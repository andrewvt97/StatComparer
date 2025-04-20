package com.example.statcomparer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.statcomparer.ui.StatComparerApp
import com.example.statcomparer.ui.theme.StatComparerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            StatComparerTheme {
                StatComparerApp()
            }
        }
    }
}