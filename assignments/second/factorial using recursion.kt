package assignments.second

fun factOne(n: Int) : Int{
    if (n>0){
        return n * factOne(n-1)
    }else{
        return 1
    }
}

fun main() {
    println(factOne(4))
}