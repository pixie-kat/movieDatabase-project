package com.shapegames.movieDatabase.DatabasMenu.MenuFunctions

import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageNotLoggedIn

fun closeApplication() {
    println("Thank you for using this Movie Database system. Have a nice day!")
}

fun logOut() {
    welcomeMessageNotLoggedIn()
}

fun unknownCommand(){
    println("Unknown command. Please select a valid option.\n")
}