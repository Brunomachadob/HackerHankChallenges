import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */
fun pickingNumbers(a: Array<Int>): Int {
    val unique = a.toSet()

    return unique.map { x ->
        a.count { it == x } + a.count { it == x + 1 }
    }.max() ?: 0
}

fun main() {
    readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
