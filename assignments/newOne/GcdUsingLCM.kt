package assignments.newOne

fun gcdFinder(a: Int, b:Int) : Int{
    var lcm : Int
    var gcd : Int

    if (a > b){
        lcm = a
    }else{
        lcm = b
    }

    while (true){
        if (lcm % a == 0 && lcm % b == 0){
            break
        }
        lcm++
    }
    gcd = (a*b)/lcm
    return gcd
}
fun main() {
    println("GCD value of two number is ${gcdFinder(6,3)}")
}