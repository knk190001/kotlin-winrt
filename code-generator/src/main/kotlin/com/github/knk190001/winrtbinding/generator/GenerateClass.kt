@file:Suppress("DuplicatedCode")

package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.ArrayType
import com.github.knk190001.winrtbinding.generator.model.arrayType
import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.base.CompositionPointerType
import com.github.knk190001.winrtbinding.runtime.base.IKotlinWinRTAggregate
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IInspectable
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.interop.IEvent
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.interop.WinRTObjectInitializer
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.REFIID
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.reflect.KType

fun generateClass(
    sparseClass: SparseClass,
    lookUp: LookUp
) = FileSpec.builder(sparseClass.namespace, sparseClass.name).apply {
    addImports()
    val classTypeSpec = TypeSpec.classBuilder(sparseClass.name).apply {
        addABIAnnotation(sparseClass.asClassName())
        if (sparseClass.interfaces.isNotEmpty()) {
            addSignatureAnnotation(sparseClass)
        }
        if (sparseClass.hasCompositionActivator || sparseClass.hasSubclass) {
            addModifiers(KModifier.OPEN)
        }

        if (sparseClass.hasSuperclass) {
            superclass(sparseClass.superclass.asClassName())
        } else if (sparseClass.hasCompositionActivator) {
            superclass(CompositionPointerType::class)
        } else {
            superclass(PointerType::class)
        }

        sparseClass.nonCollidingInterfaces().forEach {
            val superinterface =
                it.asTypeName(nestedClass = "WithDefault", usage = ClassNameUsage.ParentInterface)
            addSuperinterface(superinterface)
        }

        addSuperinterface(IInspectable::class)

        generateClassTypeSpec(sparseClass)
        generateClassABI(sparseClass)
        if (sparseClass.hasStaticInterfaces) {
            generateCompanion(sparseClass, lookUp)
        }
    }.build()
    addType(classTypeSpec)
}.build()

private fun TypeSpec.Builder.generateCompanion(sparseClass: SparseClass, lookUp: LookUp) {
    val interfaces = sparseClass.staticInterfaces.map(lookUp)
        .filterIsInstance<SparseInterface>()
    val companion = TypeSpec.companionObjectBuilder().apply {
        interfaces.flatMap { staticInterface ->
            staticInterface.methods
                .filterNot { it.isEventComponent() || it.isPropertyComponent() }
                .map { method: SparseMethod ->
                    generateStaticMethod(method, staticInterface)
                }
        }.forEach { addFunction(it) }

        interfaces.flatMap { staticInterface ->
            staticInterface.methods
                .filter { it.isAddEvent() }
                .map { method: SparseMethod ->
                    generateStaticEventProperty(method, staticInterface)
                }
        }.forEach { addProperty(it) }

        interfaces.flatMap {
            it.properties().map { prop -> prop to it }
        }.map { (prop, sparseInterface) ->
            generateStaticProperty(prop, sparseInterface)
        }.forEach { addProperty(it) }
    }.build()
    addType(companion)
}

private fun generateStaticProperty(
    prop: Pair<SparseMethod?, SparseMethod?>,
    sparseInterface: SparseInterface
): PropertySpec {
    val (getter, setter) = prop
    val propertyName = getter?.name?.substringAfter("_") ?: setter!!.name.substringAfter("_")
    val propertyType = getter?.returnType ?: setter!!.parameters.single().type
    return PropertySpec.builder(
        propertyName,
        propertyType.asTypeName(nullable = propertyType.isNullable(), usage = ClassNameUsage.ApiSurface)
    ).apply {
        mutable(setter != null)
        if (getter != null) {
            getter(FunSpec.getterBuilder().apply {
                addCode("return ABI.${sparseInterface.name}_Instance.${propertyName}")
            }.build())
        } else {
            getter(FunSpec.getterBuilder().apply {
                addStatement("throw %T()", UnsupportedOperationException::class.asTypeName())
            }.build())
        }
        if (setter != null) {
            setter(FunSpec.setterBuilder().apply {
                addParameter("value", propertyType.asTypeName(usage = ClassNameUsage.ApiSurface, nullable = propertyType.isNullable()))
                addCode("ABI.${sparseInterface.name}_Instance.${propertyName} = value".fixSpaces())
            }.build())
        }
    }.build()
}

