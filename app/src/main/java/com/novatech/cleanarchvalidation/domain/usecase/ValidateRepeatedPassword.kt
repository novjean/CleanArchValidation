package com.novatech.cleanarchvalidation.domain.usecase

import android.util.Patterns

// use case is integral part of clean arch
// between view model and data layer
// they are useful for Single Responsibility Principle
class ValidateRepeatedPassword {

    fun execute(password: String, repeatedPassword: String) : ValidationResult {
        if(password != repeatedPassword){
            return ValidationResult(
                successful = false,
                errorMessage = "The passwords don't match")
        }

        return ValidationResult(successful = true)
    }
}