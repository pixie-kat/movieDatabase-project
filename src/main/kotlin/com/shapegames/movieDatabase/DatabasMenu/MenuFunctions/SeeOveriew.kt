package com.shapegames.movieDatabase.DatabasMenu.MenuFunctions

import com.shapegames.movieDatabase.TestData.*

//See Movie or Series Overview

fun seeMovieOverview(){
    //for now using just some test data
    MovieTestData()
    println("Movie list:")
    for ((index, movie) in testMovieList.withIndex()) {
        println("${index+1}. ${movie.movieTitle}, Actors: ${movie.actors}, Rating: ${movie.rating}, Has been favorited by ${movie.isFavoritOfUsers} users.")
    }
}