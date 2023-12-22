package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.runtime.annotations.*
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.REFIID
import com.sun.jna.ptr.ByReference
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import com.sun.jna.Function as JNAFunction

private val ptrNull = Pointer::class.asClassName().member("NULL")
private val jnaPointer = ClassName("com.github.knk190001.winrtbinding.runtime", "JNAPointer")

object InvisibleInterface

fun generateInterface(
    sparseInterface: SparseInterface,
    lookUp: LookUp,
    shortCircuitGeneric: Boolean = false
): FileSpec = FileSpec.builder(sparseInterface.namespace, sparseInterface.name).apply {
    addImports()
    if (shortCircuitGeneric) {
        tag(InvisibleInterface::class, InvisibleInterface)
    }
    if (sparseInterface.genericParameters != null && !shortCircuitGeneric ||
        sparseInterface.superInterfaces.any { it.genericParameters != null } && !shortCircuitGeneric
    ) {
        if (sparseInterface.asTypeReference().isClosed()) {
            generateInterface(sparseInterface, lookUp, true)
        }
        return generateParameterizedInterface(sparseInterface)
    }
    val interfaceSpec = TypeSpec.interfaceBuilder(sparseInterface.name).apply {
        addABIAnnotation(sparseInterface.asTypeReference().asClassName())
        addSuperInterfaces(sparseInterface)
        addSignatureAnnotation(sparseInterface)
        addGuidAnnotation(sparseInterface.guid)
        addWinRTInterfaceAnnotation(sparseInterface)
        addAnnotation(JvmDefaultWithoutCompatibility::class)
        addMethods(sparseInterface, false)
        addByReferenceType(sparseInterface)
        addWithDefaultType(sparseInterface)
        generateImplementation(sparseInterface)
        addABI(sparseInterface, lookUp)
        generateCompanion(sparseInterface)
    }.build()
    addType(interfaceSpec)

}.build()

private fun TypeSpec.Builder.addWinRTInterfaceAnnotation(sparseInterface: SparseInterface) {
val annotation = AnnotationSpec.builder(WinRTInterface::class).apply {
        addMember("%S", sparseInterface.guid)
    }.build()
    addAnnotation(annotation)
}

private fun TypeSpec.Builder.addWithDefaultType(sparseInterface: SparseInterface) {
    val withDefaultTypeSpec = TypeSpec.interfaceBuilder("WithDefault").apply {
        addSuperinterface(sparseInterface.asTypeReference().asClassName())
        sparseInterface.superInterfaces.forEach {
            addSuperinterface(it.asClassName(nestedClass = "WithDefault"))
        }
        addAnnotation(JvmDefaultWithoutCompatibility::class)
        addProperty(
            sparseInterface.asTypeReference().getInterfacePointerName(),
            Pointer::class.asClassName().copy(true)
        )
        addVtblPtrProperty(sparseInterface)
        addMethods(sparseInterface, true)
    }.build()
    addType(withDefaultTypeSpec)
}

fun SparseInterface.cleanName() = this.asTypeReference().dropGenericParameterCount().name
fun SparseTypeReference.cleanName() = this.dropGenericParameterCount().name
fun generateParameterizedInterface(sparseInterface: SparseInterface): FileSpec {
    return FileSpec.builder(sparseInterface.namespace, sparseInterface.cleanName()).apply {
        addImports()
        addParameterizedInterface(sparseInterface)
        if (sparseInterface.asTypeReference().isClosed()) {
            tag(InvisibleInterface::class, InvisibleInterface)
        }
    }.build()
}

private fun FileSpec.Builder.addParameterizedInterface(sparseInterface: SparseInterface) {
    val parameterizedInterface = TypeSpec.interfaceBuilder(sparseInterface.cleanName()).apply {
        addAnnotation(GenericType::class)
        addAnnotation(DynamicSignature::class)
        addABIAnnotation(sparseInterface.withName(sparseInterface.cleanName()).asTypeReference().asClassName())
        addGuidAnnotation(sparseInterface.guid)
        addByReferenceAnnotation(sparseInterface)
        addInterfaceProperties(sparseInterface)
        addTypeParameters(sparseInterface)
        addGenericSuperInterfaces(sparseInterface)
        addGenericInterfaceMethods(sparseInterface)
        generateParameterizedByReference(sparseInterface)
        generateParameterizedImplType(sparseInterface)
        generateParameterizedABI(sparseInterface)
        addTypeProperties(sparseInterface)
    }.build()
    addType(parameterizedInterface)
}

private fun TypeSpec.Builder.addTypeProperties(sparseInterface: SparseInterface) {
    val typeAnnotationSpec = AnnotationSpec.builder(TypeHash::class)
        .addMember("%S", sparseInterface.asTypeReference().getInterfaceTypeName()).build()
    addAnnotation(typeAnnotationSpec)
    sparseInterface.superInterfaces
        .filter { it.hasGenericParameter() }
        .forEach { addTypeProperty(it, sparseInterface) }
}

fun TypeSpec.Builder.addTypeProperty(it: SparseTypeReference, sparseInterface: SparseInterface) {

    val typeParameterIndexMap = sparseInterface.genericParameters
        ?.mapIndexed { index, sparseGenericParameter -> sparseGenericParameter.name to index }
        ?.toMap() ?: emptyMap()

    val typeProperty = PropertySpec.builder(it.getInterfaceTypeName(), KType::class).apply {
        addModifiers(KModifier.OVERRIDE)
        val getter = FunSpec.getterBuilder().apply {
            val initializerCb = CodeBlock.builder().apply {
                add("return ")
                kTypeStatementFor(it, sparseInterface, typeParameterIndexMap)
            }.build()
            addCode(initializerCb)
        }.build()
        getter(getter)
    }.build()
    addProperty(typeProperty)
}

