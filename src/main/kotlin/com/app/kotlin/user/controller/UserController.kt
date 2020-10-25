package com.app.kotlin.user.controller

import com.app.kotlin.user.model.User
import com.app.kotlin.user.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v1/api/user")
class UserController(private val userService: UserService) {
    @GetMapping("/health")
    fun greeting():String{
        return "Healthy";
    }

    @PostMapping("/add")
    fun createUser(@RequestBody user: User):Long{
        return userService.createUser(user)
    }

    @GetMapping("/get/{id}")
    fun readUser(@PathVariable(value = "id") id:Long): User{
        return userService.readUser(id)
    }

    @PutMapping("/update/{id}")
    fun updateUser(@PathVariable(value = "id") id:Long, @RequestBody user: User): User{
        return userService.updateUser(user,id)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteUser(@PathVariable(value = "id") id:Long):Long{
        return userService.deleteUser(id)
    }
}