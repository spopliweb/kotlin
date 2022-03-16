package assignments.second

class Users{

    fun takeData(){
        println("Enter one Number")
        var unseInput : Long? = readLine()?.toLong()

        println("Users input is $unseInput")
    }
}

fun main() {
    val u = Users()
    u.takeData()
}