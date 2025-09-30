package com.shapegames.movieDatabase.TestData

import com.shapegames.movieDatabase.`Movies-Series`.*

//creating some easy movie and series test data to test specific functionality without having to create "real" movies or series.

val testMovieList = mutableListOf<Movie>()
val mutableLotrActorList = mutableListOf<String>("Orlando Bloom", "Elijah Wood", "Ian McKellen", "Viggo Mortensen")
val mutableUsersThatFavorited = mutableListOf<String>("Fan1, Fan2, Fan3")
val testSeriesList = mutableListOf<Series>()
val mutableBuffyActorList = mutableListOf<String>("Sarah Michelle Gellar", "Alyson Hannigan", "Nicholas Brendon", "Anthony Stewart Head")
val mutableAngelActorList = mutableListOf<String>("David Boreanaz", "Charisma Carpenter", "Alexis Denisof")

fun movieTestData(){
    val movie1 = Movie("The Lord Of the Rings - Fellowship of the Ring", "Peter Jackson",mutableLotrActorList, null, null, null)
    val movie2 = Movie("The Lord Of the Rings - The Two Towers", "Peter Jackson",mutableLotrActorList, 10, 9001,mutableUsersThatFavorited)
    testMovieList.add(movie1)
    testMovieList.add(movie2)
}

fun seriesTestData() {
    val series1 = Series("Buffy", mutableBuffyActorList, rating = 9, 8999, mutableUsersThatFavorited)
    val series2 = Series("Angel", mutableAngelActorList, rating = 5, 515, null)
    testSeriesList.add(series1)
    testSeriesList.add(series2)
}