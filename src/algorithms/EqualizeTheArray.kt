package algorithms

import java.util.*

fun equalizeArray(arr: Array<Int>): Int {
    //Group the elements by number of occurrence
    val numbersByElement = arr.groupingBy { it }.eachCount()

    //then find the most occurring element
    val mostOccurringKey = numbersByElement.maxBy { it.value }?.key

    var deletions = 0
    //finally loop through other elements occurrence count while adding them to counter
    for (items in numbersByElement) {
        if (items.key != mostOccurringKey) {
            deletions += items.value
        }
    }
    return deletions

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    //val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = equalizeArray(arr)
    println(result)
}
