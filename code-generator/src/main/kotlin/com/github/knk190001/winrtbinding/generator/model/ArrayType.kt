package com.github.knk190001.winrtbinding.generator.model

import com.github.knk190001.winrtbinding.generator.model.entities.ParameterType
import com.github.knk190001.winrtbinding.generator.model.entities.SparseParameter
import com.github.knk190001.winrtbinding.generator.model.entities.SparseTypeReference

enum class ArrayType {
    None, PassArray, FillArray, ReceiveArray
}

fun SparseParameter.arrayType(): ArrayType {
    if (!type.isArray) return ArrayType.None
    if (parameterType == ParameterType.In) {
        return ArrayType.PassArray
    }
    return if (parameterType == ParameterType.Out) {
        if (type.isReference) {
            ArrayType.ReceiveArray
        } else {
            ArrayType.FillArray
        }
    }else {
        ArrayType.None
    }
}