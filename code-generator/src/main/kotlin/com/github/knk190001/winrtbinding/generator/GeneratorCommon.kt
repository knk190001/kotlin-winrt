package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.interop.*
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.ByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.reflect.KClass
import kotlin.reflect.KType

internal fun TypeSpec.Builder.generateByReferenceType(
    entity: INamedEntity
) {
    val className = ClassName.bestGuess("${entity.namespace}.${entity.name}")

    superclass(ByReference::class)
    val ptrSize = Native::class.member("POINTER_SIZE")
    addSuperclassConstructorParameter("%M", ptrSize)

    val getValueSpec = FunSpec.builder("getValue").apply {
        addModifiers(KModifier.OVERRIDE)
        addCode("return %T(pointer.getPointer(0))", className)
    }.build()
    addFunction(getValueSpec)

    val setValueSpec = FunSpec.builder("setValue").apply {
        addParameter("value", className)
        addCode("pointer.setPointer(0, value.pointer)")
    }.build()
    addFunction(setValueSpec)
}

internal fun TypeSpec.Builder.addByReferenceType(entity: INamedEntity) {
    val brAnnotationSpec = AnnotationSpec.builder(WinRTByReference::class)
        .addMember("brClass = %L.ByReference::class", entity.name)
        .build()
    addAnnotation(brAnnotationSpec)
    val byReference = TypeSpec.classBuilder("ByReference").apply {
        addSuperinterface(IByReference::class.asClassName().parameterizedBy(ClassName("", entity.name)))
        generateByReferenceType(entity)
    }.build()
    addType(byReference)
}

fun SparseTypeReference.asClassName(
    structByValue: Boolean = true,
    nullable: Boolean = false,
    nestedClass: String? = null
): TypeName {
    if (nestedClass != null) {
        return (asClassName(structByValue, nullable) as ClassName).nestedClass(nestedClass)
    }
    if (isArray) {
        val baseClass = if (isReference) {
            if (this.copy(isArray = false).isPrimitiveSystemType()) {
                PrimitiveOutArray::class.asClassName()
            } else {
                OutArray::class.asClassName()
            }
        } else {
            Array::class.asClassName()
        }

        val componentType = copy(isArray = false, isReference = false)

        return baseClass
            .parameterizedBy(componentType.asClassName(nullable = !componentType.isPrimitiveSystemType()))
    }
    if (nullable) {
        return asClassName(isReference).copy(true)
    }
    if (isReference) {
        return byReferenceClassName().copy()
    }
    if (namespace == "System") {
        return when (name) {
            "Single" -> Float::class.asClassName()
            "Double" -> Double::class.asClassName()
            "Byte" -> Byte::class.asClassName()
            "Int16" -> Short::class.asClassName()
            "Int32" -> Int::class.asClassName()
            "Int64" -> Long::class.asClassName()
            "Char" -> Char::class.asClassName()
            "Boolean" -> Boolean::class.asClassName()
            "Void" -> Unit::class.asClassName()
            "UInt32" -> UInt::class.asClassName()
            "String" -> String::class.asClassName()
            "UInt32&" -> UIntByReference::class.asClassName()
            "Object" -> IUnknown::class.asClassName()
            "UInt64" -> ULong::class.asClassName()
            "UInt16" -> UShort::class.asClassName()
            "Guid" -> Guid.GUID::class.asClassName()
            else -> throw NotImplementedError("Type: $namespace.$name is not handled")
        }
    }
    if (this.isReference) {
        if (genericParameters != null) {
            return ClassName(dropGenericParameterCount().name, "ByReference")
        }
        return ClassName(fullName(), "ByReference")
    }
    if (genericParameters != null) {
        return ClassName(this.namespace, cleanName())
    }

    if (lookUpTypeReference(this) is SparseStruct && structByValue) {
        return ClassName(namespace, name).nestedClass("ByValue")
    }
    return ClassName(this.namespace, this.name)
}

