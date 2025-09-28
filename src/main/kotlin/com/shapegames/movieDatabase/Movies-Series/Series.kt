package com.shapegames.movieDatabase.`Movies-Series`

data class Series (
    var seriesTitle: String,
    var actors: MutableList<String>,
    var rating: Int?,
    var isFavoritOfUsers: Int?,
    var ListOfUsersThatFavorited: MutableList<String>?
) {}
