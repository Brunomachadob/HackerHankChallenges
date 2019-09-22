import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    val birdCount = TreeMap<Int, Int>()

    for (bird in arr) {
        birdCount.compute(bird) { _, value -> (value ?: 0) + 1 }
    }

    return birdCount.entries
        .stream()
        .max { a, b -> a.value - b.value }
        .map { it.key }
        .get()
}

fun main() {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
