package com.axis.auth.service

import com.axis.auth.model.User
import java.util.*

interface ILoginService {
    fun signUp(user:User):User?
    fun login(user:User):User?
    fun findByEmail(email:String): User?
    fun getById(id: Int): Optional<User?>
}