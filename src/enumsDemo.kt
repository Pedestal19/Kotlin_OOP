/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/10/2020.
 */

enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main(args:Array<String>){

    var userdirect=Direction.SOUTH

    if(userdirect==Direction.NORTH){
        println("He Went North")
    }else{
        println("I dont know where he went")
    }
}