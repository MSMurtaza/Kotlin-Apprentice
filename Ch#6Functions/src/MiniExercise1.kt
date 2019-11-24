class MiniExercise1 {
    fun printFullName(firstName: String, lastName: String):String {
        return firstName + " " + lastName
    }
}

fun main() {
    println(MiniExercise1().printFullName("Shoaib", "Murtaza"))
}