fun generateStaticEventProperty(method: SparseMethod, staticInterface: SparseInterface): PropertySpec {
    val eventName = method.name.substringAfter('_')
    val eventComponentType = method.parameters.single().type.asTypeName()
    val eventType = IEvent::class.asTypeName().parameterizedBy(eventComponentType)
    return PropertySpec.builder(eventName, eventType).apply {
        val cb = buildCodeBlock {
            addStatement("ABI.${staticInterface.name}_Instance.${eventName}")
        }
        initializer(cb)
    }.build()
}

private fun List<String>.fixNames(): List<String> {
    return this.map {
        if (reservedWords.contains(it)) {
            "`$it`"
        } else {
            it
        }
    }
}

private fun generateStaticMethod(
    method: SparseMethod,
    staticInterface: SparseInterface
) = FunSpec.builder(method.name).apply {
    method.parameters.forEach {
        when (it.arrayType()) {
            ArrayType.None -> {
                addParameter(
                    it.name, it.type.asTypeName(usage = ClassNameUsage.ApiSurface)
                        .copy(it.type.isNullable())
                )
            }

            ArrayType.PassArray -> addParameter(
                it.name,
                it.type.asTypeName(usage = ClassNameUsage.ApiSurface)
            )

            ArrayType.FillArray -> addParameter(
                it.name,
                it.type.asTypeName(usage = ClassNameUsage.ApiSurface)
            )

            ArrayType.ReceiveArray -> {
                val listType = ClassName("kotlin.collections", "MutableList")
                addParameter(
                    it.name,
                    listType.parameterizedBy(
                        it.type.copy(isArray = false, isReference = false)
                            .asTypeName(usage = ClassNameUsage.ApiSurface)
                    )
                )
            }
        }

    }
    val cb = CodeBlock.builder().apply {
        add("return ABI.${staticInterface.name}_Instance.${method.name}(")
        add(method.parameters.map { it.name }.fixNames().joinToString())
        add(")\n")
    }.build()
    addCode(cb)
}.build()

private fun TypeSpec.Builder.generateClassABI(sparseClass: SparseClass) {
    val abiSpec = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                ClassName("", sparseClass.name).copy(nullable = true),
                MemorySegment::class.asClassName()
            )
        )

        if (sparseClass.isDirectlyActivatable) {
            generateDirectActivationCode(sparseClass)
        }

        if (sparseClass.hasStaticInterfaces) {
            generateStaticInterfaces(sparseClass)
        }

        if (sparseClass.hasFactoryActivator) {
            generateFactoryActivationCode(sparseClass)
        }

        if (sparseClass.hasCompositionActivator) {
            generateCompositionActivationCode(sparseClass)
        }

        addFromNative(sparseClass)
        addPtrToNative(sparseClass)
        addLayout()
    }.build()

    addType(abiSpec)
}

private fun TypeSpec.Builder.addLayout() {
    val layoutSpec = PropertySpec.builder("layout", MemoryLayout::class).apply {
        initializer("%T.ADDRESS", ValueLayout::class)
        addModifiers(KModifier.OVERRIDE)
    }.build()
    addProperty(layoutSpec)
}

private fun TypeSpec.Builder.addFromNative(sparseClass: SparseClass) {
    val fromNative = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("segment", MemorySegment::class)
        returns(sparseClass.asClassName())
        addStatement("return %T(ptr = %T(segment.address()))".fixSpaces(), sparseClass.asClassName(), Pointer::class)
    }.build()
    addFunction(fromNative)
}

