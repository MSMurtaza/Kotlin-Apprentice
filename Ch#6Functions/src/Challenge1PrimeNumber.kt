class Challenge1PrimeNumber {
    /**
     * @param number the number that will be divided
     * @param divisor the number that will divide
     * @return Boolean true or false will be returned after complete execution
     */
    fun isNumberDivisible(number: Int, divisor: Int): Boolean {
        return number % divisor == 0
    }

    /**
     * @param number the number that will be divided
     * @return Boolean true or false will be returned after complete execution
     */
    fun isPrime(number: Int): Boolean{
        if (number < 0) return false
        var boolean:Boolean
        var prime = 0
        for (i in 0 until number) {
            boolean = (isNumberDivisible(number, 1) && isNumberDivisible(number, i+1))
            if (boolean) prime++
        }
        return prime==2
    }
}

fun main() {
    val obj = Challenge1PrimeNumber()

    println(obj.isPrime(3))
   // println(obj.isPrime(6))
    println(obj.isPrime(16))
    /*println(obj.isPrime(7))
    println(obj.isPrime(13))
    println(obj.isPrime(8893))*/
}