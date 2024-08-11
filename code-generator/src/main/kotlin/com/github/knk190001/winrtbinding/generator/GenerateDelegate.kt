package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.ArrayType
import com.github.knk190001.winrtbinding.generator.model.arrayType
import com.github.knk190001.winrtbinding.generator.model.entities.SparseDelegate
import com.github.knk190001.winrtbinding.generator.model.entities.SparseGenericParameter
import com.github.knk190001.winrtbinding.generator.model.entities.SparseMethod
import com.github.knk190001.winrtbinding.generator.model.entities.SparseTypeReference
import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.abi.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.annotations.DelegateMarker
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.ReferenceManager
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.delegate.Delegate
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmStatic
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.ByReference
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance


fun generateDelegate(sparseDelegate: SparseDelegate): FileSpec {
    return FileSpec.builder(sparseDelegate.namespace, sparseDelegate.name).apply {
        addImports()
        addDelegateFunInterface(sparseDelegate)
        val delegateTypeSpec = TypeSpec.classBuilder(sparseDelegate.name).apply {
            addABIAnnotation(sparseDelegate.asClassName())
            superclass(PointerType::class)
            addSuperinterface(IUnknown::class)
            addSuperclassConstructorParameter("ptr")
            addDelegateTypeSpec(sparseDelegate)
        }.build()
        addType(delegateTypeSpec)
    }.build()
}

fun FileSpec.Builder.addDelegateFunInterface(sparseDelegate: SparseDelegate) {
    val delegateParameters = sparseDelegate.parameters.map {
        ParameterSpec.builder(
            it.name,
            it.type.asTypeName(nullable = !it.type.isPrimitiveSystemType() && !it.type.isArray)
        ).build()
    }
    val delegateTypeParameters = sparseDelegate.genericParameters
        ?.map(SparseGenericParameter::name)
        ?.map(TypeVariableName::invoke)

    val funInterface = TypeSpec.funInterfaceBuilder("${sparseDelegate.name}Body").apply {
        delegateTypeParameters?.forEach(::addTypeVariable)
        val invokeFn = FunSpec.builder("invoke").apply {
            addModifiers(KModifier.ABSTRACT, KModifier.OPERATOR)
            delegateParameters.forEach(::addParameter)
            returns(sparseDelegate.returnType.asTypeName(nullable = sparseDelegate.returnType.isNullable()))
        }.build()
        addFunction(invokeFn)
    }.build()
    addType(funInterface)
}

private fun FileSpec.Builder.addImports() {
    addImport(
        "com.github.knk190001.winrtbinding.runtime",
        "checkHR",
        "toFunctionDescriptor",
        "transformParameterizedHandle",
        "iUnknownIID",
        "iAgileObjectIID",
        "guidFromNative",
        "abiOf",
        "arrayFromNative",
        "arrayToNative",
        "toHandle",
        "toPointer",
        "writeArrayTo",
        "toMemorySegment",
        "nativeRepresentation",
        "memoize",
        "layoutOf"
    )
    addImport(
        "com.github.knk190001.winrtbinding.runtime.interop",
        "guidOf",
        "makeByReferenceType",
        "marshalFromNative",
        "marshalToNative",
        "runtimeFromNativeJF"
    )
    addImport("kotlin.reflect", "typeOf")
    addImport("kotlin.reflect.full", "createType")
    addImport("kotlin.reflect.jvm", "jvmErasure")
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
        val starParameters = sparseDelegate.genericParameters?.map {
            STAR
        }?.toTypedArray()

        val withStarParams = (starParameters?.let {
            ClassName("", sparseDelegate.name).parameterizedBy(*it)
        } ?: ClassName("", sparseDelegate.name)).copy(nullable = true)

        val superInterface = if (sparseDelegate.isGeneric) {
            IParameterizedABI::class.asClassName()
        } else {
            IABI::class.asClassName()
        }

        addSuperinterface(
            superInterface.parameterizedBy(
                withStarParams, MemorySegment::class.asClassName()
            )
        )
        addParameterizedFromNative(sparseDelegate)
        addPtrToNative(sparseDelegate)

        if (sparseDelegate.isGeneric) {
            addGetType(withStarParams)
        } else {
            addIIDProperty(sparseDelegate)
        }
        addLayout()
        addLinkerProperty()

        if(sparseDelegate.isGeneric) {
            addParameterizedDowncallHandleFn(sparseDelegate)
        }else {
            addDownCallProperty(sparseDelegate.asMethod(), sparseDelegate, 0, "downcallHandle")
        }
    }.build()
    addType(abiTypeSpec)
}

