package com.padc.padckotlinfunctional.a_methodVsfunction

// Simple Class Declaration
class Car {
    private var speed = 0

    // A method is changing object's current state
    fun drive() {
        speed = 1
    }

    // A method is changing object's current state
    fun speedUp(speed: Int) {
        this.speed += speed
    }

    override fun toString(): String {
        return "Car(speed=$speed)"
    }
}

fun main() {
    // OOP
    val car = Car()
    println(car.toString())

    car.drive()
    println(car.toString())

    car.speedUp(10)
    println(car.toString())

    println("--------------")

    // FP
    val bus = Bus()
    println(bus.toString())

    val drivingBus = drive(bus)
    println(drivingBus)

    val highWayBus = speedUp(drivingBus, 10)
    println(highWayBus)


}

// Top Level Functions
fun drive(bus: Bus): Bus {
    return bus.copy(speed = 1)
}

fun speedUp(bus: Bus, speed: Int): Bus {
    return bus.copy(speed = bus.speed + speed)
}

data class Bus(val speed: Int = 0)