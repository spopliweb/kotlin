package assignments.second


class OctalToDecimal{
    var digit = 0
    var num = 0
    var number: Int = 0
    fun conversion(n: Int){
        var mainNum = n
        while (mainNum !=0){
            num = mainNum%10
            number += num * Math.pow(8.0, digit.toDouble()).toInt()
            mainNum /= 10
            digit++
        }
        println(number)
    }
}

fun main() {
    val numberone = OctalToDecimal()
    numberone.conversion(1600)
}
