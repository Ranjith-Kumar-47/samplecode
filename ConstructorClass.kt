class ConstructorClass (val a:Int,val b:Int) {
    constructor(asdf:Int,asddf:Int){
        println("this is secondary constructor")
    }
}

fun main() {
    println("this is main method")
    ConstructorClass(24,24)
}