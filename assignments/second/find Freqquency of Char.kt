package assignments.second

fun charFreq(name: String){
    val nameOne = name
    var digit = 0
    var ch = 's'
    for (i in nameOne.indices){
        if (ch == nameOne[i]){
            digit++
        }
    }
    println("Character $ch frequency in a string is $digit ")
}
fun main() {
    charFreq("effcheosss")
}