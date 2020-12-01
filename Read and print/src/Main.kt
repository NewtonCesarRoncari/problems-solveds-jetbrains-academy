import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println(scanner.nextLine())
    println(scanner.nextLine())
    while (scanner.hasNextInt())
        println(scanner.nextInt())
}