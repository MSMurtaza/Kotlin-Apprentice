fun main() {
    val coordinates: Pair<Int, Int> = Pair(2, 3)
//    val coordinatesInferred = Pair(2, 3)
//      val coordinatesWithTo = 2 to 3

    // pair of double
    val coordinatesDouble = Pair(2.1, 3.5)
    val coordinatesMixed = Pair(2.1, 3)

    val x1 = coordinates.first
    val y1 = coordinatesMixed.second

    val (x, y) = coordinates
    println("" + x + " " + y)
   println(""+ x1 + " " + y1)

    // triple of Double
    val coordinates3D = Triple(2, 3, 1)
//    val (x3, y3, z3) = coordinates3D
    val x3 = coordinates3D.first
    val y3 = coordinates3D.second
    val z3 = coordinates3D.third

//    println("x3 = " + x3 + ", y3 = " + y3 + ", z3 = " + z3)
    println("x3 = $x3" + ", y3 = $y3" + ", z3 = $z3")

    val (x4, y4, _) = coordinates3D
    println("x4 = $x4" + ", y4 = $y4")
}