fun SparseTypeReference.asKClass(): KClass<*> {
    if (isArray) return WinRTTypeVariable::class
    if (namespace.isEmpty()) return Nothing::class
    if (namespace == "System") {
        when (name) {
            "UInt16" -> return UShort::class
            "UInt32" -> return UInt::class
            "UInt32&" -> return UIntByReference::class
            "UInt64" -> return ULong::class
            "Double" -> return Double::class
            "Boolean" -> return Boolean::class
            "Int16" -> return Short::class
            "Int32" -> return Int::class
            "Int64" -> return Long::class
            "Void" -> return Unit::class
            "String" -> return String::class
            "Object" -> return IUnknown::class
            "Single" -> return Float::class
            "Char" -> return Char::class
            "Byte" -> return Byte::class
            "Guid" -> return Guid.GUID::class
        }
    }

    return when (lookUpTypeReference(this)) {
        is SparseClass -> WinRTClass::class
        is SparseInterface -> {
            if (genericParameters != null) {
                WinRTGenericInterface::class
            } else {
                WinRTInterface::class
            }
        }

        is SparseDelegate -> {
            if (genericParameters != null) {
                WinRTGenericDelegate::class
            } else {
                WinRTDelegate::class
            }
        }

        is SparseEnum -> WinRTEnum::class
        is SparseStruct -> WinRTStruct::class
        else -> Nothing::class
    }
}

fun SparseTypeReference.valueLayout(): CodeBlock {
    if (this.isReference) {
        return CodeBlock.of("%M", ValueLayout::class.member("ADDRESS"))
    }
    if (!isSystemTypeOrObject()) {
        when (lookUpTypeReference(this)) {
            is SparseClass -> return CodeBlock.of("%M", ValueLayout::class.member("ADDRESS"))
            is SparseInterface -> return CodeBlock.of("%M", ValueLayout::class.member("ADDRESS"))
            is SparseDelegate -> return CodeBlock.of("%M", ValueLayout::class.member("ADDRESS"))
            is SparseEnum -> return CodeBlock.of("%M", ValueLayout::class.member("JAVA_INT"))
        }
    }

    if (namespace == "System") {
        return CodeBlock.of(
            "%M", when (name) {
                "UInt32" -> ValueLayout::class.member("JAVA_INT")
                "UInt64" -> ValueLayout::class.member("JAVA_LONG")
                "Double" -> ValueLayout::class.member("JAVA_DOUBLE")
                "Boolean" -> ValueLayout::class.member("JAVA_BOOLEAN")
                "Int16" -> ValueLayout::class.member("JAVA_SHORT")
                "Int32" -> ValueLayout::class.member("JAVA_INT")
                "Int64" -> ValueLayout::class.member("JAVA_LONG")
                "String" -> ValueLayout::class.member("ADDRESS")
                "UInt32&" -> ValueLayout::class.member("ADDRESS")
                "UInt16" -> ValueLayout::class.member("JAVA_SHORT")
                "Object" -> ValueLayout::class.member("ADDRESS")
                "Single" -> ValueLayout::class.member("JAVA_FLOAT")
                "Char" -> ValueLayout::class.member("JAVA_CHAR")
                "Byte" -> ValueLayout::class.member("JAVA_BYTE")
                "Guid" -> return CodeBlock.builder().apply {
                    addStatement("%T.structLayout(", MemoryLayout::class)
                    indent()
                    addStatement("%M,", ValueLayout::class.member("JAVA_INT"))
                    addStatement("%M, ", ValueLayout::class.member("JAVA_SHORT"))
                    addStatement("%M,", ValueLayout::class.member("JAVA_SHORT"))
                    addStatement("%M", ValueLayout::class.member("JAVA_LONG"))
                    unindent()
                    addStatement(")")
                }.build()

                else -> throw NotImplementedError("Type: $namespace.$name is not handled")
            }
        )
    }
    if (lookUpTypeReference(this) is SparseInterface) {
        return CodeBlock.of("%M", ValueLayout::class.member("ADDRESS"))
    }


    return CodeBlock.of("%T.ABI.layout", asClassName(structByValue = false))
}

