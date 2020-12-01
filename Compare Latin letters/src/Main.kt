import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letters = scanner.nextLine()
    print(letters[0].equals(letters[2], true))
}