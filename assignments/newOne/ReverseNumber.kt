package assignments.newOne

import kotlin.math.pow

fun reverseNumber(a:Int): Int{
    var b = a
    var number = 0
    var reverse = 0

    while (b != 0){//123
        number = b%10
        reverse = reverse * 10 + number
        b /= 10
    }

    return reverse
}
fun main() {
    println("Reverse Number is ${reverseNumber(523)}")

    println(30.0.pow(20.0))
}