fun SparseTypeReference.byReferenceClassName(): TypeName {
    if (isArray) {
        return OutArray::class.asClassName()
            .parameterizedBy(copy(isReference = false, isArray = false).asClassName())

    }
    if (namespace == "System") {
        return when (name) {
            "UInt16" -> UShortByReference::class.asClassName()
            "UInt32" -> UIntByReference::class.asClassName()
            "UInt64" -> ULongByReference::class.asClassName()
            "Single" -> FloatByReference::class.asClassName()
            "Double" -> DoubleByReference::class.asClassName()
            "Boolean" -> BooleanByReference::class.asClassName()
            "Int16" -> ShortByReference::class.asClassName()
            "Int32" -> IntByReference::class.asClassName()
            "Int64" -> LongByReference::class.asClassName()
            "Void" -> Unit::class.asClassName()
            "String" -> StringByReference::class.asClassName()
            "Object" -> IUnknownByReference::class.asClassName()
            "Byte" -> ByteByReference::class.asClassName()
            "Guid" -> GuidByReference::class.asClassName()
            "Char" -> CharByReference::class.asClassName()
            else -> throw NotImplementedError("Type: $namespace.$name is not handled")
        }
    }
    if (genericParameters != null) {
        val name = dropGenericParameterCount().name
        val typeParameters = genericParameters.map { it.type!!.asTypeName(nullable = !it.type.isPrimitiveSystemType()) }
        return ClassName("${this.namespace}.$name", "ByReference").parameterizedBy(typeParameters)
    }

    return ClassName(this.namespace + ".${this.name}", "ByReference")
}

fun SparseTypeReference.foreignType(): KClass<*> {
    if (isArray) {
        return MemorySegment::class
    }

    if (isReference) {
        return MemoryAddress::class
    }

    if (namespace == "System") {
        return when (name) {
            "UInt16" -> Short::class
            "UInt32" -> Int::class
            "UInt64" -> Long::class
            "Single" -> Float::class
            "Double" -> Double::class
            "Boolean" -> Byte::class
            "Int16" -> Short::class
            "Int32" -> Int::class
            "Int64" -> Long::class
            "Void" -> Unit::class
            "String" -> MemoryAddress::class
            "Object" -> MemoryAddress::class
            "Byte" -> Byte::class
            "Guid" -> MemorySegment::class
            "Char" -> Char::class
            else -> throw NotImplementedError("Type: $namespace.$name is not handled")
        }
    }
    if (this.isTypeParameter()) {
        return Any::class
    }

    if (lookUpTypeReference(this) is SparseEnum) {
        return Int::class
    }

    if (lookUpTypeReference(this) is SparseStruct) {
        return MemorySegment::class
    }

    return MemoryAddress::class
}

fun TypeSpec.Builder.addSignatureAnnotation(sparseInterface: INamedEntity) {
    val annotation = AnnotationSpec.builder(Signature::class).apply {
        addMember("%S", GuidGenerator.getSignature(sparseInterface.asTypeReference(), lookUpTypeReference))
    }.build()
    addAnnotation(annotation)
}

fun TypeSpec.Builder.addGuidAnnotation(guid: String) {
    val annotation = AnnotationSpec.builder(com.github.knk190001.winrtbinding.runtime.annotations.Guid::class).apply {
        addMember("%S", guid)
    }.build()
    addAnnotation(annotation)
}


//val reservedWords = listOf("as","break","class","continue","do","else","false","for","fun","if","in","interface","null","object","package","return", "super", "this","throw", "true", "try", "tyoe")
val reservedWords = listOf("package", "object")
fun TypeSpec.Builder.addParameterizedFromNative(projectable: IDirectProjectable<*>) {
    val fromNativeFn = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        if (!projectable.genericParameters.isNullOrEmpty()) {
            addParameter("type", KType::class)
        }
        addParameter("segment", MemoryAddress::class)

        val typeVariables = projectable.genericParameters
            ?.map { STAR }
            ?.toTypedArray() ?: emptyArray()

        val returnType = if (typeVariables.isNotEmpty()) {
            (projectable.asTypeReference().asClassName() as ClassName).parameterizedBy(*typeVariables)
        } else projectable.asTypeReference().asClassName()

        returns(returnType)

        val typeVariableString = if (typeVariables.isEmpty()) ""
        else "<${typeVariables.joinToString { "Unit" }}>"

        val cb = CodeBlock.builder().apply {
            addStatement("val address = segment.toRawLongValue()")
            if (projectable is SparseInterface) {
                val typeString = if (projectable.genericParameters.isNullOrEmpty()) {
                    ""
                } else {
                    ", type"
                }
                addStatement(
                    "return make%T$typeVariableString(%T(address)$typeString)".fixSpaces(),
                    projectable.asTypeReference().asClassName(),
                    Pointer::class
                )
            } else {
                addStatement(
                    "return %T$typeVariableString(type, %T(address))".fixSpaces(),
                    projectable.asTypeReference().asClassName(),
                    Pointer::class
                )
            }
        }.build()
        addCode(cb)
    }.build()
    addFunction(fromNativeFn)
}

