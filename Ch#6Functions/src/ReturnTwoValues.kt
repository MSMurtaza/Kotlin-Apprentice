class ReturnTwoValues {
    fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
        return Pair(number * factor, number / factor)
    }
}

fun main() {
    val (product, quotient) = ReturnTwoValues().multiplyAndDivide(4, 2)
    println("Product: $product Quotient: $quotient")
}