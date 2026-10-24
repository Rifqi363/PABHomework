package com.example.hw06.task2

enum class SubmissionStatus(val label: String) {
    NOT_SUBMITTED("Not submitted yet"),
    SUBMITTED("Submitted"),
    LATE("Late submission"),
    GRADED("Graded")
}

fun printStatusInfo(status: SubmissionStatus) {
    val action = when (status) {
        SubmissionStatus.NOT_SUBMITTED -> "Please submit before the deadline."
        SubmissionStatus.SUBMITTED -> "Waiting for grading."
        SubmissionStatus.LATE -> "A late penalty may apply."
        SubmissionStatus.GRADED -> "Check your score in the portal."
    }
    println("$status: ${status.label} -> $action")
}

fun main() {
    printStatusInfo(SubmissionStatus.NOT_SUBMITTED)
    printStatusInfo(SubmissionStatus.SUBMITTED)
    printStatusInfo(SubmissionStatus.LATE)
    printStatusInfo(SubmissionStatus.GRADED)
}