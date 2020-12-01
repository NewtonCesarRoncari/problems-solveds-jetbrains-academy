import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    val attack = if (x1 == x2 - 2 && y1 == y2 + 1) {
        "YES"
    } else if (x1 == x2 - 2 && y1 == y2 - 1) {
        "YES"
    } else if (x1 == x2 - 1 && y1 == y2 - 2) {
        "YES"
    } else if (x1 == x2 - 1 && y1 == y2 + 2) {
        "YES"
    } else if (x1 == x2 + 2 && y1 == y2 + 1) {
        "YES"
    } else if (x1 == x2 + 2 && y1 == y2 - 1) {
        "YES"
    } else if (x1 == x2 + 1 && y1 == y2 - 1) {
        "YES"
    } else if (x1 == x2 + 1 && y1 == y2 + 1) {
        "YES"
    } else if (x1 == x2 + 1 && y1 == y2 - 2) {
        "YES"
    } else if (x1 == x2 + 1 && y1 == y2 + 2) {
        "YES"
    } else {
        "NO"
    }

    print(attack)
}