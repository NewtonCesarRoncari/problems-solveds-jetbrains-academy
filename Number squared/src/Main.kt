import java.util.*
import kotlin.math.pow

fun square(number: Int): Int = number.toDouble().pow(2.0).toInt()

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}
