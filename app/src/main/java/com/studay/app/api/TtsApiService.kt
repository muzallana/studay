package com.studay.app.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface TtsApiService {

    @POST("synthesize")
    fun getTtsAudio(@Body request: TtsRequest): Call<ResponseBody>
}

data class TtsRequest(
    val text: String // Teks yang akan diubah menjadi suara
)
