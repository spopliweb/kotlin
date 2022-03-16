package assignments

fun main() {
    println("Enter one Charter")
    val x = readLine()

    if (x == "a" || x=="e" || x=="i" || x=="o" || x=="u"){
        println("$x is a Vowel")
    }else if (x == "A" || x=="E" || x=="I" || x=="O" || x=="U"){
        println("$x is a Vowel")
    }else{
        println("$x is not a Vowel")
    }
}