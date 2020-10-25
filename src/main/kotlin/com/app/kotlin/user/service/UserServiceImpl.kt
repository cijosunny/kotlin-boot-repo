package com.app.kotlin.user.service

import com.app.kotlin.user.model.User
import com.app.kotlin.user.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    override fun createUser(user: User): Long {
        var userDb = userRepository.save(user)
        return userDb.id
    }

    override fun readUser(id: Long): User {
        return userRepository.findById(id).get()
    }

    override fun updateUser(user: User, id: Long): User {
        return userRepository.findById(id).map { userDb ->
            val updatedUser: User = userDb.copy(id = user.id, name = user.name, age = user.age)
            userRepository.save(updatedUser)
        }.orElse(null)
//        user.id = id
//        return userRepository.save(user)
    }

    override fun deleteUser(id: Long): Long {
        var user: Optional<User> = userRepository.findById(id)
        if (user.isPresent) {
            userRepository.delete(user.get())
            return id
        } else {
            return -1
        }
    }
}