import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val line = scanner.nextLine().split(" ")
    print("${line[0][0]}. ${line[1]}, ${line[2]} years old")
}