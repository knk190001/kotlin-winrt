package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.ArrayType
import com.github.knk190001.winrtbinding.generator.model.arrayType
import com.github.knk190001.winrtbinding.generator.model.entities.SparseDelegate
import com.github.knk190001.winrtbinding.generator.model.entities.SparseInterface
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.sun.jna.CallbackReference
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT.HRESULT
import com.sun.jna.ptr.ByReference
import com.sun.jna.win32.StdCallLibrary.StdCallCallback
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

fun generateDelegate(
    sparseDelegate: SparseDelegate
): FileSpec {
    if (sparseDelegate.parameterized) {
        val cleanName = sparseDelegate.asTypeReference().cleanName()
        return generateGenericDelegate(sparseDelegate.withName(cleanName))
    }
    return generateNonGenericDelegate(sparseDelegate)
}

fun generateNonGenericDelegate(
    sd: SparseDelegate
) = FileSpec.builder(sd.namespace, sd.name).apply {
    addImports()
    val delegateTypeName = ClassName(sd.namespace, sd.name)
    val delegateParameters = sd.parameters.map {
        ParameterSpec.builder(
            it.name,
            it.type.asGenericTypeParameter(false).copy(!it.type.isPrimitiveSystemType() && !it.type.isArray)
        ).build()
    }

    val funInterface = TypeSpec.funInterfaceBuilder("${sd.name}Body").apply {
        val invokeFn = FunSpec.builder("invoke").apply {
            addModifiers(KModifier.ABSTRACT, KModifier.OPERATOR)
            delegateParameters.forEach(::addParameter)
            returns(sd.returnType.asGenericTypeParameter())
        }.build()
        addFunction(invokeFn)
    }.build()
    addType(funInterface)

    val delegateClass = TypeSpec.classBuilder(sd.name).apply {
        addABIAnnotation(sd.asTypeReference().asClassName())
        addSignatureAnnotation(sd)
        superclass(Delegate::class)
        if (sd.genericParameters != null) {
            addAnnotation(GenericType::class)
            addSuperinterface(
                sd.asTypeReference().normalize().dropGenericParameterCount().asGenericTypeParameter(false)
            )
        }
        generateConstructor()
        generateCompanion(sd, delegateTypeName)
        generateNativeInterface(sd)
        generateByReference(sd)
        generateInvokeFunction(sd)
        generateABI(sd)
    }.build()
    addType(delegateClass)
}.build()

private fun FileSpec.Builder.addImports() {
    addImport("com.github.knk190001.winrtbinding.runtime", "getValue")
    addImport("com.github.knk190001.winrtbinding.runtime", "toHandle")
    addImport("com.github.knk190001.winrtbinding.runtime", "castToImpl")
    addImport("com.github.knk190001.winrtbinding.runtime", "handleToString")
    addImport("com.github.knk190001.winrtbinding.runtime", "setValue")
    addImport("com.github.knk190001.winrtbinding.runtime", "iUnknownIID")
    addImport("com.github.knk190001.winrtbinding.runtime", "ABI")
    addImport("com.github.knk190001.winrtbinding.runtime", "invokeHR")
    addImport("com.github.knk190001.winrtbinding.runtime", "checkHR")
    addImport("com.github.knk190001.winrtbinding.runtime", "arrayFromNative")
    addImport("com.github.knk190001.winrtbinding.runtime", "guidFromNative")
    addImport("com.github.knk190001.winrtbinding.runtime", "booleanFromNative")
    addImport("kotlin.reflect", "typeOf")
    addImport("kotlin.reflect.jvm", "javaMethod")
}

