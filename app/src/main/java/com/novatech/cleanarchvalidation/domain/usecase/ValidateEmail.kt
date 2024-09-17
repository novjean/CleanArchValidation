package com.novatech.cleanarchvalidation.domain.usecase

import android.util.Patterns

// use case is integral part of clean arch
// between view model and data layer
// they are useful for Single Responsibility Principle
class ValidateEmail {

    // this method is to execute the usecase

    fun execute(email: String) : ValidationResult {
        if(email.isBlank()){
            return ValidationResult(
                successful = false,
                errorMessage = "The email can't be blank")
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return ValidationResult(
                successful = false,
                errorMessage = "That's not a valid email")
        }
        return ValidationResult(successful = true)
    }
}