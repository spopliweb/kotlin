package assignments.newOne

fun armStrong(a:Int){
    var b: Int = a
    var number: Int = 0
    var num: Int = 0
    while (b != 0){
        num = b%10
        number += Math.pow(num.toDouble(), 3.0).toInt()
        b /= 10
    }

    if (number == a) {
        println("Number $a is an Arm Strong Number")
    }else{
        println("Number $a is not an Arm Strong Number")
    }
}

fun main() {
    armStrong(370)
}