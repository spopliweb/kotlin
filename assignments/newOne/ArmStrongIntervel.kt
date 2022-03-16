package assignments.newOne

fun armStrongInterval(a: Int, b:Int){
    var low :Int
    var high :Int
    var number: Int = 0
    var num : Int = 0
    if (a > b){
        low = b
        high = a
    }else{
        low = a
        high = b
    }
    for(i in low..high){
        var number = 0
        var num = 0
        var mainNumber = i
        var digit = 0

        while (mainNumber != 0){
            mainNumber /= 10
            digit++
        }

        mainNumber = i

        while (mainNumber != 0){
            num = mainNumber%10
            number += Math.pow(num.toDouble(), digit.toDouble()).toInt()
            mainNumber /= 10
        }
        if (number == i){
            println("Number $i is Arm Strong Number")
        }
    }
}
fun main() {
    armStrongInterval(120, 9999)
}