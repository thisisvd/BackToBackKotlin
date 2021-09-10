fun main(args: Array<String>) {

    println("Hello World!")

    // variable (var - mutable variables)
    var fullName = "Vimal Dubey"
    println(fullName)

    fullName = "Ashe Len"
    println(fullName)

    fullName = ""
    println(fullName)

    println(fullName.isEmpty()) // isEmpty

    var age = 21
    age = 22
    println(age)

    // val - Immutable Variables
    val name = "Leo Messi"
//    name = "Ronaldo"  // compiler error val can't be reassigned
    println(name)

    val anotherAge = 42
//    anotherAge = 45
    println(age)


    // Type of variable -
    var newName : String = "John"
//    var newName : String = 32  // error

        var newAge : Int = 32;
//    var newAge : Int = "John"  // error


}
