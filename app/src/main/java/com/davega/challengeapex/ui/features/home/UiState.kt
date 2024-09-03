package com.davega.challengeapex.ui.features.home

import com.davega.domain.model.Recipe
import com.davega.challengeapex.Constants

data class UiState(
    val isLoading: Boolean = true,
    val recipes: List<Recipe> = emptyList(),
    var textToSearch: String = Constants.EMPTY_STRING,
    val selectedRecipeId: String? = null,
    val error: Throwable? = null
)
