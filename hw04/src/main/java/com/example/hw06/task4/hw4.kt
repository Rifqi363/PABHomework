package com.example.hw06.task4

fun main() {
    val courses = mutableListOf("SIF101", "SIF202", "SIF303", "SIF202")
    val creditMap = mapOf(
        "SIF101" to 3, "SIF202" to 4, "SIF303" to 3,
        "SIF404" to 2, "SIF505" to 3
    )

    // 1. Tambah dua, hapus satu
    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF303")
    println("Courses: $courses")

    // 2. Set menghilangkan duplikat
    val uniqueCourses = courses.toSet()
    println("Unique courses: $uniqueCourses")

    // 3. Cari SKS, tangani yang tidak ditemukan
    println("SIF202 credits: ${creditMap.getOrDefault("SIF202", 0)}")
    println("SIF999 credits: ${creditMap["SIF999"] ?: "not found"}")

    // 4. Ringkasan (SKS dihitung dari mata kuliah unik agar tidak dobel)
    val totalCredits = uniqueCourses.sumOf { creditMap[it] ?: 0 }
    println("Total entries in list: ${courses.size}")
    println("Total unique courses: ${uniqueCourses.size}")
    println("Total credits: $totalCredits")
}