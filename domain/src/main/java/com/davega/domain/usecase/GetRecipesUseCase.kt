package com.davega.domain.usecase

import com.davega.domain.model.Recipe
import com.davega.domain.repository.RecipeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(
    private val recipeRepository: RecipeRepository
) {
    operator fun invoke(): Flow<List<Recipe>> = recipeRepository.getRecipes()
}
