package com.novatech.cleanarchvalidation.domain.usecase

import android.util.Patterns

// use case is integral part of clean arch
// between view model and data layer
// they are useful for Single Responsibility Principle
class ValidatePassword {

    // this method is to execute the usecase

    fun execute(password: String) : ValidationResult {
        if(password.length < 8){
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to consist of atleast 8 characters")
        }
        val containsLettersAndDigits = password.any { it.isDigit() } && password.any{ it.isLetter() }
        if(!containsLettersAndDigits){
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to contain at least one letter and digit")
        }
        return ValidationResult(successful = true)
    }
}