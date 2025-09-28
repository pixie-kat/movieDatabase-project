package com.shapegames.movieDatabase.DatabasMenu

/*
See Movie or Series overview including their ratings
Add new Movie/Series to overview //only user with specific permission
Delete Movie/Series from overview //only user with specific permission
Rate Movie/Series //Only when logged in
Sign up as user
See user overview //only administrators
Delete user //only administrator
Change user permission //only administrators
Close application
Log in
Log out
 */

fun welcomeMessageNotLoggedIn(){
    println("Welcome to the Movie database system\n" +
            "1. See Movie or Series Overview\n" +
            "2. Sign up as a user\n" +
            "3. Log in\n" +
            "4. Close application")
}

fun welcomeMessageLoggedInNormalUser(){
    println("Welcome to the Movie database system\n" +
            "1. See Movie or Series Overview\n" +
            "2. Rate Movie/Series\n" +
            "3. Log out\n" +
            "4. Close application")
}

fun welcomeMessageLoggedInAdministrator(){
    println("Welcome to the Movie database system\n" +
            "1. See Movie or Series Overview\n" +
            "2. Add new Movie/Series to overview\n" +
            "3. Delete Movie/Series from overview\n" +
            "4. Rate Movie/Series\n" +
            "5. See user overview\n" +
            "6. Delete user\n" +
            "7. Change user permission\n" +
            "8. Log out\n" +
            "9. Close application")
}