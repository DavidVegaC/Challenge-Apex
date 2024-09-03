package com.davega.data.datasource.remote.api.recipe

import com.davega.data.datasource.remote.response.RecipeResponse

interface RecipeRemoteDataSource {
    suspend fun getRecipes(): List<RecipeResponse>
}
