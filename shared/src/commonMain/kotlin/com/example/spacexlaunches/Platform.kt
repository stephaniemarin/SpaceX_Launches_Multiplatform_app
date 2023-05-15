package com.example.spacexlaunches

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform