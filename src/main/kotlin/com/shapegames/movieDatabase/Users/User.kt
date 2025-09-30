package com.shapegames.movieDatabase.Users

open class User(
    var UserName: String,
    protected var UserPassword: String,
    protected var HasHowManyFavorits: MutableList<Int>?,
    protected var MovieFavorites: MutableList<String>?,
    protected var SeriesFavorites: MutableList<String>?
) {}

class BasicUser(UserName: String, UserPassword: String, HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String>): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //needs to be logged in
    //can also rate movies
}

class Editor(UserName: String, UserPassword: String, HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String>): User(UserName, UserPassword,HasHowManyFavorits, MovieFavorites, SeriesFavorites) {
    //needs to be logged in
    //can rate movies
    //can also add movies
    //can also delete movies (? or only able to ask the admin to delete them?)
}

class Administrator(UserName: String, UserPassword: String,HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String> ): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //needs to be logged in
    //can do all actions
    //should see nearly all user information, except password of users
}