package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.ArrayType
import com.github.knk190001.winrtbinding.generator.model.arrayType
import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.mapIfInstanceOf
import com.github.knk190001.winrtbinding.runtime.abi.*
import com.github.knk190001.winrtbinding.runtime.annotations.*
import com.github.knk190001.winrtbinding.runtime.com.IInspectable
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.interop.*
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmStatic
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.REFIID
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.ByReference
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
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
        addByReferenceAnnotation(sparseInterface)
        addInterfaceTypeProperty(sparseInterface)
        addTypeParameters(sparseInterface)
        addSuperInterfaces(sparseInterface)
        addMethods(sparseInterface, false)
        addWithDefaultType(sparseInterface)
        addProperties(sparseInterface, false)
        addEvents(sparseInterface.asTypeReference(), false)
        generateByReference(sparseInterface)
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
            "val $managedName = %T(%T($paramName.address()))",
            param.type.byReferenceClassName(),
            Pointer::class
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
        if (lookUpTypeReference(param.type) is SparseInterface) {
            addStatement(
                "val $managedName = %T.ABI.make%T(%T($paramName.address()), ${typeString.dropLast(1)})",
                param.type.asClassName(),
                param.type.asTypeName(),
                Pointer::class
            )
        } else {
            addStatement(
                "val $managedName = %T($typeString %T($paramName.address()))",
                param.type.asTypeName(),
                Pointer::class
            )
        }
        return managedName
    }

    //Structs by reference
    if (param.type.isReference && !param.type.isSystemTypeOrObject() && lookUpTypeReference(param.type) is SparseStruct) {
        addStatement("val $managedName = %T(%T($paramName.address()))", param.type.asClassName(), Pointer::class)
        return managedName
    }

    //Guids
    if (param.type.isSystemType() && param.type.name == "Guid") {
        if (param.type.isReference) {
            addStatement(
                "val $managedName = %T(%T($paramName.address()))",
                GuidByReference::class,
                Pointer::class
            )
            return managedName
        }
        addStatement("val $managedName = guidFromNative($paramName)")
        return managedName
    }

    if (param.type.isReference) {
        addStatement("val $managedName = %T()", param.type.asTypeName())
        addStatement(
            "val ${param.name}_Type = ${
                kTypeStringFor(
                    param.type,
                    typeParameterIndexMap,
                    typeVarName = "_type"
                )
            }"
        )
        addStatement("$managedName.pointer = %T($paramName.address())", Pointer::class)
        return managedName
    }

    //Else
    val withOutReference = param.type.copy(isReference = false)
    addStatement(
        "val $managedName = (abiOf<%T>() as %T<%T, %T>).fromNative($paramName)",
        withOutReference.asClassName(false),
        IABI::class,
        withOutReference.asClassName(false),
        withOutReference.foreignType()
    )

    return managedName
}

private fun CodeBlock.Builder.addReceiveArrayToManagedStatement(
    param: SparseParameter,
    managedName: String
): String {
    val componentType = param.type.copy(isArray = false, isReference = false)
    val componentClassName = componentType.asClassName(false)
        .copy(nullable = !componentType.isPrimitiveSystemType())
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
            .filter { it.arrayType() == ArrayType.None  && !it.type.isSystemType() && it.type.isReference && (it.type.isSystemType("Object") || lookUpTypeReference(it.type).isReferenceType()) }
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
                if(!method.returnType.isSystemType() && (method.returnType.isTypeParameter() || method.returnType.isSystemType("Object") || lookUpTypeReference(method.returnType).isReferenceType())) {
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

        generateMakeFn(sparseInterface)
        generateReifiedMakeFn(sparseInterface)
        addParameterizedFromNative(sparseInterface)
        addPtrToNative(sparseInterface)
        addLayout()

        if (substitutions[sparseInterface.fullName()] != null) {
            addJVMToNativeSubstitution(sparseInterface)
        }
    }.build()
    addType(abi)
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
                sparseInterface.asClassName(),
                MemorySegment::class.asClassName()
            )
        )
        addIIDProperty(sparseInterface)
    } else {
        val starParameters = sparseInterface.genericParameters.map {
            STAR
        }.toTypedArray()
        val withStarParams = ClassName("", sparseInterface.name).parameterizedBy(*starParameters)
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
        addCode("return obj.${sparseInterface.typeName()}!!")
    }.build()
    addFunction(getTypeSpec)
}

private fun TypeSpec.Builder.addPtrToNative(entity: INamedEntity) {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", entity.asTypeName(emptyTypeParameters = true))
        returns(MemorySegment::class)
        addStatement(
            "return %T.ofAddress(%T.nativeValue(obj.toNative() as %T))",
            MemorySegment::class,
            Pointer::class,
            nullablePtr
        )
    }.build()
    addFunction(toNative)
}

