package assignments.second

class Array{
    var sum = 0.0
    val number = arrayOf(30, 15, 10, 50, 21, 10)
    fun CalulaateAvg(){
        for (i in number){
            sum += i
        }
        val ave = sum/number.size
        println("Average is $ave")
    }
}

fun main() {
    val a = Array()
    a.CalulaateAvg()
}