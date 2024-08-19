package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.ArrayType
import com.github.knk190001.winrtbinding.generator.model.arrayType
import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.runtime.CallScope
import com.github.knk190001.winrtbinding.runtime.abi.*
import com.github.knk190001.winrtbinding.runtime.annotations.*
import com.github.knk190001.winrtbinding.runtime.base.IObjectReference
import com.github.knk190001.winrtbinding.runtime.base.ReferenceType
import com.github.knk190001.winrtbinding.runtime.com.IInspectable
import com.github.knk190001.winrtbinding.runtime.interop.Event
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.objects.Vtbl
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmStatic
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.REFIID
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.ref.Reference
import kotlin.reflect.*

fun generateInterface(sparseInterface: SparseInterface): FileSpec {
    return FileSpec.builder(sparseInterface.namespace, sparseInterface.name).apply {
        addImports()
        addInterfaceTypeSpec(sparseInterface)
    }.build()
}

private fun FileSpec.Builder.addInterfaceTypeSpec(sparseInterface: SparseInterface) {
    val parameterizedInterface = TypeSpec.interfaceBuilder(sparseInterface.name).apply {
        if (sparseInterface.isGeneric) {
            addAnnotation(GenericType::class)
        }

        addABIAnnotation(sparseInterface.asClassName())
        addGuidAnnotation(sparseInterface.guid)
        if (!sparseInterface.isGeneric) {
            addSignatureAnnotation(sparseInterface)
        }
        addInterfaceTypeProperty(sparseInterface)
        addTypeParameters(sparseInterface)
        addSuperInterfaces(sparseInterface)
        addMethods(sparseInterface, false)
        addWithDefaultType(sparseInterface)
        addProperties(sparseInterface, false)
        addEvents(sparseInterface.asTypeReference(), false)
        generateImplType(sparseInterface)
        generateABI(sparseInterface)
        addTypeProperties(sparseInterface)
        addNativeWrapperObject(sparseInterface)
    }.build()
    addType(parameterizedInterface)
}

private fun TypeSpec.Builder.addProperties(sparseInterface: SparseInterface, withMethodBody: Boolean) {
    sparseInterface.properties().map { (getMethod, setMethod) ->
        generateProperty(getMethod, setMethod, sparseInterface, withMethodBody)
    }.forEach { addProperty(it) }
}

fun generateProperty(
    getter: SparseMethod?,
    setter: SparseMethod?,
    sparseInterface: SparseInterface,
    withMethodBody: Boolean
): PropertySpec {
    val isArrayProperty = getter?.returnType?.isArray ?: setter!!.parameters.single().type.isArray
    val propertyType = getter?.returnType ?: setter!!.parameters.single().type
    val propertyTypeName: TypeName = if (isArrayProperty) {
        val componentType = propertyType.copy(isArray = false)
        MUTABLE_LIST.parameterizedBy(
            componentType.asTypeName(
                nullable = componentType.isNullable(),
                usage = ClassNameUsage.ApiSurface
            )
        )
    } else propertyType.asTypeName(nullable = propertyType.isNullable(), usage = ClassNameUsage.ApiSurface)
    val propertyName = getter?.name?.substringAfter("get_") ?: setter!!.name.substringAfter("put_")

    return PropertySpec.builder(propertyName, propertyTypeName).apply {
        if (sparseInterface.superInterfaces.any {
                val superInterface = lookUpTypeReference(it) as SparseInterface
                superInterface.properties()
                    .any { (superGetter, _) ->
                        superGetter != null && superGetter.name.substringAfter('_') == propertyName
                    }
            }) {
            addModifiers(KModifier.OVERRIDE)
        }
        mutable(setter != null)
        if (!withMethodBody) {
            addPropertyAnnotations(getter, setter, sparseInterface)
            return@apply
        }
        addModifiers(KModifier.OVERRIDE)
        if (getter != null) {
            getter(
                generateInterfaceMethod(
                    getter,
                    sparseInterface,
                    sparseInterface.methods.indexOf(getter),
                    true,
                    FunctionType.Getter
                )
            )
        } else {
            getter(FunSpec.getterBuilder().addStatement("throw %T()", UnsupportedOperationException::class).build())
        }

        if (setter != null) {
            AnnotationSpec.builder(InterfaceMethod::class)
            setter(
                generateInterfaceMethod(
                    setter,
                    sparseInterface,
                    sparseInterface.methods.indexOf(setter),
                    true,
                    FunctionType.Setter
                )
            )
        }
    }.build()
}

private fun PropertySpec.Builder.addPropertyAnnotations(
    getter: SparseMethod?,
    setter: SparseMethod?,
    sparseInterface: SparseInterface
) {
    if (getter != null) {
        val getterIndex = sparseInterface.methods.indexOf(getter)
        val getterAnnotation = AnnotationSpec.builder(InterfaceMethod::class).apply {
            addMember("%L", getterIndex)
            useSiteTarget(AnnotationSpec.UseSiteTarget.GET)
        }.build()
        addAnnotation(getterAnnotation)
    }

    if (setter != null) {
        val setterIndex = sparseInterface.methods.indexOf(setter)
        val setterAnnotation = AnnotationSpec.builder(InterfaceMethod::class).apply {
            addMember("%L", setterIndex)
            useSiteTarget(AnnotationSpec.UseSiteTarget.SET)
        }.build()
        addAnnotation(setterAnnotation)
    }
}


private fun TypeSpec.Builder.addNativeHandlesProperty(
    sparseInterface: SparseInterface,
    typeParameter: Boolean = false
) {
    val nativeHandleProperty = PropertySpec.builder("handles", typeOf<Map<Int, MethodHandle>>().asTypeName()).apply {
        addModifiers(KModifier.OVERRIDE)
        getter(FunSpec.getterBuilder().apply {
            addAnnotation(NativeFunctionMarker::class)

            val getterCb = buildCodeBlock {
                add("return mapOf(")
                sparseInterface.methods.forEachIndexed(addMethodHandleExpression(typeParameter, sparseInterface))
                add(")")
            }
            addCode(getterCb)
        }.build())

    }.build()
    addProperty(nativeHandleProperty)
}

private fun CodeBlock.Builder.addMethodHandleExpression(
    typeParameter: Boolean,
    sparseInterface: SparseInterface
): (index: Int, SparseMethod) -> Unit = { i, sparseMethod ->
    add("$i to ")
    add(
        "%T.lookup().findStatic(NativeWrappers::class.java, %S, ",
        MethodHandles::class,
        "${sparseMethod.name}$i"
    )
    add("%T.methodType(%T::class.java, ", MethodType::class, Int::class.java)
    if (typeParameter) {
        add("%T::class.java, ", KType::class)
    }
    add("%T::class.java, ", sparseInterface.asClassName())
    add("%T::class.java, ", MemorySegment::class)
    sparseMethod.parameters.flatMap {
        when (it.arrayType()) {
            ArrayType.None -> listOf(it.type.foreignType())
            ArrayType.PassArray -> listOf(Int::class, MemorySegment::class)
            ArrayType.FillArray -> listOf(Int::class, MemorySegment::class)
            ArrayType.ReceiveArray -> listOf(MemorySegment::class, MemorySegment::class)
        }
    }.forEach { add("%T::class.java, ", it) }
    if (!sparseMethod.returnType.isVoid()) {
        if (sparseMethod.returnType.isArray) {
            add("%T::class.java, ", MemorySegment::class)
        }
        add("%T::class.java ", MemorySegment::class)
    }
    add(")), ")
}

