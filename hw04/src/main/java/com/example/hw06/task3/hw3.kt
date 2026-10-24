package com.example.hw06.task3

// Pecah berdasarkan satu atau lebih spasi, buang string kosong, hitung sisanya
fun String.wordCount(): Int =
    this.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }.size

// Balik angka, potong tiap 3 digit, gabung dengan ".", lalu balik lagi
fun Int.toRupiahString(): String {
    val formatted = this.toString()
        .reversed()
        .chunked(3)
        .joinToString(".")
        .reversed()
    return "Rp $formatted"
}

// Saring nilai dalam [min, max], lalu rata-ratanya (0.0 jika kosong)
fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val filtered = this.filter { it in min..max }
    return if (filtered.isEmpty()) 0.0 else filtered.average()
}

fun main() {
    println("Hello world".wordCount())
    println("Belajar Kotlin itu menyenangkan sekali".wordCount())
    println("Saya sedang mengerjakan tugas pemrograman aplikasi bergerak hari ini".wordCount())

    println(1000.toRupiahString())
    println(50000.toRupiahString())
    println(1000000.toRupiahString())

    val result = listOf(10, 50, 200, 85, -5).clampedAverage(0, 100)
    println("listOf(10, 50, 200, 85, -5).clampedAverage(0, 100) = $result")
}