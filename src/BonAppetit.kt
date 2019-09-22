import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    val shared = bill.filterIndexed { index, _ -> index !== k }.sum()
    val change = b - (shared / 2)

    if (change == 0) {
        println("Bon Appetit")
    } else {
        println(change)
    }
}

fun main() {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
