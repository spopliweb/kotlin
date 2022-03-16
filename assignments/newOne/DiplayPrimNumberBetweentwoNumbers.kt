package assignments.newOne


fun displayPrime(a: Int, b:Int) {
    var low: Int
    var high: Int
    if (a>b){
        high = a
        low = b
    }else{
        high = b
        low = a
    }
    while (low < high){ //20<50
        var flag = false

        for (i in 2 until low){ //2..11
            if (low % i == 0){ //
                flag = true
                break
            }
        }
        if (!flag){
            print("$low ")
        }
        low++
    }
}
fun main() {
    displayPrime(21,50)
}