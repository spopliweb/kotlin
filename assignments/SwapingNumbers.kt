package assignments

fun main() {
    var n = 123
    var n2 = 456

    val temp = n

    n = n2
    n2 = temp

    println("First Number is $n")
    println("Second Number is $n2")


}