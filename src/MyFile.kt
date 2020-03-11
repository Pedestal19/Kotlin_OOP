import java.io.FileWriter

/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_OOP.
 *Date: 3/11/2020.
 */

fun main(args:Array<String>){

    print("Write to file text: ")
    var str:String=readLine().toString()
    WriteToFile(str)
}

fun WriteToFile(str:String){

    try {
        var fo = FileWriter("test.txt", true)
        fo.write(str+ "\n")
        fo.close()
    }
    catch(e:Exception){
        println(e.message)
    }
}