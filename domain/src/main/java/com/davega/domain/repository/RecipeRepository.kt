package com.davega.domain.repository

import com.davega.domain.model.Recipe
import kotlinx.coroutines.flow.Flow

interface RecipeRepository {

    fun getRecipes(): Flow<List<Recipe>>

    suspend fun getRecipeById(recipeId: String): Recipe?

    suspend fun getRecipesFromRemoteData(): List<Recipe>
}
