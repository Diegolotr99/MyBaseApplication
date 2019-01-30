package com.diegogutierrez.mybaseapplication.modules.general

import androidx.multidex.MultiDexApplication
import io.github.inflationx.viewpump.ViewPump

class MyBaseApplication : MultiDexApplication() {

    override fun onCreate(){
        super.onCreate()
        ViewPump.init(
            ViewPump.builder().build()
        )
        // Initialize DB INSTANCE
        //AppDB.Companion.createAppDatabase(this)
    }
}