package com.shapegames.movieDatabase.`Movies-Series`

//here I create the general series class
//some of the parameters are nullable as they depend on user input
data class Series (
    var seriesTitle: String,
    var actors: MutableList<String>,
    var rating: Int?,
    var isFavoritOfUsers: Int?,
    var ListOfUsersThatFavorited: MutableList<String>?
) {}
