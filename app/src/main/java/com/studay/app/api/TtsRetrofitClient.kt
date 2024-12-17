package com.studay.app.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TtsRetrofitClient {

    private const val BASE_URL = "https://studay-api-tts-142018660774.asia-southeast2.run.app/"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val ttsApiService: TtsApiService by lazy {
        retrofit.create(TtsApiService::class.java)
    }
}
