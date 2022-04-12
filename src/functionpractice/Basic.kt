package functionpractice

import classespractice.Car
import classespractice.Color

fun main() {
    println(labelMultiply(2,3,"This is the result: "))
    println(labelMultiplyShort(4,5, "This the power of kotlin: "))

    printAny(labelMultiplyShort(4,5,"Lets test the unit return"))

    var car1 = Car("Maruti", Color.Blue, 2109)
    var car2 = Car("Hyundai", Color.Black, 2018)
    var car3 = Car("Tata", Color.Red, 2020)

    printCarsColor(car1,car2,car3)

}

fun labelMultiply(num1: Int, num2: Int, label: String): String {
    return "$label ${num1 * num2}"
}

fun printCarsColor(vararg cars: Car) = cars.forEach { println(it.color) }

fun labelMultiplyShort(num1: Int,num2: Int, label: String) = "$label ${num1*num2}"

fun printAny(input:Any) = println(input)
