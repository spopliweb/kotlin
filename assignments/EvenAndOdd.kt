package assignments

fun main() {
    var n = 445
    if (n%2 == 0){
        println("Given number is even")
    }else println("Given number is odd")

    //Find the number of even and odd number from series
    println("Check even and odd number from series")
    var n1 = 15
    var n2: Int = 0
    var n3: Int = 0

    for (i in 1..n1){
        if (i%2 == 0){
            n2++
            println("$i is Even number")
        }else{
            n3++
            println("$i is Odd number")
        }
    }
    println("Total Even numbers are $n2")
    println("Total Odd numbers are $n3")

    //Find how many numbers are even or odd in an array

    println()
    val myArray = arrayOf<Int>(2, 25, 24, 30, 15, 17, 21, 25, 30, 31, 32)
    var cN: Int = 0
    var cN1: Int = 0
    for (i in myArray){
        if (i%2 == 0){
            cN++
        }else{
            cN1++
        }
    }
    println("Total even Number in Array are $cN")
    println("Total even Number in Array are $cN1")

}