private fun TypeSpec.Builder.generateParameterizedABI(sparseInterface: SparseInterface) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        if (sparseInterface.genericParameters.isNullOrEmpty()) {
            addSuperinterface(
                IABI::class.asClassName().parameterizedBy(
                    sparseInterface.asTypeReference().asClassName(),
                    MemoryAddress::class.asClassName()
                )
            )
        } else {
            val starParameters = sparseInterface.genericParameters.map {
                STAR
            }.toTypedArray()
            addSuperinterface(
                IParameterizedABI::class.asClassName().parameterizedBy(
                    ClassName("", sparseInterface.cleanName()).parameterizedBy(*starParameters),
                    MemoryAddress::class.asClassName()
                )
            )
        }
        generateMakeFn(sparseInterface)
        generateReifiedMakeFn(sparseInterface)
        addParameterizedFromNative(sparseInterface)
        addPtrToNative(sparseInterface, sparseInterface.pointerName())
        addLayout()
    }.build()
    addType(abi)
}

private fun TypeSpec.Builder.generateReifiedMakeFn(sparseInterface: SparseInterface) {
    if (sparseInterface.genericParameters == null) return
    val makeFn = FunSpec.builder("make${sparseInterface.cleanName()}").apply {
        addModifiers(KModifier.INLINE)
        sparseInterface.genericParameters
            .map(SparseGenericParameter::name)
            .map { TypeVariableName(it).copy(reified = true) }
            .forEach { addTypeVariable(it) }
        addParameter("ptr", jnaPointer.copy(true))
        val typeParameters = sparseInterface.genericParameters.joinToString { it.name }
        addCode(
            "return %T.invoke<${typeParameters}>( ptr)",
            ClassName(
                sparseInterface.namespace,
                sparseInterface.cleanName()
            ).nestedClass("${sparseInterface.cleanName()}Impl"),
        )
    }.build()
    addFunction(makeFn)
}

private fun TypeSpec.Builder.generateMakeFn(
    sparseInterface: SparseInterface,
) {
    val makeFn = FunSpec.builder("make${sparseInterface.cleanName()}").apply {
        sparseInterface.genericParameters
            ?.map(SparseGenericParameter::name)
            ?.map(TypeVariableName::invoke)
            ?.forEach { addTypeVariable(it) }
        addParameter("ptr", jnaPointer.copy(true))
        if (sparseInterface.genericParameters != null) {
            addParameter("type", KType::class)
        }
        val typeParameters = sparseInterface.genericParameters
            ?.joinToString(prefix = "<", postfix = ">") { it.name } ?: ""

        val typeParameterExpression = if (sparseInterface.genericParameters != null) {
            "type,"
        } else {
            ""
        }
        addCode(
            "return %T%L(%L ptr)",
            ClassName(
                sparseInterface.namespace,
                sparseInterface.cleanName()
            ).nestedClass("${sparseInterface.cleanName()}Impl"),
            typeParameters,
            typeParameterExpression
        )
    }.build()
    addFunction(makeFn)
}

