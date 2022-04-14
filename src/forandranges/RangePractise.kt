package forandranges

enum class OddOrEven {
    OOD, EVEN
}

enum class VowelsAndConstants {
    VOWEL, CONSTANTS
}

val VOWELS = charArrayOf('a', 'e', 'i', 'o', 'u')

fun main() {
    val intRange = 1..10
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    intRange.printAny()
    charRange.printString()
    stringRange.printString()

    charRange.toHashSet().printAny()

    intRange.groupBy {
        when (it % 2 == 0) {
            true -> OddOrEven.EVEN
            false -> OddOrEven.OOD
        }
    }.printAny()

    intRange.associateWith { it.times(it) }.printAny()
    intRange.associate { Pair("Square of num $it "," is: ${it.times(it)}") }.printAny()

    charRange.groupBy {
        when (it in VOWELS) {
            true -> VowelsAndConstants.VOWEL
            false -> VowelsAndConstants.CONSTANTS
        }
    }.printAny()

    for (str in charRange.toHashSet()) {
        str.printAny()
    }

//    for (num in intRange){
//        num.printAny()
//    }

    intRange.forEach { it.times(23).printAny() }

}

fun String.printString(str: Any) = println(str)

// Using the generics on the function extensions
fun <T : Comparable<T>> ClosedRange<T>.printString() = println(this)

fun Any.printAny() = println(this)