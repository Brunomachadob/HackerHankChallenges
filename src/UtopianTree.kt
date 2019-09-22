import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the utopianTree function below.
fun utopianTree(n: Int): Int {
    if (n == 0) return 1

    return (0..n).reduce { acc, cycle ->
        when {
            cycle == 1 -> 2
            cycle % 2 !== 0 -> acc * 2
            else -> acc + 1
        }
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
