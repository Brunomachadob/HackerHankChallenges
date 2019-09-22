import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.max
import kotlin.math.min
import kotlin.ranges.*
import kotlin.text.*

val magicSquares = arrayOf(
    arrayOf(arrayOf(8, 1, 6), arrayOf(3, 5, 7), arrayOf(4, 9, 2)),
    arrayOf(arrayOf(6, 1, 8), arrayOf(7, 5, 3), arrayOf(2, 9, 4)),
    arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 6)),
    arrayOf(arrayOf(2, 9, 4), arrayOf(7, 5, 3), arrayOf(6, 1, 8)),
    arrayOf(arrayOf(8, 3, 4), arrayOf(1, 5, 9), arrayOf(6, 7, 2)),
    arrayOf(arrayOf(4, 3, 8), arrayOf(9, 5, 1), arrayOf(2, 7, 6)),
    arrayOf(arrayOf(6, 7, 2), arrayOf(1, 5, 9), arrayOf(8, 3, 4)),
    arrayOf(arrayOf(2, 7, 6), arrayOf(9, 5, 1), arrayOf(4, 3, 8))
)

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    val costs = mutableListOf<Int>()

    for (magicSquare in magicSquares) {
        var cost = 0

        magicSquare.forEachIndexed { i, magicRow ->
            val sRow = s[i]

            magicRow.forEachIndexed { j, magicValue ->
                val sValue = sRow[j]

                if (magicValue !== sValue) {
                    cost += max(magicValue, sValue) - min(magicValue, sValue)
                }
            }
        }

        costs.add(cost)
    }

    return costs.min() ?: 0

}

fun main() {
    val scan = Scanner(System.`in`)

    val s = Array(3) { Array(3) { 0 } }

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}