private fun TypeSpec.Builder.generateParameterizedImplType(sparseInterface: SparseInterface) {
    val name = sparseInterface.asTypeReference().dropGenericParameterCount()
    val impl = TypeSpec.classBuilder("${name.name}Impl").apply {
        sparseInterface.genericParameters
            ?.map(SparseGenericParameter::name)
            ?.map(TypeVariableName::invoke)
            ?.forEach(this::addTypeVariable)


        val constructor = FunSpec.constructorBuilder().apply {
            val pointerParameter = ParameterSpec.builder("ptr", jnaPointer.copy(true)).apply {
                defaultValue("%M", ptrNull)
            }.build()
            addParameter(pointerParameter)

            if (sparseInterface.genericParameters != null) {
                val typeParameter =
                    ParameterSpec.builder(sparseInterface.typeName(), KType::class.asClassName().copy(true)).apply {
                        defaultValue("null")
                        addModifiers(KModifier.OVERRIDE)
                    }.build()
                addParameter(typeParameter)
            }

        }.build()
        primaryConstructor(constructor)

        val pointerProperty = PropertySpec.builder(sparseInterface.pointerName(), jnaPointer.copy(true)).apply {
            getter(FunSpec.getterBuilder().addCode("return pointer").build())
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(pointerProperty)

        val vtblProperty = PropertySpec.builder(sparseInterface.vtblName(), jnaPointer.copy(true)).apply {
            getter(FunSpec.getterBuilder().addCode("return pointer.getPointer(0)").build())
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(vtblProperty)

        superclass(PointerType::class)
        addSuperclassConstructorParameter("ptr")

        if (sparseInterface.genericParameters != null) {
            val typeProperty =
                PropertySpec.builder(sparseInterface.typeName(), KType::class.asClassName().copy(true)).apply {
                    initializer(sparseInterface.typeName())
                    mutable(true)
                    addModifiers(KModifier.OVERRIDE)
                }.build()
            addProperty(typeProperty)
        }
        addParameterizedSIProperties(sparseInterface)
        addParameterizedSuperInterfaces(sparseInterface)
        addParameterizedImplCompanion(sparseInterface)

    }.build()
    addType(impl)
}

private fun TypeSpec.Builder.addParameterizedSIProperties(sparseInterface: SparseInterface) {
    val superInterfaceReferences = traverseSuperInterfaces(sparseInterface)
        .distinctBy { it.fullName() }

    addParameterizedSIPtrProperties(superInterfaceReferences, sparseInterface)
}

private fun TypeSpec.Builder.addParameterizedSIPtrProperties(
    superInterfaces: List<SparseTypeReference>,
    sparseInterface: SparseInterface
) {
    superInterfaces.forEach {
        val property = PropertySpec.builder(it.getInterfacePointerName(), jnaPointer.copy(true)).apply {
            val lazyCb = CodeBlock.builder().apply {
                beginControlFlow("lazy { ")
                if (!it.isClosed()) {
                    addStatement("val refiid = %T(guidOf(%L))", REFIID::class, it.getInterfaceTypeName())
                } else {
                    addStatement("val refiid = %T(guidOf<%T>())", REFIID::class, it.asGenericTypeParameter())
                }
                addStatement("val result = %T()", PointerByReference::class)
                addStatement(
                    "%T(%L).queryInterface(pointer, refiid, result)",
                    IUnknownVtbl::class,
                    sparseInterface.vtblName()
                )
                addStatement("result.value")
                endControlFlow()
            }.build()
            delegate(lazyCb)
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(property)
    }
}

private fun TypeSpec.Builder.addParameterizedSuperInterfaces(sparseInterface: SparseInterface) {
    if (sparseInterface.genericParameters == null) {
        addSuperinterface(ClassName("", "WithDefault"))
        return
    }
    addSuperinterface(sparseInterface.asTypeReference().asGenericTypeParameter())
}

private fun traverseSuperInterfaces(sparseInterface: SparseInterface): Set<SparseTypeReference> {
    val superInterfaces = sparseInterface.superInterfaces
        .map { lookUpTypeReference(it) }
        .filterIsInstance<SparseInterface>()

    return sparseInterface.superInterfaces
        .union(superInterfaces.flatMap { traverseSuperInterfaces(it) })
}

private fun TypeSpec.Builder.addParameterizedImplCompanion(sparseInterface: SparseInterface) {
    val companion = TypeSpec.companionObjectBuilder().apply {
        val invoke = FunSpec.builder("invoke").apply {
            addModifiers(KModifier.OPERATOR)

            sparseInterface.genericParameters
                ?.map(SparseGenericParameter::name)
                ?.map(TypeVariableName::invoke)
                ?.forEach(this::addTypeVariable)

            if (sparseInterface.genericParameters != null) {
                addParameter("type", KType::class.asClassName())
            }
            addParameter("ptr", jnaPointer.copy(true))
            val typeParameter = if (sparseInterface.genericParameters != null) {
                ", type"
            } else {
                ""
            }
            addCode(
                "return %T(ptr%L)",
                ClassName(
                    sparseInterface.namespace,
                    sparseInterface.cleanName(),

                    ).nestedClass("${sparseInterface.cleanName()}Impl"),
                typeParameter
            )

            returns(sparseInterface.asTypeReference().dropGenericParameterCount().asGenericTypeParameter())
        }.build()
        addFunction(invoke)

        if (sparseInterface.genericParameters != null) {
            val reifiedInvoke = FunSpec.builder("invoke").apply {
                addModifiers(KModifier.INLINE, KModifier.OPERATOR)

                sparseInterface.genericParameters
                    .map(SparseGenericParameter::name)
                    .map(TypeVariableName::invoke)
                    .map { it.copy(reified = true) }
                    .forEach(this::addTypeVariable)

                addParameter("ptr", jnaPointer.copy(true))

                addCode(
                    "return %T(typeOf<%T>(),ptr)",
                    ClassName(
                        sparseInterface.namespace,
                        sparseInterface.cleanName()
                    ).nestedClass("${sparseInterface.cleanName()}Impl"),
                    sparseInterface.asTypeReference().dropGenericParameterCount().asGenericTypeParameter(),
                )

                returns(sparseInterface.asTypeReference().dropGenericParameterCount().asGenericTypeParameter())
            }.build()
            addFunction(reifiedInvoke)
        }
    }.build()

    addType(companion)
}

private fun TypeSpec.Builder.addByReferenceAnnotation(sparseInterface: SparseInterface) {
    val annotation = AnnotationSpec.builder(WinRTByReference::class).apply {
        addMember(
            "%T::class",
            (sparseInterface.asTypeReference().dropGenericParameterCount()
                .asClassName() as ClassName).nestedClass("ByReference")
        )
    }.build()
    addAnnotation(annotation)
}

private fun TypeSpec.Builder.addInterfaceProperties(sparseInterface: SparseInterface) {
    addProperty(sparseInterface.pointerName(), Pointer::class.asClassName().copy(true))
    val vtblProperty = PropertySpec.builder(sparseInterface.vtblName(), Pointer::class.asClassName().copy(true))
        .apply {
            val getter = FunSpec.getterBuilder().apply {
                addStatement("return %L?.getPointer(0)", sparseInterface.pointerName())
            }.build()
            getter(getter)
        }.build()
    addProperty(vtblProperty)
    if (sparseInterface.genericParameters != null) {
        addProperty(sparseInterface.typeName(), KType::class.asClassName().copy(true))
    }

}

private fun TypeSpec.Builder.addGenericInterfaceMethods(sparseInterface: SparseInterface) {
    val generic = sparseInterface.genericParameters == null
    if (generic) {
        val withDefaultSpec = TypeSpec.interfaceBuilder("WithDefault").apply {
            addSuperinterface(sparseInterface.asTypeReference().asClassName())
            sparseInterface.methods
                .mapIndexed { idx, it -> generateGenericInterfaceMethod(it, sparseInterface, idx, true ) }
                .forEach(this::addFunction)
        }.build()
        addType(withDefaultSpec)
    }
    sparseInterface.methods
        .mapIndexed { idx, it -> generateGenericInterfaceMethod(it, sparseInterface, idx, !generic) }
        .forEach(this::addFunction)
}

fun generateGenericInterfaceMethod(method: SparseMethod, sparseInterface: SparseInterface, idx: Int, withMethodBody: Boolean = true): FunSpec =
    FunSpec.builder(method.name).apply {
        method.parameters.forEach {
            if (it.type.namespace == "") {
                if (it.type.isArray) {
                    addParameter(
                        it.name,
                        Array::class.asClassName()
                            .parameterizedBy(TypeVariableName(it.type.name))
                    )
                } else {
                    addParameter(it.name, TypeVariableName.invoke(it.type.name))
                }
            } else {
                addParameter(it.name, it.type.asGenericTypeParameter(false).copy(!it.type.isPrimitiveSystemType()))
            }
        }
        if (method.returnType.namespace == "") {
            returns(TypeVariableName.invoke(method.returnType.name))
        } else {
            returns(method.returnType.asGenericTypeParameter(false).copy(!method.returnType.isPrimitiveSystemType()))
        }
        if (withMethodBody) {
            val cb = CodeBlock.builder().apply {
                addGenericInterfaceMethodBody(method, sparseInterface, idx)
            }.build()
            addCode(cb)
            if(sparseInterface.genericParameters == null) {
                addModifiers(KModifier.OVERRIDE)
            }
        } else {
            addModifiers(KModifier.ABSTRACT)
        }
    }.build()

private fun CodeBlock.Builder.addGenericInterfaceMethodBody(
    method: SparseMethod,
    sparseInterface: SparseInterface,
    idx: Int
) {
    val typeParameterIndexMap = sparseInterface.genericParameters
        ?.mapIndexed { paramIndex, it -> it.name to paramIndex }
        ?.toMap() ?: emptyMap()
    if (sparseInterface.genericParameters != null) {

        addTypePropertyCheck(sparseInterface)
    }

    addStatement(
        "val fnPtr = %L!!.getPointer(${6 + idx}L * %M)",
        sparseInterface.vtblName(),
        Native::class.member("POINTER_SIZE")
    )

    addStatement("val fn = %T.getFunction(fnPtr)", Function::class)

    if (!method.returnType.isVoid()) {
        addResultVariable(method.returnType, sparseInterface)
    }

    add("val hr = fn.invokeHR(arrayOf(%L,%L", sparseInterface.pointerName(),
        method.parameters.map {
            if (it.type.isTypeParameter()) {
                "${it.name},${sparseInterface.typeName()}!!.arguments[${typeParameterIndexMap[it.type.name]}].type!!"
            } else {
                it.name
            }
        }.map {
            if (reservedWords.contains(it)) "`$it`" else it
        }.joinToString { "marshalToNative($it)" })

    if (!method.returnType.isVoid()) {
        if (method.parameters.isNotEmpty()) {
            add(",")
        }
        add("result")
    }
    add("))\n")

    beginControlFlow("if( hr.toInt() != 0)")
    addStatement("throw %T(hr.toString())", RuntimeException::class)
    endControlFlow()

    if (!method.returnType.isVoid()) {
        add("val returnType = ")
        kTypeStatementFor(method.returnType, sparseInterface, typeParameterIndexMap)


        add("\n")
        val returnType = if (method.returnType.isTypeParameter()) {
            TypeVariableName(method.returnType.name)
        } else {
            method.returnType.asGenericTypeParameter()
        }

        val dotType = if (method.returnType.isTypeParameter()) {
            ".type"
        } else {
            ""
        }

        add("return marshalFromNative<%T>(result.getValue(), returnType$dotType!!)", returnType)
        if (method.returnType.isPrimitiveSystemType()) {
            add("!!")
        }

        if (method.returnType.isTypeParameter()) {
            add("as ${method.returnType.name}")
        }
    }
}

private fun CodeBlock.Builder.addResultVariable(typeReference: SparseTypeReference, sparseInterface: SparseInterface) {
    val typeParameterIndexMap = sparseInterface.genericParameters
        ?.mapIndexed { idx, it -> it.name to idx }
        ?.toMap() ?: emptyMap()


    if (!typeReference.hasGenericParameter()) {
        if (typeReference.isTypeParameter()) {
            addStatement(
                "val result = makeByReferenceType<%L>(%L!!.arguments[%L].type!!)",
                typeReference.name,
                sparseInterface.typeName(),
                typeParameterIndexMap[typeReference.name]
            )
        } else {
            addStatement("val result = makeByReferenceType<%T>()", typeReference.asClassName())
        }
        return
    }

    addStatement(
        "val result = makeByReferenceType<%T>(", typeReference.asGenericTypeParameter()
    )
    kTypeStatementFor(typeReference, sparseInterface, typeParameterIndexMap)
    add(")\n")
}

private fun CodeBlock.Builder.addTypePropertyCheck(sparseInterface: SparseInterface) {
    beginControlFlow("if (${sparseInterface.typeName()} == null)")
    addStatement("throw %T(%S)", IllegalStateException::class, "Type has not been initialized")
    endControlFlow()
}

private fun CodeBlock.Builder.kTypeStatementFor(
    typeReference: SparseTypeReference,
    sparseInterface: SparseInterface?,
    typeParameterIndexMap: Map<String, Int>,
    projection: Boolean = false
) {

    if (typeReference.isTypeParameter()) {
        add("${sparseInterface?.typeName()}!!.arguments[${typeParameterIndexMap[typeReference.name]}]")
        return
    }
    if (projection) {
        add("%T(%M,", KTypeProjection::class, KVariance::class.member("INVARIANT"))
    }
    if (!typeReference.hasGenericParameter()) {
        add("%T::class.createType()", typeReference.asClassName())
        if (projection) {
            add(")")
        }
        return
    }

    val type = typeReference.copy(genericParameters = null).dropGenericParameterCount()

    add("%T::class.createType(listOf(\n", ClassName(type.namespace, type.name))
    indent()
    typeReference.genericParameters!!.forEach {
        if (it.type == null) {
            kTypeStatementFor(SparseTypeReference(it.name, ""), sparseInterface, typeParameterIndexMap, projection)
        } else {

            kTypeStatementFor(it.type, sparseInterface, typeParameterIndexMap, true)

        }
        add(",\n")
    }
    unindent()
    add("))")
    if (projection) {
        add(")")
    }

}

private fun TypeSpec.Builder.addGenericSuperInterfaces(sparseInterface: SparseInterface) {
    addSuperinterface(NativeMapped::class)
    addSuperinterface(IWinRTInterface::class)

    sparseInterface.superInterfaces
        .map {
            if (lookUpTypeReference(it) is SparseInterface && !it.hasGenericParameter()) {
                it.asClassName(nestedClass = "WithDefault")
            }
            else {
                it.asGenericTypeParameter()
            }
        }
        .forEach(this::addSuperinterface)
}

fun SparseTypeReference.asGenericTypeParameter(structByValue: Boolean = false, emptyTypeParameters: Boolean = false): TypeName {
    if (this.isTypeParameter()) {
        return TypeVariableName(this.name)
    }
    if (this.genericParameters == null && !isArray) {
        return this.asClassName(structByValue)
    }
    if (this.name.contains("`")) {
        return this.copy(
            name = name.replaceAfter('`', "").dropLast(1)
        ).asGenericTypeParameter(structByValue, emptyTypeParameters)
    }
    if (this.isArray) {
        val nonArray = this.copy(isArray = false)
        return Array::class
            .asClassName()
            .parameterizedBy(
                nonArray.asGenericTypeParameter(structByValue, emptyTypeParameters)
                    .copy(!nonArray.isPrimitiveSystemType())
            )
    }
    val typeParameters = genericParameters!!.map {
        if (emptyTypeParameters) {
            STAR
        } else if (it.type == null) {
            TypeVariableName(it.name)
        } else if (it.type.namespace == "") {
            TypeVariableName(it.type.name)
        } else {
            it.type.asGenericTypeParameter(structByValue).copy(!it.type.isPrimitiveSystemType())
        }
    }.toList()

    if (this.isReference) {
        return ClassName(namespace, name)
            .nestedClass("ByReference")
            .parameterizedBy(typeParameters)
    }
    return ClassName(namespace, name).parameterizedBy(typeParameters)

}

private fun TypeSpec.Builder.generateParameterizedByReference(sparseInterface: SparseInterface) {
    val byReferenceInterfaceSpec = TypeSpec.classBuilder("ByReference").apply {
        addTypeParameters(sparseInterface)
        superclass(ByReference::class)
        addSuperclassConstructorParameter("%M", Native::class.member("POINTER_SIZE"))
        addSuperinterface(
            IByReference::class.asClassName()
                .parameterizedBy(sparseInterface.asTypeReference().asGenericTypeParameter())
        )

        if (sparseInterface.genericParameters != null) {
            addSuperinterface(ISpecializable::class)

            val typePropertySpec = PropertySpec.builder("type", KType::class.asTypeName().copy(nullable = true)).apply {
                mutable(true)
                initializer("null")
            }.build()

            addProperty(typePropertySpec)

            val specializeSpec = FunSpec.builder("specialize").apply {
                addModifiers(KModifier.OVERRIDE)
                addParameter("type", KType::class)
                addStatement("this.type = type")
            }.build()

            addFunction(specializeSpec)
        }

        val abi = (sparseInterface.asTypeReference().asClassName() as ClassName).nestedClass("ABI")
        val typeExpression = if (sparseInterface.genericParameters != null) {
            ", type!!"
        } else {
            ""
        }
        val getValueFn = FunSpec.builder("getValue").apply {
            addModifiers(KModifier.OVERRIDE)
            addCode(
                "return %T.make%T(pointer.getPointer(0)%L)",
                abi,
                sparseInterface.asTypeReference().asGenericTypeParameter(),
                typeExpression
            )
            returns(sparseInterface.asTypeReference().asGenericTypeParameter())
        }.build()
        addFunction(getValueFn)

        val setValueFn = FunSpec.builder("setValue").apply {
            addParameter("value", sparseInterface.asTypeReference().asGenericTypeParameter())
            addCode("pointer = value.%L!!", sparseInterface.pointerName())
        }.build()
        addFunction(setValueFn)

    }.build()

    addType(byReferenceInterfaceSpec)
}

fun SparseTypeReference.dropGenericParameterCount(): SparseTypeReference {
    if (!this.name.contains('`')) return this
    return this.copy(name = name.replaceAfter('`', "").dropLast(1))
}

private fun TypeSpec.Builder.addTypeParameters(sparseInterface: SparseInterface) {
    sparseInterface.genericParameters
        ?.map(SparseGenericParameter::name)
        ?.map(TypeVariableName::invoke)
        ?.forEach(this::addTypeVariable)
}

private fun TypeSpec.Builder.addSuperInterfaces(sparseInterface: SparseInterface) {
    addSuperinterface(NativeMapped::class)
    if (sparseInterface.genericParameters != null) {
        val normalized = sparseInterface.asTypeReference().normalize()
        addSuperinterface(normalized.asGenericTypeParameter(false))
    }
    addSuperinterface(IWinRTInterface::class)
    sparseInterface.superInterfaces
        .map {
//            if (lookUpTypeReference(it) is SparseInterface && !it.hasGenericParameter()) {
//                it.asClassName(nestedClass = "WithDefault")
//            }else {
//                it.asClassName()
//            }
            it.asClassName()

        }
        .forEach(this::addSuperinterface)

}

private fun TypeSpec.Builder.generateCompanion(sparseInterface: SparseInterface) {
    val companionSpec = TypeSpec.companionObjectBuilder().apply {
        generateMakeArrayFunction(sparseInterface)
        generateMakeArrayOfNullsFunction(sparseInterface)
    }.build()
    addType(companionSpec)
}

fun TypeSpec.Builder.generateMakeArrayOfNullsFunction(sparseInterface: SparseInterface) {
    val makeArrayOfNullsSpec = FunSpec.builder("makeArrayOfNulls").apply {
        addParameter("size", Int::class)
        val returnType = Array::class.asClassName().parameterizedBy(ClassName("", sparseInterface.name).copy(true))
        returns(returnType)
        val cb = CodeBlock.builder().apply {
            val implClassName = ClassName("", "${sparseInterface.name}_Impl")
            addStatement("return arrayOfNulls<%T>(size) as %T", implClassName, returnType)
        }.build()
        addCode(cb)
    }.build()
    addFunction(makeArrayOfNullsSpec)
}

private fun TypeSpec.Builder.generateMakeArrayFunction(sparseInterface: SparseInterface) {
    val makeArraySpec = FunSpec.builder("makeArray").apply {
        addParameter("elements", ClassName("", sparseInterface.name), KModifier.VARARG)
        returns(Array::class.asClassName().parameterizedBy(ClassName("", sparseInterface.name).copy(true)))
        val cb = CodeBlock.builder().apply {
            val interfaceClassName = ClassName("", sparseInterface.name)
            addStatement(
                "return (elements as Array<%T?>).castToImpl<%T,${sparseInterface.name}_Impl>()",
                interfaceClassName,
                interfaceClassName
            )
        }.build()
        addCode(cb)
    }.build()
    addFunction(makeArraySpec)
}

private fun TypeSpec.Builder.generateImplementation(
    sparseInterface: SparseInterface,
) {
    val implementationSpec = TypeSpec.classBuilder("${sparseInterface.name}_Impl").apply {
        superclass(PointerType::class)
        addSuperinterface(ClassName("", "WithDefault" ))
        addSuperInterfaces(sparseInterface)
        addSIProperties(sparseInterface)
        addPointerProperty(sparseInterface)
        addConstructor()
    }.build()
    addType(implementationSpec)
}

private fun TypeSpec.Builder.addSIProperties(sparseInterface: SparseInterface) {
    val superInterfaces = mutableMapOf<String, SparseTypeReference>()
    sparseInterface.superInterfaces.forEach { typeReference ->
        addSuperInterfacePtrProperties(sparseInterface, typeReference) {
            superInterfaces[it.getProjectedName()] = it
        }
    }

    superInterfaces.values.forEach {
        addSuperInterfacePtrProperty(sparseInterface, it)
    }
}

private fun TypeSpec.Builder.addSuperInterfacePtrProperties(
    thisInterface: SparseInterface,
    superInterface: SparseTypeReference,
    addProperty: (SparseTypeReference) -> Unit
) {
    val resolved = lookUpTypeReference(superInterface) as SparseInterface
    val projectedInterface = resolved
        .copy(genericParameters = superInterface.genericParameters)
        .projectAll()
    addProperty(superInterface)
    projectedInterface.superInterfaces.forEach {
        addSuperInterfacePtrProperties(thisInterface, it, addProperty)
    }
}


private fun TypeSpec.Builder.addSuperInterfacePtrProperty(
    thisInterface: SparseInterface,
    superInterface: SparseTypeReference
) {
    val ptrSpec = PropertySpec.builder(
        superInterface.getInterfacePointerName(),
        jnaPointer,
        KModifier.OVERRIDE
    ).apply {
        val delegateCb = CodeBlock.builder().apply {
            beginControlFlow("lazy")
            val memberName = if (superInterface.genericParameters != null) {
                "PIID"
            } else {
                "IID"
            }
            val iid = (superInterface.asClassName() as ClassName).nestedClass("ABI").member(memberName)
            addStatement("val refiid = %T(%M)", REFIID::class, iid)
            addStatement("val result = %T()", PointerByReference::class)
            val iUnknownVtbl = IUnknownVtbl::class
            addStatement("%T(${thisInterface.vtblName()}).queryInterface(pointer,refiid,result)", iUnknownVtbl)
            addStatement("result.value")
            endControlFlow()
        }.build()
        delegate(delegateCb)
    }.build()

    addProperty(ptrSpec)
}

private fun TypeSpec.Builder.addPointerProperty(sparseInterface: SparseInterface) {
    val getter = FunSpec.getterBuilder()
        .addCode("return pointer")
        .build()

    val pointerPropertySpec =
        PropertySpec.builder(sparseInterface.pointerName(), Pointer::class.asClassName().copy(true))
            .getter(getter)
            .addModifiers(KModifier.OVERRIDE)
            .build()
    addProperty(pointerPropertySpec)
}

private fun SparseInterface.pointerName() =
    this.asTypeReference().getInterfacePointerName()

private fun TypeSpec.Builder.addByReferenceType(sparseInterface: SparseInterface) {
    val brAnnotationSpec = AnnotationSpec.builder(WinRTByReference::class)
        .addMember("brClass = %L.ByReference::class", sparseInterface.name)
        .build()
    addAnnotation(brAnnotationSpec)
    val spec = TypeSpec.classBuilder("ByReference").apply {
        addSuperinterface(IByReference::class.asClassName().parameterizedBy(ClassName("", sparseInterface.name)))
        generateByReferenceInterface(sparseInterface)
    }.build()
    addType(spec)
}

internal fun TypeSpec.Builder.generateByReferenceInterface(entity: SparseInterface) {
    val className = ClassName("", entity.name)

    superclass(ByReference::class)
    val ptrSize = Native::class.member("POINTER_SIZE")
    addSuperclassConstructorParameter("%M", ptrSize)
    if (entity.genericParameters != null) {
        val superinterface = ClassName(entity.namespace, entity.name.replaceAfter('_', "").dropLast(1))
            .nestedClass("ByReference")
            .parameterizedBy(entity.genericParameters.mapNotNull {
                it.type?.asGenericTypeParameter(false)?.copy(!it.type.isPrimitiveSystemType())
            })

        addSuperinterface(superinterface)
    }

    val getValueSpec = FunSpec.builder("getValue").apply {
        addModifiers(KModifier.OVERRIDE)
        addCode("return ABI.make${entity.name}(pointer.getPointer(0))", className)
    }.build()
    addFunction(getValueSpec)

    val setValueSpec = FunSpec.builder("setValue").apply {
        addParameter("value", ClassName("", "${entity.name}_Impl"))
        addCode("pointer.setPointer(0, value.pointer)")
    }.build()
    addFunction(setValueSpec)
}

private fun TypeSpec.Builder.addABI(sparseInterface: SparseInterface, lookUp: LookUp) {
    val abiSpec = TypeSpec.objectBuilder("ABI").apply {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sparseInterface.asTypeReference().asClassName(),
                MemoryAddress::class.asClassName()
            )
        )

        generateMakeFunction(sparseInterface)
        addIIDProperty(sparseInterface)
        addFromNative(sparseInterface)
        addPtrToNative(sparseInterface, sparseInterface.pointerName())
        addLayout()
    }.build()
    addType(abiSpec)
}

private fun TypeSpec.Builder.addLayout() {
    val layoutProperty = PropertySpec.builder("layout", ValueLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        initializer("%M", ValueLayout::class.member("ADDRESS"))
    }.build()
    addProperty(layoutProperty)
}

private fun TypeSpec.Builder.addFromNative(sparseInterface: SparseInterface) {
    val fromNative = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("segment", MemoryAddress::class)
        returns(sparseInterface.asTypeReference().asClassName())
        addStatement("val address = segment.toRawLongValue()", ValueLayout::class.member("ADDRESS"))
        addStatement("return make${sparseInterface.name}(%T(address))".fixSpaces(), Pointer::class)
    }.build()
    addFunction(fromNative)
}

