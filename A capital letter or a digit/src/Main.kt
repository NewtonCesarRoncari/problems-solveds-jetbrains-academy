import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next().first()
    print(letter.isUpperCase() || letter in '1'..'9')
}