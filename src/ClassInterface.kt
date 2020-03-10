/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/10/2020.
 */


//interfaces are by default open
interface op{
    fun sum(n1:Int, n2:Int) : Int {return 0}
    fun div(n1:Int, n2:Int)  {println("default sum: "+ n1+n2)} //interface with default implementation
}

class UserOp:op{
    override fun sum(n1: Int, n2: Int): Int {
        return n1+n2
    }

    override fun div(n1: Int, n2: Int) {
        println("div: " + n1/n2)
    }
}

class AdminOp:op{
    override fun sum(n1: Int, n2: Int): Int {
        return n1+n2*4
    }

    override fun div(n1: Int, n2: Int) {
        println("div: " + n1/(n2-2))
    }
}

fun main (args:Array<String>){
    var adminOp = AdminOp()
    adminOp.div(3,4)

    var managerOP = ManagerOp()
    println(managerOP.sum(3,4))
}

class ManagerOp:op{
//kotlin would use the interface default values for the method called
}