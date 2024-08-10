///Create an Array:
fun arrayOne() {
    val arrayOfNumber = arrayOf(1, 2, 3, 4, 5)
    for (index in arrayOfNumber.indices) {
        //print value used index
        println(arrayOfNumber[index])
    }

    // another way to print value with index
    for ((index, value) in arrayOfNumber.withIndex()) {
        println("The element at $index is $value")
    }

    println("Array reversed ${arrayOfNumber.reversedArray().joinToString()}")

}

fun  immutableList(){
    val listOf = listOf("apple", "banana", "cherry")
   // used indices
    for (index in listOf.indices)
        println(listOf[index])

    //contains
    val contains = listOf.contains("banana")
    println(contains)

    //convert to upper case
    val listUpperCase = listOf.toString().uppercase()
    println(listUpperCase)

}

fun mutableList()
{
    val mutableOfDoubleList = mutableListOf(1.1, 2.2, 3.3)
    mutableOfDoubleList.add(4.4)
    mutableOfDoubleList.remove(2.2)


    mutableOfDoubleList.forEach {action ->
        println(action)
    }


    val sortedArray = mutableOfDoubleList.sorted()
    println(sortedArray.joinToString() )


}


fun map()
{
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val mult = numbers.map { it * 2 }
    println(mult)

    val words = listOf("Kotlin", "is", "a", "great", "language", "to", "learn")

    val longWords = words.filter { it.length > 5 }
    println(longWords)

    val numbersOf = mutableListOf(1.5, 2.0, 3.7, 4.2)
    numbersOf.forEach { number ->
        val squared = number * number
        println(squared)
    }



}

