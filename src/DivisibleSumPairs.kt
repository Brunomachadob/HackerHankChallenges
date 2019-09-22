import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(k: Int, ar: Array<Int>): Int {
    var count = 0
    val arRange = 0 until ar.size;

    for (i in arRange) {
        for (j in arRange) {
            if (i !== j && i < j && (ar[i] + ar[j]) % k == 0) {
                count++
            }
        }
    }

    return count
}

fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(k, ar)

    println(result)
}