fun TypeSpec.Builder.addABIAnnotation(abiClassName: TypeName) {
    val annotation = AnnotationSpec.builder(ABIMarker::class).apply {
        addMember("%T.ABI::class", abiClassName)
    }.build()
    addAnnotation(annotation)
}

fun TypeSpec.Builder.addPtrToNative(entity: INamedEntity, pointerName: String = "pointer") {
    val toNative = FunSpec.builder("toNative").apply {
        addModifiers(KModifier.OVERRIDE)
        addParameter("obj", entity.asTypeReference().asTypeName(emptyTypeParameters = true))
        returns(MemoryAddress::class)
        val objPointerExpression = if (entity is SparseInterface && entity.genericParameters.isNullOrEmpty()) {
            "(obj as WithDefault).$pointerName"
        } else {
            "obj.$pointerName"
        }
        addStatement("return %T.ofLong(%T.nativeValue($objPointerExpression))", MemoryAddress::class, Pointer::class)
    }.build()
    addFunction(toNative)
}

fun FunSpec.Builder.addTypeParameters(projectable: IDirectProjectable<*>) {
    projectable.genericParameters!!
        .map(SparseGenericParameter::name)
        .map(TypeVariableName::invoke)
        .forEach(::addTypeVariable)
}

enum class ClassNameUsage {
    ApiSurface, ParentInterface, Other
}

fun SparseTypeReference.asTypeName(
    emptyTypeParameters: Boolean = false,
    nestedClass: String? = null,
    usage: ClassNameUsage = ClassNameUsage.Other,
    nullable: Boolean = false
): TypeName {
    if (nullable) {
        return asTypeName(emptyTypeParameters, nestedClass, usage, false).copy(nullable = true)
    }
    if (this.isTypeParameter()) {
        return TypeVariableName(this.name)
    }
    if (this.name.contains("`")) {
        return this.copy(
            name = name.replaceAfter('`', "").dropLast(1)
        ).asTypeName(emptyTypeParameters, nestedClass, usage)
    }
    if (this.isArray) {
        val nonArray = this.copy(isArray = false)
        return Array::class
            .asClassName()
            .parameterizedBy(
                nonArray.asTypeName(emptyTypeParameters, nestedClass, usage)
                    .copy(!nonArray.isPrimitiveSystemType())
            )
    }

    if (usage != ClassNameUsage.Other) {
        val result = when (usage) {
            ClassNameUsage.ParentInterface -> implTypeName(this)
            ClassNameUsage.ApiSurface -> apiSurfaceTypeName(this)
            else -> throw IllegalArgumentException()
        }
        if (result != null) return result
    }
    if (this.genericParameters == null && !isArray) {
        return this.asClassName(false, nestedClass = nestedClass)
    }

    if (nestedClass != null) {
        val className = this.asClassName(nestedClass = nestedClass) as ClassName
        val parameterized = this.asTypeName(emptyTypeParameters) as ParameterizedTypeName
        return className.parameterizedBy(parameterized.typeArguments)
    }
    val typeParameters = genericParameters!!.map {
        if (emptyTypeParameters) {
            STAR
        } else if (it.type == null) {
            TypeVariableName(it.name)
        } else if (it.type.namespace == "") {
            TypeVariableName(it.type.name)
        } else {
            it.type.asTypeName(nullable = !it.type.isPrimitiveSystemType())
        }
    }.toList()

    if (this.isReference) {
        return ClassName(namespace, name)
            .nestedClass("ByReference")
            .parameterizedBy(typeParameters)
    }
    return ClassName(namespace, name).parameterizedBy(typeParameters)

}