fun CodeBlock.Builder.addToManagedStatementForParameter(
    param: SparseParameter,
    typeParameterIndexMap: Map<String, Int>
): String {

    val managedName = "${param.name}_Managed"
    val paramName = if (reservedWords.contains(param.name)) {
        "`${param.name}`"
    } else {
        param.name
    }
    when (param.arrayType()) {
        ArrayType.None -> {}
        ArrayType.PassArray -> {
            return addArrayToManagedStatement(param, typeParameterIndexMap, managedName, paramName)
        }

        ArrayType.FillArray -> {
            return addArrayToManagedStatement(param, typeParameterIndexMap, managedName, paramName)
        }

        ArrayType.ReceiveArray -> {
            addReceiveArrayToManagedStatement(param, managedName)
            return managedName
        }
    }


    //Primitives and Primitive References
    if (param.type.isPrimitiveSystemType() && !param.type.isReference) {
        return addPrimitiveToManagedStatement(param, managedName, paramName)
    } else if (param.type.isPrimitiveSystemType() && param.type.isReference) {
        addStatement(
            "val $managedName = %T($paramName)",
            param.type.byReferenceClassName()
        )
        return managedName
    }

    //Type Parameters
    if (param.type.isTypeParameter()) {
        addStatement(
            "val ${param.name}_Type = ${
                kTypeStringFor(
                    param.type,
                    typeParameterIndexMap,
                    typeVarName = "_type"
                )
            }"
        )
        addStatement(
            "val $managedName = runtimeFromNativeJF<%T>($paramName, ${param.name}_Type) as ${param.type.name}",
            Any::class
        )
        return managedName
    }
    //Delegates, and Interfaces
    if (!param.type.isReference && !param.type.isSystemTypeOrObject() && lookUpTypeReference(param.type) is IParameterizable<*>) {
        val typeString = if (param.type.isGeneric) {
            addStatement(
                "val ${param.name}_Type = ${
                    kTypeStringFor(
                        param.type,
                        typeParameterIndexMap,
                        typeVarName = "_type"
                    )
                }"
            )
            "${param.name}_Type, "
        } else ""

        add(
            "val $managedName = %T.fromNative(${typeString}$paramName)",
            param.type.asClassName(nestedClass = "ABI")
        )
        if(substitutions.containsKey(param.type.fullName()) || param.type.isGeneric) {
            add(" as %T", param.type.asTypeName(usage = ClassNameUsage.ApiSurface))
        }
        addStatement("")
        return managedName
    }

    //Structs by reference
    if ((param.type.isReference && !param.type.isSystemTypeOrObject() && lookUpTypeReference(param.type) is SparseStruct) || (param.type.isReference && param.type.isSystemType(
            "Guid"
        ))
    ) {
        addStatement(
            "val ${paramName}_Type = ${
                kTypeStringFor(
                    param.type.copy(isReference = false),
                    typeParameterIndexMap,
                    typeVarName = "_type"
                )
            }"
        )
        addStatement(
            "val $managedName = %T(%T.createType(${paramName}_Type), $paramName)",
            param.type.asTypeName(),
            PointerTo::class
        )
        return managedName
    }

    //Guids
    if (param.type.isSystemType() && param.type.name == "Guid") {
        addStatement("val $managedName = guidFromNative($paramName)")
        return managedName
    }

    if (param.type.isReference) {
        addStatement(
            "val ${param.name}_Type = ${
                kTypeStringFor(
                    param.type.copy(isReference = false),
                    typeParameterIndexMap,
                    typeVarName = "_type"
                )
            }"
        )
        addStatement(
            "val $managedName = %T(%T.createType(${param.name}_Type), $paramName)",
            param.type.asTypeName(),
            PointerTo::class
        )
        return managedName
    }

    //Else
    val withOutReference = param.type.copy(isReference = false)
    addStatement(
        "val $managedName = (abiOf<%T>() as %T<%T, %T>).fromNative($paramName)",
        withOutReference.asClassName(),
        IABI::class,
        withOutReference.asClassName(),
        withOutReference.foreignType()
    )

    return managedName
}

private fun CodeBlock.Builder.addReceiveArrayToManagedStatement(
    param: SparseParameter,
    managedName: String
): String {
    val componentType = param.type.copy(isArray = false, isReference = false)
    val componentClassName = componentType.asClassName()
        .copy(nullable = componentType.isNullable())
    addStatement("val $managedName = mutableListOf<%T>()", componentClassName)
    return managedName
}

private fun CodeBlock.Builder.addPrimitiveToManagedStatement(
    param: SparseParameter,
    managedName: String,
    paramName: String
): String {
    when (param.type.name) {
        "Boolean" -> {
            addStatement("val $managedName = $paramName != 0.toByte()", param.type.asClassName())
            return managedName
        }

        "UInt64" -> {
            addStatement("val $managedName = $paramName.toULong()")
            return managedName
        }

        "UInt32" -> {
            addStatement("val $managedName = $paramName.toUInt()")
            return managedName
        }

        "UInt16" -> {
            addStatement("val $managedName = $paramName.toUShort()")
            return managedName
        }

        "Byte" -> {
            addStatement("val $managedName = $paramName.toUByte()")
            return managedName
        }

        else -> {
            return param.name
        }
    }
}

private fun CodeBlock.Builder.addArrayToManagedStatement(
    param: SparseParameter,
    typeParameterIndexMap: Map<String, Int>,
    managedName: String,
    paramName: String
): String {
    val componentType = param.type.copy(isArray = false)
    add("val ${param.name}_Type = ")
    add(buildCodeBlock {
        kTypeStatementFor(componentType, typeParameterIndexMap, root = true, typeVarName = "_type")
        addStatement("")
    })
    addStatement(
        "val $managedName = arrayFromNative<%T>(${param.name}_Type, ${param.name}_size, ${paramName})",
        componentType.asTypeName(nullable = componentType.isNullable())
    )
    return managedName
}