private fun TypeSpec.Builder.generateMakeFunction(sparseInterface: SparseInterface) {
    val makeFn = FunSpec.builder("make${sparseInterface.name}").apply {
        addParameter("ptr", Pointer::class.asClassName().copy(true))
        returns(ClassName("", "WithDefault"))
        addCode("return %T(ptr)", ClassName("", "${sparseInterface.name}_Impl"))
    }.build()
    addFunction(makeFn)
}

private fun TypeSpec.Builder.addIIDProperty(sparseInterface: SparseInterface) {
    val iidSpec = PropertySpec.builder("IID", Guid.IID::class.asClassName()).apply {
        this.initializer("%T(%S)", Guid.IID::class.asClassName(), sparseInterface.guid)
    }.build()
    addProperty(iidSpec)
}

private fun TypeSpec.Builder.addPIIDProperty(
    sparseInterface: SparseInterface,
    lookUp: LookUp
) {
    val piid = GuidGenerator.createIID(sparseInterface.asTypeReference(), lookUp)!!.toGuidString()
        .filter { it.isLetterOrDigit() }
        .lowercase()

    val piidSpec = PropertySpec.builder("PIID", Guid.IID::class).apply {
        initializer(CodeBlock.of("%T(%S)", Guid.IID::class, piid))
    }.build()
    addProperty(piidSpec)
}