private fun TypeSpec.Builder.generateCompositionActivationCode(sparseClass: SparseClass) {
    generateCompositionFactoryActivators(sparseClass)
    generateCompositionFactoryLazyProperties(sparseClass)
    generateCompositionFactoryActivationFunctions(sparseClass)

}

private fun TypeSpec.Builder.generateFactoryActivationCode(sparseClass: SparseClass) {
    generateFactoryActivators(sparseClass)
    generateFactoryLazyProperties(sparseClass)
    generateFactoryActivationFunctions(sparseClass)
}

private fun TypeSpec.Builder.generateFactoryActivationFunctions(sparseClass: SparseClass) {
    val factoryInterfaces = sparseClass.factoryActivatorTypes.map {
        lookUpTypeReference(it) as SparseInterface
    }

    factoryInterfaces.flatMap {
        it.methods.map { method -> method to it }
    }.forEach {
        generateFactoryActivationFunction(it.first, it.second)
    }
}

private fun TypeSpec.Builder.generateCompositionFactoryActivationFunctions(sparseClass: SparseClass) {
    val factoryInterfaces = sparseClass.compositionActivatorTrait.compositionFactoryTypes.map {
        lookUpTypeReference(it) as SparseInterface
    }

    factoryInterfaces.flatMap {
        it.methods.map { method -> method to it }
    }.forEach {
        generateCompositionFactoryActivationFunction(it.first, it.second)
    }
}

fun TypeSpec.Builder.generateFactoryActivationFunction(
    method: SparseMethod,
    factoryInterface: SparseInterface
) {
    val activationFn = FunSpec.builder("activate").apply {
        method.parameters.forEach {
            addParameter(it.name, it.type.asTypeName(usage = ClassNameUsage.ApiSurface))
        }
        returns(nullablePtr)
        val cb = CodeBlock.builder().apply {
            add("return ${factoryInterface.name}_Instance.${method.name}(")
            add(method.parameters.joinToString { it.name })
            add(")?.pointer")
        }.build()
        addCode(cb)
    }.build()
    addFunction(activationFn)
}

fun TypeSpec.Builder.generateCompositionFactoryActivationFunction(
    method: SparseMethod,
    factoryInterface: SparseInterface
) {
    val activationFn = FunSpec.builder("activate").apply {
        val userParams = method.parameters.dropLast(2)

        userParams.forEach {
            addParameter(it.name, it.type.asTypeName(usage = ClassNameUsage.ApiSurface))
        }

        addParameter(
            ParameterSpec.builder("aggregatingClass", IKotlinWinRTAggregate::class.asClassName().copy(true)).apply {
                defaultValue(CodeBlock.of("null"))
            }.build()
        )

        returns(nullablePtr)
        val cb = CodeBlock.builder().apply {
            addStatement("val inner = %T()", PointerTo::class.asClassName().parameterizedBy(ANY))

            beginControlFlow("val baseInterface = if (aggregatingClass != null)")
            addStatement("%T(aggregatingClass.initAggregate())", IInspectable.IInspectable_Impl::class)
            nextControlFlow("else")
            addStatement("null")
            endControlFlow()
            add("val obj = ${factoryInterface.name}_Instance.${method.name}(")
            add((userParams.map { it.name } +
                    listOf("baseInterface", "inner")).joinToString(),
                IInspectable.IInspectable_Impl::class)
            add(")?.pointer\n")
            addStatement("aggregatingClass?.inner = inner.value as? %T", IUnknown::class)
            addStatement("return obj")
        }.build()
        addCode(cb)
    }.build()
    addFunction(activationFn)
}

private fun TypeSpec.Builder.generateFactoryLazyProperties(sparseClass: SparseClass) {
    sparseClass.factoryActivatorTypes.forEach {
        generateFactoryLazyProperty(lookUpTypeReference(it) as SparseInterface)
    }
}

private fun TypeSpec.Builder.generateCompositionFactoryLazyProperties(sparseClass: SparseClass) {
    sparseClass.compositionActivatorTrait.compositionFactoryTypes.forEach {
        generateFactoryLazyProperty(lookUpTypeReference(it) as SparseInterface)
    }
}


