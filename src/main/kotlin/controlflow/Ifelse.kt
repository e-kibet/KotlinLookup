package controlflow

fun main(args: Array<String>){

    println("Please enter your age?")

    val age = readLine()!!.toInt()

    val statement = if (age < 18) "You are a king of age: $age" else  "You are an adult of age: $age"

    println(statement)

}