import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(
    houseStart: Int,
    houseEnd: Int,
    appleTree: Int,
    orangeTree: Int,
    apples: Array<Int>,
    oranges: Array<Int>
) {
    val isInHouseRange: (Int) -> Boolean = { it in houseStart..houseEnd }

    apples.map { it + appleTree }.count(isInHouseRange).also { println(it) }
    oranges.map { it + orangeTree }.count(isInHouseRange).also { println(it) }
}

fun main() {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