private fun TypeSpec.Builder.addMethods(
    sparseInterface: SparseInterface,
    withMethodBody: Boolean = true
) {
    sparseInterface.methods
        .mapIndexed { index, method ->

            FunSpec.builder(method.name).apply {
                addInterfaceMethodAnnotation(index)
                if (sparseInterface.genericParameters != null) {
                    addModifiers(KModifier.OVERRIDE)
                }
                method.parameters.forEach {
                    if (it.type.genericParameters != null) {
                        addParameter(
                            it.name,
                            it.type.asGenericTypeParameter(false)
                                .copy(!it.type.isPrimitiveSystemType() && !it.type.isArray)
                        )
                    } else {
                        addParameter(it.name, it.type.asClassName(false, nullable = !it.type.isPrimitiveSystemType()))
                    }

                }
                if(withMethodBody) {
                    addInterfaceMethodBody(method, index, sparseInterface)
                    addModifiers(KModifier.OVERRIDE)
                } else {
                    addModifiers(KModifier.ABSTRACT)
                }
                if (!method.returnType.isVoid()) returns(
                    method.returnType.asGenericTypeParameter(false)
                        .copy(!method.returnType.isPrimitiveSystemType())
                )
            }.build()
        }.forEach(this::addFunction)
}

private fun FunSpec.Builder.addInterfaceMethodAnnotation(index: Int) {
    val spec = AnnotationSpec.builder(InterfaceMethod::class).apply {
        addMember("$index")
    }.build()
    addAnnotation(spec)
}

