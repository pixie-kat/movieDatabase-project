package com.shapegames.movieDatabase.Users

//here I create the base User class that all following sub classes have in common
//some params are nullable as they will be extended by user interaction
open class User(
    var UserName: String,
    protected var UserPassword: String,
    protected var HasHowManyFavorits: MutableList<Int>?,
    protected var MovieFavorites: MutableList<String>?,
    protected var SeriesFavorites: MutableList<String>?
) {}

//a basic logged in user that has no permission except of seeing the movie + series list
//and can also rate movies
class BasicUser(UserName: String, UserPassword: String, HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String>): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //needs to be logged in
    //can also rate movies
}

//an editor class that has the basic user permission + can also add/delete movies/series
class Editor(UserName: String, UserPassword: String, HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String>): User(UserName, UserPassword,HasHowManyFavorits, MovieFavorites, SeriesFavorites) {
    //needs to be logged in
    //can rate movies
    //can also add movies
    //can also delete movies (? or only able to ask the admin to delete them?)
}

//an administrator class that has all previous permission + also user administration
class Administrator(UserName: String, UserPassword: String,HasHowManyFavorits: MutableList<Int>, MovieFavorites: MutableList<String>, SeriesFavorites: MutableList<String> ): User(UserName, UserPassword, HasHowManyFavorits, MovieFavorites, SeriesFavorites){
    //needs to be logged in
    //can do all actions
    //should see nearly all user information, except password of users
}