private fun TypeSpec.Builder.addParameterizedDowncallHandleFn(sparseDelegate: SparseDelegate) {
    addFunction(FunSpec.builder("downcallHandleForType").apply {
        addParameter("type", KType::class)
        returns(MethodHandle::class)
        addCode("return ")
        addCode(downcallPropertyInitializer(sparseDelegate, sparseDelegate.asMethod()))
    }.build())
    val downcallHandlePropertyType = LambdaTypeName.get(
        null,
        listOf(ParameterSpec("type", KType::class.asTypeName())),
        MethodHandle::class.asTypeName()
    )
    addProperty(PropertySpec.builder("downcallHandle", downcallHandlePropertyType).apply {
        initializer("memoize(::downcallHandleForType)")
    }.build())
}

private fun TypeSpec.Builder.addGetType(typeName: TypeName) {
    val getTypeSpec = FunSpec.builder("getType").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", typeName)
        addCode("return obj!!.type!!")
    }.build()
    addFunction(getTypeSpec)
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
                .parameterizedBy(sparseDelegate.asTypeName())
        )

        if (sparseDelegate.isGeneric) {
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
            val typeParameter = if (sparseDelegate.isGeneric) "type!!" else null
            val parameters = listOfNotNull(typeParameter, "pointer.getPointer(0)").joinToString()
            addCode(
                "return %T(${parameters})",
                sparseDelegate.asTypeName()
            )
            returns(sparseDelegate.asTypeName())
        }.build()
        addFunction(getValueFn)

        val setValueFn = FunSpec.builder("setValue").apply {
            addParameter("value", sparseDelegate.asTypeName())
            addCode("pointer = value.pointer!!")
        }.build()
        addFunction(setValueFn)

    }.build()

    addType(byReferenceInterfaceSpec)
}

private fun TypeSpec.Builder.addCompanionObject(sparseDelegate: SparseDelegate) {
    val companionObject = TypeSpec.companionObjectBuilder().apply {
        addBodyInvokeOperator(sparseDelegate)
        if (sparseDelegate.isGeneric) {
            addReifiedPointerInvokeOperator(sparseDelegate)
        }
        addNativeHandleProperty(sparseDelegate)
        addNativeFn(sparseDelegate)
    }.build()
    addType(companionObject)
}

