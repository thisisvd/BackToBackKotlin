fun main(){

    // Integer Value -
    var myByte : Byte = 8     // 8-bit signed Integers
    var myShort : Short = 16  // 16-bit signed Integers
    var myInt : Int = 32      // 32-bit signed Integers
    var myLong : Long = 64    // 64-bit signed Integers

    // Decimal Value -
    val myFloat : Float = 32.00F  // 32-bit signed Integers
    val myDouble : Double = 64.00 // 64-bit signed Integers

    println(myByte.toDouble()) // convert myByte value to double

    val bigLong : Long = 1_000_000_000
    println(bigLong)

    val newInt = myInt.plus(12) // we can perform all other mathematical operations
    println(newInt)

}