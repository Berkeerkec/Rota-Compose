package com.berkeerkec.rota_compose.presentation.bottom_bar

import com.berkeerkec.rota_compose.R

sealed class BottomBarScreen(
    val route : String,
    val icon : Int
){
    object Food : BottomBarScreen(
        route = "food",
        icon = R.drawable.ic_restaurant
    )
    object Hotel : BottomBarScreen(
        route = "hotel",
        icon = R.drawable.ic_hotel
    )
    object Culture : BottomBarScreen(
        route = "culture",
        icon = R.drawable.ic_culture
    )
    object User : BottomBarScreen(
        route = "user",
        icon = R.drawable.ic_user
    )
}