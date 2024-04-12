package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.ArrayType
import com.github.knk190001.winrtbinding.generator.model.arrayType
import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.mapIfInstanceOf
import com.github.knk190001.winrtbinding.runtime.annotations.*
import com.github.knk190001.winrtbinding.runtime.base.*
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinDef.ULONG
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.ByReference
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.reflect.*

fun generateInterface(sparseInterface: SparseInterface): FileSpec {
    return FileSpec.builder(sparseInterface.namespace, sparseInterface.cleanName()).apply {
        addImports()
        addParameterizedInterface(sparseInterface)
    }.build()
}

private fun FileSpec.Builder.addParameterizedInterface(sparseInterface: SparseInterface) {
    val parameterizedInterface = TypeSpec.interfaceBuilder(sparseInterface.cleanName()).apply {
        if (sparseInterface.genericParameters != null) {
            addAnnotation(GenericType::class)
        }

        addABIAnnotation(sparseInterface.withName(sparseInterface.cleanName()).asTypeReference().asClassName())
        addGuidAnnotation(sparseInterface.guid)
        addByReferenceAnnotation(sparseInterface)
        addInterfaceTypeProperty(sparseInterface)
        addTypeParameters(sparseInterface)
        addSuperInterfaces(sparseInterface)
        addInterfaceMethods(sparseInterface)
        generateByReference(sparseInterface)
        generateImplType(sparseInterface)
        generateABI(sparseInterface)
        addTypeProperties(sparseInterface)
        addNativeWrapperObject(sparseInterface)
    }.build()
    addType(parameterizedInterface)
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
    add("%T::class.java, ", sparseInterface.asTypeReference().asClassName())
    add("%T::class.java, ", MemoryAddress::class)
    sparseMethod.parameters.flatMap {
        when (it.arrayType()) {
            ArrayType.None -> listOf(it.type.foreignType())
            ArrayType.PassArray -> listOf(Int::class, MemoryAddress::class)
            ArrayType.FillArray -> listOf(Int::class, MemoryAddress::class)
            ArrayType.ReceiveArray -> listOf(MemoryAddress::class, MemoryAddress::class)
        }
    }.forEach { add("%T::class.java, ", it) }
    if (!sparseMethod.returnType.isVoid()) {
        if (sparseMethod.returnType.isArray) {
            add("%T::class.java, ", MemoryAddress::class)
        }
        add("%T::class.java ", MemoryAddress::class)
    }
    add(")), ")
}

