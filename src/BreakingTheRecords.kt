import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    var leastPointsRecordsCount = -1
    var maxPointsRecordsCount = -1

    scores.forEach {
        if (it < min) min = it.also { leastPointsRecordsCount++ }
        if (it > max) max = it.also { maxPointsRecordsCount++ }
    }

    return arrayOf(maxPointsRecordsCount, leastPointsRecordsCount)
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