private fun TypeSpec.Builder.addNativeHandleProperty(sd: SparseDelegate) {
    val nativeHandleProperty = PropertySpec.builder("nativeFnHandle", MethodHandle::class).apply {
        getter(FunSpec.getterBuilder().apply {
            addAnnotation(NativeFunctionMarker::class)
            val getterCB = CodeBlock.builder().apply {
                add(
                    "return %T.lookup().findStatic( %T::class.java, %S,\n",
                    MethodHandles::class,
                    sd.asClassName(),
                    "nativeFn"
                )
                indent()
                add("%T.methodType(%T::class.java, \n", MethodType::class, Int::class.java)
                if (sd.isGeneric) {
                    add("%T::class.java, ", KType::class)
                }
                add("%T::class.java, ", ClassName("", "${sd.name}Body"))
                add("%T::class.java, ", MemorySegment::class)

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

        if (sparseDelegate.isGeneric) {
            addParameter("_type", KType::class)
        }
        addParameter("fn", getBodyClassName(sparseDelegate))
        addParameter("thisPtr", MemorySegment::class)
        sparseDelegate.parameters.flatMap {
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

private fun TypeSpec.Builder.addReifiedPointerInvokeOperator(sparseDelegate: SparseDelegate) {
    val invokeFn = FunSpec.builder("invoke").apply {
        addModifiers(KModifier.OPERATOR, KModifier.INLINE)
        addMethodTypeParameters(sparseDelegate)
        addParameter("pointer", nullablePtr)
        returns(sparseDelegate.asTypeName())
        addStatement("val type = typeOf<%T>()", sparseDelegate.asTypeName())
        addStatement("return %T(type, pointer)", sparseDelegate.asClassName())
    }.build()
    addFunction(invokeFn)
}

fun kTypeStringFor(
    typeReference: SparseTypeReference,
    typeParameterIndexMap: Map<String, Int>,
    projection: Boolean = false,
    typeVarName: String = "type"
): String {
    val builder = CodeBlock.builder()
    return with(builder) {
        kTypeStatementFor(typeReference, typeParameterIndexMap, projection, true, typeVarName)
        builder.build().toString()
    }
}

fun CodeBlock.Builder.kTypeStatementFor(
    typeReference: SparseTypeReference,
    typeParameterIndexMap: Map<String, Int>,
    projection: Boolean = false,
    root: Boolean = false,
    typeVarName: String = "type"
) {
    if (!typeReference.hasTypeParameter()) {
        add("typeOf<%T>()", typeReference.asTypeName())
        return
    }
    if (typeReference.isTypeParameter()) {
        add("${typeVarName}!!.arguments[${typeParameterIndexMap[typeReference.name]}]")
        if (root) {
            add(".type!!")
        }
        return
    }
    if (projection) {
        add("%T(%M,", KTypeProjection::class, KVariance::class.member("INVARIANT"))
    }

    add("%T::class.createType(listOf(\n", typeReference.asClassName())
    indent()
    typeReference.genericParameters!!.forEach {
        if (it.type == null) {
            kTypeStatementFor(
                SparseTypeReference(it.name, ""),
                typeParameterIndexMap,
                projection,
                typeVarName = typeVarName
            )
        } else {
            kTypeStatementFor(it.type, typeParameterIndexMap, true, typeVarName = typeVarName)
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
        if (sparseDelegate.isGeneric) {
            addModifiers(KModifier.INLINE)
        }
        addModifiers(KModifier.OPERATOR)
        addMethodTypeParameters(sparseDelegate, true)

        val bodyClassName = getBodyClassName(sparseDelegate)
        addParameter("fn", bodyClassName)

        val delegateType = sparseDelegate.asTypeName()
        val delegateClass = sparseDelegate.asClassName()
        returns(delegateType)

        val cb = CodeBlock.builder().apply {
            addStatement("val arena = %T.ofAuto()", Arena::class)
            val parameterized = sparseDelegate.isGeneric.toString()
            addStatement("val (methodHandle, functionDescriptor) = transformParameterizedHandle(typeOf<%T>(), ${parameterized})", delegateType)
            addStatement("val boundHandle = methodHandle.bindTo(fn)")
            addStatement(
                "val stub = %T.nativeLinker().upcallStub(boundHandle, functionDescriptor, arena)",
                Linker::class
            )

            add("val guid = ")
            if (sparseDelegate.isGeneric) {
                addStatement("guidOf<%T>()", delegateType)
            }else {
                addStatement("ABI.IID")
            }

            addStatement("val delegateStruct = %T.createDelegate(arena, guid, stub)", Delegate::class)

            addStatement("val type = typeOf<%T>()", delegateType)

            val typeParameter = if (sparseDelegate.isGeneric) "type" else null
            val ctorParams = listOfNotNull(
                typeParameter,
                "delegateStruct.toPointer()",
                "arena"
            )
            addStatement("val newDelegate = %T(${ctorParams.joinToString()})", delegateType)
            addStatement("%T.releaseOnGC(newDelegate)", ReferenceManager::class)
            addStatement("return newDelegate")
        }.build()
        addCode(cb)
    }.build()
    addFunction(invokeFn)
}

private fun SparseDelegate.asMethod(): SparseMethod {
    return SparseMethod(
        "invoke",
        parameters,
        returnType
    )
}

private fun TypeSpec.Builder.addInvokeOperator(sparseDelegate: SparseDelegate) {
    val invokeFn = generateInterfaceMethod(
        sparseDelegate.asMethod(),
        sparseDelegate,
        0,
        true,
        vtblName = "iUnknown_Vtbl",
        pointerName = "iUnknown_Ptr",
        typeVarName = "type"

    )
    addFunction(invokeFn)
}

private fun TypeSpec.Builder.addPrimaryConstructor(sparseDelegate: SparseDelegate) {
    val constructor = FunSpec.constructorBuilder().apply {
        if (sparseDelegate.isGeneric) {
            val typeParameterSpec = ParameterSpec.builder("type", KType::class.asClassName().copy(true)).apply {
                defaultValue("null")
            }.build()
            addParameter(typeParameterSpec)
            val typePropertySpec = PropertySpec.builder("type", KType::class.asClassName().copy(true)).apply {
                initializer("type")
            }.build()
            addProperty(typePropertySpec)
        }

        val ptrParameterSpec = ParameterSpec.builder("ptr", typeNameOf<Pointer?>()).apply {
            defaultValue("%T.NULL", Pointer::class)
        }.build()
        addParameter(ptrParameterSpec)

        val arenaParameterSpec = ParameterSpec.builder("arena", typeNameOf<Arena?>()).apply {
            defaultValue("null")
        }.build()
        addParameter(arenaParameterSpec)

        val arenaPropertySpec = PropertySpec.builder("arena", typeNameOf<Arena?>()).apply {
            initializer("arena")
            addModifiers(KModifier.PRIVATE)
        }.build()
        addProperty(arenaPropertySpec)
    }.build()
    primaryConstructor(constructor)
}

private fun getBodyClassName(sparseDelegate: SparseDelegate): TypeName {
    val parameterizedTypeName = sparseDelegate.asTypeName()
    return parameterizedTypeName(sparseDelegate, parameterizedTypeName)
}

private fun parameterizedTypeName(
    sparseDelegate: SparseDelegate,
    parameterizedTypeName: TypeName
): TypeName {
    if (parameterizedTypeName !is ParameterizedTypeName) {
        return ClassName(sparseDelegate.namespace, "${sparseDelegate.name}Body")
    }

    return ClassName(sparseDelegate.namespace, "${sparseDelegate.name}Body")
        .parameterizedBy(*parameterizedTypeName.typeArguments.toTypedArray<TypeName>())
}

private fun TypeSpec.Builder.addTypeParameters(sparseDelegate: SparseDelegate) {
    sparseDelegate.genericParameters
        ?.map(SparseGenericParameter::name)
        ?.map(TypeVariableName::invoke)
        ?.forEach(::addTypeVariable)
}

private fun FunSpec.Builder.addMethodTypeParameters(sparseDelegate: SparseDelegate, reified: Boolean = true) {
    sparseDelegate.genericParameters
        ?.map(SparseGenericParameter::name)
        ?.map(TypeVariableName::invoke)
        ?.map {
            it.copy(reified = reified)
        }
        ?.forEach(::addTypeVariable)
}

private fun TypeSpec.Builder.addDelegateAnnotations(sparseDelegate: SparseDelegate) {
    if (sparseDelegate.isGeneric) {
        addAnnotation(GenericType::class)
    }
    addAnnotation(DelegateMarker::class)
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

