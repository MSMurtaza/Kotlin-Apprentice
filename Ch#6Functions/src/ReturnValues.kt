class ReturnValues {
    /*fun multiply(number: Int, multiplier: Int): Int {
        return number * multiplier
    }*/

    // If a function consists solely of a single expression, you can assign the expression to the function
    // using = while at the same time not using braces, a return type, or a return statement
    fun multiply(number: Int, multiplier: Int) = number * multiplier
}

fun main() {
    val obj = ReturnValues()
    println(obj.multiply(10, 2))
}