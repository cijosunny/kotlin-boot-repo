package com.app.kotlin.user.service

import com.app.kotlin.user.model.User

interface UserService {
    fun createUser(user: User): Long
    fun readUser(id: Long): User
    fun updateUser(user: User, id: Long): User
    fun deleteUser(id: Long): Long
}