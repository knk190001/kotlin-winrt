package com.github.knk190001.winrtbinding.generator

import com.github.knk190001.winrtbinding.generator.model.entities.*
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.interop.*
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.reflect.KClass
import kotlin.reflect.KType

fun INamedEntity.asClassName(
    structByValue: Boolean = true,
    nullable: Boolean = false,
    nestedClass: String? = null
): TypeName {
    if (this !is SparseTypeReference) return this.asTypeReference().asClassName(structByValue, nullable, nestedClass)
    if (nestedClass != null) {
        return (asClassName(structByValue, nullable) as ClassName).nestedClass(nestedClass)
    }
    if (isArray) {
        val baseClass = if (isReference) {
            ClassName("kotlin.collections", "MutableList")
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
        return byReferenceClassName(withTypeParameters = false)
    }
    if (namespace == "System") {
        return when (name) {
            "Single" -> Float::class.asClassName()
            "Double" -> Double::class.asClassName()
            "Byte" -> UByte::class.asClassName()
            "SByte" -> Byte::class.asClassName()
            "Int16" -> Short::class.asClassName()
            "Int32" -> Int::class.asClassName()
            "Int64" -> Long::class.asClassName()
            "Char" -> Char::class.asClassName()
            "Boolean" -> Boolean::class.asClassName()
            "Void" -> Unit::class.asClassName()
            "UInt32" -> UInt::class.asClassName()
            "String" -> String::class.asClassName()
            "UInt32&" -> PointerTo::class.asClassName()
                .parameterizedBy(UInt::class.asClassName())
            "Object" -> Any::class.asClassName()
            "UInt64" -> ULong::class.asClassName()
            "UInt16" -> UShort::class.asClassName()
            "Guid" -> Guid.IID::class.asClassName()
            else -> throw NotImplementedError("Type: $namespace.$name is not handled")
        }
    }
    if (isGeneric) {
        return ClassName(this.namespace, name)
    }

    if (lookUpTypeReference(this) is SparseStruct && structByValue) {
        return ClassName(namespace, name).nestedClass("ByValue")
    }
    return ClassName(this.namespace, this.name)
}

fun INamedEntity.hasTrivialABI(): Boolean {
    if (namespace != "System") return false
    return when (name) {
        "Single", "Double", "SByte", "Int16", "Int32", "Int64", "Char" -> true
        else -> false
    }
}

fun INamedEntity.abiClassName(): ClassName {
    if (this !is SparseTypeReference) return this.asTypeReference().abiClassName()
    if (namespace == "System") {
        return when (name) {
            "UInt16" -> UShortABI::class.asClassName()
            "UInt32" -> UIntABI::class.asClassName()
            "UInt64" -> ULongABI::class.asClassName()
            "Single" -> FloatABI::class.asClassName()
            "Double" -> DoubleABI::class.asClassName()
            "Boolean" -> BooleanABI::class.asClassName()
            "Int16" -> ShortABI::class.asClassName()
            "Int32" -> IntABI::class.asClassName()
            "Int64" -> LongABI::class.asClassName()
            "String" -> StringABI::class.asClassName()
            "Object" -> ClassName(AnyABIPackage, AnyABIClassName)
            "Byte" -> UByteABI::class.asClassName()
            "SByte" -> ByteABI::class.asClassName()
            "Guid" -> GUIDABI::class.asClassName()
            "Char" -> CharABI::class.asClassName()
            else -> throw NotImplementedError("Type: $namespace.$name is not handled")
        }
    }
    if (isReference || isArray) {
        return this.copy(isReference = false, isArray = false).abiClassName()
    }
    return this.asClassName(structByValue = false, nestedClass = "ABI") as ClassName
}

fun INamedEntity.valueLayout(): CodeBlock {
    if (this !is SparseTypeReference) return this.asTypeReference().valueLayout()

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
                "Boolean" -> ValueLayout::class.member("JAVA_BYTE")
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
                    val structLayoutWithPadding = MemberName(
                        "com.github.knk190001.winrtbinding.runtime",
                        "structLayoutWithPadding"
                    )
                    addStatement("%M(", structLayoutWithPadding)
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

fun INamedEntity.byReferenceClassName(withTypeParameters: Boolean = true): TypeName {
    if (this !is SparseTypeReference) return this.asTypeReference().byReferenceClassName(withTypeParameters)
    val withoutReference = this.copy(isReference = false)
    val componentType = if (withTypeParameters) {
        withoutReference.asTypeName(nullable = this.isNullable())
    } else {
        withoutReference.asClassName(false)
    }
    return PointerTo::class.asClassName().parameterizedBy(componentType)
}

fun INamedEntity.foreignType(): KClass<*> {
    if (this !is SparseTypeReference) return this.asTypeReference().foreignType()

    if (isArray) {
        return MemorySegment::class
    }

    if (isReference) {
        return MemorySegment::class
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
            "String" -> MemorySegment::class
            "Object" -> MemorySegment::class
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

    return MemorySegment::class
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
fun TypeSpec.Builder.addParameterizedFromNative(projectable: IParameterizable<*>) {
    val fromNativeFn = FunSpec.builder("fromNative").apply {
        addModifiers(KModifier.OVERRIDE)
        if (!projectable.genericParameters.isNullOrEmpty()) {
            addParameter("type", KType::class)
        }
        addParameter("segment", MemorySegment::class)

        val typeVariables = projectable.genericParameters
            ?.map { STAR }
            ?.toTypedArray() ?: emptyArray()

        val returnType = if (typeVariables.isNotEmpty()) {
            (projectable.asClassName() as ClassName).parameterizedBy(*typeVariables)
        } else projectable.asClassName()

        returns(returnType.copy(projectable.isNullable()))

        val typeVariableString = if (typeVariables.isEmpty()) ""
        else "<${typeVariables.joinToString { "Unit" }}>"

        val cb = CodeBlock.builder().apply {
            if (projectable.isNullable()) {
                beginControlFlow("if (segment == MemorySegment.NULL)")
                addStatement("return null")
                endControlFlow()
            }

            if (projectable is SparseInterface) {
                val typeString = if (projectable.genericParameters.isNullOrEmpty()) {
                    ""
                } else {
                    ", type"
                }
                addStatement(
                    "return %TImpl$typeVariableString(segment$typeString)".fixSpaces(),
                    projectable.asClassName(),
                )
            } else {
                val typeParameter = if (projectable.genericParameters.isNullOrEmpty()) null else "type"
                val parameters = listOfNotNull(typeParameter, "segment").joinToString()
                addStatement(
                    "return %T$typeVariableString(${parameters})".fixSpaces(),
                    projectable.asClassName(),
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
        addParameter("obj", entity.asTypeName(emptyTypeParameters = true, nullable = true))
        returns(MemorySegment::class)

        beginControlFlow("if (obj == null)")
        addStatement("return %T.NULL", MemorySegment::class)
        endControlFlow()

        addStatement("return obj.segment")
    }.build()
    addFunction(toNative)
}

fun FunSpec.Builder.addTypeParameters(projectable: IParameterizable<*>) {
    projectable.genericParameters
        ?.map(SparseGenericParameter::name)
        ?.map(TypeVariableName::invoke)
        ?.forEach(::addTypeVariable)
}

enum class ClassNameUsage {
    ApiSurface, ParentInterface, Other
}

fun INamedEntity.asTypeName(
    emptyTypeParameters: Boolean = false,
    nestedClass: String? = null,
    usage: ClassNameUsage = ClassNameUsage.Other,
    nullable: Boolean = false
): TypeName {
    if (this !is SparseTypeReference) return this.asTypeReference()
        .asTypeName(emptyTypeParameters, nestedClass, usage, nullable)
    if (nullable) {
        return asTypeName(emptyTypeParameters, nestedClass, usage, false).copy(nullable = true)
    }
    if (this.isTypeParameter()) {
        return TypeVariableName(this.name)
    }
    if (this.isArray) {
        val nonArray = this.copy(isArray = false)
        return Array::class
            .asClassName()
            .parameterizedBy(
                nonArray.asTypeName(emptyTypeParameters, nestedClass, usage)
                    .copy(nonArray.isNullable())
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
    if (!isGeneric && !isArray) {
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
        return byReferenceClassName()
    }
    return ClassName(namespace, name).parameterizedBy(typeParameters)

}

fun apiSurfaceTypeName(typeReference: SparseTypeReference): TypeName? {
    if (typeReference.isReference) return null
    val typeArguments = (typeReference.asTypeName() as? ParameterizedTypeName)
        ?.typeArguments
        ?.toTypedArray()

    substitutions[typeReference.fullName()].let {
        if (it == null) return null
        if (typeArguments == null) return it.apiTypeName
        return it.apiTypeName.parameterizedBy(*typeArguments)
    }
}

fun implTypeName(typeReference: SparseTypeReference): TypeName? {
    val typeArguments = (typeReference.asTypeName() as? ParameterizedTypeName)
        ?.typeArguments
        ?.toTypedArray()

    substitutions[typeReference.fullName()].let {
        if (it == null) return null
        if (typeArguments == null) return it.implTypeName
        return it.implTypeName.parameterizedBy(*typeArguments)
    }
}

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

fun TypeSpec.Builder.addEvents(
    typeReferencee: SparseTypeReference,
    withImplementation: Boolean,
    pointerExpr: String? = null,
    lazy: Boolean = false
) {
    val sparseInterface = lookUpTypeReference(typeReferencee) as SparseInterface
    sparseInterface.events()
        .map { (addMethod, removeMethod) ->
            val projectedMethod = typeReferencee.genericParameters?.let {
                if (it.any { params -> params.type == null }) return@let null
                else it
            }?.let {
                it.fold(addMethod) { acc, genericParameter ->
                    acc.projectType(genericParameter.name, genericParameter.type!!)
                }
            } ?: addMethod

            val eventComponentType = projectedMethod.parameters[0].type.asTypeName()
            val eventType = IEvent::class.asTypeName().parameterizedBy(eventComponentType)
            val tokenType = addMethod.returnType.asTypeName()
            val prefix = if (pointerExpr != null) "${pointerExpr}, " else ""
            PropertySpec.builder(addMethod.name.replace("add_", ""), eventType).apply {
                if (withImplementation) {
                    val initializerCb = buildCodeBlock {
                        add(
                            "%T<%T, %T>(${prefix}this, ${sparseInterface.methods.indexOf(addMethod)}, ${
                                sparseInterface.methods.indexOf(removeMethod)
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

