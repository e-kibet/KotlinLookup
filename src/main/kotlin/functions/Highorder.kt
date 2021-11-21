package functions

/**
 * returning function or accepting the function as an argument
 */
fun main(args: Array<String>){
    rollDice(1..6, 4) { result -> //outside trailing the lambda
        println(result)
    }

    sum(10, 10){ sum ->
        print("sum of two numbers: $sum")
    }
}

fun rollDice(
    range: IntRange,
    time: Int,
    callback: (result: Int) -> Unit
){
    for(i in 0..time){
        val result =    range.random()
        callback(result)
    }
}

fun sum(
    firstNum: Int,
    secondNum: Int,
    callback: (result: Int) -> Unit
){
    val sum = firstNum + secondNum
    callback(sum)
}