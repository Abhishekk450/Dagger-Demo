package com.example.daggerdemo

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                                                  private val emailService: EmailService) {

    fun registerUser(email:String, password:String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "abc@gmail.com", "User Verified")
    }
}

       /*
        Unit Testing = means UserRepository and EmailService Class is ready than we use UserRegistration Class

        Single Responsibilty = means it can work two task it create an object or it register the user also

        Lifetime of objects = means User Repository and Email service attach with UserRegistrationService means if
        UserRegistrationService is destroy it destroy both of the objects(not reuse)

        Extensible = means it hard code the object in case in future we want to change the object we make a new object
        rather than modify in existense one.
        */
