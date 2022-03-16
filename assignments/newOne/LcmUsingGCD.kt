package assignments.newOne

fun lcmFinder(a:Int, b:Int) : Int{
    var lcm: Int
    var gcd: Int = if(a<b) a else b
    while (true){
        if (a%gcd == 0 && b%gcd == 0){
            break
        }
        gcd--
    }

    lcm = (a*b)/gcd

    return lcm
}
fun main() {
    println("LCM of two numbers is ${lcmFinder(6, 3)}")
}