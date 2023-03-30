import java.lang.StringBuilder

fun main() {
    val values = arrayListOf<Int>(1,2,3,4,5,6)
//    println(values.toString())
//    for (a in values)
//        println(a)
//    values.forEach { println(it) }
    println("This is array list values $values")

//    for ( i in 0 until values.size)
//        println(values[i])
    val stringValue = values.plus(values)
    println(stringValue)
    val builder:StringBuilder = StringBuilder("this is working and it is a arrayList ").append(values.toString())
    println(builder)
}



