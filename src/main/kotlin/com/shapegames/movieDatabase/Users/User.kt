package com.shapegames.movieDatabase.Users

open class User(
    var UserName: String,
    protected var UserPassword: String,
    protected var HasHowManyFavorits: MutableList<Int>,
    protected var MovieFavorites: MutableList<String>,
    protected var SeriesFavorites: MutableList<String>
) {}

class NormalUser(UserName: String, UserPassword: String, HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String>): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //needs to be logged in and can only see his favprites
}

class Administrator(UserName: String, UserPassword: String,HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String> ): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //Administrator should be able to see all Menu items
    //should see all information, except password for all users (e.g. their favorites)
}