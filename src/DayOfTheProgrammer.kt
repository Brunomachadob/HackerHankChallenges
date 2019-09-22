import kotlin.io.*
import kotlin.text.*

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    val isLeap = { year: Int ->
        year % 4 == 0 && (year < 1918 || year % 400 == 0 || year % 100 != 0)
    }

    val day = when {
        year == 1918 -> 26
        isLeap(year) -> 12
        else -> 13
    }

    return "$day.09.$year"
}

fun main() {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
