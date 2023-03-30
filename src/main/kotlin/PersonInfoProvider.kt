interface PersonInfoProvider {
    val name : String
    fun printSomething()
    fun printHere(){
        println("Printing here...")
    }

}

interface SessionInfoProvider{
    val sessionId : String
}

class ones : SessionInfoProvider{
    override val sessionId: String
        get() = "string"

}

class BasicInfoProvider(override val name: String, override  val sessionId: String) : PersonInfoProvider , SessionInfoProvider{
    init {
        println(name)
    }

    override fun printSomething() {
        println("printing Something")
    }

    override fun printHere() {
        super.printHere()
        println("Another printing here...")
    }
}

fun main() {
    val basicInfoProvider = BasicInfoProvider("Ranjith" , "123")
    basicInfoProvider.printHere()
    basicInfoProvider.printSomething()


}
