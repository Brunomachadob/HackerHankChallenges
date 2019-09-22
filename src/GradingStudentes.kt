import java.util.*

/*
 * Complete the gradingStudents function below.
 */
fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map {
        if (it >= 38 && it % 5 > 2) {
            it + (5 - (it % 5))
        } else {
            it
        }
    }.toTypedArray()
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grades = Array(n) { 0 }
    for (gradesItr in 0 until n) {
        val gradesItem = scan.nextLine().trim().toInt()
        grades[gradesItr] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
