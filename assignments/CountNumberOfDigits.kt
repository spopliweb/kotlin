package assignments

fun main() {
    var number = 12456778
    var i : Int = 0

    while (number != 0){

       number /= 10
        i++
    }
    println(i)
}