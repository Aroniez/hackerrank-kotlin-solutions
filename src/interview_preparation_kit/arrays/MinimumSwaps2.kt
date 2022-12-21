package interview_preparation_kit.arrays

/**
 * Minimum Swaps 2 - Meduim - Problem Solving (Intermediate)
 *
 * You are given an unordered array consisting of consecutive integers
 * [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements.
 * Find the minimum number of swaps required to sort the array in ascending order.
 */

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the minimumSwaps function below.
fun minimumSwaps(arr: Array<Int>): Int {
    var count = 0
    var i = 0
    val n = arr.size
    while (i < n) {
        //goal is to get each number to it's correct index,
        //which is the number's value minus one to account for index 0
        var correctIndex = arr[i]-1
        //If the index isn't correct
        if (arr[i] != arr[correctIndex]) {
            //Swap it with the number at it's correct index
            arr[i] = arr[correctIndex].also { arr[correctIndex] = arr[i] } //kotlin swap function [https://stackoverflow.com/questions/45377802/swap-function-in-kotlin]
            //add to count to account for the swap
            count+=1
        } else {
            //If number is at correct index, move to next index and re-check
            i+=1
        }
    }
    //Once all numbers are at the correct index, return total count
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val res = minimumSwaps(arr)

    println(res)
}
