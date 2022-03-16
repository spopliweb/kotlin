package assignments.second

public class DecimalToOctal{
    var number : Long = 0
    var num: Int = 0
    var i = 1
    fun conversion(n:Int){
        var oneNum = n
        while (oneNum != 0){
            num = oneNum%8
            oneNum /= 8
            number += (num * i).toLong()
            i *= 10
        }
        println("$n Octal value is $number")
    }

}

fun main() {
    val o = DecimalToOctal()
    o.conversion(1800)
}