private fun TypeSpec.Builder.generateInvokeFunction(sd: SparseDelegate) {
    val invokeFn = FunSpec.builder("invoke").apply {
        if (sd.genericParameters != null) {
            addModifiers(KModifier.OVERRIDE)
        }
        sd.parameters.forEach {
            addParameter(
                it.name, it.type.asGenericTypeParameter(false)
                    .copy(!it.type.isPrimitiveSystemType() && !it.type.isArray)
            )
        }
        val cb = CodeBlock.builder().apply {
            if (sd.returnType.name != "Void") {
                addStatement("val result = %T()", sd.returnType.byReferenceClassName())
                returns(sd.returnType.asGenericTypeParameter())
            }
            val marshalledParameters = sd.parameters.map {
                Marshaller.marshals.getOrDefault(it.type.asKClass(), Marshaller.default)
                    .generateToNativeMarshalCode(it.name)
            }
            marshalledParameters.forEach {
                add(it.second)
            }

            val marshalledNames = marshalledParameters.map {
                it.first
            }
            addStatement("val function = %T.getFunction(delegateStruct.fn!!)", Function::class)
            add("val hr = function.invokeHR(arrayOf(this.pointer,")
            add(marshalledNames.mapIndexed { idx, name ->
                if (sd.parameters[idx].type.namespace != "System" &&
                    lookUpTypeReference(sd.parameters[idx].type) is SparseInterface
                ) {
                    "$name?.toNative() as Pointer"
                } else {
                    name
                }
            }.toMutableList().apply {
                if (sd.returnType.name != "Void") {
                    add("result")
                }
            }.joinToString())

            addStatement("))")
            addStatement("checkHR(hr)")

            if (sd.returnType.name != "Void") {
                addStatement("val resultValue = result.getValue()")
                val (name, cb) = Marshaller.marshals.getOrDefault(sd.returnType.asKClass(), Marshaller.default)
                    .generateFromNativeMarshalCode("resultValue")
                add(cb)
                addStatement("return $name")
            }
        }.build()
        addCode(cb)
    }.build()
    addFunction(invokeFn)
}

private fun TypeSpec.Builder.generateConstructor() {
    val ctor = FunSpec.constructorBuilder().apply {
        val ptrParameter = ParameterSpec.builder("ptr", Pointer::class.asClassName().copy(true))
            .defaultValue("%T.NULL", Pointer::class)
            .build()
        addParameter(ptrParameter)
    }.build()
    primaryConstructor(ctor)
    addSuperclassConstructorParameter("ptr")
}

private fun TypeSpec.Builder.generateCompanion(
    sd: SparseDelegate,
    delegateTypeName: ClassName
) {
    val companionObj = TypeSpec.companionObjectBuilder().apply {
        generatePseudoConstructor(sd, delegateTypeName)
        generateForeignFunction(sd)
        generateNativeHandleProperty(sd)
    }.build()
    addType(companionObj)
}

private fun TypeSpec.Builder.generateNativeHandleProperty(sd: SparseDelegate) {
    val nativeHandleProperty = PropertySpec.builder("nativeFnHandle", MethodHandle::class).apply {
        addModifiers(KModifier.PRIVATE)
        initializer(CodeBlock.builder().apply {
            addStatement(
                "%T.lookup().findStatic(%T::class.java, %S,",
                MethodHandles::class,
                sd.asTypeReference().asClassName(),
                "nativeFn"
            )
            indent()
            addStatement("%T.methodType(%T::class.java, ", MethodType::class, Int::class.java)
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
            addStatement(")")
            unindent()
            addStatement(")")
        }.build())
    }.build()
    addProperty(nativeHandleProperty)
}

