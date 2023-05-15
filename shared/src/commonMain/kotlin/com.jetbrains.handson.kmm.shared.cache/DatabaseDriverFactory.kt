package com.jetbrains.handson.kmm.shared.cache

import  com.squareup.sqldelight.db.SqlDriver

//this is the common driver
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}