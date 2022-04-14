package classespractice

interface Multiply22 {
    fun result(num:Int): String
}


fun multiply(multiply22: Multiply22) = multiply22.result(123)

fun main() {
    var multiply22 = multiply(object: Multiply22 {
        override fun result(num: Int) = "The result is : ${num * 22}"
    })

    println(multiply22)
}