private fun TypeSpec.Builder.generateFactoryLazyProperty(factoryInterface: SparseInterface) {
    val factoryInterfaceProperty = PropertySpec.builder(
        "${factoryInterface.name}_Instance",
        factoryInterface.asClassName()
    ).apply {
        val delegateCb = CodeBlock.builder().apply {
            beginControlFlow("lazy")
            addStatement("create${factoryInterface.name}()")
            endControlFlow()
        }.build()

        delegate(delegateCb)
    }.build()
    addProperty(factoryInterfaceProperty)
}

private fun TypeSpec.Builder.generateFactoryActivators(sparseClass: SparseClass) {
    sparseClass.factoryActivatorTypes.forEach {
        generateFactoryActivator(sparseClass, it)
    }
}

private fun TypeSpec.Builder.generateCompositionFactoryActivators(sparseClass: SparseClass) {
    sparseClass.compositionActivatorTrait.compositionFactoryTypes.forEach {
        generateFactoryActivator(sparseClass, it)
    }
}

private fun TypeSpec.Builder.generateFactoryActivator(sparseClass: SparseClass, factoryInterface: SparseTypeReference) {
    val createFactoryActivatorFn = FunSpec.builder("create${factoryInterface.name}").apply {
        val factoryClassName = factoryInterface.asClassName() as ClassName
        val cb = CodeBlock.builder().apply {
            addStatement("val refiid = %T(guidOf<%T>())", REFIID::class, factoryClassName)
            addStatement("val factoryActivatorPtr = %T()", PointerByReference::class)

            val win32 = ClassName("com.github.knk190001.winrtbinding.runtime", "JNAApiInterface")
                .nestedClass("Companion")
                .member("INSTANCE")

            addStatement(
                "val hr = %M.RoGetActivationFactory(%S.toHandle(),refiid,factoryActivatorPtr)",
                win32,
                sparseClass.fullName()
            )
            addStatement("checkHR(hr)")
            addStatement(
                "return(%T.ABI.make${factoryInterface.name}(factoryActivatorPtr.value))",
                factoryClassName
            )
        }.build()
        addCode(cb)
        returns(factoryClassName)
    }.build()
    addFunction(createFactoryActivatorFn)
}

private fun TypeSpec.Builder.generateStaticInterfaces(sparseClass: SparseClass) {
    sparseClass.staticInterfaces.map {
        generateStaticInterface(it, sparseClass)
    }
}

fun TypeSpec.Builder.generateStaticInterface(staticInterface: SparseTypeReference, sparseClass: SparseClass) {
    val staticInterfaceClass = staticInterface.asClassName()
    val createStaticInterfaceSpec = FunSpec.builder("create${staticInterface.name}").apply {
        returns(staticInterfaceClass)
        val cb = CodeBlock.builder().apply {
            addStatement("val refiid = %T(%T.ABI.IID)", REFIID::class, staticInterfaceClass)
            addStatement("val interfacePtr = %T()", PointerByReference::class)

            val win32 = ClassName("com.github.knk190001.winrtbinding.runtime", "JNAApiInterface")
                .nestedClass("Companion")
                .member("INSTANCE")

            addStatement(
                "val hr = %M.RoGetActivationFactory(%S.toHandle(),refiid,interfacePtr)",
                win32,
                sparseClass.fullName()
            )
            addStatement(
                "val result = %T.ABI.make${staticInterface.name}(interfacePtr.value)",
                ClassName(staticInterface.namespace, staticInterface.name)
            )
            addStatement("return result")
        }.build()

        addCode(cb)
    }.build()

    val staticInterfaceProperty = PropertySpec.builder("${staticInterface.name}_Instance", staticInterfaceClass).apply {
        val delegateCb = CodeBlock.builder().apply {
            beginControlFlow("lazy")
            addStatement("create${staticInterface.name}()")
            endControlFlow()
        }.build()

        delegate(delegateCb)
    }.build()

    addFunction(createStaticInterfaceSpec)
    addProperty(staticInterfaceProperty)
}

