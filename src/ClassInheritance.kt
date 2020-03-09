/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/9/2020.
 */

open class Operations(){

    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }
}

class MultiOperations():Operations(){



    fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }

    fun mult(n1:Int, n2:Int):Int{
        return n1*n2
    }
}

fun main(args:Array<String>){

    var op = Operations()
    var sum=op.sum(10,15)
    println("sum: "+ sum)
    var div = op.div(12,11)
    println("div: "+div)

    var op2=MultiOperations()
    sum=op2.sum(10, 15)
    println("sum: "+ sum)
    div = op2.div(12,11)
    println("div: "+div)
    var mult=op2.mult(10, 15)
    println("multi: "+ mult)
    var sub = op2.sub(12,11)
    println("div: "+sub)

}