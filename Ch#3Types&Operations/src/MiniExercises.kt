fun main() {
    // 1
    val age1 = 42
    val age2 = 21

    // 2
    val avg1 = (age1.toDouble() + age2.toDouble()) / 2
    println("Average: $avg1")

    // 1
    val firstName = "Shoaib"
    val lastName = "Murtaza"
    println(firstName + " " + lastName)

    // 2
    val fullName = firstName + " " + lastName
    println(fullName)

    // 3
    val myDetails = "Hello, my name is $fullName"
    println(myDetails)

    // 1
    val triple: Triple<Int, Int, Int> = Triple(12, 10, 2019)

    // 2
    // val (month, day, year) = triple

    // 3
    // val (month, _, year) = triple

    // 4
    val day = triple.second
    val month = triple.first
    val year = triple.third

    println("Day: $day" + "Month: $month" + " Year $year")
    val triple1 = Triple(day, 14, year)
    println("Day: ${triple1.first}" + " Month: ${triple1.second}" + " Year ${triple1.third}")
}