fun apiSurfaceTypeName(typeReference: SparseTypeReference): TypeName? {
    if (typeReference.isReference) return null
    val typeArguments = (typeReference.asTypeName() as? ParameterizedTypeName)
        ?.typeArguments
        ?.toTypedArray()

    substitutions[typeReference.fullCleanName()].let {
        if (it == null) return null
        if (typeArguments == null) return it.apiTypeName
        return it.apiTypeName.parameterizedBy(*typeArguments)
    }
}

fun implTypeName(typeReference: SparseTypeReference): TypeName? {
    val typeArguments = (typeReference.asTypeName() as? ParameterizedTypeName)
        ?.typeArguments
        ?.toTypedArray()

    substitutions[typeReference.fullCleanName()].let {
        if (it == null) return null
        if (typeArguments == null) return it.implTypeName
        return it.implTypeName.parameterizedBy(*typeArguments)
    }
}

fun SparseTypeReference.fullCleanName() = "$namespace.${cleanName()}"

val ptrNull = Pointer::class.asClassName().member("NULL")
val jnaPointer = ClassName("com.github.knk190001.winrtbinding.runtime", "JNAPointer")
val nullablePtr = jnaPointer.copy(nullable = true)

data class InterfaceSubstitution(
    val apiTypeName: ClassName,
    val implTypeName: ClassName,
    val jvmPeerType: ClassName
)

val substitutions = mapOf(
    "Windows.Foundation.Collections.IVector" to InterfaceSubstitution(
        ClassName("kotlin.collections", "MutableList"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "NativeVector"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "JVMVector")
    ),
    "Windows.Foundation.Collections.IVectorView" to InterfaceSubstitution(
        ClassName("kotlin.collections", "List"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "NativeVectorView"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "JVMVectorView")
    ),
    "Windows.Foundation.Collections.IMap" to InterfaceSubstitution(
        ClassName("kotlin.collections", "MutableMap"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "NativeMap"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "JVMMap")
    ),
    "Windows.Foundation.Collections.IMapView" to InterfaceSubstitution(
        ClassName("kotlin.collections", "Map"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "NativeMapView"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "JVMMapView")
    ),
    "Windows.Foundation.Collections.IIterable" to InterfaceSubstitution(
        ClassName("kotlin.collections", "Iterable"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "NativeIterable"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "JVMIterable")
    ),
    "Windows.Foundation.Collections.IIterator" to InterfaceSubstitution(
        ClassName("kotlin.collections", "Iterator"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "NativeIterator"),
        ClassName("com.github.knk190001.winrtbinding.foundation.collections", "JVMIterator")
    )
)

fun TypeSpec.Builder.addEvents(typeReferencee: SparseTypeReference, withImplementation: Boolean, pointerExpr: String? = null, lazy: Boolean = false) {
    val sparseInterface = lookUpTypeReference(typeReferencee) as SparseInterface
    sparseInterface.events()
        .map { (addMethod, removeMethod) ->
            val projectedMethod = typeReferencee.genericParameters?.let{
                if(it.any { params -> params.type == null }) return@let null
                else it
            }?.let {
                it.fold(addMethod){ acc, genericParameter ->
                    acc.projectType(genericParameter.name, genericParameter.type!!)
                }
            } ?: addMethod

            val eventComponentType = projectedMethod.parameters[0].type.asTypeName()
            val eventType = IEvent::class.asTypeName().parameterizedBy(eventComponentType)
            val tokenType = addMethod.returnType.asTypeName()
            val prefix = if(pointerExpr != null) "${pointerExpr}, " else ""
            PropertySpec.builder(addMethod.name.replace("add_", ""), eventType).apply {
                if (withImplementation) {
                    val initializerCb = buildCodeBlock {
                        add(
                            "%T<%T, %T>(${prefix}this, ${sparseInterface.methods.indexOf(addMethod) + 6}, ${
                                sparseInterface.methods.indexOf(removeMethod) + 6
                            }, typeOf<%T>())", NativeEvent::class, eventComponentType, tokenType, tokenType
                        )
                    }
                    if (lazy) {
                        delegate(buildCodeBlock {
                            beginControlFlow("lazy")
                            add(initializerCb)
                            endControlFlow()
                        })
                    } else {
                        initializer(initializerCb)
                    }
                    addModifiers(KModifier.OVERRIDE)
                } else {
                    addModifiers(KModifier.ABSTRACT)
                }
            }.build()
        }.forEach(::addProperty)
}

