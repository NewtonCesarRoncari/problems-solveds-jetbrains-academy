import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letters = scanner.nextLine().toCharArray()
    print(letters[2] == letters[0] + 1 &&
            letters[4] == letters[2] + 1)
}