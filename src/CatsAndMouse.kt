import java.util.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

// Complete the catAndMouse function below.
fun catAndMouse(a: Int, b: Int, z: Int): String {
    val distA = abs(a - z)
    val distB = abs(b - z)

    val diff = distA.compareTo(distB)

    return when {
        diff == 0 -> "Mouse C"
        diff > 0 -> "Cat B"
        else -> "Cat A"
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
