package com.example.rickmorty_paging_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.rickmorty_paging_3.presentation.RickListScreen
import com.example.rickmorty_paging_3.ui.theme.RickMorty_Paging_3Theme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RickMorty_Paging_3Theme {
                RickListScreen()
            }
        }
    }
}