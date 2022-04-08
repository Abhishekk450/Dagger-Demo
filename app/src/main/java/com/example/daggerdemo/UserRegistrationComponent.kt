package com.example.daggerdemo

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService():UserRegistrationService

    fun getEmailService():EmailService
}