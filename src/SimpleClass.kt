/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/8/2020.
 */

class Car(var type:String, var model:Int, var price:Double, var milesDrive:Int, var owner:String) {

    init {
        println("class is created\n type: $type")
        println("model: $model")
        println("price: $price")
        println("milesDrive: $milesDrive")
        println("owner: $owner")

    }

    fun getCarPrice():Double{
        return this.price - (this.milesDrive.toDouble() * 10)
    }

}

fun main(args:Array<String>){

    val hosannaCar = Car("BMW", 2015,10000.05, 450, "Hosanna")
    println("Hosanna Car: "+hosannaCar.model +" "+ hosannaCar.getCarPrice())
    val moninsehCar = Car("Kia", 2019, 23000.45,10, "Moninseh")

}