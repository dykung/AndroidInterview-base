package com.radio.jams

import android.app.Application
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

@ExperimentalSerializationApi
class JamsApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@JamsApplication)
        }
    }
}