private fun FunSpec.Builder.addInterfaceMethodBody(method: SparseMethod, index: Int, sparseInterface: SparseInterface) {
    val cb = CodeBlock.builder().apply {
        generateInterfaceMethodBody(method, index, sparseInterface)
    }.build()
    addCode(cb)
}

private fun CodeBlock.Builder.generateInterfaceMethodBody(
    method: SparseMethod,
    index: Int,
    sparseInterface: SparseInterface
) {
    val pointerSize = Native::class.member("POINTER_SIZE")
    val stdConvention = JNAFunction::class.member("ALT_CONVENTION")
    addStatement("val fnPtr = ${sparseInterface.vtblName()}!!.getPointer(${index + 6}L * %M)", pointerSize)
    addStatement("val fn = %T.getFunction(fnPtr, %M)", JNAFunction::class, stdConvention)

    if (!method.returnType.isVoid()) {
        val outArrayType = if (method.returnType.copy(isArray = false).isPrimitiveSystemType()) {
            "Primitive"
        } else {
            ""
        }
        if (method.returnType.isArray) {
            addStatement(
                "val result = make${outArrayType}OutArray<%T>()",
                method.returnType.copy(isArray = false, isReference = false).asGenericTypeParameter()
            )
        } else {
            addStatement("val result = makeByReferenceType<%T>()", method.returnType.asGenericTypeParameter())
        }
    }

    add("val hr = fn.invokeHR(arrayOf(${sparseInterface.pointerName()}, ")
//    add(marshalledNames.joinToString())

    add(
        method.parameters
            .map {
                return@map it.copy(
                    name = if (reservedWords.contains(it.name)) {
                        "`${it.name}`"
                    } else {
                        it.name
                    }
                )
            }.joinToString {
                if (it.type.isPrimitiveSystemType()) {
                    it.name
                } else {
                    (if (it.type.isArray) "${it.name}.size," else "")  +
                    "marshalToNative(${it.name})"
                }
            }
    )

    if (method.parameters.isNotEmpty()) {
        add(",")
    }

    if (!method.returnType.isVoid()) {
        add(" result")
    }
    add("))\n")

    beginControlFlow("if (hr.toInt() != 0) {")
    addStatement("throw %T(hr.toString())", RuntimeException::class.asClassName())
    endControlFlow()

    if (method.returnType.isVoid()) return

//    val returnMarshaller = Marshaller.marshals.getOrDefault(method.returnType.asKClass(), Marshaller.default)
//    val (unmarshalledName, unmarshallingCode) = returnMarshaller.generateFromNativeMarshalCode("resultValue")

    if (method.returnType.isArray) {
        add("val resultValue = result.array")
        if (!method.returnType.isSystemType() && lookUpTypeReference(
                method.returnType.copy(
                    isArray = false,
                    isReference = false
                )
            ) is SparseStruct
        ) {
            add(" as %T", method.returnType.copy(isReference = false).asClassName())
        }
        add("\n")
    } else {
        addStatement(
            "val resultValue = marshalFromNative<%T>(result.getValue())",
            method.returnType.asGenericTypeParameter(false)
        )
    }
    val nullable = if (method.returnType.isPrimitiveSystemType()) {
        "!!"
    } else {
        ""
    }

    addStatement("return resultValue$nullable")
}

