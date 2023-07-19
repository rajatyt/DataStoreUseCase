package com.example.datastoreusecase.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
	navController: NavController
//	homeViewModel: HomeViewModel

) {
	Scaffold(topBar = {
		TopAppBar(title = { Text(text = "Welcome to home screen") })

	}) { innerPadding ->
		Column(
			modifier = Modifier
				.fillMaxSize()
				.padding(innerPadding)
		) {
			HomeScreenContent(Modifier.fillMaxSize())
		}

	}
}

@Composable
fun HomeScreenContent(modifier: Modifier = Modifier) {
	Column(
		modifier = Modifier,
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(text = "welcome to center of my page")
	}
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenContentPreview() {
	HomeScreenContent(modifier = Modifier.fillMaxSize())
}