private fun TypeSpec.Builder.generateReifiedMakeFn(sparseInterface: SparseInterface) {
    if (!sparseInterface.isGeneric) return
    val makeFn = FunSpec.builder("make${sparseInterface.name}").apply {
        addModifiers(KModifier.INLINE)
        sparseInterface.genericParameters!!
            .map(SparseGenericParameter::name)
            .map { TypeVariableName(it).copy(reified = true) }
            .forEach { addTypeVariable(it) }
        addParameter("ptr", nullablePtr)
        addCode(
            "return %T(ptr, typeOf<%T>())",
            sparseInterface.asTypeReference()
                .asTypeName(nestedClass = "${sparseInterface.name}Impl"),
            sparseInterface.asTypeName(),
        )
    }.build()
    addFunction(makeFn)
}

private fun TypeSpec.Builder.generateMakeFn(
    sparseInterface: SparseInterface,
) {
    val makeFn = FunSpec.builder("make${sparseInterface.name}").apply {
        sparseInterface.genericParameters
            ?.map(SparseGenericParameter::name)
            ?.map(TypeVariableName::invoke)
            ?.forEach { addTypeVariable(it) }
        addParameter("ptr", nullablePtr)
        if (sparseInterface.isGeneric) {
            addParameter("type", KType::class)
        }

        val typeParameterExpression = if (sparseInterface.isGeneric) {
            ", type"
        } else {
            ""
        }
        val returnType =
            sparseInterface.asTypeName(nestedClass = "${sparseInterface.name}Impl")
        addCode(
            "return %T(ptr%L)",
            returnType,
            typeParameterExpression
        )
        returns(returnType)
    }.build()
    addFunction(makeFn)
}

