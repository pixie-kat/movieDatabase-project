package com.shapegames.movieDatabase.Movies

data class Movie (
    var movieTitle: String,
    var actors: MutableList<String>,
    var rating: Int?,
    var isFavoritOfUsers: Int?,
    var ListOfUsersThatFavorited: MutableList<String>?
    ){}