private fun TypeSpec.Builder.generateDirectActivationCode(sparseClass: SparseClass) {
    generateCreateActivationFactorySpec(sparseClass)
    generateActivationFactoryPropertySpec()
    generateActivationFunction()
}

private fun TypeSpec.Builder.generateActivationFunction() {
    val activateSpec = FunSpec.builder("activate").apply {
        returns(jnaPointer)
        val cb = CodeBlock.builder().apply {
            addStatement("return activationFactory.activateInstance()")
        }.build()
        addCode(cb)
    }.build()
    addFunction(activateSpec)
}

private fun TypeSpec.Builder.generateActivationFactoryPropertySpec() {
    val activationFactoryClass = IActivationFactory::class
    val activationFactoryPropertySpec = PropertySpec.builder("activationFactory", activationFactoryClass).apply {
        val delegateCb = CodeBlock.builder().apply {
            beginControlFlow("lazy")
            addStatement("createActivationFactory()")
            endControlFlow()
        }.build()
        delegate(delegateCb)
    }.build()
    addProperty(activationFactoryPropertySpec)
}

private fun TypeSpec.Builder.generateCreateActivationFactorySpec(sparseClass: SparseClass) {

    val createActivationFunSpec = FunSpec.builder("createActivationFactory").apply {
        val cb = CodeBlock.builder().apply {
            val iActivationFactoryVtblIID = IActivationFactory.Companion::class.member("IID")
            addStatement("val refiid = %T(%M)", REFIID::class, iActivationFactoryVtblIID)
            addStatement("val iAFPtr = %T()", PointerByReference::class)

            val win32 = JNAApiInterface.Companion::class
                .member("INSTANCE")

            addStatement(
                "var hr = %M.RoGetActivationFactory(%S.toHandle(), refiid, iAFPtr)",
                win32,
                sparseClass.fullName()
            )
            addStatement("checkHR(hr)")


            addStatement("return %T(iAFPtr.value)", IActivationFactory::class)
        }.build()
        addCode(cb)
        returns(IActivationFactory::class)
    }.build()
    addFunction(createActivationFunSpec)
}

private fun FileSpec.Builder.addImports() {
    addImport("com.github.knk190001.winrtbinding.runtime", "getValue")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "guidOf")
    addImport("com.github.knk190001.winrtbinding.runtime", "toHandle")
    addImport("com.github.knk190001.winrtbinding.runtime", "checkHR")
    addImport("kotlin.reflect", "typeOf")

}

private fun TypeSpec.Builder.generateClassTypeSpec(sparseClass: SparseClass) {
    generateConstructor(sparseClass)
    generateTypeProperties(sparseClass)
    generateInterfacePointerProperties(sparseClass)
    generateEventProperties(sparseClass)
    generateInterfaceGuidArray(sparseClass)
    generateInterfaceConflictProperties(sparseClass)
    generateDeconflictionProperties(sparseClass)
}

private fun TypeSpec.Builder.generateDeconflictionProperties(sparseClass: SparseClass) {
    sparseClass.propertyCollisions()
        .forEach { (getterPair, setterPair) ->
            val (getter, getterInterface) = getterPair
            val (_, setterInterface) = setterPair
            val type = getter.returnType
            val typeName = if (type.isArray) {
                val componentType = type.copy(isArray = false)
                MUTABLE_LIST.parameterizedBy(
                    componentType.asTypeName(
                        usage = ClassNameUsage.ApiSurface,
                        nullable = componentType.isNullable()
                    )
                )
            } else type.asTypeName(usage = ClassNameUsage.ApiSurface, nullable = type.isNullable())
            val propertyName = getter.name.substringAfter('_')
            val propertySpec = PropertySpec.builder(getter.name.substringAfter('_'), typeName).apply {
                mutable()
                addModifiers(KModifier.OVERRIDE)
                val getterSpec = FunSpec.getterBuilder().apply {
                    addStatement(
                        "return super<%T>.${propertyName}",
                        getterInterface.asClassName(nestedClass = "WithDefault")
                    )
                }.build()
                getter(getterSpec)

                val setterSpec = FunSpec.setterBuilder().apply {
                    addParameter("value", typeName)
                    addStatement(
                        "super<%T>.${propertyName} = value",
                        setterInterface.asClassName(nestedClass = "WithDefault")
                    )
                }.build()
                setter(setterSpec)
            }.build()
            addProperty(propertySpec)
        }
}

