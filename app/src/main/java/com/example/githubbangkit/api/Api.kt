package com.example.githubbangkit.api
import retrofit2.Call
import com.example.githubbangkit.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>
}

