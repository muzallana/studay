package com.studay.app.api

import com.studay.app.api.dataclass.Angka
import com.studay.app.api.dataclass.Cerita
import com.studay.app.api.dataclass.Huruf
import com.studay.app.api.dataclass.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("register")
    fun registerUser(@Body user: User): Call<ApiResponse>

    @POST("login")
    fun loginUser(@Body credentials: LoginCredentials): Call<ApiResponse>
}

data class LoginCredentials(val email: String, val password: String)
