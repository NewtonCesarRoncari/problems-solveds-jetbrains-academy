import java.util.Scanner

val vowels = arrayListOf('A', 'E', 'I', 'O', 'U')
fun isVowel(letter: Char): Boolean = vowels.contains(letter.toUpperCase())

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}
