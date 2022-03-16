package assignments.second

fun main() {
    val myArr = arrayOf<Int>(45,23,24,50,34,56,1,2,5,4,6,10,0,100,98)
    for (i in myArr.indices){
        for (j in i+1 until myArr.size){
            if (myArr[i] > myArr[j]){
                val temp = myArr[i]
                myArr[i] = myArr[j]
                myArr[j] = temp
            }
        }
    }
    println("Lagrgest Value in array is ${myArr[myArr.size-1]}")
}