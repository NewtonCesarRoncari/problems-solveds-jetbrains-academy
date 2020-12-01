import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    var i = 1
    var squares = 1
    while (squares <= number) {
        squares = i * i
        i++
        if (squares <= number) {
            println(squares)
        }
    }
}