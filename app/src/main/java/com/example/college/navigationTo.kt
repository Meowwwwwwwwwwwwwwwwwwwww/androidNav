package com.example.college

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun navigationTo(){

    val view:ViewModelMain = viewModel()
    val navcontrol = rememberNavController()
     NavHost(navController = navcontrol , startDestination = Screen.MainScreen.route){
                   composable(route= Screen.MainScreen.route ) {
                       MainScreen(navto ={navcontrol.navigate(Screen.TeacherPage.route)} ,
                           navtoo ={navcontrol.navigate(Screen.StudentPage.route)} )


                   }



         composable(route=Screen.TeacherPage.route){
             TeacherPage(
                 navigationto = ({ navcontrol.navigate(Screen.MainScreen.route) })
             )}
         composable(route=Screen.StudentPage.route){
             StudentPage(
                 navigationto = ({ navcontrol.navigate(Screen.MainScreen.route) })
             )}
         }
}