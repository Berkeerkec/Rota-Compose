package com.berkeerkec.rota_compose.presentation.food_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FoodScreen(){

    Box(modifier = Modifier.fillMaxSize()){

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ){

            StatusBar()
            TrendBar()
        }
    }
}

@Preview
@Composable
fun FoodScreenPreview(){
    FoodScreen()
}