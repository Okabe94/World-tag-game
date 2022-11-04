package com.example.taggame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.taggame.core.presentation.utils.navigation.AppNavHost
import com.example.taggame.ui.theme.TagGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WordTagGameScreen()
        }
    }
}

@Composable
fun WordTagGameScreen() {
    TagGameTheme { AppNavHost() }
}