package com.example.datastoreusecase

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.datastoreusecase.navigation.AppNavigation
import com.example.datastoreusecase.ui.theme.DataStoreUseCaseTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataStoreUseCase() {
	DataStoreUseCaseTheme {
		val navController = rememberNavController()

		Scaffold { innerPadding ->
			AppNavigation(
				modifier = Modifier.padding(innerPadding),
				navController = navController
			)
		}

	}
}