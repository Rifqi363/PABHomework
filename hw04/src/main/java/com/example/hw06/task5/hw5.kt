package com.example.hw06.task5

enum class LetterGrade { A, B, C, D, E }

data class Student(val id: Int, val name: String, val score: Int)

fun Student.letterGrade(): LetterGrade = when {
    score >= 85 -> LetterGrade.A
    score >= 70 -> LetterGrade.B
    score >= 55 -> LetterGrade.C
    score >= 40 -> LetterGrade.D
    else -> LetterGrade.E
}

fun main() {
    val students = mutableListOf(
        Student(101, "Ali", 88),
        Student(102, "Budi", 65),
        Student(103, "Citra", 92),
        Student(104, "Dewi", 71)
    )

    students.add(Student(105, "Eko", 30))       // tambah saat program berjalan
    students.removeAll { it.score < 40 }        // hapus yang nilainya di bawah 40

    for (student in students) {
        val (id, name, score) = student         // destructuring
        println("$id - ${name.padEnd(8)} - $score -> ${student.letterGrade()}")
    }
}