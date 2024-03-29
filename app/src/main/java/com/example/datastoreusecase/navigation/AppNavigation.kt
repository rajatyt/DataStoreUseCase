package com.example.datastoreusecase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.datastoreusecase.home.HomeScreen
import com.example.datastoreusecase.home.HomeViewModel

@Composable
fun AppNavigation(
	modifier: Modifier = Modifier,
	navController: NavHostController
) {
	NavHost(
		modifier = modifier,
		navController = navController,
		startDestination = TopLevelDestination.Home.route
	) {
		composable(route = TopLevelDestination.Home.route) {
//			val homeViewModel: HomeViewModel = hiltViewModel()

			HomeScreen(navController = navController)
		}

	}

}