private fun TypeSpec.Builder.addNativeWrapperObject(sparseInterface: SparseInterface) {
    val nativeWrapperObjSpec = TypeSpec.objectBuilder("NativeWrappers").apply {
        if (!sparseInterface.isGeneric) {
            addSuperinterface(INativeHandleProvider::class)
            val iidProperty = PropertySpec.builder("guid", Guid.IID::class, KModifier.OVERRIDE).apply {
                getter(FunSpec.getterBuilder().apply {
                    addCode("return ABI.IID")
                }.build())
            }.build()
            addProperty(iidProperty)
        } else {
            addSuperinterface(IParameterizedNativeHandleProvider::class)
        }

        sparseInterface.methods
            .mapIndexed { idx, method ->
                generateParameterizedNativeFn(idx, sparseInterface, method)
            }.forEach(::addFunction)

        addNativeHandlesProperty(sparseInterface, sparseInterface.isGeneric)
    }.build()
    addType(nativeWrapperObjSpec)
}

private fun String.escapeReserved(): String {
    return if (reservedWords.contains(this)) "`${this}`" else this
}

private fun generateParameterizedNativeFn(idx: Int, sparseInterface: SparseInterface, method: SparseMethod): FunSpec {
    val nativeFn = FunSpec.builder("${method.name}$idx").apply {
        jvmStatic()
        if (sparseInterface.isGeneric) {
            addTypeParameters(sparseInterface)
        }
        returns(INT)

        if (sparseInterface.isGeneric) {
            addParameter("_type", KType::class)
        }

        addParameter("_thisObj", sparseInterface.asTypeName())
        addParameter("_thisPtr", MemorySegment::class)
        method.parameters.flatMap {
            when (it.arrayType()) {
                ArrayType.None -> listOf(it.name to it.type.foreignType())
                ArrayType.FillArray -> listOf(
                    "${it.name}_size" to Int::class,
                    it.name to MemorySegment::class
                )

                ArrayType.PassArray -> listOf(
                    "${it.name}_size" to Int::class,
                    it.name to MemorySegment::class
                )

                ArrayType.ReceiveArray -> listOf(
                    "${it.name}_size" to MemorySegment::class,
                    it.name to MemorySegment::class
                )
            }
        }.forEach { addParameter(it.first, it.second) }

        if (!method.returnType.isVoid()) {
            if (method.returnType.isArray) {
                addParameter("_return_Size", MemorySegment::class)
            }
            addParameter("_returnAddr", MemorySegment::class)
        }

        val cb = if (method.isEventComponent()) {
            generateNativeToJVMForEvent(sparseInterface, method)
        } else {
            generateNativeToJVMBody(sparseInterface, method)
        }
        addCode(cb)
    }.build()
    return nativeFn
}

private fun generateNativeToJVMForEvent(sparseInterface: SparseInterface, method: SparseMethod): CodeBlock {
    val typeParameterIndexMap = sparseInterface.genericParameters
        ?.mapIndexed { idx, it -> it.name to idx }
        ?.toMap() ?: emptyMap()

    val cb = buildCodeBlock {
        beginControlFlow("try")
        val managedNames = method.parameters.map {
            addToManagedStatementForParameter(it, typeParameterIndexMap)
        }
        val eventName = method.name.substringAfter("_")
        val nullableAny = Any::class.asTypeName().copy(nullable = true)
        addStatement("val _event = _thisObj.${eventName} as %T<%T, %T>", Event::class, nullableAny, nullableAny)
        if (method.isAddEvent()) {
            addStatement("val _result = _event.nativeAdd(${managedNames.single()})")
            add("val _result_Type = ")
            kTypeStatementFor(
                method.returnType.copy(isArray = false, isReference = false),
                typeParameterIndexMap,
                root = true,
                typeVarName = "_type"
            )
            addStatement("")
            addStatement("val _result_ABI = abiOf(_result_Type.jvmErasure) as %T", typeNameOf<IBaseABI<Any?, Any?>>())
            addStatement("_result_ABI.copyTo(_result, _returnAddr)")
        } else {
            addStatement("_event.nativeRemove(${managedNames.single()})")
        }
        addStatement("return 0")
        nextControlFlow("catch (e: Throwable)")
        addStatement("e.printStackTrace()")
        addStatement("return %T.E_FAIL", WinNT::class)
        endControlFlow()
    }
    return cb
}

private fun generateNativeToJVMBody(
    sparseInterface: SparseInterface,
    method: SparseMethod
): CodeBlock {
    val typeParameterIndexMap = sparseInterface.genericParameters
        ?.mapIndexed { idx, it -> it.name to idx }
        ?.toMap() ?: emptyMap()

    val cb = CodeBlock.builder().apply {
        beginControlFlow("try")
        val managedNames = method.parameters.map {
            addToManagedStatementForParameter(it, typeParameterIndexMap)
        }
        if (!method.returnType.isVoid()) {
            add("val _result = ")
        }

        if (method.isPropertyComponent()) {
            val propertyName = method.name.substringAfter("_")
            if (method.isGetter()) {
                addStatement("_thisObj.$propertyName")
            } else {
                add("_thisObj.$propertyName = ${managedNames.single()}")
                if (method.parameters.single().type.isArray) {
                    add(".toMutableList()")
                }
                addStatement("")
            }
        } else {
            addStatement("_thisObj.${method.name}(${managedNames.joinToString()})")
        }
        method.parameters
            .filter { it.arrayType() == ArrayType.FillArray }
            .forEach {
                addStatement("writeArrayTo(${it.name}_Type, ${it.name}_Managed, ${it.name})")
            }

        method.parameters
            .filter { it.arrayType() == ArrayType.ReceiveArray }
            .forEach {
                addStatement(
                    "val ${it.name}_Type = ${
                        kTypeStringFor(
                            it.type.copy(
                                isArray = false,
                                isReference = false
                            ), typeParameterIndexMap,
                            typeVarName = "_type"
                        )
                    }"

                )
                addStatement("writeListIntoBuffer(${it.name}_Type, ${it.name}_size, ${it.name.escapeReserved()}, ${it.name}_Managed)")
            }

        method.parameters
            .filter {
                it.arrayType() == ArrayType.None && !it.type.isSystemType() && it.type.isReference && (it.type.isSystemType(
                    "Object"
                ) || lookUpTypeReference(it.type).isReferenceType())
            }
            .forEach {
                addStatement("addRefOutgoing(${it.name}_Type, ${it.name})")
            }

        if (!method.returnType.isVoid()) {
            add("val _result_Type = ")
            kTypeStatementFor(
                method.returnType.copy(isArray = false, isReference = false),
                typeParameterIndexMap,
                root = true,
                typeVarName = "_type"
            )
            addStatement("")
            if (method.returnType.isArray) {
                addStatement("writeListIntoBuffer(_result_Type, _return_Size, _returnAddr, _result)")
            } else {
                addStatement(
                    "val _result_ABI = abiOf(_result_Type.jvmErasure) as %T",
                    typeNameOf<IBaseABI<Any?, Any?>>()
                )
                addStatement("_result_ABI.copyTo(_result, _returnAddr)")
                if (!method.returnType.isSystemType() && (method.returnType.isTypeParameter() || method.returnType.isSystemType(
                        "Object"
                    ) || lookUpTypeReference(method.returnType).isReferenceType())
                ) {
                    addStatement("addRefOutgoing(_result_Type, _returnAddr)")
                }
            }
        }
        unindent()
        addStatement("return 0")
        addStatement("} catch (e: Throwable) {")
        indent()
        addStatement("e.printStackTrace()")
        addStatement("return %T.E_FAIL", WinNT::class)
        endControlFlow()
    }.build()
    return cb
}

