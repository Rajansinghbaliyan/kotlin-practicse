package typealiasis

import declaration.Employee

typealias EmployeeSet = MutableSet<Employee>

fun main() {

    val employee = Employee("James bond", 45623)

    val employeeSet: EmployeeSet = mutableSetOf()

    employeeSet.add(employee)

}