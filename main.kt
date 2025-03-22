import Exam.*
import Exam.Applicant as Applicant1
import Exam.Teacher as Teacher1
fun main(){
    try {
        println("Введите имя абитуриента")
        var applicant1: Applicant1 = Applicant1()
        applicant1.name = readln()
        applicant1.Registration()
        println("Сколько будет вступительных экзаменов?")
        val count = readLine()!!.toInt()
        if(count>0) {
            for (n in 1..count) {
                println("Введите имя преподавателя, который будет принимать у вас экзамен")
                var teacher: Teacher1 = Teacher1()
                teacher.name = readln()
                println("Введите название экзамена")
                applicant1.exam = readln()
                teacher.exam = applicant1.exam
                applicant1.RegisterExam()
                println("Введите свою оценку за экзамен ${applicant1.exam}")
                applicant1.grade = readLine()!!.toInt()
                teacher.grade = applicant1.grade
                teacher.Grade()
                applicant1.Grade()
            }
            println("Ваш средний балл за все экзамены: ${applicant1.AverageScore()}")
            println("Введите число - от какого среднего балла абитуриент принимается на факультет")
            val score = readLine()!!.toDouble()
            if(applicant1.AverageScore()>=score){
                println("Поздравляем, вы приняти на факультет!")
            }
            else{
                println("Нам жаль, ваш средний балл ниже, мы не можем вас принять")
            }
        }
        else{
            println("Некорректное значение")
        }
    }
    catch (e:Exception){
        println("Некорректный ввод данных")
    }
}