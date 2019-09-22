import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.max
import kotlin.text.*

// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {
    val doses = (height.max() ?: 0) - k
    return max(0, doses)
}

fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val height = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
