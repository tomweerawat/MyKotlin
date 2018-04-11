package com.example.hotumit.mykotlin

import android.app.Application



/**
 * Created by HOTUM IT on 26/3/2561.
 */

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Contextor.getInstance().init(applicationContext)

    }
}
