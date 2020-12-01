import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numbers = arrayListOf<Int>()
    var number = 0

    while (scanner.hasNextInt()) {
        val newNumber = scanner.nextInt()
        numbers.add(newNumber)

        if (newNumber > number) {
            number = newNumber
        }

        if (numbers[numbers.size - 1] == 0) {
            print(number)
        }
    }

}