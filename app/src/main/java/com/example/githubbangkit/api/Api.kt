package com.example.githubbangkit.api
import com.example.githubbangkit.data.model.DetailUserResponse
import com.example.githubbangkit.data.model.User
import retrofit2.Call
import com.example.githubbangkit.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>


    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ):Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>



}

