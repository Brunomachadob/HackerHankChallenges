import java.util.*
import kotlin.math.min

// 1p -> 1
// 2p -> 1 2
// 3p -> 1 23
// 4p -> 1 23 4
// 5p -> 1 23 45
// 6p -> 1 23 45 6
//min(p/2,n/2-p/2)
/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    return min(p/2, n/2 - p/2)
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
