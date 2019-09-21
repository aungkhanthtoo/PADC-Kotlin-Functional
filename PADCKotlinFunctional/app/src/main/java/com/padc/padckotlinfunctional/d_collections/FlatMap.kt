package com.padc.padckotlinfunctional.d_collections

fun main() {

    val result = listOf("abc", "12").flatMap { it.toCharList() }
    println(result)
}


