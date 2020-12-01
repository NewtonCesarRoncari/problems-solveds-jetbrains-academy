import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val guests = scanner.nextInt()
    val weekend = scanner.nextBoolean()

    print(if (weekend) { guests in 15..25 } else { guests in 10..20 })
}