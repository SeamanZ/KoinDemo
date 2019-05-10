package com.example.koindemo

import android.app.Application
import com.example.koindemo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


/**
 * Created by Seaman on 2019-05-10.
 * Bangggood Ltd
 */
class SampleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // use AndroidLogger as Koin Logger - default Level.INFO
            androidLogger()

            // use the Android context given there
            androidContext(this@SampleApp)

            // load properties from assets/koin.properties file
            androidFileProperties()

            modules(appModule)
        }
    }
}