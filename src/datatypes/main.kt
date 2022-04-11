package datatypes

import javacode.PrintNames

fun main() {
    // All the datatypes are same as the Java

    // int is default for all the integer types
    val myInt = 12

    var myLong = 22L
    // or
    var myLong2: Long = 11

    // We cant implicitly convert the smaller type to bigger type
    // we have to do it explicitly

    myLong = myInt.toLong()

    // Arrays

    val names = arrayOf("James", "harry", "Robin")
    println(names::class)

    names.groupBy { it[0].isUpperCase() }
            .forEach { println(it) }

    val evenNumbers = Array(3) {i -> i * 2 }

    evenNumbers.forEach { i -> println(i) }

    var someArray : Array<Int>

    someArray = Array(4) {0}

    someArray.forEach { i -> println(i) }

    var mixedArray = arrayOf("hello", 21, 45L, 'a')

    println(mixedArray::class)

    val printNames = PrintNames()

    printNames.printNames(names)
    printNames.printIntegers(evenNumbers.toIntArray())
    printNames.printArrayListInt(evenNumbers.toMutableList())

    // Or we could use the special primitives types that are available in the
    // kotlin, these will also provide the performance boast also

    val intArray = IntArray(3) { 0 }
    var intArray2 = intArrayOf(1,2,3,4,5)

    printNames.printIntegers(intArray)
}