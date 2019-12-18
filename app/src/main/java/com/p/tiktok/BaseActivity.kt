package com.p.tiktok

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

abstract class BaseActivity : AppCompatActivity() {

    lateinit var activityManager: ActivityManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

    }

    protected fun startActivity(activity: Activity, targetActivityClass: Class<Any>) {
        startActivity(Intent(activity, targetActivityClass))
    }

    protected fun getNumberOfTasks() = activityManager.appTasks.size

    protected fun getAppTaskState() : String {
        val stringBuilder = StringBuilder()
        val totalNumberOfTasks = activityManager.getRunningTasks(10).size
        stringBuilder.append("Total Number of Tasks:$totalNumberOfTasks")

        return stringBuilder.toString()
    }
}