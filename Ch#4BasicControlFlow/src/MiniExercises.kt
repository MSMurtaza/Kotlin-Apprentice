fun main() {
    // 1
    /*val myAge: Int = 33
    val isTeenAger = myAge < 20 && myAge > 12
    println("Is teen age: $isTeenAger")*/

    // 2
    /*val theirAge = 30
    val bothTeenAgers = (myAge < 20 && myAge > 12) && (theirAge < 20 && theirAge > 12)
    println("Both teen agers: $bothTeenAgers")*/

    // 3
    val reader = "Shoaib Murtaza"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    println("Author is reader? $authorIsReader")

    // 4
    val readerBeforeAuthor = author < reader
    println("Reader before author $readerBeforeAuthor")

    // 1
    val myAge:Int = 33
    if (myAge < 20 && myAge > 12) {
        println("Teenager")
        // !(myAge < 20) || !(myAge > 12)
    } else {
        println("Not a teenager")
    }

    // 2
    val answer = if (myAge < 20 && myAge > 12) "Teenager" else "Not a teenager"
    println(answer)
}