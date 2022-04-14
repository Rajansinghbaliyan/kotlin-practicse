package enumPractise

enum class Department(val fullName: String, val noOfEmp: Int) {
    HR("Human Resource",  30), IT("Information Technology",3);

    fun getDetails() = "The name of the department is $fullName and the strength is $noOfEmp"
}


fun main() {
    println(Department.HR.getDetails())
    println(Department.IT.getDetails())
}