class MiniExercise4 {
    fun calculateFullName(): Pair<String, Int> {
        return Pair("Shoaib Murtaza","Shoaib Murtaza".length)
    }
}

fun main() {
    val (fullName, lenght) = MiniExercise4().calculateFullName()
    // length-1 is for subtracting one character of space between firstName and lastName
    println("My name is $fullName & its length is ${lenght-1}")
}