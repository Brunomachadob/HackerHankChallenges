import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

private const val ASCII_CODE_A = 97

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    return word.chars().map{ h[it - ASCII_CODE_A] }.max().orElse(0).times(word.length)
}

fun main() {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}
