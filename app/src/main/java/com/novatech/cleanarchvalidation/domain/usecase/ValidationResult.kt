package com.novatech.cleanarchvalidation.domain.usecase

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
