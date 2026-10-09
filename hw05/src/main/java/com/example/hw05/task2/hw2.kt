package com.example.hw05.task2

val double: (Int) -> Int = { it * 2}
val startsWithVowel: (String) -> Boolean = { text ->
    text.isNotEmpty() && text[0].lowercaseChar() in "aeiou"
}

fun applyTwice(n: Int, operation: (Int) -> Int): Int = operation(operation(n))

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach(::println)
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> =
    list.map(mapper)

fun main() {
    println(applyTwice(3, double))

    val courses = listOf(
        "Algorithms",
        "Mobile Application Development",
        "Operating Systems",
        "Database Systems",
        "Embedded Systems"
    )
    printIf(courses, startsWithVowel)

    println(transform(listOf(2, 3, 4)) { ( it * it).toString() })
}