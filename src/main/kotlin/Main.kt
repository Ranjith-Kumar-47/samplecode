fun main() {
    val mutableList: MutableList<Int> = arrayListOf(1, 2, 3, 4, 5)
    println(mutableList.swapTwoNumber(2, 4))
}

fun Student.isExcellent(marks: Int): Boolean {
    return marks > 90
}


class Student {
    fun isPassed(marks: Int): Boolean {
        return marks > 45
    }
}

fun MutableList<Int>.swapTwoNumber(index1: Int, index2: Int): MutableList<Int> {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
    return this
}