private fun TypeSpec.Builder.generateForeignFunction(sd: SparseDelegate) {
    val nativeFnSpec = FunSpec.builder("nativeFn").apply {
        addAnnotation(JvmStatic::class)
        val suppressWarningSpec = AnnotationSpec.builder(Suppress::class).addMember("%S", "UNCHECKED_CAST").build()
        addAnnotation(suppressWarningSpec)
        addParameter("fn", ClassName("", "${sd.name}Body"))
        addParameter("thisObj", MemoryAddress::class)
        sd.parameters.flatMap {
            when (it.arrayType()) {
                ArrayType.None -> listOf(it.name to it.type.foreignType())
                ArrayType.FillArray -> {
                    listOf(
                        "${it.name}_size" to Int::class,
                        it.name to MemorySegment::class
                    )
                }

                ArrayType.PassArray -> {
                    listOf(
                        "${it.name}_size" to Int::class,
                        it.name to MemorySegment::class
                    )
                }

                ArrayType.ReceiveArray -> {
                    listOf(
                        "${it.name}_size" to MemorySegment::class,
                        it.name to MemorySegment::class
                    )
                }
            }
        }.forEach {
            addParameter(it.first, it.second)
        }

        if (sd.returnType.name != "Void") {
            addParameter("returnValue", MemorySegment::class)
        }

        val cb = CodeBlock.builder().apply {
            beginControlFlow("try")
            val mappedNames = sd.parameters.map {
                it to (it.type.isPrimitiveSystemType() && it.type.name != "Boolean")
            }.map { (param, isPrimitive) ->
                if (isPrimitive) {
                    return@map param.name
                }
                val typeParameters = mutableListOf<TypeName>()
                val managedName = "${param.name}_Managed"
                val typeOfString = if (!param.type.genericParameters.isNullOrEmpty()) {
                    typeParameters.add(param.type.asGenericTypeParameter())
                    "typeOf<%T>(), "
                } else {
                    ""
                }
                val fromNativeString = if (param.type.isArray) {
                    typeParameters.add(0, param.type.copy(isArray = false).asGenericTypeParameter())
                    "arrayFromNative<%T>(${param.name}_size, ${param.name})"
                } else if (param.type.namespace == "System" && param.type.name == "Guid") {
                    "guidFromNative(${param.name})"
                } else if (param.type.namespace == "System" && param.type.name == "Boolean") {
                    "${param.name} != 0.toByte()"
                } else {
                    typeParameters.add(0, param.type.asClassName())
                    typeParameters.add(param.type.asGenericTypeParameter())
                    "%T.ABI.fromNative($typeOfString${param.name}) as %T"
                }

                addStatement(
                    "val $managedName = $fromNativeString",
                    *typeParameters.toTypedArray()
                )

                managedName
            }
            if (sd.returnType.name != "Void") {
                add("val result = ")
            }
            addStatement("fn(${mappedNames.joinToString()})")
            val returnVarName = if (sd.returnType.name != "Void") {
                val (name, cb) = Marshaller.marshals.getOrDefault(sd.returnType.asKClass(), Marshaller.default)
                    .generateToNativeMarshalCode("result")
                add(cb)
                name
            } else ""
            if (sd.returnType.name != "Void") {
                addStatement("val returnAddress = %T(returnValue[ADDRESS, 0].toRawLongValue())", Pointer::class)
                addStatement("val returnByValue = %T()", sd.returnType.byReferenceClassName())
                addStatement("returnByValue.setPointer(returnAddress)")
                if (sd.returnType.isSystemTypeOrObject() && sd.returnType.name == "Object") {
                    addStatement("returnByValue.setValue($returnVarName.castToImpl())")
                } else {
                    addStatement("returnByValue.setValue($returnVarName)")
                }
            }
            unindent()
            addStatement("} catch (e: Throwable) {")
            indent()
            addStatement("e.printStackTrace()")
            addStatement("return WinNT.E_FAIL")
            endControlFlow()
            addStatement("return 0")
        }.build()
        addCode(cb)
        returns(Int::class)
    }.build()
    addFunction(nativeFnSpec)
}

private fun TypeSpec.Builder.generatePseudoConstructor(
    sd: SparseDelegate,
    delegateTypeName: ClassName
) {
    val createFn = FunSpec.builder("invoke").apply {
        addModifiers(KModifier.OPERATOR)
        addParameter("fn", ClassName(sd.namespace, "${sd.name}Body"))
        returns(delegateTypeName)

        val cb = CodeBlock.builder().apply {
            addStatement("val session = %T.global()", MemorySession::class)
            addStatement("val stub = %T.nativeLinker().upcallStub(", Linker::class)
            indent()
            addStatement("nativeFnHandle.bindTo(fn),")
            addStatement(
                "%T.of(%M, %M ",
                FunctionDescriptor::class,
                ValueLayout::class.member("JAVA_INT"),
                ValueLayout::class.member("ADDRESS")
            )
            sd.parameters.flatMap {
                when (it.arrayType()) {
                    ArrayType.None -> listOf(it.type.valueLayout())
                    ArrayType.PassArray -> listOf(
                        ValueLayout::class.member("JAVA_INT"),
                        ValueLayout::class.member("ADDRESS")
                    )

                    ArrayType.FillArray -> listOf(
                        ValueLayout::class.member("JAVA_INT"),
                        ValueLayout::class.member("ADDRESS")
                    )

                    ArrayType.ReceiveArray -> listOf(
                        ValueLayout::class.member("ADDRESS"),
                        ValueLayout::class.member("ADDRESS")
                    )
                }
            }.forEach {
                add(", ")
                when (it) {
                    is MemberName -> {
                        add("%M", it)
                    }

                    is CodeBlock -> {
                        add(it)
                    }

                    else -> {
                        add("%T", it)
                    }
                }
            }
            if (sd.returnType.name != "Void") {
                add(", %M", ValueLayout::class.member("ADDRESS"))
            }
            addStatement("),")
            addStatement("session)")
            unindent()
            addStatement(
                "val nativeFn = %T.getCallback(Native::class.java, %T(stub.address().toRawLongValue())) as Native",
                CallbackReference::class,
                Pointer::class
            )
            addStatement("val newDelegate = %T(%T(12))", delegateTypeName, Memory::class)
            val iidType = if (sd.parameterized) {
                "PIID"
            } else {
                "IID"
            }
            addStatement("newDelegate.init(listOf(ABI.$iidType,iUnknownIID), nativeFn)", Guid.IID::class, sd.guid)
            addStatement("return newDelegate")
        }.build()
        addCode(cb)
    }.build()
    addFunction(createFn)
}

