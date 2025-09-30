package com.shapegames.movieDatabase.DatabasMenu.MenuFunctions

import com.shapegames.movieDatabase.DatabasMenu.stateOfMenu
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageAdministrator
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageBasicUser
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageEditor
import com.shapegames.movieDatabase.DatabasMenu.welcomeMessageNotLoggedIn
import com.shapegames.movieDatabase.TestData.*


//here I follow up when the user opens the movie + series overview
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
            //I know the user selection is not being used, but it allows for the user to actually press any key
            // without the overview being visible again directly
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
            stateOfMenu()
            }
        else -> {
            unknownCommand()
            overviewSelection()
        }
    }
}

//here I show the general movie overview
fun seeMovieOverview(){
    //for now using just some test data
    movieTestData()
    println("Movie overview:")
    for ((index, movie) in testMovieList.withIndex()) {
        println("${index+1}. ${movie.movieTitle}, Actors: ${movie.actors}, Rating: ${movie.rating}, Has been favorited by ${movie.isFavoritOfUsers} users.")
    }
}

//here I show the general series overview
fun seeSeriesOverview() {
    seriesTestData()
    println("Series overview:")
    for ((index, series) in testSeriesList.withIndex()) {
        println("${index+1}. ${series.seriesTitle}, Actors: ${series.actors}, Rating: ${series.rating}, Has been favorited by ${series.isFavoritOfUsers} users.")
    }
}

//here I handle the actions following which menu the user previously was in
//first I had it directly in the overviewSelection() but because of the nesting I moved it out
//+ if needed I can easier reuse it if it makes sense
fun stateOfMenu() {
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
}