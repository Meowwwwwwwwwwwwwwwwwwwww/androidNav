package com.example.college

sealed class Screen( val route:String){
    object MainScreen :Screen("mainScreen")
       object TeacherPage :Screen("teachersPage")
    object StudentPage :Screen("studentPage")

}