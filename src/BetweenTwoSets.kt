import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val maxA = a.max()!!
    val minB = b.min()!!

    var total = 0
    var n = maxA

    while (n <= minB) {
        if (a.all { n % it == 0 } && b.all { it % n == 0 }) {
            total++
        }

        n++
    }

    return total
}

fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
