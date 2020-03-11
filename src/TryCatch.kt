/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/11/2020.
 */

fun main(args:Array<String>){

    try {
        print("enter N2: ")
        var n2: Int = readLine()!!.toInt()
        var Div = 10 / n2

        println("DIV:$Div")
    }catch(ex: Exception) {
        println("app is done")
    }

}