package classespractice

class CustomString private constructor(val str:String){
    companion object {
        fun simpleCustomString(str: String) = CustomString(str)
        fun upperOrLowerCustomString(str: String, bool:Boolean) = when(bool) {
            true -> CustomString(str.toUpperCase())
            false -> CustomString(str.toLowerCase())
        }
    }

    override fun toString(): String {
        return "CustomString(str='$str')"
    }
}

fun main() {
    val customString = CustomString.simpleCustomString("Hello")
    println(customString)

    val shout = CustomString.upperOrLowerCustomString("heeeeeelllllooooo",true)
    println(shout)
}