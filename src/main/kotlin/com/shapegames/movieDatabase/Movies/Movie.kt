package com.shapegames.movieDatabase.Movies

data class Movie (
    var MovieTitle: String,
    var Actors: MutableList<String>,
    var Rating: Int?,
    var IsFavoritOfUsers: Int?,
    var ListOfUsersThatFavorited: MutableList<String>?
    ){}