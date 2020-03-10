/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/10/2020.
 */

class UserAdmins<T>(credit:T){

    init{
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args:Array<String>){

    var userAdmin = UserAdmins<String>("Hosanna")
    var userAdminInt = UserAdmins<Int>(22)
    var userAdminDouble = UserAdmins<Double>(14.22)

    display<Int>(94)
    display("Gabe")

}