package com.novatech.cleanarchvalidation.domain.usecase

import android.util.Patterns

// use case is integral part of clean arch
// between view model and data layer
// they are useful for Single Responsibility Principle
class ValidateTerms {
    
    fun execute(acceptedTerms: Boolean) : ValidationResult {
        if(!acceptedTerms){
            return ValidationResult(
                successful = false,
                errorMessage = "Please accept the terms")
        }

        return ValidationResult(successful = true)
    }
}