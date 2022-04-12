package classespractice

import classespractice.Material.*

enum class Material {
    Ceramic, Metal, Wood, Plastic, Ice
}

class GardenItem(val name: String){
    var material: Material = Plastic
    constructor(name: String, material: Material): this(name){
        this.material = material
    }
    constructor(material: Material): this("Strange Thing",material)

    override fun toString(): String {
        return "GardenItem(name='$name', material=$material)"
    }


}

fun main() {
    var elf = GardenItem("Elf")
    var snowMan = GardenItem("Snowman", Wood)
    var strange = GardenItem(Ceramic)

    println(elf)
    println(snowMan)
    println(strange)
}
