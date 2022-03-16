package assignments.second

import java.util.Scanner

fun quotientReminder(){

    val x: Int
    val y: Int

    val sc = Scanner(System.`in`)

    println("Provide dividend")
    x = sc.nextInt()

    println("Provide divisor")
    y = sc.nextInt()

    val quotient = x/y
    val reminder = x%y

    println("Quotation is $quotient \nReminder is $reminder")
}

fun main() {
    quotientReminder()
}