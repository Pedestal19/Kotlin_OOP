import java.util.*

/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/10/2020.
 */

fun ArrayList<String>.swap(index1:Int, index2:Int){
    var temp=this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, temp)
}

fun main(args:Array<String>){

    var arrayList=ArrayList<String>();
    arrayList.add("Hosanna")
    arrayList.add("Gabe")
    arrayList.add("Oji")
    arrayList.swap(0,1);
    arrayList.swap(1,2);
    println(arrayList)

}