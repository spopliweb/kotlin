package assignments.newOne

fun gcdCheck(a: Int, b:Int){
    var gcd:Int = if(a<b) a else b

    while (true){
        if ((a % gcd == 0) && (b % gcd == 0)){
            break
        }
        gcd--
    }
    println("GCD of $a and $b is $gcd")
}
fun main() {
    gcdCheck(24,60)
}