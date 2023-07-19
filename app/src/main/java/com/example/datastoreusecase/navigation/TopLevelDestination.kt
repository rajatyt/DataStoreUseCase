package com.example.datastoreusecase.navigation

sealed class TopLevelDestination(
	val route: String
) {
	object Home : TopLevelDestination(
		route = "home"
	)

	object Detail : TopLevelDestination(
		route = "detail"
	)

	fun withArgs(vararg args: Any): String {
		return buildString {
			append(route)
			args.forEach { arg ->
				append("/$arg")
			}
		}
	}
}