private fun TypeSpec.Builder.addTypeProperties(sparseInterface: SparseInterface) {
    val typeAnnotationSpec = AnnotationSpec.builder(TypeHash::class)
        .addMember("%S", sparseInterface.getInterfaceTypeName()).build()
    addAnnotation(typeAnnotationSpec)
    sparseInterface.superInterfaces
        .filter { it.isGeneric }
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

private fun TypeSpec.Builder.generateABI(sparseInterface: SparseInterface) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        addABISuperInterface(sparseInterface)

        val handleProviderType: KClass<*> =
            if (!sparseInterface.isGeneric) INativeHandleProvider::class
            else IParameterizedNativeHandleProvider::class
        addSuperinterface(handleProviderType, CodeBlock.of("NativeWrappers"))

        addParameterizedFromNative(sparseInterface)
        addPtrToNative(sparseInterface)
        addLayout()

        if (substitutions[sparseInterface.fullName()] != null) {
            addJVMToNativeSubstitution(sparseInterface)
        }

        addLinkerProperty()
        addDownCallHandles(sparseInterface)
        addDowncallHandlesProperty(sparseInterface)
    }.build()
    addType(abi)
}

fun TypeSpec.Builder.addLinkerProperty() {
    addProperty(
        PropertySpec.builder("linker", Linker::class).apply {
            addModifiers(KModifier.PRIVATE)
            initializer("%T.nativeLinker()", Linker::class)
        }.build()
    )
}

private fun TypeSpec.Builder.addDowncallHandlesProperty(sparseInterface: SparseInterface) {
    if (sparseInterface.isGeneric) {
        val property = PropertySpec.builder(
            "downcallHandles",
            memoizedDowncallHandleType
        ).apply {
            addModifiers(KModifier.INTERNAL)
            initializer("memoize(::getDownCallHandlesForType)")
        }.build()
        addProperty(property)
    }
}

var memoizedDowncallHandleType = LambdaTypeName.get(
    null,
    listOf(ParameterSpec("type", KType::class.asTypeName())),
    LIST.parameterizedBy(MethodHandle::class.asClassName())
)

private fun generateListOfDowncallHandles(sparseInterface: SparseInterface): CodeBlock {
    return buildCodeBlock {
        add("listOf(")
        indent()
        sparseInterface.methods.forEach {
            add(downcallPropertyInitializer(sparseInterface, it))
            addStatement(",")
        }
        unindent()
        add(")")
    }
}

private fun TypeSpec.Builder.addDownCallHandles(sparseInterface: SparseInterface) {
    if (sparseInterface.isGeneric) {
        addDowncallHandleListFunction(sparseInterface)
    } else {
        addConstantDowncallHandleList(sparseInterface)
    }
}

private fun TypeSpec.Builder.addDowncallHandleListFunction(sparseInterface: SparseInterface) {
    val funSpec = FunSpec.builder("getDownCallHandlesForType").apply {
        addModifiers(KModifier.INTERNAL)
        addParameter("type", KType::class)
        returns(LIST.parameterizedBy(MethodHandle::class.asClassName()))
        addCode(buildCodeBlock {
            add("${nbsp}return ")
            add(generateListOfDowncallHandles(sparseInterface))
        })
    }.build()
    addFunction(funSpec)
}

private fun TypeSpec.Builder.addConstantDowncallHandleList(sparseInterface: SparseInterface) {
    val propertySpec =
        PropertySpec.builder("downcallHandles", LIST.parameterizedBy(MethodHandle::class.asClassName())).apply {
            addModifiers(KModifier.INTERNAL)
            initializer(generateListOfDowncallHandles(sparseInterface))
        }.build()
    addProperty(propertySpec)
}

fun TypeSpec.Builder.addDownCallProperty(
    method: SparseMethod,
    type: IParameterizable<*>,
    methodIdx: Int,
    name: String = "${method.name}_$methodIdx"
) {
    val propertySpec = PropertySpec.builder(name, MethodHandle::class).apply {
        initializer(downcallPropertyInitializer(type, method))
    }.build()
    addProperty(propertySpec)
}

fun downcallPropertyInitializer(
    type: IParameterizable<*>,
    method: SparseMethod,
): CodeBlock {
    val typeParameterIndices = type.genericParameters
        ?.mapIndexed { index, sparseGenericParameter -> sparseGenericParameter.name to index }
        ?.toMap() ?: emptyMap()
    val intValueLayout = ValueLayout::class.member("JAVA_INT")
        .let { CodeBlock.of("%M", it) }
    val addressValueLayout = ValueLayout::class.member("ADDRESS")
        .let { CodeBlock.of("%M", it) }

    return buildCodeBlock {
        add("linker.downcallHandle(")
        add("%T.of(", FunctionDescriptor::class)
        add(intValueLayout)
        add(", ")
        add(addressValueLayout)
        add(", ")
        method.parameters.flatMap {
            when (it.arrayType()) {
                ArrayType.None -> layoutStatementForNonArrayParameter(it, typeParameterIndices)
                ArrayType.PassArray -> listOf(intValueLayout, addressValueLayout)
                ArrayType.FillArray -> listOf(intValueLayout, addressValueLayout)
                ArrayType.ReceiveArray -> listOf(addressValueLayout, addressValueLayout)
            }
        }.forEach {
            add(it)
            add(", ")
        }
        if (!method.returnType.isVoid()) {
            if (method.returnType.isArray) {
                add(addressValueLayout)
                add(",")
            }
            add(addressValueLayout)
        }
        add("))")
    }
}

private fun layoutStatementForNonArrayParameter(
    it: SparseParameter,
    typeParameterIndices: Map<String, Int>
) = if (it.type.isTypeParameter()) {
    listOf(
        CodeBlock.of(
            "layoutOf(type.arguments[%L].type!!.jvmErasure)",
            typeParameterIndices[it.type.name]
        )
    )
} else {
    listOf(it.type.valueLayout())
}

fun TypeSpec.Builder.addJVMToNativeSubstitution(sparseInterface: SparseInterface) {
    if (sparseInterface.isGeneric) {
        addSuperinterface(IParameterizedNativePeerProvider::class)
    } else {
        TODO("Create a non-parameterized version of this interface")
    }
    val generatePeerSpec = FunSpec.builder("makeNativePeer").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("type", KType::class)
        addParameter("obj", Any::class.asTypeName().copy(nullable = true))
        returns(Any::class.asTypeName().copy(nullable = true))

        val cb = buildCodeBlock {
            beginControlFlow("if (obj == null)")
            addStatement("return %M", ptrNull)
            endControlFlow()

            val substitution = substitutions[sparseInterface.fullName()]!!
            val starProjectedApiTypeName =
                substitution.apiTypeName.parameterizedBy(sparseInterface.genericParameters!!.map { STAR })
            beginControlFlow("if (obj is %T)", starProjectedApiTypeName)
            addStatement("return %T(type, obj)", substitution.jvmPeerType)
            endControlFlow()
            addStatement(
                "throw %T(%S)",
                IllegalArgumentException::class,
                "obj is not an instance of ${substitution.apiTypeName}"
            )
        }
        addCode(cb)
    }.build()
    addFunction(generatePeerSpec)
}

