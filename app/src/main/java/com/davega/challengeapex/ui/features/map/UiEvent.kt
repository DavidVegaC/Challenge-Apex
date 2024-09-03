package com.davega.challengeapex.ui.features.map

sealed interface UiEvent {
    data class GetRecipe(val recipeId: String) : UiEvent
    data object ErrorShown : UiEvent
}
