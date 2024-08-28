package com.better.alarm.data

import android.content.Context
import android.content.SharedPreferences

class PointManager(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("UserPoints", Context.MODE_PRIVATE)

    fun getPoints(): Int {
        return sharedPreferences.getInt("points", 0)
    }

    fun addPoints(points: Int) {
        val currentPoints = getPoints()
        val newPoints = currentPoints + points
        sharedPreferences.edit().putInt("points", newPoints).apply()
    }
}
