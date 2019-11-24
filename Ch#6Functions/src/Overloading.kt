class Overloading {
    fun getValue(value: Int): Int {
        return value + 1
    }

    fun getValue(value: String): String {
        return value
    }
}

fun main() {
    println(Overloading().getValue(10))
    println(Overloading().getValue("Shoaib"))
}