private fun TypeSpec.Builder.generateInterfaceConflictProperties(sparseClass: SparseClass) {
    sparseClass.collisions().forEach {
        val propertySpec = PropertySpec.builder("as${it.name}", it.asTypeName()).apply {
            delegate(buildCodeBlock {
                beginControlFlow("lazy")
                addStatement(
                    "%T(${it.getInterfacePointerName()})",
                    it.asTypeName(nestedClass = "${it.name}Impl")
                )
                endControlFlow()
            })
        }.build()
        addProperty(propertySpec)
    }
}

private fun TypeSpec.Builder.generateEventProperties(sparseClass: SparseClass) {
    sparseClass.nonCollidingInterfaces().forEach { addEvents(it, true, it.getInterfacePointerName(), lazy = true) }
}

private fun TypeSpec.Builder.generateInterfaceGuidArray(sparseClass: SparseClass) {
    val guidArrayProperty = PropertySpec.builder(
        "_interfaceGuids",
        typeNameOf<Array<Guid.IID>>(),
        KModifier.PRIVATE
    ).apply {
        initializer(buildCodeBlock {
            addStatement("arrayOf(")
            indent()
            sparseClass.nonCollidingInterfaces().forEach(this::addGuidStatement)
            unindent()
            addStatement(")")
        })
    }.build()
    addProperty(guidArrayProperty)
}

fun CodeBlock.Builder.addGuidStatement(sparseTypeReference: SparseTypeReference) {
    addStatement("guidOf<%T>(),", sparseTypeReference.asTypeName())
}

private fun TypeSpec.Builder.generateTypeProperties(sparseClass: SparseClass) {
    val genericInterfaces = sparseClass.nonCollidingInterfaces()
        .filter { it.hasActualizedGenericParameter() }

    genericInterfaces.map {
        PropertySpec.builder(it.getInterfaceTypeName(), KType::class, KModifier.OVERRIDE).apply {
            initializer("typeOf<%T>()", it.asTypeName())
        }.build()
    }.forEach(this::addProperty)

}

private fun TypeSpec.Builder.generateInterfacePointerProperties(sparseClass: SparseClass) {
    val initializerVal = PropertySpec.builder(
        "_interfaceInitializer",
        WinRTObjectInitializer::class,
        KModifier.PRIVATE
    ).apply {
        initializer("%T(this, ${sparseClass.interfaces.size})", WinRTObjectInitializer::class)
    }.build()
    addProperty(initializerVal)

    sparseClass.interfaces
        .mapIndexed { idx, sparseTypeReference ->
            generateInterfacePointerProperty(
                sparseClass,
                idx,
                sparseTypeReference
            )
        }
        .forEach(::addProperty)
}

fun generateInterfacePointerProperty(
    sparseClass: SparseClass,
    idx: Int,
    sparseTypeReference: SparseTypeReference
): PropertySpec {
    return PropertySpec.builder(
        sparseTypeReference.getInterfacePointerName(),
        nullablePtr
    ).apply {
        if (!sparseClass.collisions().contains(lookUpTypeReference(sparseTypeReference))) {
            addModifiers(KModifier.OVERRIDE)
        }

        getter(FunSpec.getterBuilder().apply {
            addCode("return _interfaceInitializer[_interfaceGuids[$idx]]")
        }.build())

    }.build()
}

fun INamedEntity.packageQualifiedIdentifier(): String {
    return "${namespace}_$name".replace(".", "_")
}

