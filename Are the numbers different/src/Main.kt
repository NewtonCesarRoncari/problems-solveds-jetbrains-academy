import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()

    println(!numbersEquals(n1, n2, n3))
}

fun numbersEquals(n1: Int, n2: Int, n3: Int): Boolean {
    return n1 == n2 || n1 == n3 || n2 == n3
}