private fun TypeSpec.Builder.addABISuperInterface(
    sparseInterface: SparseInterface,
) {
    if (sparseInterface.genericParameters.isNullOrEmpty()) {
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sparseInterface.asClassName(nullable = true),
                MemorySegment::class.asClassName()
            )
        )
        addIIDProperty(sparseInterface)
    } else {
        val starParameters = sparseInterface.genericParameters.map {
            STAR
        }.toTypedArray()
        val withStarParams = ClassName("", sparseInterface.name)
            .parameterizedBy(*starParameters)
            .copy(nullable = true)
        addSuperinterface(
            IParameterizedABI::class.asClassName().parameterizedBy(
                withStarParams,
                MemorySegment::class.asClassName()
            )
        )

        addGetType(sparseInterface, withStarParams)
    }
}

private fun TypeSpec.Builder.addGetType(sparseInterface: SparseInterface, typeName: TypeName) {
    val getTypeSpec = FunSpec.builder("getType").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", typeName)
        addCode("return obj!!.${sparseInterface.typeName()}!!")
    }.build()
    addFunction(getTypeSpec)
}

private fun TypeSpec.Builder.addPtrToNative(entity: INamedEntity) {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", entity.asTypeName(emptyTypeParameters = true, nullable = true))
        returns(MemorySegment::class)
        beginControlFlow("if (obj == null)")
        addStatement("return %T.NULL", MemorySegment::class)
        endControlFlow()
        beginControlFlow("if (obj !is %T)", IObjectReference::class)
        addStatement("throw %T(%S)", IllegalArgumentException::class, "obj is not an instance of IObjectReference")
        endControlFlow()
        addStatement("return obj.segment")
    }.build()
    addFunction(toNative)
}

