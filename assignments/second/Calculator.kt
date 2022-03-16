package assignments.second

import java.util.Scanner

open class Calculator{
    fun takeNumebers(){
        val takeNum = Scanner(System.`in`)
        println("Enter Two Numbers: ")

        val numOne = takeNum.nextDouble()
        val numTwo = takeNum.nextDouble()

        println("Provide your Operator to [+, -, *, /]: ")
        val operator = takeNum.next()[0]
        val result: Double

        when(operator){
            '+' -> result = numOne + numTwo
            '-'-> {
                    if(numOne > numTwo){
                        result = numOne - numTwo
                    }else{
                        result = numTwo - numOne
                    }
                }
            '/' -> {
                    if(numOne > numTwo){
                        result = numOne / numTwo
                    }else{
                        result = numTwo / numOne
                    }
                }
            '*' -> result = numOne * numTwo
            else -> {
                println("Operator is not correct")
                return
            }
        }
        println("Your two numbers are $numOne and $numTwo and you choose to perform $operator answer is $result")

    }
}
fun main() {
    val c = Calculator()
    c.takeNumebers()
}