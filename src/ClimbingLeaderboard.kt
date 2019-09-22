import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the climbingLeaderboard function below.
fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    val uniqueScores = scores.toSet()

    return alice.map { aliceScore ->
        uniqueScores
            .indexOfFirst { aliceScore >= it }
            .let { if (it == -1) uniqueScores.size else it }
            .inc()
    }.toTypedArray()
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    println(result.joinToString("\n"))
}
