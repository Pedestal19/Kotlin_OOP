/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/10/2020.
 */

abstract class CreditCard(){
    fun CreditID():String{
        return "123456"
    }

    abstract fun newCredit();
}

class UserInfo():CreditCard(){

    fun getInfo():String{
        return CreditID();
    }

    override  fun newCredit(){
        println("new card created")
    }
}

fun main(args:Array<String>){

    //var credit = CreditCard() //cannot call an abstract class directly
    //println(credit.CreditID())
    var user=UserInfo()
    println(user.getInfo())

}