package com.padc.padckotlinfunctional.d_collections

fun main() {
    val numbers = listOf(1, -1, 2)

    val positiveNumbers = numbers.filter { it > 0 }

    numbers.first { it > 0 }
    numbers.firstOrNull { it > 0}


    val squares = numbers.map { it * it }
}