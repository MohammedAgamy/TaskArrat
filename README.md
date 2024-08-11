# Kotlin Array and List Operations
* This repository showcases various Kotlin operations on arrays and lists, including filtering, mapping, sorting, and more. The examples cover both mutable and immutable collections, demonstrating core Kotlin functionality.

## Overview 
This project includes several Kotlin functions that perform common operations on arrays and lists. You'll find examples of:

* Iterating over arrays and lists
* Reversing and filtering arrays
* Adding and removing elements from mutable lists
* Using higher-order functions like map, filter, any, none, all, and find

## Code Examples
### Array Operations


   ```ruby
   fun arrayOne() {

    // Declare an array of integers with the values [1, 2, 3, 4, 5].
    val arrayOfNumber = arrayOf(1, 2, 3, 4, 5)

    // Use a loop to iterate through the array and print each value using withIndex.
    for (index in arrayOfNumber.indices) {
        //print value used index
        println(arrayOfNumber[index])
    }

    // another way to print value with index
    for ((index, value) in arrayOfNumber.withIndex()) {
        println("The element at $index is $value")
    }

    /*Reverse the array and print the reversed array. */
    println("Array reversed ${arrayOfNumber.reversedArray().joinToString()}")


    //Use the filter function to create a new list from the array that contains only even numbers. Print the new list.
    val filterList = arrayOfNumber.filter { it % 2 == 0 }
    println("even number = $filterList")

}
   ```

#### Result 
  <img src ="https://github.com/MohammedAgamy/TaskArray/blob/master/11.jpg">

  

### Immutable List Operations

   ```ruby
  fun immutableList() {

    // Declare an immutable list of strings with the values ["apple", "banana", "cherry"].
    val listOf = listOf("apple", "banana", "cherry")

    // Use a loop to iterate through the list and print each value using indices.
    for (index in listOf.indices)
        println(listOf[index])

    //Use the contains operator to check if the list contains the element "banana" and print the result.
    val contains = listOf.contains("banana")
    println("list contains a  $contains")

    //Convert the list to uppercase and print the modified list.  
    val listUpperCase = listOf.toString().uppercase()
    println("convert to upper case $listUpperCase")

}

   ```

#### Result 
  <img src ="https://github.com/MohammedAgamy/TaskArray/blob/master/12.jpg">


### Mutable List Operations

   ```ruby
 

fun mutableList() {
   //Declare a mutable list of doubles with the values [1.1, 2.2, 3.3].
    val mutableOfDoubleList = mutableListOf(1.1, 2.2, 3.3)

    //Add the value 4.4 to the mutable list.
    mutableOfDoubleList.add(4.4)

    //Remove the value 2.2 from the mutable list.
    mutableOfDoubleList.remove(2.2)

    //Use a loop to iterate through the mutable list and print each value with for each.
    mutableOfDoubleList.forEach { action ->
        println("Double of mutable list = $action")
    }

    //Sort the mutable list in ascending order and print the sorted list.  
    val sortedArray = mutableOfDoubleList.sorted()
    println(" array after sort ${sortedArray.joinToString()}")


}


   ```
#### Result 
  <img src ="https://github.com/MohammedAgamy/TaskArray/blob/master/13.jpg">


  ### operators

   ```ruby
 
fun operators() {
    //Use the map operator to create a new list from the array where each value is multiplied by 2. Print the new list.
    val numbers = arrayOf(1, 2, 3, 4, 5).map { it * 2 }
    println("multiplied list = $numbers")

    // Use the filter operator to create a new list from the original list of strings that only contains strings with more than 5 characters. Print the new list.
    val words = listOf("Kotlin", "is", "a", "great", "language", "to", "learn")
    val longWords = words.filter { it.length > 5 }
    println("longWord = $longWords")

    // Use the any function to check if there is any element in the list of strings that starts with 'a'. Print the result.
    val any = words.any { it.first() == 'a' }
    println("any words starts with a = $any")

    //Use the forEach loop to iterate through the modified mutable list of doubles and print each value squared.  
    val numbersOf = mutableListOf(1.5, 2.0, 3.7, 4.2)
    numbersOf.forEach { number ->
        val squared = number * number
        println(" result of squared = $squared")
    }


}



   ```
#### Result 
  <img src ="https://github.com/MohammedAgamy/TaskArray/blob/master/14.jpg">


  ### additionalFunctions

   ```ruby

fun  additionalFunctions()
{
    val numbersOf = mutableListOf(1.5, 2.0, 3.7, 4.2)
    //Use the none function to check if none of the elements in the array are negative. Print the result. 
    val nonNegative = numbersOf.none {
        it < 0
    }
    println("Non Negative = $nonNegative")

    // Use the all function to check if all the elements in the mutable list are greater than 1. Print the result. 
    val greaterThan = numbersOf.all {
        it > 1
    }
    println("Number greater than 1 = $greaterThan")

    //Use the find function to find the first element in the array that is greater than 3. Print the result.
    val checkFirst = numbersOf.find {
        it > 3
    }
    println("First is greater than 3 = $checkFirst")


    //Use the filter function to create a new list from the array that contains only even numbers. Print the new list.
    // convert it from Double to int to use condition
    val filterList = numbersOf.filter { it.toInt() % 2 == 0 }
    println("even number = $filterList")
}


   ```
#### Result 
  <img src ="https://github.com/MohammedAgamy/TaskArray/blob/master/15.jpg">

  ## Call in Main 
  
  ```ruby

fun main(args: Array<String>) {

    //Create an Array:
    arrayOne()
    //Create a List:
    immutableList()
    //Create a Mutable List:
    mutableList()
    //operators
    operators()
    //additionalFunctions
    additionalFunctions()

}
   ```
  