private fun TypeSpec.Builder.generateNativeInterface(sd: SparseDelegate) {
    val nativeInterface = TypeSpec.funInterfaceBuilder("Native").apply {
        addSuperinterface(StdCallCallback::class)
        val invoke = FunSpec.builder("invoke").apply {
            addParameter("thisPtr", Pointer::class)
            addModifiers(KModifier.ABSTRACT)
            sd.parameters.forEach {
                if (it.type.namespace != "System" && lookUpTypeReference(it.type) is SparseInterface) {
                    addParameter(it.name, Pointer::class)
                } else if (Marshaller.marshals.contains(it.type.asKClass())) {
                    addParameter(it.name, Marshaller.marshals[it.type.asKClass()]!!.nativeType)
                } else {
                    addParameter(
                        it.name,
                        it.type.asClassName(false).copy(!it.type.isPrimitiveSystemType() && !it.type.isArray)
                    )
                }
            }
            if (sd.returnType.name != "Void") {
                addParameter("retVal", sd.returnType.byReferenceClassName())
            }
            returns(HRESULT::class)
        }.build()
        addFunction(invoke)
    }.build()
    addType(nativeInterface)
}

private fun TypeSpec.Builder.generateByReference(sd: SparseDelegate) {
    val brAnnotationSpec = AnnotationSpec.builder(WinRTByReference::class)
        .addMember("brClass = %L.ByReference::class", sd.name)
        .build()
    addAnnotation(brAnnotationSpec)

    val delegateTypeName = ClassName(sd.namespace, sd.name)
    val byReference = TypeSpec.classBuilder("ByReference").apply {
        addSuperinterface(IByReference::class.asClassName().parameterizedBy(ClassName("", sd.name)))

        superclass(ByReference::class)
        val memberName = MemberName(Native::class.asClassName(), "POINTER_SIZE")
        addSuperclassConstructorParameter("%M", memberName)
        val getValueSpec = FunSpec.builder("getValue").apply {
            addModifiers(KModifier.OVERRIDE)
            addCode("return %T(pointer.getPointer(0))", delegateTypeName)
            returns(delegateTypeName)
        }.build()
        addFunction(getValueSpec)

        val setValueSpec = FunSpec.builder("setValue").apply {
            addParameter("delegate", delegateTypeName)
            addCode("pointer.setPointer(0, delegate.pointer)")
        }.build()
        addFunction(setValueSpec)
    }.build()
    addType(byReference)
}

private fun TypeSpec.Builder.generateABI(sd: SparseDelegate) {
    val abiObject = TypeSpec.objectBuilder("ABI").apply {
        addIID(sd)
        addSuperinterface(
            IABI::class.asClassName().parameterizedBy(
                sd.asTypeReference().asClassName(),
                MemoryAddress::class.asClassName()
            )
        )
        addFromNative(sd)
        addPtrToNative(sd)
        addLayout()
    }.build()
    addType(abiObject)
}

private fun TypeSpec.Builder.addIID(sd: SparseDelegate) {
    val iidProperty = PropertySpec.builder("IID", Guid.IID::class).apply {
        initializer("%T(%S)", Guid.IID::class, sd.guid)
    }.build()
    addProperty(iidProperty)
}

private fun TypeSpec.Builder.addFromNative(sd: SparseDelegate) {
    val fromNative = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("segment", MemoryAddress::class)
        returns(sd.asTypeReference().asClassName())
        addStatement("val address = segment.toRawLongValue()", ValueLayout::class.member("ADDRESS"))
        addStatement(
            "return %T(%T(address))".fixSpaces(),
            sd.asTypeReference().asClassName(),
            Pointer::class
        )
    }.build()
    addFunction(fromNative)
}

private fun TypeSpec.Builder.addLayout() {
    val layoutProperty = PropertySpec.builder("layout", ValueLayout::class).apply {
        addModifiers(KModifier.OVERRIDE)
        initializer("%M", ValueLayout::class.member("ADDRESS"))
    }.build()
    addProperty(layoutProperty)
}
