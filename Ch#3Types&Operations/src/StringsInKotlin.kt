fun main(){
    // Characters & Strings
    val characterA: Char = 'a'
    println(characterA)

    val stringDog: String = "Dog"
    println(stringDog)

    // Concatenation
    var message = "Hello " + "my name is "
    val name = "Dick"
    message += name
    println(message)
    // to add a character to String, you do this
    val exclamationMark:Char = '!'
    message += exclamationMark
    println(message)

    // Multiline Strings
    var bigString = """
        |you can have a string
        |that contains multiple
        |lines 
        |by
        |doing this.
    """.trimMargin()
    println(bigString)
}