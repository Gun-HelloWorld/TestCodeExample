package com.gun.testcodeexample.data.source

import com.gun.testcodeexample.data.dto.user.User

interface UserRemoteDataSource {
    suspend fun getUserList(): MutableList<User>
    suspend fun getUser(userName: String): User
}