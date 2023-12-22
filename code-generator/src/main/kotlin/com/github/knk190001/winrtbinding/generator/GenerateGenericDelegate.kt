@file:Suppress("DuplicatedCode")

package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.ArrayType
import com.github.knk190001.winrtbinding.generator.model.arrayType
import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmStatic
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.ByReference
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance

fun generateGenericDelegate(sparseDelegate: SparseDelegate): FileSpec {
    return FileSpec.builder(sparseDelegate.namespace, sparseDelegate.name).apply {
        addImports()
        addDelegateFunInterface(sparseDelegate)
        val delegateTypeSpec = TypeSpec.classBuilder(sparseDelegate.name).apply {
            addABIAnnotation(sparseDelegate.asTypeReference().asClassName())
            superclass(Delegate::class)
            addDelegateTypeSpec(sparseDelegate)
        }.build()
        addType(delegateTypeSpec)
    }.build()
}

fun FileSpec.Builder.addDelegateFunInterface(sparseDelegate: SparseDelegate) {
    val delegateParameters = sparseDelegate.parameters.map {
        ParameterSpec.builder(
            it.name,
            it.type.asGenericTypeParameter(false).copy(!it.type.isPrimitiveSystemType() && !it.type.isArray)
        ).build()
    }
    val delegateTypeParameters = sparseDelegate.genericParameters!!
        .map(SparseGenericParameter::name)
        .map(TypeVariableName::invoke)

    val funInterface = TypeSpec.funInterfaceBuilder("${sparseDelegate.name}Body").apply {
        delegateTypeParameters.forEach(::addTypeVariable)
        val invokeFn = FunSpec.builder("invoke").apply {
            addModifiers(KModifier.ABSTRACT, KModifier.OPERATOR)
            delegateParameters.forEach(::addParameter)
            returns(sparseDelegate.returnType.asGenericTypeParameter())
        }.build()
        addFunction(invokeFn)
    }.build()
    addType(funInterface)
}

private fun FileSpec.Builder.addImports() {
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "guidOf")
    addImport("com.github.knk190001.winrtbinding.runtime", "invokeHR")
    addImport("com.github.knk190001.winrtbinding.runtime", "checkHR")
    addImport("com.github.knk190001.winrtbinding.runtime", "toFunctionDescriptor")
    addImport("com.github.knk190001.winrtbinding.runtime", "transformParameterizedHandle")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "makeByReferenceType")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "marshalFromNative")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "marshalToNative")
    addImport("com.github.knk190001.winrtbinding.runtime.interop", "runtimeFromNativeJF")
    addImport("com.github.knk190001.winrtbinding.runtime", "iUnknownIID")
    addImport("kotlin.reflect", "typeOf")
    addImport("kotlin.reflect.full", "createType")
    addImport("com.sun.jna", "Memory")
}

private fun TypeSpec.Builder.addDelegateTypeSpec(sparseDelegate: SparseDelegate) {
    addDelegateAnnotations(sparseDelegate)
    addTypeParameters(sparseDelegate)
    addPrimaryConstructor(sparseDelegate)
    addInvokeOperator(sparseDelegate)
    addCompanionObject(sparseDelegate)
    addByReferenceType(sparseDelegate)
    addABI(sparseDelegate)
}

private fun TypeSpec.Builder.addABI(sparseDelegate: SparseDelegate) {
    val abiTypeSpec = TypeSpec.objectBuilder("ABI").apply {
        val starParameters = sparseDelegate.genericParameters!!.map {
            STAR
        }.toTypedArray()
        addSuperinterface(
            IParameterizedABI::class.asClassName().parameterizedBy(
                ClassName("", sparseDelegate.name).parameterizedBy(*starParameters),
                MemoryAddress::class.asClassName()
            )
        )
        addParameterizedFromNative(sparseDelegate)
        addPtrToNative(sparseDelegate)
        addLayout()
    }.build()
    addType(abiTypeSpec)
}

private fun TypeSpec.Builder.addLayout() {
    val layoutSpec = PropertySpec.builder("layout", MemoryLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        initializer("%T.ADDRESS", ValueLayout::class)
    }.build()
    addProperty(layoutSpec)
}

