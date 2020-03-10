/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/11/2020.
 */

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
