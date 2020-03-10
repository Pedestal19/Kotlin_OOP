import com.example.cars.MyCar

/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/10/2020.
 */

/*
class CarWithCons(){

    var name:String?=null
    var year:Int?=null
    var cost:Double?=null
    var mileage:Double?=null
    var owner:String?=null

    constructor(name:String, year:Int, cost:Double, mileage:Double, owner:String):this(){
        this.name = name
        this.year = year
        this.cost = cost
        this.mileage = mileage
        this.owner = owner
    }
}
*/

fun main(args:Array<String>) {

    var hosannaCar = CarWithCons("Audi R8", 2021, 13000.0, 12.3, "Tommy")
    println("Get Owner: "+ hosannaCar.name)
    println("Get Mileage: "+hosannaCar.mileage)

    var zannaCar = CarWithCons("AI - Sleek", 2036, 87000.0, 4.8, "Tomford")
    println("Get Owner: "+ zannaCar.name)
    println("Get Mileage: "+zannaCar.mileage)

    var myclass= MyCar()

}