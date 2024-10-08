package com.davega.data.datasource.local.recipe

import com.davega.data.room.dao.RecipeDao
import com.davega.data.room.entity.RecipeEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RecipeLocalDataSourceImpl @Inject constructor(
    private val dao: RecipeDao
) : RecipeLocalDataSource {

    override suspend fun saveRecipes(data: List<RecipeEntity>) = dao.save(data)

    override fun getRecipes(): Flow<List<RecipeEntity>> = dao.getRecipes()

    override suspend fun getRecipeById(recipeId: String): RecipeEntity? =
        dao.getRecipeById(recipeId)
}
