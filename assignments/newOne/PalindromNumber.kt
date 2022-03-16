package assignments.newOne

fun numberCheck(a: Int) : Boolean{
    var b = a

    var c = 0
    var d = 0

    var bool = true

    while (b !=0){

        c = b%10
        d = d*10 + c

        b /= 10
    }

    return d == a
}

fun main() {
    val bool = numberCheck(1414141)
    if (bool){
        println("Number is Palindrome")
    }else{
        println("Number is Not Palindrome")
    }

}