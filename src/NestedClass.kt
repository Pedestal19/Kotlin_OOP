/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/11/2020.
 */

class Outer{

    private val name:String?=null

    inner class Nested{

        fun Show(){
            println(name)
        }

    }
}

fun main(args:Array<String>){

    var outer=Outer()
    var nested=Outer().Nested()
    nested.Show()

}