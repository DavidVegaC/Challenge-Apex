package com.davega.challengeapex.ui.features.map

import com.davega.domain.model.Recipe

data class UiState(
    val isLoading: Boolean = true,
    val recipe: Recipe? = null,
    val error: Throwable? = null
)
