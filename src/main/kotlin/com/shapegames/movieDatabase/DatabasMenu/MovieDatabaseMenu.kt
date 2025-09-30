package com.shapegames.movieDatabase.DatabasMenu

import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.closeApplication
import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.logOut
import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.overviewSelection
import com.shapegames.movieDatabase.DatabasMenu.MenuFunctions.unknownCommand

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

var stateOfMenu = 0

fun welcomeMessageNotLoggedIn(){
    stateOfMenu =   0
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
            //Use UserActions
        }
        "3" -> {
            //Use UserActions
        }
        "4" -> {
            closeApplication()
        }
        else -> {
            unknownCommand()
            welcomeMessageBasicUser()
        }
    }
}

fun welcomeMessageBasicUser(){
    stateOfMenu = 1
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
            welcomeMessageBasicUser()
        }
    }
}

fun welcomeMessageEditor() {
    stateOfMenu = 2
        //also add user name here
    println("Welcome .., please make your selection\n" +
            "1. See Movie or Series Overview\n" +
            "2. Rate Movie/Series\n" +
            "3. Add new Movie/Series to overview\n" +
            "4. Delete Movie/Series from overview\n" +
            "5. Log out\n" +
            "6. Close application")
    val userSelection = readln()
    when (userSelection) {
        "1" -> {
            overviewSelection()
        }
        "2" -> {
            //RateMovieSeries
        }
        "3" -> {
            //Use EditMovieSeries
        }
        "4" -> {
            //Use EditMovieSeries
        }
        "5" -> {
            logOut()
        }
        "6" -> {
            closeApplication()
        }
        else -> {
            unknownCommand()
            welcomeMessageEditor()
        }
    }
}

fun welcomeMessageAdministrator(){
    stateOfMenu = 3
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
            //Use EditMovieSeries
        }
        "3" -> {
            //Use EditMovieSeries
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
            welcomeMessageAdministrator()
        }
    }
}

