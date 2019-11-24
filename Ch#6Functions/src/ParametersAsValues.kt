class ParametersAsValues {

    fun incrementAndPrint(value:Int): Int{
        //value +=1
        val newValue = value + 1
        println(newValue)
        return newValue
    }
}

fun main() {
    println(ParametersAsValues().incrementAndPrint(10))
}