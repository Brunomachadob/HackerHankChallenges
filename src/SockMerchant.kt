import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the sockMerchant function below.
fun sockMerchant(ar: Array<Int>): Int {
    val uniqueSocks = mutableSetOf<Int>()
    var pairsCount = 0

    for (i in ar) {
        when (uniqueSocks.contains(i)) {
            false -> uniqueSocks.add(i)
            true -> {
                uniqueSocks.remove(i); pairsCount++
            }
        }
    }

    return pairsCount
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(ar)

    println(result)
}
