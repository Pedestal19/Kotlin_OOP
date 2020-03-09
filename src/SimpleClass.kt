/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/8/2020.
 */

class Car() {

    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null

    constructor(type:String, model:Int, price:Double, milesDrive:Int, owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
        println("constructor1")
    }

    constructor(owner:String):this(){
        this.owner=owner
        println("constructor2")
    }

    init {
        /*println("class is created\n type: $type")
        println("model: $model")
        println("price: $price")
        println("milesDrive: $milesDrive")
        println("owner: $owner")*/

    }

    fun getCarPrice():Double{
        return this.price!! - (this.milesDrive!!.toDouble() * 10)
    }

}

fun main(args:Array<String>){

    val hosannaCar = Car("BMW", 2015,10000.05, 450, "Hosanna")
    println("Hosanna Car: "+hosannaCar.model +" "+ hosannaCar.getCarPrice())
    val moninsehCar = Car("Kia", 2019, 23000.45,10, "Moninseh")
    println("moninseh Car: "+moninsehCar.model +" "+ moninsehCar.getCarPrice())
    val tommyCar = Car("tommy")
//    tommyCar.getCarPrice() can't call this because it has no value for this
}