private fun SparseTypeReference.isVoid(): Boolean {
    return namespace == "System" && name == "Void"
}

private fun TypeSpec.Builder.addConstructor() {
    val constructorSpec = FunSpec.constructorBuilder().apply {
        val ptrParameterSpec = ParameterSpec.builder("ptr", Pointer::class.asClassName().copy(true))
            .defaultValue("%M", ptrNull)
            .build()
        addParameter(ptrParameterSpec)
    }.build()
    primaryConstructor(constructorSpec)
    addSuperclassConstructorParameter("ptr")

}

fun SparseInterface.vtblName(): String {
    return "${asTypeReference().hashID()}_VtblPtr"
}

fun SparseInterface.typeName(): String {
    return asTypeReference().getInterfaceTypeName()
}

private fun TypeSpec.Builder.addVtblPtrProperty(sparseInterface: SparseInterface) {
    val getterSpec = FunSpec.getterBuilder().addCode("return ${sparseInterface.pointerName()}?.getPointer(0)").build()

    val vtblPtrSpec = PropertySpec.builder(sparseInterface.vtblName(), Pointer::class.asClassName().copy(true))
        .getter(getterSpec)
        .build()

    addProperty(vtblPtrSpec)
}

private fun FileSpec.Builder.addImports() {
    addImport("com.github.knk190001.winrtbinding.runtime", "handleToString")
    addImport("com.github.knk190001.winrtbinding.runtime", "toHandle")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "makeOutArray")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "makeByReferenceType")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "marshalToNative")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "marshalFromNative")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "makePrimitiveOutArray")
    addImport("com.github.knk190001.winrtbinding.runtime", "invokeHR")
    addImport("com.github.knk190001.winrtbinding.runtime", "castToImpl")
    addImport("com.github.knk190001.winrtbinding.runtime", "getValue")
    addImport("com.github.knk190001.winrtbinding.runtime", "getValue")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "marshalToNative")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "marshalFromNative")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "guidOf")
    addImport("kotlin.reflect.full", "createType")
    addImport("kotlin.reflect", "typeOf")
}

