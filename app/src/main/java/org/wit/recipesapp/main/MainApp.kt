package org.wit.recipesapp.main


import android.app.Application
import org.wit.recipesapp.models.RecipeMemStore
//import org.wit.recipesapp.models.RecipeModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    //val recipes = ArrayList<RecipeModel>()
    val recipes = RecipeMemStore()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Recipes App started")

    }
}