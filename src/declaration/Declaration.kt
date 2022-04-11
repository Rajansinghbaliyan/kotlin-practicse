package declaration

fun main() {
    val number: Int
    number = 1000

    var name = "James"
    name = "James $name"

    val employee = Employee("James", (Math.random()*100000).toInt())
    employee.name = "James Bond"
    print(employee)
}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if ( other is Employee ) {
            if (name == other.name && id == other.id)
                return true
        }

        return false
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }
}
