package classespractice

open class PersonalComputer(val year:Int){
    var brand:String = "Empty brand"

    constructor(brand:String, year: Int): this(year){
        println("The constructor of the parent class is running")
        this.brand = brand
    }

}

class Desktop: PersonalComputer, SuperDigital {
    constructor(brand: String,year: Int = 2010): super(brand,year){
        println("The constructor of the Desktop is running.")
    }

    override fun sayInRoboticVoice(str: String): String {
        TODO("Not yet implemented")
    }

    override fun sayHello(str: String): String {
        TODO("Not yet implemented")
    }
}

interface Digital {
    fun sayHello(str:String): String
}

interface SuperDigital : Digital {
    fun sayInRoboticVoice(str: String): String
}

fun main() {
    val alienWare = Desktop("Alienware")
    println(alienWare)
}