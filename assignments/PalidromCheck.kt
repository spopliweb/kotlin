package assignments

fun main() {
    var n = 123321
    val n2 = n
    var number:Int = 0
    var reverse:Int = 0
    while (n!=0){
        number = n%10
        reverse = reverse *10 + number
        n /= 10
    }
    if (n2==reverse){
        println("Number is Palindrome")
        println("Palindrome Number is $reverse")
    }else{
        println("Number is not Palindrome")
        println(reverse)
    }
}