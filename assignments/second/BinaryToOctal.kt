package assignments.second

class BinaryToOctal{

    var num = 0
    var number: Int = 0
    var digit = 0
    fun conversion(n: Int){
        var bin = n
        while (bin != 0){
            num = bin%10
            number += num * Math.pow(2.0, digit.toDouble()).toInt()
            bin /= 10
            digit++
        }

        var octNum = 0
        var octRem = 0
        var octDigit = 1
        while (number != 0){
            octRem = number%8
            number /= 8
            octNum += (octRem * octDigit)
            octDigit *= 10

        }
        println("$n is Binary and its octal number is $octNum")
    }
}
fun main() {
    val oct = BinaryToOctal()
    oct.conversion(10001)
}