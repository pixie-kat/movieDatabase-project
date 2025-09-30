package com.shapegames.movieDatabase.`Movies-Series`

data class Movie (
    var movieTitle: String,
    var director: String,
    var actors: MutableList<String>,
    var rating: Int?,
    var isFavoritOfUsers: Int?,
    var ListOfUsersThatFavorited: MutableList<String>?
    ){}