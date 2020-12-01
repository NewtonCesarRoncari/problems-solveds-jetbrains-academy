import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    var i = 1
    var count = 1

    while (count <= number) {
        repeat(i) {
            if (count <= number) {
                println(i)
            }
            count++
        }
        i++
    }
}