package assignments.second

import java.util.Scanner

class UserOne{
    fun dateCollection(){
        println("Enter your number")
        val scanner = Scanner(System.`in`)
        val num1: Long = scanner.nextLong()
        println("You have enter value $num1")

    }
}
fun main() {
    val u = UserOne()
    u.dateCollection()
}