package com.app.kotlin.user.model

import javax.persistence.*

@Entity
@Table(name = "user_tb")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var name: String,
        var age: Int
) {
}