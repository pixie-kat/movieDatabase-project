package com.shapegames.movieDatabase.DatabasMenu.MenuFunctions

import com.shapegames.movieDatabase.DatabasMenu.stateOfMenu
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageAdministrator
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageBasicUser
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageEditor
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageNotLoggedIn
import com.shapegames.movieDatabase.TestData.*

//See Movie or Series Overview

fun overviewSelection() {
    println("Which list do you want to see?\n" +
            "1. Movie Overview\n" +
            "2. Series Overview\n" +
            "3. Go back")
    val userSelection = readln()
    when (userSelection) {
        "1" -> {
            seeMovieOverview()
            println("Press any key to get back to the previous menu.")
            val userSelection = readln()
            overviewSelection()
        }
        "2" -> {
            seeSeriesOverview()
            println("Press any key to get back to the previous menu.")
            val userSelection = readln()
            overviewSelection()
        }
        "3" -> {
            when (stateOfMenu) {
                0 -> {
                    welcomeMessageNotLoggedIn()
                }
                1 -> {
                    welcomeMessageBasicUser()
                }
                2 -> {
                    welcomeMessageEditor()
                }
                3 -> {
                    welcomeMessageAdministrator()
                }
            }
        //how do I get back to the right menu???
        }
        else -> {
            unknownCommand()
            overviewSelection()
        }
    }
}

fun seeMovieOverview(){
    //for now using just some test data
    movieTestData()
    println("Movie list:")
    for ((index, movie) in testMovieList.withIndex()) {
        println("${index+1}. ${movie.movieTitle}, Actors: ${movie.actors}, Rating: ${movie.rating}, Has been favorited by ${movie.isFavoritOfUsers} users.")
    }
}

fun seeSeriesOverview() {
    seriesTestData()
    println("Series list:")
    for ((index, series) in testSeriesList.withIndex()) {
        println("${index+1}. ${series.seriesTitle}, Actors: ${series.actors}, Rating: ${series.rating}, Has been favorited by ${series.isFavoritOfUsers} users.")
    }
}
