package com.padc.padckotlinfunctional.d_collections

import kotlin.collections.ArrayList

data class Student(val name: String, val marks: Double)

val students = listOf<Student>(
    Student("Thiri", 60.0),
    Student("Aung Aung", 90.0),
    Student("Hlaing Tin", 80.0),
    Student("Zaw Zaw", 80.0),
    Student("Kyaw Kyaw", 40.0),
    Student("Bo Bo", 95.0)
)

fun getPassedStudents(students: List<Student>): List<Student> {
    val newList = ArrayList<Student>()
    for (student in students){
        if (student.marks >= 60){
            newList.add(student)
        }
    }
    return newList
}


fun main() {
    println(getPassedStudents(students))

}



fun getHighestMarkPassedStudent(students: List<Student>): Student {
    TODO()
}