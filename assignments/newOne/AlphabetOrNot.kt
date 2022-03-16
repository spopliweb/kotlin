package assignments.newOne

fun main() {

    val x: Char = ' '

    val y = x.code

    if(y >= 65 || y >= 90){
        println("Character is Alphabet and Charter is $x")
    }else if (y >= 97 || y >= 122){
        println("Character is Alphabet and Charter is $x")
    }else{
        println("Character is Not Alphabet and Charter is $x")
    }

}