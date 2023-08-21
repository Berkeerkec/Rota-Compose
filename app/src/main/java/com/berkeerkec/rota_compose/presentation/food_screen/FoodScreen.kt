package com.berkeerkec.rota_compose.presentation.food_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FoodScreen(){

    Box(modifier = Modifier.fillMaxSize()){

        val scrollView = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .verticalScroll(scrollView)
        ){

            StatusBar()
            TrendBar()
            PostBar()

        }
    }
}

@Preview
@Composable
fun FoodScreenPreview(){
    FoodScreen()
}