package com.padc.padckotlinfunctional.b_lambdasAndhigherorder

import java.text.SimpleDateFormat
import java.util.*

val dateString: (Date) -> String = { date ->
    val dateFormat = SimpleDateFormat("yyyy MMM dd", Locale.US)
    "The date is ${dateFormat.format(date)}"
}

fun main() {
    println(dateString(Date()))
}