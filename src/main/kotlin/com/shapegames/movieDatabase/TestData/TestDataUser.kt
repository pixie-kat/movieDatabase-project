package com.shapegames.movieDatabase.TestData

import com.shapegames.movieDatabase.`Movies-Series`.Movie
import com.shapegames.movieDatabase.Users.*

//creating some easy user test data to test specific functionality without having to create "real" users.

val mutableFavMovieList1 = mutableListOf<String>("Star Trek", "Star Wars")
val mutableFavMovieList2 = mutableListOf<String>("Pitch Perfect", "Legally Blonde")
val mutableFavSeriesList1 = mutableListOf<String>("Wednesday", "Dexter")
val mutableFavSeriesList2 = mutableListOf<String>("Love at first sight")

fun basicUserTestData(): BasicUser{
    val basic1 = BasicUser("BasicUsername", "basic", mutableListOf(4),mutableFavMovieList1, mutableFavSeriesList1)
    return basic1
}

fun editorTestData(): Editor {
    val editor1 = Editor("EditorUsername", "editor", mutableListOf(50),mutableFavMovieList2, mutableFavSeriesList2)
    return editor1
}

fun adminTestData(): Administrator {
    val admin1 = Administrator("AdministratorUsername", "admin", mutableListOf(99), mutableFavMovieList2, mutableFavSeriesList2 )
    return admin1
}