private fun CodeBlock.Builder.addToManagedStatementForParameter(
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
            addReceiveArrayToManagedStatement(param, paramName, managedName)
            return managedName
        }
    }


    //Primitives and Primitive References
    if (param.type.isPrimitiveSystemType() && !param.type.isReference) {
        return addPrimitiveToManagedStatement(param, managedName, paramName)
    } else if (param.type.isPrimitiveSystemType() && param.type.isReference) {
        addStatement(
            "val $managedName = %T(%T($paramName.toRawLongValue()))",
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
    if (!param.type.isReference && !param.type.isSystemTypeOrObject() && lookUpTypeReference(param.type) is IDirectProjectable<*>) {
        val typeString = if (!param.type.genericParameters.isNullOrEmpty()) {
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
                "val $managedName = %T.ABI.make%T(%T($paramName.toRawLongValue()), ${typeString.dropLast(1)})",
                param.type.asClassName(),
                param.type.asTypeName(),
                Pointer::class
            )
        } else {
            addStatement(
                "val $managedName = %T($typeString %T($paramName.toRawLongValue()))",
                param.type.asTypeName(),
                Pointer::class
            )
        }
        return managedName
    }

    //Structs by reference
    if (param.type.isReference && !param.type.isSystemTypeOrObject() && lookUpTypeReference(param.type) is SparseStruct) {
        addStatement("val $managedName = %T(%T($paramName.toRawLongValue()))", param.type.asClassName(), Pointer::class)
        return managedName
    }

    //Guids
    if (param.type.isSystemType() && param.type.name == "Guid") {
        if (param.type.isReference) {
            addStatement(
                "val $managedName = %T(%T($paramName.toRawLongValue()))",
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
        addStatement("$managedName.pointer = %T($paramName.toRawLongValue())", Pointer::class)
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
    paramName: String,
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
            addStatement("val $managedName = %T($paramName)", ULONG::class)
            return managedName
        }

        "UInt32" -> {
            addStatement("val $managedName = %T($paramName.toLong())", WinDef.UINT::class)
            return managedName
        }

        "UInt16" -> {
            addStatement("val $managedName = %T($paramName.toLong())", WinDef.USHORT::class)
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
        kTypeStatementFor(param.type, typeParameterIndexMap, root = true, typeVarName = "_type")
        addStatement("")
    })
    addStatement(
        "val $managedName = arrayFromNative<%T>(${param.name}_Type, ${param.name}_size, ${paramName})",
        componentType.asTypeName(componentType.isNullable())
    )
    return managedName
}
fun SparseInterface.cleanName() = this.asTypeReference().dropGenericParameterCount().name

fun SparseTypeReference.cleanName() = this.dropGenericParameterCount().name

private fun TypeSpec.Builder.addNativeWrapperObject(sparseInterface: SparseInterface) {
    val nativeWrapperObjSpec = TypeSpec.objectBuilder("NativeWrappers").apply {
        if (sparseInterface.genericParameters == null) {
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

        addNativeHandlesProperty(sparseInterface, sparseInterface.genericParameters != null)
    }.build()
    addType(nativeWrapperObjSpec)
}

private fun String.escapeReserved(): String {
    return if (reservedWords.contains(this)) "`${this}`" else this
}

private fun generateParameterizedNativeFn(idx: Int, sparseInterface: SparseInterface, method: SparseMethod): FunSpec {
    val nativeFn = FunSpec.builder("${method.name}$idx").apply {
        jvmStatic()
        if (sparseInterface.genericParameters != null) {
            addTypeParameters(sparseInterface)
        }
        returns(INT)

        if (sparseInterface.genericParameters != null) {
            addParameter("_type", KType::class)
        }

        addParameter("thisObj", sparseInterface.asTypeReference().asTypeName())
        addParameter("thisPtr", MemoryAddress::class)
        method.parameters.flatMap {
            when (it.arrayType()) {
                ArrayType.None -> listOf(it.name to it.type.foreignType())
                ArrayType.FillArray -> listOf(
                    "${it.name}_size" to Int::class,
                    it.name to MemoryAddress::class
                )

                ArrayType.PassArray -> listOf(
                    "${it.name}_size" to Int::class,
                    it.name to MemoryAddress::class
                )

                ArrayType.ReceiveArray -> listOf(
                    "${it.name}_size" to MemoryAddress::class,
                    it.name to MemoryAddress::class
                )
            }
        }.forEach { addParameter(it.first, it.second) }

        if (!method.returnType.isVoid()) {
            if (method.returnType.isArray) {
                addParameter("return_size", MemoryAddress::class)
            }
            addParameter("returnAddr", MemoryAddress::class)
        }

        val typeParameterIndexMap = sparseInterface.genericParameters
            ?.mapIndexed { idx, it -> it.name to idx }
            ?.toMap() ?: emptyMap()

        val cb = CodeBlock.builder().apply {
            beginControlFlow("try")
            val managedNames = method.parameters.map {
                addToManagedStatementForParameter(it, typeParameterIndexMap)
            }
            if (!method.returnType.isVoid()) {
                add("val result = ")
            }
            addStatement("thisObj.${method.name}(${managedNames.joinToString()})")

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

            if (!method.returnType.isVoid()) {
                add("val result_Type = ")
                kTypeStatementFor(
                    method.returnType.copy(isArray = false, isReference = false),
                    typeParameterIndexMap,
                    root = true,
                    typeVarName = "_type"
                )
                addStatement("")
                if (method.returnType.isArray) {
                    addStatement("writeListIntoBuffer(result_Type, return_size, returnAddr, result)")
                } else {
                    addStatement(
                        "val result_ABI = abiOf(result_Type.jvmErasure) as %T",
                        typeNameOf<IBaseABI<Any?, Any?>>()
                    )
                    addStatement("result_ABI.copyTo(result, returnAddr)")
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
        addCode(cb)
    }.build()
    return nativeFn
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

private fun TypeSpec.Builder.generateABI(sparseInterface: SparseInterface) {
    val abi = TypeSpec.objectBuilder("ABI").apply {
        if (sparseInterface.genericParameters.isNullOrEmpty()) {
            addSuperinterface(
                IABI::class.asClassName().parameterizedBy(
                    sparseInterface.asTypeReference().asClassName(),
                    MemoryAddress::class.asClassName()
                )
            )
            addIIDProperty(sparseInterface)
        } else {
            val starParameters = sparseInterface.genericParameters.map {
                STAR
            }.toTypedArray()
            val withStarParams = ClassName("", sparseInterface.cleanName()).parameterizedBy(*starParameters)
            addSuperinterface(
                IParameterizedABI::class.asClassName().parameterizedBy(
                    withStarParams,
                    MemoryAddress::class.asClassName()
                )
            )

            addGetType(sparseInterface, withStarParams)
        }
        val handleType: KClass<*> =
            if (sparseInterface.genericParameters == null) INativeHandleProvider::class
            else IParameterizedNativeHandleProvider::class

        addSuperinterface(handleType, CodeBlock.of("NativeWrappers"))
        generateMakeFn(sparseInterface)
        generateReifiedMakeFn(sparseInterface)
        addParameterizedFromNative(sparseInterface)
        addPtrToNative(sparseInterface)
        addLayout()
    }.build()
    addType(abi)
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
        addParameter("obj", entity.asTypeReference().asTypeName(emptyTypeParameters = true))
        returns(MemoryAddress::class)
        addStatement(
            "return %T.ofLong(%T.nativeValue(obj.toNative() as %T))",
            MemoryAddress::class,
            Pointer::class,
            nullablePtr
        )
    }.build()
    addFunction(toNative)
}

private fun TypeSpec.Builder.generateReifiedMakeFn(sparseInterface: SparseInterface) {
    if (sparseInterface.genericParameters == null) return
    val makeFn = FunSpec.builder("make${sparseInterface.cleanName()}").apply {
        addModifiers(KModifier.INLINE)
        sparseInterface.genericParameters
            .map(SparseGenericParameter::name)
            .map { TypeVariableName(it).copy(reified = true) }
            .forEach { addTypeVariable(it) }
        addParameter("ptr", nullablePtr)
        val typeParameters = sparseInterface.genericParameters.joinToString { it.name }
        addCode(
            "return %T(ptr, typeOf<%T>())",
            sparseInterface.asTypeReference()
                .asTypeName(nestedClass = "${sparseInterface.cleanName()}Impl"),
            sparseInterface.asTypeReference().asTypeName(),
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
        addParameter("ptr", nullablePtr)
        if (sparseInterface.genericParameters != null) {
            addParameter("type", KType::class)
        }

        val typeParameterExpression = if (sparseInterface.genericParameters != null) {
            ", type"
        } else {
            ""
        }
        val returnType =
            sparseInterface.asTypeReference().asTypeName(nestedClass = "${sparseInterface.cleanName()}Impl")
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
    val name = sparseInterface.asTypeReference().dropGenericParameterCount()
    val impl = TypeSpec.classBuilder("${name.name}Impl").apply {
        sparseInterface.genericParameters
            ?.map(SparseGenericParameter::name)
            ?.map(TypeVariableName::invoke)
            ?.forEach(this::addTypeVariable)

        val constructor = FunSpec.constructorBuilder().apply {
            val pointerParameter = ParameterSpec.builder("ptr", nullablePtr).apply {
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
//        addParameterizedImplCompanion(sparseInterface)

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
        val property = PropertySpec.builder(it.getInterfacePointerName(), nullablePtr).apply {
            val lazyCb = CodeBlock.builder().apply {
                beginControlFlow("lazy { ")
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
    addSuperinterface(IUnknown::class)
    sparseInterface.superInterfaces.map {
        it.asTypeName(nestedClass = "WithDefault", usage = ClassNameUsage.ParentInterface)
    }.forEach(::addSuperinterface)

    val className = sparseInterface.asTypeReference()
        .asTypeName(nestedClass = "WithDefault", usage = ClassNameUsage.ParentInterface)
    addSuperinterface(className)
}

private fun traverseSuperInterfaces(sparseInterface: SparseInterface): Set<SparseTypeReference> {
    val superInterfaces = sparseInterface.superInterfaces
        .map { lookUpTypeReference(it) }
        .filterIsInstance<SparseInterface>()

    return sparseInterface.superInterfaces
        .union(superInterfaces.flatMap { traverseSuperInterfaces(it) })
}

private fun TypeSpec.Builder.addByReferenceAnnotation(sparseInterface: SparseInterface) {
    val annotation = AnnotationSpec.builder(WinRTByReference::class).apply {
        addMember("%T::class", sparseInterface.asTypeReference().asClassName(nestedClass = "ByReference"))
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
    if (sparseInterface.genericParameters != null) {
        addProperty(sparseInterface.typeName(), KType::class.asClassName().copy(true))
    }
}


private fun TypeSpec.Builder.addInterfaceMethods(sparseInterface: SparseInterface) {

    val withDefaultSpec = TypeSpec.interfaceBuilder("WithDefault").apply {
        addInterfacePtrProperties(sparseInterface)
        if (sparseInterface.genericParameters != null) {
            addTypeParameters(sparseInterface)
        }
        sparseInterface.superInterfaces.map {
            it.asTypeName(nestedClass = "WithDefault", usage = ClassNameUsage.ParentInterface)
        }.forEach(::addSuperinterface)
        addSuperinterface(sparseInterface.asTypeReference().asTypeName())


        sparseInterface.methods
            .mapIndexed { idx, it -> generateInterfaceMethod(it, sparseInterface, idx, true) }
            .forEach(this::addFunction)
    }.build()
    addType(withDefaultSpec)

    sparseInterface.methods
        .mapIndexed { idx, it -> generateInterfaceMethod(it, sparseInterface, idx, false) }
        .forEach(this::addFunction)
}

fun SparseTypeReference.isNullable(): Boolean {
    return !this.isPrimitiveSystemType() && !this.isTypeParameter()
}

fun generateInterfaceMethod(
    method: SparseMethod,
    sparseInterface: SparseInterface,
    idx: Int,
    withMethodBody: Boolean = true
): FunSpec =
    FunSpec.builder(method.name).apply {
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

        returns(returnType)

        if (withMethodBody) {
            addCode(buildCodeBlock {
                addGenericInterfaceMethodBody(method, sparseInterface, idx)
            })
            addModifiers(KModifier.OVERRIDE)
        } else {
            addInterfaceMethodAnnotation(idx)
            addModifiers(KModifier.ABSTRACT)
        }
    }.build()

sealed interface ParamType
data class Synthetic(val name: String) : ParamType
data class TypeParameter(val name: String, val typeReference: SparseTypeReference) : ParamType
data class Standard(val name: String) : ParamType

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

    addToNativeForPassAndFillArrays(method, typeParameterIndexMap, sparseInterface)
    addToNativeForReciveArrays(method)
    addInvokeStatement(sparseInterface, method, typeParameterIndexMap)

    addHRCheck()

    addReadFromNativeForFillArrays(method, typeParameterIndexMap, sparseInterface)
    addReadFromNativeForReciveArrays(method, typeParameterIndexMap, sparseInterface)

    if (!method.returnType.isVoid()) {
        add("val returnType = ")
        kTypeStatementFor(
            method.returnType,
            typeParameterIndexMap,
            root = true,
            typeVarName = sparseInterface.typeName()
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
    sparseInterface: SparseInterface,
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>
) {
    add("val hr = fn.invokeHR(arrayOf(%L ", sparseInterface.pointerName())
    method.parameters
        .flatMap(getInvokeParameterTypes())
        .mapIfInstanceOf<ParamType, Standard>(::escapeReservedWords)
        .map(invokeArgumentExpressionForParameter(typeParameterIndexMap, sparseInterface))
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

private fun CodeBlock.Builder.addReadFromNativeForReciveArrays(
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    sparseInterface: SparseInterface
) {
    method.parameters
        .filter { it.arrayType() == ArrayType.ReceiveArray }
        .forEach {
            val typeString = kTypeStringFor(it.type, typeParameterIndexMap, typeVarName = sparseInterface.typeName())
            addStatement("val ${it.name}_Type = $typeString")
            addStatement("readReceiveArrayIntoList(${it.name}_Type, ${it.name}_Length, ${it.name}_Native, ${it.name})")
        }
}

private fun CodeBlock.Builder.addReadFromNativeForFillArrays(
    method: SparseMethod,
    typeParameterIndexMap: Map<String, Int>,
    sparseInterface: SparseInterface
) {
    method.parameters
        .filter { it.arrayType() == ArrayType.FillArray }
        .forEach {
            addStatement(
                "readArrayFromPtr(%L, ${it.name}_Native, ${it.name})",
                kTypeStringFor(it.type, typeParameterIndexMap, typeVarName = sparseInterface.typeName())
            )
        }
}

private fun CodeBlock.Builder.addToNativeForReciveArrays(method: SparseMethod) {
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
    sparseInterface: SparseInterface
) {
    method.parameters
        .filter { it.arrayType() == ArrayType.PassArray || it.arrayType() == ArrayType.FillArray }
        .forEach {
            add("val ${it.name}_Native = arrayToNative(")
            kTypeStatementFor(it.type, typeParameterIndexMap, typeVarName = sparseInterface.typeName(), root = true)
            addStatement(", ${it.name})")
        }
}

private fun invokeArgumentExpressionForParameter(
    typeParameterIndexMap: Map<String, Int>,
    sparseInterface: SparseInterface
): (ParamType) -> String = {
    when (it) {
        is Standard -> "marshalToNative(${it.name})"
        is Synthetic -> it.name
        is TypeParameter -> {
            val typeString = kTypeStringFor(
                it.typeReference,
                typeParameterIndexMap,
                typeVarName = sparseInterface.typeName()
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
                if (it.type.isTypeParameter()) {
                    listOf(TypeParameter(it.name, it.type))
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

private fun CodeBlock.Builder.addResultVariable(typeReference: SparseTypeReference, sparseInterface: SparseInterface) {
    val typeParameterIndexMap = sparseInterface.genericParameters
        ?.mapIndexed { idx, it -> it.name to idx }
        ?.toMap() ?: emptyMap()

    if (typeReference.isArray) {
        addStatement("val result_Length = %T()", IntByReference::class)
        addStatement("val result_Native = %T()", PointerByReference::class)
        return
    }

    if (!typeReference.hasGenericParameter()) {
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
    kTypeStatementFor(typeReference, sparseInterface, typeParameterIndexMap)
    addStatement(")")
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

private fun TypeSpec.Builder.addSuperInterfaces(sparseInterface: SparseInterface, withDefault: Boolean = false) {

    addSuperinterface(NativeMapped::class)
    addSuperinterface(IWinRTInterface::class)

    sparseInterface.superInterfaces
        .map(SparseTypeReference::asTypeName)
        .forEach(this::addSuperinterface)

    addSuperinterface(IUnknown::class)
}

private fun TypeSpec.Builder.generateByReference(sparseInterface: SparseInterface) {
    val byReferenceInterfaceSpec = TypeSpec.classBuilder("ByReference").apply {
        addTypeParameters(sparseInterface)
        superclass(ByReference::class)
        addSuperclassConstructorParameter("%M", Native::class.member("POINTER_SIZE"))
        addSuperinterface(
            IByReference::class.asClassName()
                .parameterizedBy(sparseInterface.asTypeReference().asTypeName())
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

        val abi = sparseInterface.asTypeReference().asClassName(nestedClass = "ABI")
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
                sparseInterface.asTypeReference().asTypeName(),
                typeExpression
            )
            returns(sparseInterface.asTypeReference().asTypeName())
        }.build()
        addFunction(getValueFn)

        val setValueFn = FunSpec.builder("setValue").apply {
            addParameter("value", sparseInterface.asTypeReference().asTypeName())
            addCode("pointer = value.toNative() as %T", jnaPointer)
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

private fun SparseInterface.pointerName() =
    this.asTypeReference().getInterfacePointerName()

private fun TypeSpec.Builder.addLayout() {
    val layoutProperty = PropertySpec.builder("layout", ValueLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        initializer("%M", ValueLayout::class.member("ADDRESS"))
    }.build()
    addProperty(layoutProperty)
}

private fun TypeSpec.Builder.addIIDProperty(sparseInterface: SparseInterface) {
    val iidSpec = PropertySpec.builder("IID", Guid.IID::class.asClassName()).apply {
        this.initializer("%T(%S)", Guid.IID::class.asClassName(), sparseInterface.guid)
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

fun SparseInterface.vtblName(): String {
    return "${asTypeReference().hashID()}_VtblPtr"
}

fun SparseInterface.typeName(): String {
    return asTypeReference().getInterfaceTypeName()
}

private fun FileSpec.Builder.addImports() {
    addImport(
        "com.github.knk190001.winrtbinding.runtime.interop",
        "makeByReferenceType",
        "marshalToNative",
        "marshalFromNative",
        "makePrimitiveOutArray",
        "makeOutArray",
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
        "writeListIntoBuffer"
    )
    addImport("kotlin.reflect.full", "createType")
    addImport("kotlin.reflect", "typeOf")
    addImport("kotlin.reflect.jvm", "jvmErasure")
}

