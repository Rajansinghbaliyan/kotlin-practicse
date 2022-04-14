package classespractice

class SomeClass{
    companion object{
        private val secret = 123
        fun getSecretPassword() = "The secret is $secret"
    }
}

fun main() {
    // Here we are access the value through the static function without any object
    println(SomeClass.getSecretPassword())
}