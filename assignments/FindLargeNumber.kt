package assignments

fun main() {
    val arr = arrayOf<Int>(45,60,47,70,80)

    var n = arr[0]

    for (i in arr){
        if (n<i){
            n = i
        }
    }
    println("Largest number is $n")
}