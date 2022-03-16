package assignments.second

fun sum(number: Int): Int{
    if (number >= 1){
        return number + sum(number-1)
    }else{
        return number
    }
}
fun main() {
    println("Sum is ${sum(10)}")
}