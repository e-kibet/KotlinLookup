package basicconcepts

fun main(args: Array<String>){
    println("Please enter you age? ")

    /**
     * input is always string by default so we need to convert it into integer, character, or double
     */
    val age = readLine()!!.toInt() //readLine is going to get depreciated from version 1.6 instead:

    /**
     * version 1.6 introduces the readLn and readLnOrEmpty
     */
    println("You are is $age")
}