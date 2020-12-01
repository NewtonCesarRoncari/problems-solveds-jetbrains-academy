import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val rest = number % 2
    print(if (rest == 0) {
        "EVEN"
    } else {
        "ODD"
    })
}