package assignments.newOne

fun primeCheck (a:Int) : Boolean {
    var bool = true
    for (i in 2 until a){
        if (a%i == 0){
            bool = false
            break
        }
    }

    return bool
}

fun main() {
    val bool1 = primeCheck(11)
    if (bool1){
        println("Number is a Prime Number")
    }else{
        println("Number is Not a Prime Number")
    }

}