package classespractice

// Constant can be created at the top level with out any class

val MY_CONSTANT = 100

fun main() {

    println("My Constant is : $MY_CONSTANT")

    val person1 = Person("Harry")
    println(person1.fullTime)
    person1.fullTime = false

    val person2 = Person("James", false)
    println(person2.firstName)
    println(person2.fullTime)
    person2.fullTime = true
    println(person2.fullTime)
}

class Person(val firstName: String, fullTime:Boolean = true){
    var fullTime = fullTime
    get(){
        println("Running the getter for fullTime")
        return field
    }
    set(value){
        println("Running the setter for the fullTime")
        field = value
    }

    override fun toString(): String {
        return "Person(firstName='$firstName')"
    }

}