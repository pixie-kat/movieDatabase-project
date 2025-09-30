package com.shapegames.movieDatabase.Users

open class User(
    var UserName: String,
    protected var UserPassword: String,
    protected var HasHowManyFavorits: MutableList<Int>,
    protected var MovieFavorites: MutableList<String>,
    protected var SeriesFavorites: MutableList<String>
) {}

class LoggedInUser(UserName: String, UserPassword: String, HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String>): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //needs to be logged in and is the only one who can see their favorites
}

class Administrator(UserName: String, UserPassword: String,HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String> ): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //Administrator should be able to see all Menu items
    //should see nearly all information, except password for all users and their favorites
}