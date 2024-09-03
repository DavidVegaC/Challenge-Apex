package com.davega.domain.usecase

import com.davega.domain.model.Recipe
import com.davega.domain.repository.RecipeRepository
import javax.inject.Inject

class GetRecipeByIdUseCase @Inject constructor(
    private val recipeRepository: RecipeRepository
) {
    suspend operator fun invoke(recipeId: String): Recipe? =
        recipeRepository.getRecipeById(recipeId)
}
