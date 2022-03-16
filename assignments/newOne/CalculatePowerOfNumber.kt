package assignments.newOne

fun powerOfNumebers(a: Int, b: Int): Int {
    var x = a.toDouble()
    var z = b.toDouble()

    return Math.pow(x, z).toInt()
}

fun main() {
    val y =  powerOfNumebers(3,1)
    println("Power of Numbers is $y")
}