package assignments.newOne

fun lcmNumbers(a: Int, b: Int){

    var lcm : Int = if(a>b) a else b
    while(true){
        if(lcm %a  == 0 && lcm %b ==0){
            break
        }
        lcm++
    }

    println("LCM of $a and $b is $lcm ")
}

fun main() {
    lcmNumbers(20,40)
}