private fun TypeSpec.Builder.generateImplType(sparseInterface: SparseInterface) {
    val impl = TypeSpec.classBuilder("${sparseInterface.name}Impl").apply {
        sparseInterface.genericParameters
            ?.map(SparseGenericParameter::name)
            ?.map(TypeVariableName::invoke)
            ?.forEach(this::addTypeVariable)

        val constructor = FunSpec.constructorBuilder().apply {
            val pointerParameter = ParameterSpec.builder("ptr", nullablePtr).apply {
                defaultValue("%M", ptrNull)
            }.build()
            addParameter(pointerParameter)

            if (sparseInterface.isGeneric) {
                val typeParameter =
                    ParameterSpec.builder(sparseInterface.typeName(), KType::class.asClassName().copy(true)).apply {
                        defaultValue("null")
                        addModifiers(KModifier.OVERRIDE)
                    }.build()
                addParameter(typeParameter)
            }

        }.build()
        primaryConstructor(constructor)

        val pointerProperty = PropertySpec.builder(sparseInterface.pointerName(), nullablePtr).apply {
            getter(FunSpec.getterBuilder().addCode("return pointer").build())
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(pointerProperty)

        val vtblProperty = PropertySpec.builder(sparseInterface.vtblName(), nullablePtr).apply {
            getter(FunSpec.getterBuilder().addCode("return pointer.getPointer(0)").build())
            addModifiers(KModifier.OVERRIDE)
        }.build()
        addProperty(vtblProperty)

        superclass(PointerType::class)
        addSuperclassConstructorParameter("ptr")

        if (sparseInterface.isGeneric) {
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

    addParameterizedSIPtrProperties(superInterfaceReferences, sparseInterface)
}

private fun TypeSpec.Builder.addParameterizedSIPtrProperties(
    superInterfaces: List<SparseTypeReference>,
    sparseInterface: SparseInterface
) {
    superInterfaces.forEach {
        val property = PropertySpec.builder(it.getInterfacePointerName(), nullablePtr).apply {
            val lazyCb = CodeBlock.builder().apply {
                beginControlFlow("lazy { ".fixSpaces())
                if (!it.isClosed()) {
                    addStatement("val refiid = %T(guidOf(%L))", REFIID::class, it.getInterfaceTypeName())
                } else {
                    addStatement("val refiid = %T(guidOf<%T>())", REFIID::class, it.asTypeName())
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

private fun TypeSpec.Builder.addByReferenceAnnotation(sparseInterface: SparseInterface) {
    val annotation = AnnotationSpec.builder(WinRTByReference::class).apply {
        addMember("%T::class", sparseInterface.asClassName(nestedClass = "ByReference"))
    }.build()
    addAnnotation(annotation)
}

private fun TypeSpec.Builder.addInterfacePtrProperties(sparseInterface: SparseInterface) {
    addProperty(sparseInterface.pointerName(), nullablePtr)
    val vtblProperty = PropertySpec.builder(sparseInterface.vtblName(), nullablePtr)
        .apply {
            val getter = FunSpec.getterBuilder().apply {
                addStatement("return %L?.getPointer(0)", sparseInterface.pointerName())
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

fun SparseTypeReference.isNullable(): Boolean {
    return !this.isPrimitiveSystemType() && !this.isTypeParameter()
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
    vtblName: String = entity.vtblName(),
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
                addInterfaceMethodBody(method, entity, idx, vtblName, pointerName, typeVarName)
            })
            if (entity is SparseInterface && functionType == FunctionType.Normal) {
                addModifiers(KModifier.OVERRIDE)
            }
        } else if (functionType == FunctionType.Normal) {
            addInterfaceMethodAnnotation(idx)
            addModifiers(KModifier.ABSTRACT)
        }
    }.build()

sealed interface ParamType
data class Synthetic(val name: String) : ParamType
data class ExplicitType(val name: String, val typeReference: SparseTypeReference) : ParamType
data class Standard(val name: String) : ParamType

private fun CodeBlock.Builder.addInterfaceMethodBody(
    method: SparseMethod,
    type: IParameterizable<*>,
    idx: Int,
    vtblName: String = type.vtblName(),
    pointerName: String = type.pointerName(),
    typeVarName: String = type.typeName()
) {
    val typeParameterIndexMap = type.genericParameters
        ?.mapIndexed { paramIndex, it -> it.name to paramIndex }
        ?.toMap() ?: emptyMap()

    if (type.isGeneric) {
        addTypePropertyCheck(type, typeVarName)
    }

    addStatement(
        "val fnPtr = %L!!.getPointer(${6 + idx}L * %M)",
        vtblName,
        Native::class.member("POINTER_SIZE")
    )
    addStatement("val fn = %T.getFunction(fnPtr)", ClassName("", Function::class.qualifiedName!!))

    if (!method.returnType.isVoid()) {
        addResultVariable(method.returnType, type)
    }

    addToNativeForPassAndFillArrays(method, typeParameterIndexMap, type, method.isPropertyComponent())
    addToNativeForReceiveArrays(method)
    addInvokeStatement(type, method, typeParameterIndexMap, pointerName, typeVarName)

    addStatement("checkHR(hr)")

    addReadFromNativeForFillArrays(method, typeParameterIndexMap, type)
    addReadFromNativeForReceiveArrays(method, typeParameterIndexMap, type)

    if (!method.returnType.isVoid()) {
        add("val returnType = ")
        kTypeStatementFor(
            method.returnType.copy(isArray = false),
            typeParameterIndexMap,
            root = true,
            typeVarName = type.typeName()
        )

        addStatement("")
        if (method.returnType.isArray) {
            val componentTypeRef = method.returnType.copy(isArray = false)
            val componentType = componentTypeRef.asTypeName()
                .copy(componentTypeRef.isNullable())
            addStatement("val result = mutableListOf<%T>()", componentType)
            addStatement("readReceiveArrayIntoList(returnType, result_Length, result_Native, result)")
            addStatement("return result")
            return
        }

        val returnType = if (method.returnType.isTypeParameter()) {
            TypeVariableName(method.returnType.name)
        } else {
            method.returnType.asTypeName(usage = ClassNameUsage.ApiSurface)
        }

        add("return marshalFromNative<%T>(result.getValue(), returnType)".fixSpaces(), returnType)
        if (method.returnType.isPrimitiveSystemType()) {
            add("!!")
        }

        if (method.returnType.isTypeParameter()) {
            add("as ${method.returnType.name}")
        }
    }
}

private fun CodeBlock.Builder.addInvokeStatement(
    type: IParameterizable<*>,
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    pointerName: String = type.pointerName(),
    typeVarName: String = type.typeName()
) {
    add("val hr = fn.invokeHR(arrayOf(%L ", pointerName)
    method.parameters
        .flatMap(getInvokeParameterTypes())
        .mapIfInstanceOf<ParamType, Standard>(::escapeReservedWords)
        .map(invokeArgumentExpressionForParameter(typeParameterIndexMap, type, typeVarName))
        .map { ", $it" }
        .forEach { add(it) }

    if (!method.returnType.isVoid()) {
        if (method.returnType.isArray) {
            add(", result_Length, result_Native")
        } else {
            add(", result")
        }
    }
    add("))\n")
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
    method.parameters
        .filter { it.arrayType() == ArrayType.ReceiveArray }
        .forEach {
            addStatement("val ${it.name}_Native = %T()", PointerByReference::class)
            addStatement("val ${it.name}_Length = %T()", IntByReference::class)
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

private fun invokeArgumentExpressionForParameter(
    typeParameterIndexMap: Map<String, Int>,
    type: IParameterizable<*>,
    typeVarName: String = type.typeName()
): (ParamType) -> String = {
    when (it) {
        is Standard -> "marshalToNative(${it.name})"
        is Synthetic -> it.name
        is ExplicitType -> {
            val typeString = kTypeStringFor(
                it.typeReference,
                typeParameterIndexMap,
                typeVarName = typeVarName
            )
            "marshalToNative(${it.name},$typeString)"
        }
    }
}

private fun escapeReservedWords(it: Standard): ParamType {
    return if (reservedWords.contains(it.name)) {
        Standard("`${it.name}`")
    } else {
        it
    }
}

private fun getInvokeParameterTypes(): (SparseParameter) -> List<ParamType> =
    {
        when (it.arrayType()) {
            ArrayType.None -> {
                if (it.type.isTypeParameter() || substitutions.containsKey(it.type.fullName())) {
                    listOf(ExplicitType(it.name, it.type))
                } else {
                    listOf(Standard(it.name))
                }
            }

            ArrayType.PassArray, ArrayType.FillArray -> listOf(
                Synthetic("${it.name}.size"),
                Synthetic("${it.name}_Native")
            )

            ArrayType.ReceiveArray -> listOf(
                Synthetic("${it.name}_Length"),
                Synthetic("${it.name}_Native")
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
        addStatement("val result_Length = %T()", IntByReference::class)
        addStatement("val result_Native = %T()", PointerByReference::class)
        return
    }

    if (!typeReference.isGeneric) {
        if (typeReference.isTypeParameter()) {
            addStatement(
                "val result = makeByReferenceType<%L>(%L!!.arguments[%L].type!!)",
                typeReference.name,
                sparseInterface.typeName(),
                typeParameterIndexMap[typeReference.name]
            )
        } else {
            addStatement("val result = makeByReferenceType<%T>()", typeReference.asClassName(structByValue = false))
        }
        return
    }

    addStatement(
        "val result = makeByReferenceType<%T>(", typeReference.asTypeName()
    )
    kTypeStatementFor(typeReference, typeParameterIndexMap, typeVarName = sparseInterface.typeName())
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
        add("%T::class.createType()", typeReference.asClassName(structByValue = false))
        if (projection) {
            add(")")
        }
        return
    }

    val type = typeReference.copy(genericParameters = null)

    add("%T::class.createType(listOf(\n", type.asClassName(structByValue = false))
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
    addSuperinterface(NativeMapped::class)
    sparseInterface.superInterfaces
        .map(SparseTypeReference::asTypeName)
        .forEach(this::addSuperinterface)

    addSuperinterface(IInspectable::class)
}

private fun TypeSpec.Builder.generateByReference(sparseInterface: SparseInterface) {
    val byReferenceInterfaceSpec = TypeSpec.classBuilder("ByReference").apply {
        addTypeParameters(sparseInterface)
        superclass(ByReference::class)
        addSuperclassConstructorParameter("%M", Native::class.member("POINTER_SIZE"))
        addSuperinterface(
            IByReference::class.asClassName()
                .parameterizedBy(sparseInterface.asTypeName())
        )

        if (sparseInterface.isGeneric) {
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

        val abi = sparseInterface.asClassName(nestedClass = "ABI")
        val typeExpression = if (sparseInterface.isGeneric) {
            ", type!!"
        } else {
            ""
        }
        val getValueFn = FunSpec.builder("getValue").apply {
            addModifiers(KModifier.OVERRIDE)
            addCode(
                "return %T.make%T(pointer.getPointer(0)%L)",
                abi,
                sparseInterface.asTypeName(),
                typeExpression
            )
            returns(sparseInterface.asTypeName(nestedClass = "WithDefault"))
        }.build()
        addFunction(getValueFn)

        val setValueFn = FunSpec.builder("setValue").apply {
            addParameter("value", sparseInterface.asTypeName())
            addCode("pointer = value.toNative() as %T", jnaPointer)
        }.build()
        addFunction(setValueFn)

    }.build()

    addType(byReferenceInterfaceSpec)
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
        "makeByReferenceType",
        "marshalToNative",
        "marshalFromNative",
        "marshalToNative",
        "marshalFromNative",
        "guidOf",
        "runtimeFromNativeJF"
    )
    addImport(
        "com.github.knk190001.winrtbinding.runtime",
        "handleToString",
        "toHandle",
        "abiOf",
        "invokeHR",
        "getValue",
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
        "addRefOutgoing"
    )
    addImport("kotlin.reflect.full", "createType")
    addImport("kotlin.reflect", "typeOf")
    addImport("kotlin.reflect.jvm", "jvmErasure")
}

