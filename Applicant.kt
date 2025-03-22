package Exam

open class Applicant {
    var name = "" // имя абтуриента
    var grade = 0 // оценка
    var exam = "" // название экзамена
    var grades: MutableList<Int> = mutableListOf()
    fun Registration() {
        println("Абитуриент $name регистрируется на факультет")
    }

    fun RegisterExam() {
        println("$name зарегистрирован на экзамен $exam")
    }

    open fun Grade() {
        println("Оценка абитуриента $name - $grade")
        grades.add(grade)
    }

    open fun AverageScore(): Double {
        return if (grades.isNotEmpty()) grades.average()
        else 0.0
    }
}