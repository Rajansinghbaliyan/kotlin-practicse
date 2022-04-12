package classespractice

fun main() {
    val employee = Employee("james")
    println(employee.firstName)
    println(employee.fullTime)

    val employee1 = Employee("Harry", false)
    println(employee1.firstName)
    println(employee1.fullTime)
}

class Employee(val firstName: String, var fullTime:Boolean = true){

//   var fullTime: Boolean = true
//
//    constructor(firstName: String, fullTime:Boolean): this(firstName){
//        this.fullTime = fullTime
//    }


    // If we want to create a constructor protected

// private class Employee protected constructor(val firstName: String) {
    // If we only assign the value then this is the short form
    //    val firstName = firstName

    // Long way of initializing the properties
    //    init {
    //        println("Constructor is called")
    //        this.firstName = firstName
    //    }

    override fun toString(): String {
        return "Employee(firstName='$firstName')"
    }
}