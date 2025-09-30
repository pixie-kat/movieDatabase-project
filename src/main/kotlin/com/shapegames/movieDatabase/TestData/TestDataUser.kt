package com.shapegames.movieDatabase.TestData

import com.shapegames.movieDatabase.`Movies-Series`.Movie
import com.shapegames.movieDatabase.Users.*

//creating some easy user test data to test specific functionality without having to create "real" users.

val mutableFavMovieList1 = mutableListOf<String>("Star Trek", "Star Wars")
val mutableFavMovieList2 = mutableListOf<String>("Pitch Perfect", "Legally Blonde")
val mutableFavSeriesList1 = mutableListOf<String>("Wednesday", "Dexter")
val mutableFavSeriesList2 = mutableListOf<String>("Love at first sight")
val basicUserList = mutableListOf<BasicUser>()

fun basicUserTestData(){
    val basic1 = BasicUser("Basic", "basic", mutableListOf(4),mutableFavMovieList1, mutableFavSeriesList1)
    basicUserList.add(basic1)
}

fun editorTestData() {
    val editor1 = Editor("Editor", "editor", mutableListOf(50),mutableFavMovieList2, mutableFavSeriesList2)
}

fun adminTestData() {
    val admin1 = Administrator("Administrator", "admin", mutableListOf(99), mutableFavMovieList2, mutableFavSeriesList2 )
}

