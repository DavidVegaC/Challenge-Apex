package com.davega.domain.usecase

import com.davega.domain.repository.RecipeRepository
import javax.inject.Inject

class RefreshRecipesUseCase @Inject constructor(
    private val recipeRepository: RecipeRepository
) {
    suspend operator fun invoke() = recipeRepository.getRecipesFromRemoteData()
}
