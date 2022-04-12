package classespractice

enum class Color{
    Red,Blue,Green,Black
}

data class Car(val model: String,var color: Color, val year: Int )

fun main() {
    val aura = Car("Aura",Color.Black, 2021)
    val swift = Car("Swift", Color.Red, 2018)

     var (model, color, _) = aura

     println("$model,$color")

    println(aura.hashCode())
    println(swift.toString())

}