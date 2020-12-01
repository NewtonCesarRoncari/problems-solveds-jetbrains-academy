import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()
    print(n1 in n2..n3)
}