package com.shapegames.movieDatabase.`Movies-Series`

//here I create the general movie class
//some of the parameters are nullable as they depend on user input
data class Movie (
    var movieTitle: String,
    var director: String,
    var actors: MutableList<String>,
    var rating: Int?,
    var isFavoritOfUsers: Int?,
    var ListOfUsersThatFavorited: MutableList<String>?
    ){}