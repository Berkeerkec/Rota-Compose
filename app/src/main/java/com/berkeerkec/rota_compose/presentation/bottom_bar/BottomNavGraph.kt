package com.berkeerkec.rota_compose.presentation.bottom_bar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.berkeerkec.rota_compose.presentation.culture_screen.CultureScreen
import com.berkeerkec.rota_compose.presentation.food_screen.FoodScreen
import com.berkeerkec.rota_compose.presentation.hotel_screen.HotelScreen

@Composable
fun BottomNavGraph(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Food.route){

        composable(route = BottomBarScreen.Food.route){
            FoodScreen()
        }
        composable(route = BottomBarScreen.Hotel.route){
            HotelScreen()
        }
        composable(route = BottomBarScreen.Culture.route){
            CultureScreen()
        }
        composable(route = BottomBarScreen.User.route){
            CultureScreen()
        }
    }
}