private fun TypeSpec.Builder.generateImplType(sparseInterface: SparseInterface) {
    val impl = TypeSpec.classBuilder("${sparseInterface.name}Impl").apply {
        sparseInterface.genericParameters
            ?.map(SparseGenericParameter::name)
            ?.map(TypeVariableName::invoke)
            ?.forEach(this::addTypeVariable)

        val constructor = FunSpec.constructorBuilder().apply {
            addParameter("ptr", MemorySegment::class)
            addModifiers(KModifier.INTERNAL)
            if (sparseInterface.isGeneric) {
                addParameter(sparseInterface.typeName(), KType::class, KModifier.OVERRIDE)
            }

        }.build()
        primaryConstructor(constructor)

        val pointerProperty = PropertySpec.builder(sparseInterface.pointerName(), OBJECT_PTR).apply {
            initializer("%T(segment)", OBJECT_PTR)
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(pointerProperty)

        val vtblProperty = PropertySpec.builder(sparseInterface.vtblName(), Vtbl::class).apply {
            initializer("%L.vtbl.withMethodCount(%L)", sparseInterface.pointerName(), sparseInterface.methods.size)
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(vtblProperty)

        superclass(ReferenceType::class)
        addSuperclassConstructorParameter("ptr")

        if (sparseInterface.isGeneric) {
            val typeProperty =
                PropertySpec.builder(sparseInterface.typeName(), KType::class).apply {
                    initializer(sparseInterface.typeName())
                    addModifiers(KModifier.OVERRIDE)
                }.build()
            addProperty(typeProperty)
        }
        addParameterizedSIProperties(sparseInterface)
        addParameterizedSuperInterfaces(sparseInterface)
        addInterfaceEvents(sparseInterface)
    }.build()
    addType(impl)
}

private fun TypeSpec.Builder.addInterfaceEvents(sparseInterface: SparseInterface) {
    addEvents(sparseInterface.asTypeReference(), true)

    val superInterfaces = traverseSuperInterfaces(sparseInterface)
        .filter { lookUpTypeReference(it) is SparseInterface }
        .distinctBy { it.fullName() }

    superInterfaces.forEach {
        addEvents(it, true, it.getInterfacePointerName(), true)
    }
}

private fun TypeSpec.Builder.addParameterizedSIProperties(sparseInterface: SparseInterface) {
    val superInterfaceReferences = traverseSuperInterfaces(sparseInterface)
        .distinctBy { it.fullName() }

    addParameterizedSIPtrProperties(superInterfaceReferences)
}

private fun TypeSpec.Builder.addParameterizedSIPtrProperties(
    superInterfaces: List<SparseTypeReference>
) {
    superInterfaces.forEach {
        val property = PropertySpec.builder(it.getInterfacePointerName(), OBJECT_PTR).apply {
            val lazyCb = CodeBlock.builder().apply {
                beginControlFlow("lazy { ".fixSpaces())
                if (!it.isClosed()) {
                    addStatement("val refiid = %T(guidOf(%L))", REFIID::class, it.getInterfaceTypeName())
                } else {
                    addStatement("val refiid = %T(guidOf<%T>())", REFIID::class, it.asTypeName())
                }
                addStatement(
                    "%T(QueryInterface(refiid).segment)",
                    OBJECT_PTR
                )
                endControlFlow()
            }.build()
            delegate(lazyCb)
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(property)
    }
}

private fun TypeSpec.Builder.addParameterizedSuperInterfaces(sparseInterface: SparseInterface) {
    addSuperinterface(IInspectable::class)
    sparseInterface.superInterfaces.map {
        it.asTypeName(nestedClass = "WithDefault", usage = ClassNameUsage.ParentInterface)
    }.forEach(::addSuperinterface)

    val className = sparseInterface.asTypeReference()
        .asTypeName(nestedClass = "WithDefault", usage = ClassNameUsage.ParentInterface)
    addSuperinterface(className)
}

private fun traverseSuperInterfaces(sparseInterface: SparseInterface): Set<SparseTypeReference> {
    val genericParams = sparseInterface.genericParameters?.let { params ->
        if (params.all { param -> param.type != null }) params else null
    }
    val superInterfaces = sparseInterface.superInterfaces
        .map { lookUpTypeReference(it) }
        .filterIsInstance<SparseInterface>()
        .map {
            genericParams?.let { params ->
                params.fold(it) { acc, param -> acc.projectType(param.name, param.type!!) }
            } ?: it
        }

    return sparseInterface.superInterfaces
        .union(superInterfaces.flatMap { traverseSuperInterfaces(it) })
}

private fun TypeSpec.Builder.addInterfacePtrProperties(sparseInterface: SparseInterface) {
    addProperty(sparseInterface.pointerName(), OBJECT_PTR)
    val vtblProperty = PropertySpec.builder(sparseInterface.vtblName(), Vtbl::class)
        .apply {
            val getter = FunSpec.getterBuilder().apply {
                addStatement(
                    "return %L.vtbl.withMethodCount(%L)",
                    sparseInterface.pointerName(),
                    sparseInterface.methods.size
                )
            }.build()
            getter(getter)
        }.build()
    addProperty(vtblProperty)
}

private fun TypeSpec.Builder.addInterfaceTypeProperty(sparseInterface: SparseInterface) {
    if (sparseInterface.isGeneric) {
        addProperty(sparseInterface.typeName(), KType::class.asClassName().copy(true))
    }
}


private fun TypeSpec.Builder.addWithDefaultType(sparseInterface: SparseInterface) {
    val withDefaultSpec = TypeSpec.interfaceBuilder("WithDefault").apply {
        addInterfacePtrProperties(sparseInterface)

        if (sparseInterface.isGeneric) {
            addTypeParameters(sparseInterface)
        }
        sparseInterface.superInterfaces.map {
            it.asTypeName(nestedClass = "WithDefault", usage = ClassNameUsage.ParentInterface)
        }.forEach(::addSuperinterface)
        addSuperinterface(sparseInterface.asTypeName())
        addSuperinterface(IInspectable::class)
        addMethods(sparseInterface, true)

        addProperties(sparseInterface, true)

    }.build()
    addType(withDefaultSpec)
}

private fun TypeSpec.Builder.addMethods(sparseInterface: SparseInterface, withMethodBody: Boolean) {
    sparseInterface.methods
        .mapIndexed { idx, it -> idx to it }
        .filterNot { (_, it) -> it.isEventComponent() || it.isPropertyComponent() }
        .map { (idx, it) -> generateInterfaceMethod(it, sparseInterface, idx, withMethodBody) }
        .forEach(this::addFunction)
}

fun INamedEntity.isNullable(): Boolean {
    if (this !is SparseTypeReference) return this.asTypeReference().isNullable()
    if (isReference) return false
    val isNotPrimitive = !isPrimitiveSystemType()
    val isNotGuid = !isSystemType("Guid")
    val isNotTypeParameter = !isTypeParameter()

    val entity = if (isSystemTypeOrObject() || isTypeParameter()) null else lookUpTypeReference(this)
    val isNotEnum = entity !is SparseEnum
    val isNotStruct = entity !is SparseStruct

    return isNotPrimitive && isNotGuid && isNotTypeParameter && isNotEnum && isNotStruct
}

enum class FunctionType {
    Getter, Setter, Normal;

    fun builder(name: String): FunSpec.Builder {
        return when (this) {
            Getter -> FunSpec.getterBuilder()
            Setter -> FunSpec.setterBuilder()
            Normal -> FunSpec.builder(name)
        }
    }

}

fun generateInterfaceMethod(
    method: SparseMethod,
    entity: IParameterizable<*>,
    idx: Int,
    withMethodBody: Boolean = true,
    functionType: FunctionType = FunctionType.Normal,
    pointerName: String = entity.pointerName(),
    typeVarName: String = entity.typeName()
): FunSpec =
    functionType.builder(method.name).apply {
        if (method.returnType.isArray) {
            addAnnotation(ReceiveArray::class)
        }

        val mutableList = ClassName("kotlin.collections", "MutableList")
        method.parameters.forEach {
            when (it.arrayType()) {
                ArrayType.None -> {
                    val type = it.type
                        .asTypeName(usage = ClassNameUsage.ApiSurface)
                        .copy(it.type.isNullable())

                    addParameter(it.name, type)
                }

                ArrayType.PassArray, ArrayType.FillArray -> {
                    val componentTypeRef = it.type.copy(isArray = false)
                    val type = componentTypeRef
                        .asTypeName(usage = ClassNameUsage.ApiSurface)
                        .copy(componentTypeRef.isNullable())
                    addParameter(it.name, Array::class.asClassName().parameterizedBy(type))
                }

                ArrayType.ReceiveArray -> {
                    val componentTypeRef = it.type.copy(isArray = false, isReference = false)
                    val type = componentTypeRef
                        .asTypeName(usage = ClassNameUsage.ApiSurface)
                        .copy(componentTypeRef.isNullable())

                    val parameterSpec = ParameterSpec.builder(it.name, mutableList.parameterizedBy(type)).apply {
                        addAnnotation(ReceiveArray::class)
                    }.build()

                    addParameter(parameterSpec)
                }
            }

        }

        val returnType = if (method.returnType.isArray) {
            val componentTypeRef = method.returnType.copy(isArray = false, isReference = false)
            val componentType = componentTypeRef
                .asTypeName(usage = ClassNameUsage.ApiSurface)
                .copy(componentTypeRef.isNullable())
            mutableList.parameterizedBy(componentType)
        } else {
            method.returnType
                .asTypeName(usage = ClassNameUsage.ApiSurface)
                .copy(method.returnType.isNullable())
        }

        if (functionType == FunctionType.Normal) {
            returns(returnType)
        }

        if (withMethodBody) {
            addCode(buildCodeBlock {
                addInterfaceMethodBody(method, entity, idx, pointerName, typeVarName)
            })
            if (entity is SparseInterface && functionType == FunctionType.Normal) {
                addModifiers(KModifier.OVERRIDE)
            }
        } else if (functionType == FunctionType.Normal) {
            addInterfaceMethodAnnotation(idx)
            addModifiers(KModifier.ABSTRACT)
        }
    }.build()

private fun CodeBlock.Builder.addInterfaceMethodBody(
    method: SparseMethod,
    type: IParameterizable<*>,
    idx: Int,
    pointerName: String = type.pointerName(),
    typeVarName: String = type.typeName()
) {
    beginControlFlow("${nbsp}return %T {", CallScope::class)
    val typeParameterIndexMap = type.genericParameters
        ?.mapIndexed { paramIndex, it -> it.name to paramIndex }
        ?.toMap() ?: emptyMap()

    addNullCheck(pointerName)
    if (type.isGeneric) {
        addTypePropertyCheck(type, typeVarName)
    }
    addNonArrayToNativeStatements(method, typeParameterIndexMap, typeVarName, type)
    val vtblName = if (type is SparseInterface) type.vtblName() else pointerName
    addFnPtrVariable(type, idx, vtblName)

    if (!method.returnType.isVoid()) {
        addResultVariable(method.returnType, type)
    }

    addToNativeForPassAndFillArrays(method, typeParameterIndexMap, type, method.isPropertyComponent())
    addToNativeForReceiveArrays(method)
    addHandleVariable(type, typeVarName, idx)
    addInvokeStatement(type, method, pointerName)
    addStatement("checkHR(%T(hr))", WinNT.HRESULT::class)
    addReadFromNativeForFillArrays(method, typeParameterIndexMap, type)
    addReadFromNativeForReceiveArrays(method, typeParameterIndexMap, type)
    addReachabilityFenceForParameters(method)

    if (!method.returnType.isVoid()) {
        if (method.returnType.isArray) {
            addArrayReturnStatements(method, typeParameterIndexMap, type)
        } else {
            addReturnStatement(method)
        }
    }
    endControlFlow()
}

private fun CodeBlock.Builder.addNullCheck(pointerName: String) {
    beginControlFlow("if (%L.segment == %T.NULL)", pointerName, MemorySegment::class)
    addStatement("throw %T(%S)", NullPointerException::class, "Attempted to call method on null pointer")
    endControlFlow()
}

private fun CodeBlock.Builder.addFnPtrVariable(
    type: IParameterizable<*>,
    idx: Int,
    vtblName: String
) {
    add("val fnPtr = %L", vtblName)
    if (type is SparseInterface) {
        add("[${idx}]")
    } else {
        add(".vtbl.invoke")
    }
    addStatement("")
}

private fun CodeBlock.Builder.addReturnStatement(method: SparseMethod) {
    val returnType = if (method.returnType.isTypeParameter()) {
        TypeVariableName(method.returnType.name)
    } else {
        method.returnType.asTypeName(usage = ClassNameUsage.ApiSurface)
    }

    add("return@CallScope result.value".fixSpaces(), returnType)
    if (substitutions.containsKey(method.returnType.fullName())) {
        add(" as %T", method.returnType.asTypeName(usage = ClassNameUsage.ApiSurface))
    }
    addStatement("")
}

private fun CodeBlock.Builder.addArrayReturnStatements(
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    type: IParameterizable<*>
) {
    add("val returnType = ")
    kTypeStatementFor(
        method.returnType.copy(isArray = false),
        typeParameterIndexMap,
        root = true,
        typeVarName = type.typeName()
    )
    addStatement("")
    val componentTypeRef = method.returnType.copy(isArray = false)
    val componentType = componentTypeRef.asTypeName()
        .copy(componentTypeRef.isNullable())
    addStatement("val result = mutableListOf<%T>()", componentType)
    addStatement("readReceiveArrayIntoList(returnType, result_Length, result_Native, result)")
    addStatement("return@CallScope result")
}

private fun CodeBlock.Builder.addReachabilityFenceForParameters(method: SparseMethod) {
    method.parameters
        .map(SparseParameter::name)
        .map(::escapeReservedWords)
        .forEach {
            addStatement("%T.reachabilityFence(${it})", Reference::class)
        }
}

private fun CodeBlock.Builder.addNonArrayToNativeStatements(
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    typeVarName: String,
    type: IParameterizable<*>
) {
    method.parameters.filter(::notArrayOrTrivialConversion)
        .forEach {
            if (it.type.isReference) {
                addStatement("val ${it.name}_Native = ${it.name}.segment")
            } else if (shouldUseIndirectToNative(it)) {
                addParameterToNativeIndirect(it, typeParameterIndexMap, typeVarName)
            } else {
                addParameterToNative(it, type)
            }
        }
}

private fun CodeBlock.Builder.addParameterToNative(
    it: SparseParameter,
    type: IParameterizable<*>
) {
    val name = escapeReservedWords(it.name)
    val abiClassName = it.type.abiClassName()
    if (type is SparseInterface && type.hasMemberWithName(it.type.name)) {
        addStatement("val ${it.name}_ABI: %T = %L", abiClassName, abiClassName.canonicalName)
    } else {
        addStatement("val ${it.name}_ABI = %L", abiClassName)
    }
    addStatement("val ${it.name}_Native = ${it.name}_ABI.toNative($name)")
}

private fun CodeBlock.Builder.addParameterToNativeIndirect(
    it: SparseParameter,
    typeParameterIndexMap: Map<String, Int>,
    typeVarName: String
) {
    val name = escapeReservedWords(it.name)
    add("val ${it.name}_Native = nativeRepresentation($name, ")
    kTypeStatementFor(it.type, typeParameterIndexMap, root = true, typeVarName = typeVarName)
    addStatement(")")
}

private fun shouldUseIndirectToNative(it: SparseParameter) =
    substitutions.containsKey(it.type.fullName()) || it.type.isTypeParameter() || it.type.isSystemType("Object")

private fun notArrayOrTrivialConversion(it: SparseParameter) =
    it.arrayType() == ArrayType.None && !it.type.hasTrivialABI()

private fun CodeBlock.Builder.addInvokeStatement(
    type: IParameterizable<*>,
    method: SparseMethod,
    pointerName: String = type.pointerName(),
) {
    add("val hr = handle.invoke(fnPtr, %L.segment ", pointerName)
    method.parameters
        .flatMap(getInvokeParameterTypes())
        .map(::escapeReservedWords)
        .map { ", $it" }
        .forEach { add(it) }

    if (!method.returnType.isVoid()) {
        if (method.returnType.isArray) {
            add(", result_Length.segment, result_Native.segment")
        } else {
            add(", result.segment")
        }
    }
    add(") as Int\n")
}

private fun CodeBlock.Builder.addHandleVariable(
    type: IParameterizable<*>,
    typeVarName: String,
    idx: Int
) {
    if (type is SparseInterface) {
        add("val handle = ABI.downcallHandles")
    } else {
        add("val handle = ABI.downcallHandle")
    }
    if (type.isGeneric) {
        add("(${typeVarName}!!)")
    }
    if (type is SparseInterface) {
        add("[${idx}]")
    }
    addStatement("")
}

private fun CodeBlock.Builder.addReadFromNativeForReceiveArrays(
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    type: IParameterizable<*>
) {
    method.parameters
        .filter { it.arrayType() == ArrayType.ReceiveArray }
        .forEach {
            val typeString = kTypeStringFor(it.type, typeParameterIndexMap, typeVarName = type.typeName())
            addStatement("val ${it.name}_Type = $typeString")
            addStatement("readReceiveArrayIntoList(${it.name}_Type, ${it.name}_Length, ${it.name}_Native, ${it.name})")
        }
}

private fun CodeBlock.Builder.addReadFromNativeForFillArrays(
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    type: IParameterizable<*>
) {
    method.parameters
        .filter { it.arrayType() == ArrayType.FillArray }
        .forEach {
            addStatement(
                "readArrayFromPtr(%L, ${it.name}_Native, ${it.name})",
                kTypeStringFor(it.type, typeParameterIndexMap, typeVarName = type.typeName())
            )
        }
}

private fun CodeBlock.Builder.addToNativeForReceiveArrays(method: SparseMethod) {
    val pointer = PointerTo::class.asClassName()
    method.parameters
        .filter { it.arrayType() == ArrayType.ReceiveArray }
        .forEach {
            addStatement("val ${it.name}_Native = %T()", pointer.parameterizedBy(pointer.parameterizedBy(STAR)))
            addStatement("val ${it.name}_Length = %T()", pointer.parameterizedBy(INT))
        }
}

private fun CodeBlock.Builder.addToNativeForPassAndFillArrays(
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    type: IParameterizable<*>,
    isProperty: Boolean
) {
    method.parameters
        .filter { it.arrayType() == ArrayType.PassArray || it.arrayType() == ArrayType.FillArray }
        .forEach {
            add("val ${it.name}_Native = arrayToNative(")
            kTypeStatementFor(
                it.type.copy(isArray = false),
                typeParameterIndexMap,
                typeVarName = type.typeName(),
                root = true
            )
            add(", ${it.name}")
            if (isProperty) {
                add(".toTypedArray()")
            }
            addStatement(")")
        }
}

private fun escapeReservedWords(it: String): String {
    return if (reservedWords.contains(it)) {
        "`$it`"
    } else {
        it
    }
}

private fun getInvokeParameterTypes(): (SparseParameter) -> List<String> =
    {
        when (it.arrayType()) {
            ArrayType.None -> {
                if (it.type.hasTrivialABI()) listOf(it.name)
                else listOf("${it.name}_Native")
            }

            ArrayType.PassArray, ArrayType.FillArray -> listOf(
                "${it.name}.size",
                "${it.name}_Native"
            )

            ArrayType.ReceiveArray -> listOf(
                "${it.name}_Length.segment",
                "${it.name}_Native.segment"
            )
        }
    }

private fun CodeBlock.Builder.addResultVariable(
    typeReference: SparseTypeReference,
    sparseInterface: IParameterizable<*>
) {
    val typeParameterIndexMap = sparseInterface.genericParameters
        ?.mapIndexed { idx, it -> it.name to idx }
        ?.toMap() ?: emptyMap()

    if (typeReference.isArray) {
        val pointer = PointerTo::class.asClassName()
        addStatement("val result_Length = %T()", pointer.parameterizedBy(INT))
        addStatement("val result_Native = %T()", pointer.parameterizedBy(pointer.parameterizedBy(STAR)))
        return
    }

    if (!typeReference.isGeneric) {
        if (typeReference.isTypeParameter()) {
            addStatement(
                "val result = %T<%L>(%L!!.arguments[%L].type!!)",
                PointerTo::class,
                typeReference.name,
                sparseInterface.typeName(),
                typeParameterIndexMap[typeReference.name]
            )
        } else {
            addStatement("val result = %T<%T>()", PointerTo::class, typeReference.asClassName())
        }
        return
    }

    addStatement(
        "val result = %T<%T>(", PointerTo::class, typeReference.asTypeName()
    )
    indent()
    kTypeStatementFor(typeReference, typeParameterIndexMap, typeVarName = sparseInterface.typeName())
    unindent()
    addStatement(")")
}

private fun CodeBlock.Builder.addTypePropertyCheck(type: IParameterizable<*>, typeVarName: String = type.typeName()) {
    beginControlFlow("if (${typeVarName} == null)")
    addStatement("throw %T(%S)", IllegalStateException::class, "Type has not been initialized")
    endControlFlow()
}

private fun CodeBlock.Builder.kTypeStatementFor(
    typeReference: SparseTypeReference,
    sparseInterface: SparseInterface?,
    typeParameterIndexMap: Map<String, Int>,
    projection: Boolean = false
) {
    if (!typeReference.hasTypeParameter()) {
        add("typeOf<%T>()", typeReference.asTypeName())
        return
    }
    if (typeReference.isTypeParameter()) {
        add("${sparseInterface?.typeName()}!!.arguments[${typeParameterIndexMap[typeReference.name]}]")
        return
    }
    if (projection) {
        add("%T(%M,", KTypeProjection::class, KVariance::class.member("INVARIANT"))
    }
    if (!typeReference.isGeneric) {
        add("%T::class.createType()", typeReference.asClassName())
        if (projection) {
            add(")")
        }
        return
    }

    val type = typeReference.copy(genericParameters = null)

    add("%T::class.createType(listOf(\n", type.asClassName())
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

private fun TypeSpec.Builder.addSuperInterfaces(sparseInterface: SparseInterface) {
    sparseInterface.superInterfaces
        .map(SparseTypeReference::asTypeName)
        .forEach(this::addSuperinterface)
}

private fun TypeSpec.Builder.addTypeParameters(sparseInterface: SparseInterface) {
    sparseInterface.genericParameters
        ?.map(SparseGenericParameter::name)
        ?.map(TypeVariableName::invoke)
        ?.forEach(this::addTypeVariable)
}

private fun IParameterizable<*>.pointerName() =
    this.getInterfacePointerName()

private fun TypeSpec.Builder.addLayout() {
    val layoutProperty = PropertySpec.builder("layout", ValueLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        initializer("%M", ValueLayout::class.member("ADDRESS"))
    }.build()
    addProperty(layoutProperty)
}

fun TypeSpec.Builder.addIIDProperty(type: IParameterizable<*>) {
    val iidSpec = PropertySpec.builder("IID", Guid.IID::class.asClassName()).apply {
        this.initializer("%T(%S)", Guid.IID::class.asClassName(), type.guid)
    }.build()
    addProperty(iidSpec)
}

private fun FunSpec.Builder.addInterfaceMethodAnnotation(index: Int) {
    val spec = AnnotationSpec.builder(InterfaceMethod::class).apply {
        addMember("$index")
    }.build()
    addAnnotation(spec)
}

private fun CodeBlock.Builder.addHRCheck() {
    beginControlFlow("if (hr.toInt() != 0) {")
    addStatement("throw %T(hr.toString())", RuntimeException::class.asClassName())
    endControlFlow()
}

private fun SparseTypeReference.isVoid(): Boolean {
    return namespace == "System" && name == "Void"
}

fun IParameterizable<*>.vtblName(): String {
    return "${asTypeReference().packageQualifiedIdentifier()}_VtblPtr"
}

fun IParameterizable<*>.typeName(): String {
    return asTypeReference().getInterfaceTypeName()
}

private fun FileSpec.Builder.addImports() {
    addImport(
        "com.github.knk190001.winrtbinding.runtime.interop",
        "guidOf",
        "runtimeFromNativeJF",
        "vtbl"
    )
    addImport(
        "com.github.knk190001.winrtbinding.runtime",
        "abiOf",
        "getValue",
        "arrayFromNative",
        "guidFromNative",
        "ABI",
        "arrayToNative",
        "readArrayFromPtr",
        "readReceiveArrayIntoList",
        "writeListIntoBuffer",
        "checkHR",
        "writeArrayTo",
        "addRefOutgoing",
        "layoutOf",
        "memoize",
        "toMemorySegment",
        "nativeRepresentation"
    )
    addImport("kotlin.reflect.full", "createType")
    addImport("kotlin.reflect", "typeOf")
    addImport("kotlin.reflect.jvm", "jvmErasure")
}

