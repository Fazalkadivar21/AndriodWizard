//I wrote this because I didn't find it anywhere all at once (maybe I didn't searched enough)
//matrix is commonly used for DSA questions so I thought you should know how to handle them in Kotlin
fun main() {
    //static arrays
    var oneD = Array(2) { it + 1 }
    println(oneD.contentToString())
    var twoD = Array(2) { row ->
        Array(2) { col ->
            row + col + 1
        }
    }
    for (i in twoD) {
        println(i.contentToString())
    }
    // with user input
    oneD = Array(2) { el ->
        print("enter $el value : ")
        readln().toInt()
    }
    for (el in oneD) {
        println(el)
    }
    twoD = Array(2) { row ->
        Array(2) { col ->
            print("enter ele array[$row],[$col] : ")
            readln().toInt()
        }
    }
    for (row in twoD) {
        println(row.contentToString())
    }
}