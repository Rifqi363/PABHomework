package com.example.hw05.task1

fun main() {
    val double: (Int) -> Int = { it * 2 }
    println(double(7))

    val startsWithVowel: (String) -> Boolean = { text ->
        text.isNotEmpty() && text[0].lowercaseChar() in "aeiou"
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("banana"))
    println(startsWithVowel("cherry"))

    val larger: (Int, Int) -> Int = {a, b -> if (a > b) a else b }
    println(larger(12, 7))
}
