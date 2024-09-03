package com.davega.challengeapex.ui.features.detail

import com.davega.domain.model.Recipe

data class UiState(
    val recipe: Recipe? = null,
    val navigateToMap: Boolean = false,
    val error: Throwable? = null
)
