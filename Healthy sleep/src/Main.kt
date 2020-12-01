import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val minimum = scanner.nextInt()
    val maximum = scanner.nextInt()
    val hours = scanner.nextInt()

    val result = when {
        hours in minimum..maximum -> { "Normal" }
        hours > maximum -> { "Excess" }
        else -> { "Deficiency" }
    }

    print(result)
}