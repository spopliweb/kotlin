package assignments.newOne

fun main() {
    var n = 15
    val num1 = n
    var binaryNumber: Long = 0
    var num:Int
    var i = 1
    var step = 1

    while (n!=0){
        num = n%2
        n /= 2
        binaryNumber += (num * i).toLong()
        i *= 10
    }
    println("$num1 is decimal number and its Binary number is $binaryNumber")

}