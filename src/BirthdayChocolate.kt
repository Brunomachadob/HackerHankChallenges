import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var possibilities = 0

    for (i in 0 ..s.size-m) {
        val sum = s.slice(i until i+m).sum()

        if (sum == d) possibilities++
    }

    return possibilities
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
