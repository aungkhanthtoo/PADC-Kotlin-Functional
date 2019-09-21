package com.padc.padckotlinfunctional.d_collections

data class City(val name: String)

data class Product(val name: String, val price: Double){
    override fun toString(): String = "'$name' for $price"
}

data class Order(val products: List<Product>, val isDelivered :Boolean)

data class Customer(val name: String, val city: City, val orders: List<Order>){
    override fun toString(): String = "$name from ${city.name}"
}

data class Shop(val name: String, val customers: List<Customer>)

fun String.toCharList() = toCharArray().toList()