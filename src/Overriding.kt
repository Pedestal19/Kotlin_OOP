/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/9/2020.
 */

open class Operations1(Name:String){
    var ProcessName:String?=null
    open fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }
}

class MultiOperations1:Operations1{

    constructor(): super("Default"){

    }

    var t:Int?=null

    override fun sum(n1:Int, n2:Int):Int{
        this.t=22               //calling var from this class
        this.sub(1,2)  //calling fun from this class
        super.div(4,1) //calling div from super--parent class
        super.sum(6, 9)//calling sum from super--parent class
        return n1+n2*3
    }

    fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }

    fun mult(n1:Int, n2:Int):Int{
        return n1*n2
    }

    fun GetName(){
        super.ProcessName
    }
}

fun main(args:Array<String>){

    var op = Operations1("Pedestal")
    var sum=op.sum(10,15)
    println("sum: "+ sum)
    var div = op.div(12,11)
    println("div: "+div)

    println("op.ProcessName "+op.ProcessName)

    var op2=MultiOperations1() as Operations1
    sum=op2.sum(10, 15)
    println("sum: "+ sum)
    div = op2.div(12,11)
    println("div: "+div)
//    var mult=op2.mult(10, 15)
//    println("multi: "+ mult)
//    var sub = op2.sub(12,11)
//    println("div: "+sub)

    //public can be accessed through inherited class and can be read through an instance
    //protected is same as public but cannot be read through an instance
    //private is only visible to the class
}