private fun TypeSpec.Builder.addByReferenceType(sparseDelegate: SparseDelegate) {
    val byReferenceInterfaceSpec = TypeSpec.classBuilder("ByReference").apply {
        addTypeParameters(sparseDelegate)
        superclass(ByReference::class)
        addSuperclassConstructorParameter("%M", Native::class.member("POINTER_SIZE"))
        addSuperinterface(
            IByReference::class.asClassName()
                .parameterizedBy(sparseDelegate.asTypeReference().asGenericTypeParameter())
        )

        if (sparseDelegate.genericParameters != null) {
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

        val getValueFn = FunSpec.builder("getValue").apply {
            addModifiers(KModifier.OVERRIDE)
            addCode(
                "return %T(type!!, pointer.getPointer(0))",
                sparseDelegate.asTypeReference().asGenericTypeParameter()
            )
            returns(sparseDelegate.asTypeReference().asGenericTypeParameter())
        }.build()
        addFunction(getValueFn)

        val setValueFn = FunSpec.builder("setValue").apply {
            addParameter("value", sparseDelegate.asTypeReference().asGenericTypeParameter())
            addCode("pointer = value.pointer!!")
        }.build()
        addFunction(setValueFn)

    }.build()

    addType(byReferenceInterfaceSpec)
}

private fun TypeSpec.Builder.addCompanionObject(sparseDelegate: SparseDelegate) {
    val companionObject = TypeSpec.companionObjectBuilder().apply {
        addBodyInvokeOperator(sparseDelegate)
        addPointerInvokeOperator(sparseDelegate)
        addReifiedPointerInvokeOperator(sparseDelegate)
        generateGenericNativeHandleProperty(sparseDelegate)
        addNativeFn(sparseDelegate)
    }.build()
    addType(companionObject)
}

private fun TypeSpec.Builder.generateGenericNativeHandleProperty(sd: SparseDelegate) {
    val nativeHandleProperty = PropertySpec.builder("nativeFnHandle", MethodHandle::class).apply {
        getter(FunSpec.getterBuilder().apply {
            addAnnotation(NativeFunctionMarker::class)
            val getterCB = CodeBlock.builder().apply {
                add(
                    "return %T.lookup().findStatic( %T::class.java, %S,\n",
                    MethodHandles::class,
                    sd.asTypeReference().asClassName(),
                    "nativeFn"
                )
                indent()
                add("%T.methodType(%T::class.java, \n", MethodType::class, Int::class.java)
                add("%T::class.java, ", KType::class)
                add("%T::class.java, ", ClassName("", "${sd.name}Body"))
                add("%T::class.java, ", MemoryAddress::class)

                sd.parameters.flatMap {
                    when (it.arrayType()) {
                        ArrayType.None -> listOf(it.type.foreignType())
                        ArrayType.PassArray -> listOf(Int::class, MemorySegment::class)
                        ArrayType.FillArray -> listOf(Int::class, MemorySegment::class)
                        ArrayType.ReceiveArray -> listOf(MemorySegment::class, MemorySegment::class)
                    }
                }.forEach { add("%T::class.java, ", it) }
                addStatement(")\n")
                unindent()
                add(")")
            }.build()
            addCode(getterCB)
        }.build())
    }.build()
    addProperty(nativeHandleProperty)
}


private fun TypeSpec.Builder.addNativeFn(sparseDelegate: SparseDelegate) {
    assert(sparseDelegate.returnType.name == "Void")
    val nativeFn = FunSpec.builder("nativeFn").apply {
        jvmStatic()

        addTypeParameters(sparseDelegate)
        addParameter("type", KType::class)
        addParameter("fn", getBodyClassName(sparseDelegate))
        addParameter("thisPtr", MemoryAddress::class)
        sparseDelegate.parameters.flatMap {
            when (it.arrayType()) {
                ArrayType.None -> listOf(it.name to it.type.foreignType())
                ArrayType.FillArray -> listOf(
                    "${it.name}_size" to Int::class,
                    it.name to  MemorySegment::class
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

        val typeParameterIndexMap = sparseDelegate.genericParameters
            ?.mapIndexed { idx, it -> it.name to idx }
            ?.toMap() ?: emptyMap()

        val cb = CodeBlock.builder().apply {
            beginControlFlow("try")
            val managedNames = sparseDelegate.parameters.map {
                addToManagedStatementForParameter(it, typeParameterIndexMap)
            }
            addStatement("fn(${managedNames.joinToString()})")
            unindent()
            addStatement("} catch (e: Throwable) {")
            indent()
            addStatement("e.printStackTrace()")
            addStatement("return %T.E_FAIL", WinNT::class)
            endControlFlow()
            addStatement("return 0")
        }.build()
        addCode(cb)
        returns(Int::class)
    }.build()
    addFunction(nativeFn)
}

fun CodeBlock.Builder.addToManagedStatementForParameter(
    param: SparseParameter,
    typeParameterIndexMap: Map<String, Int>
): String {
    if (param.type.isPrimitiveSystemType() && param.type.name != "Boolean") {
        return param.name
    }
    val managedName = "${param.name}_Managed"

    //Arrays
    if (param.type.isArray) {
        addStatement("val ${param.name}_Type = ${kTypeStringFor(param.type, typeParameterIndexMap)}")
        addStatement("val $managedName = arrayFromNative(${param.name}_Type, ${param.name}_size, ${param.name})")
        return managedName
    }

    //Type Parameters
    if (param.type.isTypeParameter()) {
        addStatement("val ${param.name}_Type = ${kTypeStringFor(param.type, typeParameterIndexMap)}")
        addStatement(
            "val $managedName = runtimeFromNativeJF<%T>(${param.name}, ${param.name}_Type) as ${param.type.name}",
            Any::class
        )
        return managedName
    }
    //Delegates, and Interfaces
    if (!param.type.isSystemTypeOrObject() && lookUpTypeReference(param.type) is IDirectProjectable<*>) {
        var typeString = if (!param.type.genericParameters.isNullOrEmpty()) {
            addStatement("val ${param.name}_Type = ${kTypeStringFor(param.type, typeParameterIndexMap)}")
            "${param.name}_Type"
        } else ""
        if (lookUpTypeReference(param.type) is SparseInterface) {
            typeString = ", $typeString"
            addStatement(
                "val $managedName = %T.ABI.make%T(%T(${param.name}.toRawLongValue())$typeString)",
                param.type.asClassName(),
                param.type.asGenericTypeParameter(),
                Pointer::class
            )
        } else {
            typeString = "$typeString, "
            addStatement(
                "val $managedName = %T($typeString%T(${param.name}.toRawLongValue()))",
                param.type.asClassName(),
                Pointer::class
            )

        }
        return managedName
    }

    if (param.type.name == "Boolean") {
        addStatement("val $managedName = ${param.name} != 0", param.type.asClassName())
        return managedName
    }

    //Else
    addStatement("val $managedName = %T.ABI.fromNative(${param.name})", param.type.asClassName())

    return managedName
}

private fun TypeSpec.Builder.addReifiedPointerInvokeOperator(sparseDelegate: SparseDelegate) {
    val invokeFn = FunSpec.builder("invoke").apply {
        addModifiers(KModifier.OPERATOR, KModifier.INLINE)
        addMethodTypeParameters(sparseDelegate)
        addParameter("pointer", Pointer::class.asClassName().copy(true))
        returns(sparseDelegate.asTypeReference().asGenericTypeParameter())
        addStatement("val type = typeOf<%T>()", sparseDelegate.asTypeReference().asGenericTypeParameter())
        addStatement("return %T(type, pointer)", sparseDelegate.asTypeReference().asClassName())
    }.build()
    addFunction(invokeFn)
}

private fun TypeSpec.Builder.addPointerInvokeOperator(sparseDelegate: SparseDelegate) {
    val typeParameterIndexMap =
        sparseDelegate.genericParameters?.mapIndexed { idx, it -> it.name to idx }?.toMap()
            ?: emptyMap()
    val invokeFn = FunSpec.builder("invoke").apply {
        addModifiers(KModifier.OPERATOR)
        addMethodTypeParameters(sparseDelegate, reified = false)
        addParameter("type", KType::class)
        addParameter("ptr", Pointer::class.asClassName().copy(true))
        returns(sparseDelegate.asTypeReference().asGenericTypeParameter())
        val bodyClassName = getBodyClassName(sparseDelegate)
        val cb = CodeBlock.builder().apply {
            addStatement("val thisPtr = ptr!!.getPointer(0)")
            addStatement("val vtbl = thisPtr!!.getPointer(0)")
            addStatement(
                "val function = %T.getFunction(vtbl.getPointer(3L * %T.POINTER_SIZE))",
                Function::class,
                Native::class
            )
            beginControlFlow("val body: %T = %T ", bodyClassName, bodyClassName)
            addStatement(sparseDelegate.parameters.joinToString(transform = SparseParameter::name, postfix = " ->"))
            val marshaledParameters = Marshaller.marshalVariablesToNative(sparseDelegate.parameters, this)
                .zip(sparseDelegate.parameters)
                .map { (marshaled, sparseParameter) ->
                    if (sparseParameter.type.namespace.isNotEmpty()) {
                        marshaled
                    } else {
                        "marshalToNative(${marshaled}, ${kTypeStringFor(sparseParameter.type, typeParameterIndexMap)})"
                    }
                }

            val result = if (sparseDelegate.returnType.name != "Void") {
                addResultVariable(sparseDelegate)
                ", result"
            } else ""

            addStatement("val hr = function.invokeHR(arrayOf(thisPtr, ${marshaledParameters.joinToString(postfix = result)}))")
            addStatement("checkHR(hr)")

            if (sparseDelegate.returnType.name != "Void") {
                add("val returnType = ")
                kTypeStatementFor(sparseDelegate.returnType, typeParameterIndexMap)
                addStatement(
                    "marshalFromNative<%T>(result.getValue(), returnType)",
                    sparseDelegate.returnType.asGenericTypeParameter()
                )
            }
            endControlFlow()
            addStatement("return %T(type, body, thisPtr)", sparseDelegate.asTypeReference().asClassName())
        }.build()
        addCode(cb)
    }.build()
    addFunction(invokeFn)
}

private fun CodeBlock.Builder.addResultVariable(sparseDelegate: SparseDelegate) {
    val typeParameterIndexMap = sparseDelegate.genericParameters
        ?.mapIndexed { idx, it -> it.name to idx }
        ?.toMap() ?: emptyMap()


    val resultType = sparseDelegate.returnType
    if (!resultType.hasGenericParameter()) {
        if (resultType.isTypeParameter()) {
            addStatement(
                "val result = makeByReferenceType<%L>(%L!!.arguments[%L].type!!)",
                resultType.name,
                "type",
                typeParameterIndexMap[resultType.name]
            )
        } else {
            addStatement("val result = makeByReferenceType<%T>()", resultType.asClassName())
        }
        return
    }

    addStatement(
        "val result = makeByReferenceType<%T>(", resultType.asGenericTypeParameter()
    )
    kTypeStatementFor(resultType, typeParameterIndexMap)
    add(")\n")
}

private fun kTypeStringFor(
    typeReference: SparseTypeReference,
    typeParameterIndexMap: Map<String, Int>,
    projection: Boolean = false
): String {
    val builder = CodeBlock.builder()
    return with(builder) {
        kTypeStatementFor(typeReference, typeParameterIndexMap, projection, true)
        builder.build().toString()
    }
}

private fun CodeBlock.Builder.kTypeStatementFor(
    typeReference: SparseTypeReference,
    typeParameterIndexMap: Map<String, Int>,
    projection: Boolean = false,
    root: Boolean = false
) {

    if (typeReference.isTypeParameter()) {
        add("type!!.arguments[${typeParameterIndexMap[typeReference.name]}]")
        if (root) {
            add(".type!!")
        }
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
            kTypeStatementFor(SparseTypeReference(it.name, ""), typeParameterIndexMap, projection)
        } else {
            kTypeStatementFor(it.type, typeParameterIndexMap, true)
        }
        add(",\n")
    }
    unindent()
    add("))")
    if (projection) {
        add(")")
    }

}


private fun TypeSpec.Builder.addBodyInvokeOperator(sparseDelegate: SparseDelegate) {
    val invokeFn = FunSpec.builder("invoke").apply {
        addModifiers(KModifier.OPERATOR, KModifier.INLINE)
        addMethodTypeParameters(sparseDelegate, true)

        val bodyClassName = getBodyClassName(sparseDelegate)
        addParameter("fn", bodyClassName)

        val delegateType = sparseDelegate.asTypeReference().asGenericTypeParameter()
        val delegateClass = sparseDelegate.asTypeReference().asClassName()
        returns(delegateType)

        val cb = CodeBlock.builder().apply {
            addStatement("val session = %T.global()", MemorySession::class)
            addStatement("val handleDescriptorPair = transformParameterizedHandle(typeOf<%T>())", delegateType)
            addStatement("val methodHandle = handleDescriptorPair.first.bindTo(fn)")
            addStatement("val functionDescriptor = handleDescriptorPair.second")
            addStatement("val stub = %T.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)", Linker::class)
            addStatement("val newDelegate = %T(typeOf<%T>(), fn, %T(12))", delegateClass, delegateType, Memory::class)
            addStatement("val guid = guidOf<%T>()", delegateType)
            addStatement("newDelegate.init(listOf(%T.IID, guid), %T(stub.address().toRawLongValue()))", IUnknown.ABI::class, Pointer::class)
            addStatement("return newDelegate")
        }.build()
        addCode(cb)
    }.build()
    addFunction(invokeFn)
}

private fun parameterToTypeName(sparseParameter: SparseParameter): TypeName {
    return if (sparseParameter.type.namespace.isEmpty()) {
        TypeVariableName(sparseParameter.type.name)
    } else {
        sparseParameter.type.asGenericTypeParameter()
    }
}

private fun TypeSpec.Builder.addInvokeOperator(sparseDelegate: SparseDelegate) {
    val invokeFn = FunSpec.builder("invoke").apply {
        addModifiers(KModifier.OPERATOR)

        val parameterNames = sparseDelegate.parameters.map { it.name }

        sparseDelegate.parameters
            .map(::parameterToTypeName)
            .zip(parameterNames)
            .forEach { (type, name) ->
                addParameter(name, type)
            }

        if (sparseDelegate.returnType.name != "Void") {
            returns(sparseDelegate.returnType.asGenericTypeParameter())
        }

        val cb = CodeBlock.builder().apply {
            if (sparseDelegate.returnType.name != "Void") {
                add("return ")
            }
            addStatement("body!!(${parameterNames.joinToString()})")
        }.build()
        addCode(cb)
    }.build()
    addFunction(invokeFn)
}

private fun TypeSpec.Builder.addPrimaryConstructor(sparseDelegate: SparseDelegate) {
    val constructor = FunSpec.constructorBuilder().apply {
        val typeParameterSpec = ParameterSpec.builder("type", KType::class.asClassName().copy(true)).apply {
            this.defaultValue("null")
        }.build()
        addParameter(typeParameterSpec)

        val typePropertySpec = PropertySpec.builder("type", KType::class.asClassName().copy(true)).apply {
            this.initializer("type")
        }.build()
        addProperty(typePropertySpec)

        val bodyClassName = getBodyClassName(sparseDelegate).copy(true)
        val bodyParameterSpec = ParameterSpec.builder("body", bodyClassName).apply {
            this.defaultValue("null")
        }.build()
        addParameter(bodyParameterSpec)
        val bodyPropertySpec = PropertySpec.builder("body", bodyClassName).apply {
            this.initializer("body")
        }.build()
        addProperty(bodyPropertySpec)

        val ptrParameterSpec = ParameterSpec.builder("ptr", typeNameOf<Pointer?>()).apply {
            this.defaultValue("%T.NULL", Pointer::class)
        }.build()
        addParameter(ptrParameterSpec)
    }.build()
    primaryConstructor(constructor)
}

private fun getBodyClassName(sparseDelegate: SparseDelegate): ParameterizedTypeName {
    val parameterizedTypeName = sparseDelegate.asTypeReference().asGenericTypeParameter()
    return parameterizedTypeName(sparseDelegate, parameterizedTypeName)
}

private fun parameterizedTypeName(
    sparseDelegate: SparseDelegate,
    parameterizedTypeName: TypeName
): ParameterizedTypeName {
    return ClassName(sparseDelegate.namespace, "${sparseDelegate.name}Body")
        .parameterizedBy(*(parameterizedTypeName as ParameterizedTypeName).typeArguments.toTypedArray<TypeName>())
}

private fun TypeSpec.Builder.addTypeParameters(sparseDelegate: SparseDelegate) {
    sparseDelegate.genericParameters!!
        .map(SparseGenericParameter::name)
        .map(TypeVariableName::invoke)
        .forEach(::addTypeVariable)
}

private fun FunSpec.Builder.addTypeParameters(sparseDelegate: SparseDelegate) {
    sparseDelegate.genericParameters!!
        .map(SparseGenericParameter::name)
        .map(TypeVariableName::invoke)
        .forEach(::addTypeVariable)
}

private fun FunSpec.Builder.addMethodTypeParameters(sparseDelegate: SparseDelegate, reified: Boolean = true) {
    sparseDelegate.genericParameters!!
        .map(SparseGenericParameter::name)
        .map(TypeVariableName::invoke)
        .map {
            it.copy(reified = reified)
        }
        .forEach(::addTypeVariable)
}

private fun TypeSpec.Builder.addDelegateAnnotations(sparseDelegate: SparseDelegate) {
    addAnnotation(GenericType::class)
    addAnnotation(DynamicSignature::class)
    addGuidAnnotation(sparseDelegate.guid)
    addByReferenceAnnotation(sparseDelegate)
}

private fun TypeSpec.Builder.addByReferenceAnnotation(sparseDelegate: SparseDelegate) {
    val annotation = AnnotationSpec.builder(WinRTByReference::class).apply {
        addMember(
            "%T::class",
            (sparseDelegate.asTypeReference()
                .asClassName() as ClassName).nestedClass("ByReference")
        )
    }.build()
    addAnnotation(annotation)
}

