class MiniExercise2 {
    fun printFullName(firstName: String, lastName: String): String{
        return firstName + " " + lastName
    }
}

fun main() {
    println(MiniExercise2().printFullName(firstName = "Shoaib", lastName = "Murtaza"))
}