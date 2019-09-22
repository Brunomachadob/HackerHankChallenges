import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the countingValleys function below.
fun countingValleys(s: String): Int {
    val UP = "U".first()

    var valleyCount = 0
    var level = 0

    for (char in s) {
        val climbingUp = (char == UP)

        level += (if (climbingUp) 1 else -1)

        if (climbingUp && level == 0) valleyCount++
    }

    return valleyCount
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(s)

    println(result)
}
