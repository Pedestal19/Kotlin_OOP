import java.util.*

/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/11/2020.
 */

class Person(var name:String, var age:Int): Comparable<Person>{



    override fun compareTo(other: Person): Int{
//        return this.age - other.age   ascending order
        return other.age - this.age //descending order

    }
}

fun main(args:Array<String>){

    var listOfNames= ArrayList<Person>()

    listOfNames.add(Person("Moninseh", 5))
    listOfNames.add(Person("Hosanna", 28))
    listOfNames.add(Person("Tommy", 11))

    println("before sort")
    for(person in listOfNames){
        println("Name: "+person.name)
        println("age: "+person.age)
    }

    println("after sort")
    Collections.sort(listOfNames)

    for(person in listOfNames){
        println("Name: "+person.name)
        println("age: "+person.age)
    }

}