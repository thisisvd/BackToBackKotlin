fun main(){

    var fullName : String = "Hello World"
    println(fullName.length)
    println(fullName.lowercase())

    val firstName = "Vim"

    // Char - 16-bit Unicode Character
    val char : Char = 'a'
    println(char)

    // Interpolation & Triple Quotes
    var message : String = """
        |Hello
        |my name is this is vd
        |How are you?
    """.trimMargin()

    println(message)

    var name = "Vim"
    var age = 21

    println("Hello $name your age is $age and your name is ${name.length} character long.")

}