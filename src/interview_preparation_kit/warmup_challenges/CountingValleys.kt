package interview_preparation_kit.warmup_challenges

import java.util.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    val steps = s.split("")
    steps
    var level = 0
    var numberOfValleys = 0
    var currentTrend = "flat"
    for (step in steps) {
        if (step == "D") {
            level -= 1
            currentTrend = "downwards"
        } else if (step == "U") {
            level += 1
            if (level == 0) {
                numberOfValleys += 1
            }
        } else {
            //do nothing
        }

    }
    return numberOfValleys
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
