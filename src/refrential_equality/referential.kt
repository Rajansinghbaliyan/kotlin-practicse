package refrential_equality

import declaration.Employee

fun main() {
    val employee1 = Employee("James",1)
    val employee2 = Employee("Marry",2)
    val employee3 = Employee("James", 1)

    println(employee1 === employee3) // checks for the referential equality
    println(employee1 == employee3)
    println(employee1.equals(employee3))

    println(employee1 != employee3) // checking for the structure equality
    println(employee1 !== employee3) // checking for the referential equality
}