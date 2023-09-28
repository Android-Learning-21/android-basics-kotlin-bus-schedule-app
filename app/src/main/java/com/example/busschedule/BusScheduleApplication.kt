package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDatabase

/**
 * Custom Application class for the app. Make sure to set the android:name property in AndroidManifest.xml
 */
class BusScheduleApplication : Application() {

    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }

}