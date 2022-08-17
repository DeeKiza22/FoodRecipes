package com.example.foodrecipes

import com.example.foodrecipes.model.RecipeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodrecipeApi {

    @GET(value ="/recipes/random")
    fun getRecipe(
        @QueryMap queries:Map<String, String>

    ): Response<RecipeResponse>
}