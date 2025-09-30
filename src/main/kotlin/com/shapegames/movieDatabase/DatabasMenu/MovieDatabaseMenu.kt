package com.shapegames.movieDatabase.DatabasMenu

import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.closeApplication
import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.logOut
import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.overviewSelection
import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.unknownCommand
import kotlin.math.log

/*
See Movie or Series overview including their ratings
Add new Movie/Series to overview //only user with specific permission
Delete Movie/Series from overview //only user with specific permission
Rate Movie/Series //Only when logged in
Sign up as user
See user overview //only administrators
Delete user //only administrator
Change user permission //only administrators
Close application
Log in
Log out
 */

fun welcomeMessageNotLoggedIn(){
    println("Welcome to the Movie Database system\n" +
            "1. See Movie or Series Overview\n" +
            "2. Sign up as a user\n" +
            "3. Log in\n" +
            "4. Close application")
    val userSelection = readln()
    when (userSelection) {
        "1" -> {
            overviewSelection()
        }
        "2" -> {
            //Use NormalUserActions
        }
        "3" -> {
            //Use NormalUserActions
        }
        "4" -> {
            closeApplication()
        }
        else -> {
            unknownCommand()
            welcomeMessageLoggedInUser()
        }
    }
}

fun welcomeMessageLoggedInUser(){
    //add username to the message!
    println("Welcome ..., please make your selection\n" +
            "1. See Movie or Series Overview\n" +
            "2. Rate Movie/Series\n" +
            "3. Log out\n" +
            "4. Close application")
    val userSelection = readln()
    when (userSelection) {
        "1" -> {
            overviewSelection()
        }
        "2" -> {
            //Use RateMovieSeries
        }
        "3" -> {
            logOut()
        }
        "4" -> {
            closeApplication()
        }
        else -> {
            unknownCommand()
            welcomeMessageLoggedInUser()
        }
    }
}

fun welcomeMessageLoggedInAdministrator(){
    //also add user name here
    println("Welcome admin .., please make your selection\n" +
            "1. See Movie or Series Overview\n" +
            "2. Add new Movie/Series to overview\n" +
            "3. Delete Movie/Series from overview\n" +
            "4. Rate Movie/Series\n" +
            "5. See user overview\n" +
            "6. Delete user\n" +
            "7. Change user permission\n" +
            "8. Log out\n" +
            "9. Close application")
    val userSelection = readln()
    when (userSelection) {
        "1" -> {
            overviewSelection()
        }
        "2" -> {
            //Use AdminMovieSeriesActions
        }
        "3" -> {
            //Use AdminMovieSeriesActions
        }
        "4" -> {
            //RateMovieSeries
        }
        "5" -> {
            //Use AdminUserActions
        }
        "6" -> {
            //Use AdminUserActions
        }
        "7" -> {
            //Use AdminUserActions
        }
        "8" -> {
            logOut()
        }
        "9" -> {
            closeApplication()
        }
        else -> {
            unknownCommand()
            welcomeMessageLoggedInAdministrator()
        }
    }
}

