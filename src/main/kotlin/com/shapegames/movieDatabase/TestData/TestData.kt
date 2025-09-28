package com.shapegames.movieDatabase.TestData

import com.shapegames.movieDatabase.Movies.*

val testMovieList = mutableListOf<Movie>()

fun MovieTestData(){
    val mutableLotrActorlist = mutableListOf<String>("Orlando Bloom", "Elijah Wood", "Ian McKellen", "Viggo Mortensen")
    val mutableUsersThatFavorited = mutableListOf<String>("Fan1, Fan2, Fan3")
    val movie1 = Movie("The Lord Of the Rings - Fellowship of the Ring", mutableLotrActorlist, null, null, null)
    val movie2 = Movie("The Lord Of the Rings - The Two Towers", mutableLotrActorlist, 10, 100,mutableUsersThatFavorited)
    testMovieList.add(movie1)
    testMovieList.add(movie2)
}