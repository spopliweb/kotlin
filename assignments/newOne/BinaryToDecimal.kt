package assignments.newOne

fun main() {
    var n = 1111
    var digit = 0
    var number = 0
    var num = 0
    while (n!=0){
        num = n%10
        number += num * Math.pow(2.0, digit.toDouble()).toInt()
        n /= 10
            digit++
    }
    println(number)

}