package com.padc.padckotlinfunctional.c_scopefunctions

import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

fun printExceptionMessage(exception: Exception?) {
    exception?.let {
        println(exception.message)
    }
}

val todayDate: String = Calendar.getInstance().let { calendar ->
    val formatter = SimpleDateFormat("dd/M/yyyy hh:mm:ss", Locale.US)
    formatter.format(calendar.time)
}

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println(todayDate)

    val lastWeekOfYear = Calendar.getInstance().apply {
        add(Calendar.DAY_OF_YEAR, -7)
    }.also {
        print("Created Calendar type: ${it.calendarType}")
    }
}

val todayDateWithRun: String = run {
    val calendar = Calendar.getInstance()
    val formatter = SimpleDateFormat("dd/M/yyyy hh:mm:ss", Locale.US)
    formatter.format(calendar.time)
}