package com.example.rickmorty_paging_3.data

import com.example.rickmorty_paging_3.data.response.ResponseWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface RickMortyApiService {

    @GET("character/")

    suspend fun getCharacter(@Query("page") page: Int): ResponseWrapper
}