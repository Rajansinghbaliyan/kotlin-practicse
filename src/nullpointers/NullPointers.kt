package nullpointers

fun main() {
    val name: String? = null

    // Elvis Operator
    val result = name?.toUpperCase() ?: "The value was null"
    println(result::class)
    println(result.toUpperCase())

    // Safe Cast operator
    val someThing: Any = arrayOf(2, 3, 4, 5)
    val str = someThing as? String
    println(str)
    println(str?.toUpperCase())

    // Assertion on the Nullable type will throw the exception if the error occur
    val string1: String? = "Not null, might be in the future"
    println(string1!!)
    val capitalString = string1.toUpperCase()
    println(capitalString)
    val string2: String? = "The is the kingdom come"
    string2?.let { printText(it) }


    // Arrays of the Null value
    val nullArray = arrayOf(1,null,3,4,5,null)
    val nullArray1 = Array<Int?>(4) {null}
    nullArray.forEach { println("${ it?.times(32) }") }
    nullArray1.forEach { println(it) }

}

fun printText(text: String) {
    println(text)
}