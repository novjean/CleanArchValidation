package com.novatech.cleanarchvalidation.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.novatech.cleanarchvalidation.domain.usecase.ValidateEmail
import com.novatech.cleanarchvalidation.domain.usecase.ValidatePassword
import com.novatech.cleanarchvalidation.domain.usecase.ValidateRepeatedPassword
import com.novatech.cleanarchvalidation.domain.usecase.ValidateTerms

class MainViewModel(
    private val validateEmail: ValidateEmail = ValidateEmail(),
    private val validatePassword: ValidatePassword = ValidatePassword(),
    private val validateRepeatedPassword: ValidateRepeatedPassword = ValidateRepeatedPassword(),
    private val validateTerms: ValidateTerms = ValidateTerms()
    ) : ViewModel() {

    var state by mutableStateOf(RegistrationFormState())
}