package functions

fun main(args: Array<String>){
    val sum = sum(10, 30)

    println("sum of two numbers: $sum")
}

fun sum(x: Int, y: Int): Any {
    return x + y;
}