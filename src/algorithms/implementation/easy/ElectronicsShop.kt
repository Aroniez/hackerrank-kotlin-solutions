package algorithms.implementation.easy

import java.util.*

/***
 * Challenge >===> https://www.hackerrank.com/challenges/electronics-shop/problem
 * */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    //create an empty list for storing all spending <= budget
    val spending: ArrayList<Int> = arrayListOf()

    //loop through both keyboards and drives while adding the total required on pairs
    for (keyboard in keyboards) {
        for (drive in drives) {
            if ((keyboard + drive) >= b) {
                spending.add((keyboard + drive))
            }
        }
    }
    //if the list is empty then it means any combination of keyboard and drive costs more than budget
    //thus we return -1. Else, we simply return max value to spend
    return if (spending.isEmpty()) {
        -1
    } else {
        spending.max()!!
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}