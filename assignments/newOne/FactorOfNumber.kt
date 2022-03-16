package assignments.newOne

fun factorCheck(a:Int){
    for (i in 1..a){
        if (a%i == 0){
            println("$i is factor of $a")
        }
    }
}

fun main() {
    factorCheck(25)
}