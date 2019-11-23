fun main() {
    // 1
    val coordinates: Pair<Int, Int> = Pair(2, 3)

    // 2
    val (row, column) = coordinates
    val x = coordinates.first
    val y = coordinates.second
    println("Row: $row" + " Column: $column")

    // 3
//    val character: Character = "Dog"
//    val character: Char = 'd'
//    val string: String = "Dog"
//    val string: String = 'd'

    // 4
    val date = Triple(15, 8, 2015)
    val day = date.first
    println("Day: $day")

    // 5
    // val name = "Dick"
    // name += "Lucas"
    // initializing again constant, which is wrong

    // 6
    val triple = Triple(100, 1.5, 10)
    val value = triple.second
    println("Value: $value")
    // type of  constant value is Double

    // 7
    val newDate = Triple(15, 8, 2015)
    val month = newDate.second
    println("Month: $month")
    // value of constant value is 8

    // 8
    val number = 10
    val multiplier = 5
    val summary = "$number multiplied by $multiplier equals ${number * multiplier}"
    println("Summary: $summary")
    // 10 multiplied by 5 equals 50

    // 9
    val a = 4
    val b:Short = 100
    val c:Byte = 12
    val result = a + b - c
    println("Result: $result")
    // answer is 12

    // 10
    println("kotlin.math.PI: ${kotlin.math.PI}" + " kotlin.math.PI.toFloat(): ${kotlin.math.PI.toFloat()}")
    // kotlin.math.PI = 3.141592653589793 & kotlin.math.PI.toFloat() = 3.1415927
}