fun main() {
    val animal = "Fox"
    if (animal == "Cat" || animal == "Dog") {
        println("Animal is a house pet")
    } else {
        println("Animal is not a house pet")
    }

    val a = 5
    val b = 10
    val min: Int
    /*if (a < b) {
        min = a
    } else {
        min = b
    }*/

    val max: Int
    /*if (a > b) {
        max = a
    } else {
        max = b
    }*/

    /*min = if (a < b) a else b
    max = if (a > b) a else b
    println("Min: $min Max: $max")*/

    val hourOfDay = 12
    val timeOfDay = if (hourOfDay < 6) {
        "Early Morning"
    } else if (hourOfDay < 12) {
        "Morning"
    } else if (hourOfDay < 17) {
        "Afternoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late evening"
    } else {
        "Invalid hour!"
    }
    println("Time of day: $timeOfDay")
}