fun INamedEntity.getInterfacePointerName(): String {
    return "${packageQualifiedIdentifier()}_Ptr"
}

fun INamedEntity.getInterfaceTypeName(): String {
    return "${packageQualifiedIdentifier()}_Type"
}

private fun TypeSpec.Builder.generateConstructor(sparseClass: SparseClass) {
    val constructorSpec = FunSpec.constructorBuilder().apply {
        addParameter("ptr", nullablePtr)
    }.build()
    primaryConstructor(constructorSpec)
    addSuperclassConstructorParameter("ptr")

    val jnaConstructor = FunSpec.constructorBuilder().apply {
        callThisConstructor("null")
        addModifiers(KModifier.INTERNAL)
    }.build()
    addFunction(jnaConstructor)

    if (sparseClass.isDirectlyActivatable) {
        generateDirectActivationConstructor()
    }

    if (sparseClass.hasFactoryActivator) {
        generateFactoryConstructors(sparseClass)
    }

    if (sparseClass.hasCompositionActivator) {
        generateCompositionFactoryConstructors(sparseClass)
    }
}

private fun TypeSpec.Builder.generateFactoryConstructors(sparseClass: SparseClass) {
    sparseClass.factoryActivatorTypes.map {
        lookUpTypeReference(it) as SparseInterface
    }.flatMap {
        it.methods
    }.forEach(::generateFactoryConstructor)
}

private fun TypeSpec.Builder.generateCompositionFactoryConstructors(sparseClass: SparseClass) {
    sparseClass.compositionActivatorTrait.compositionFactoryTypes.map {
        lookUpTypeReference(it) as SparseInterface
    }.flatMap {
        it.methods
    }.forEach(::generateCompositionFactoryConstructor)
}

private fun TypeSpec.Builder.generateCompositionFactoryConstructor(sparseMethod: SparseMethod) {
    val constructorSpec = FunSpec.constructorBuilder().apply {
        val userParams = sparseMethod.parameters.dropLast(2)
        userParams.forEach {
            addParameter(it.name, it.type.asTypeName(usage = ClassNameUsage.ApiSurface))
        }
        if (userParams.isEmpty()) {
            val markerParam = ParameterSpec.builder("activationMarker", UNIT).apply {
                defaultValue(CodeBlock.of("%T", UNIT))
            }.build()
            addParameter(markerParam)
        }
        callThisConstructor("null")


        val parameterNames = (userParams
            .map { it.name } + "aggregatingClass = this as %T")

        val cb = buildCodeBlock {
            beginControlFlow("pointer = if (this is %T)", IKotlinWinRTAggregate::class)
            addStatement("ABI.activate(${parameterNames.joinToString()})!!", IKotlinWinRTAggregate::class)
            nextControlFlow("else")
            addStatement("ABI.activate(${parameterNames.dropLast(1).joinToString()})!!")
            endControlFlow()
        }
        addCode(cb)

    }.build()
    addFunction(constructorSpec)
}

private fun TypeSpec.Builder.generateFactoryConstructor(sparseMethod: SparseMethod) {
    val constructorSpec = FunSpec.constructorBuilder().apply {
        sparseMethod.parameters.forEach {
            addParameter(it.name, it.type.asTypeName(usage = ClassNameUsage.ApiSurface))
        }
        callThisConstructor("ABI.activate(${sparseMethod.parameters.joinToString { it.name }})")
    }.build()
    addFunction(constructorSpec)
}

private fun TypeSpec.Builder.generateDirectActivationConstructor() {
    val constructorSpec = FunSpec.constructorBuilder().apply {
        val unit = ClassName("", "kotlin.Unit")
        val activationMarkerParam = ParameterSpec.builder("activationMarker", unit).apply {
            defaultValue(CodeBlock.of("%T", unit))
        }.build()
        addParameter(activationMarkerParam)
        callThisConstructor("ABI.activate()")
    }.build()
    addFunction(constructorSpec)
}

