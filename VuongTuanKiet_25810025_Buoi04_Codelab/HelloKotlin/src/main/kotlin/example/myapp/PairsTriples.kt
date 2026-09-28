package org.example.example.myapp

fun main() {
    val equipment = "fish net" to "catching fish"

    println("${equipment.first} used for ${equipment.second}")

    val numbers = Triple(6, 9, 42)

    println(numbers)
    println(numbers.toList())

    println(numbers.first)
    println(numbers.second)
    println(numbers.third)

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")
}
