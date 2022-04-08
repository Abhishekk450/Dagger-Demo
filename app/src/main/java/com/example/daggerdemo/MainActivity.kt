package com.example.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val userRepository = UserRepository()
        val emailService =  EmailService()

        val userRegistrationService = UserRegistrationService(userRepository, emailService)*/

        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()
        userRegistrationService.registerUser("abc@gmail.com","password")
    }
}

// This is manual dependency