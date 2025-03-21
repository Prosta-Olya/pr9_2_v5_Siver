package Exams

class Teacher():Applicant() {

    override  fun Grade(){
        println("Преподаватель $name Выставил оценку абитуриенту - $grade")
    }
}