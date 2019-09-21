package com.padc.padckotlinfunctional.d_collections

fun main() {
    val numbers = listOf(-1, 0, 2)
    val isZero: (Int) -> Boolean = { it == 0 }

    numbers.any(isZero)
    numbers.all(isZero)
    numbers.count(isZero)

}