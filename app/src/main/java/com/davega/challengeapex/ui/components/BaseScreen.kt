package com.davega.challengeapex.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.davega.challengeapex.ui.theme.ApexTheme

@Composable
fun BaseScreen(content: @Composable () -> Unit) {
    ApexTheme {
        val surfaceModifier = Modifier.fillMaxSize()
        Surface(modifier = surfaceModifier) {
            content()
        }
    }
}