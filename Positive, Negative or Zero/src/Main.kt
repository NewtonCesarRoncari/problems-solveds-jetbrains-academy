import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val result = when {
        number > 0 -> {
            "positive"
        }
        number < 0 -> {
            "negative"
        }
        else -> {
            "zero"
        }
    }
    print(result)
}