fun main() {
    var sum = 1

    while (true) {
        sum += sum + (sum + 1)
        if (sum > 1000) {
            break
        }
        println(sum)
    }
    println(sum)
}