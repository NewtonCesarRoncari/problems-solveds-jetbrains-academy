import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val line = scanner.nextLine()
    val symbol = scanner.nextInt()
    print("Symbol # $symbol of the string \"$line\" is \'${line[symbol - 1]}\'")
}