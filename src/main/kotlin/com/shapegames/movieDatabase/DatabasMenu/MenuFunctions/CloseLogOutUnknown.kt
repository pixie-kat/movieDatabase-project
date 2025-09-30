package com.shapegames.movieDatabase.DatabasMenu.MenuFunctions

import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageNotLoggedIn

//this is just a command to create a nicer user experience so it feels like the application finishes
fun closeApplication() {
    println("Thank you for using this Movie Database system. Have a nice day!")
}

//as the name says, we log out and are back in the beginning
fun logOut() {
    welcomeMessageNotLoggedIn()
}

//in case users select a key that has no action assigned to it
fun unknownCommand(){
    println("Unknown command. Please select a valid option.\n")
}