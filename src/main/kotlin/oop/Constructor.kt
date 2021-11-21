package oop

class Constructor(age: Int, name: String) {
    private var age: Int? = age
    private var name: String? = name

    fun returnStatement(
        callback: (result: String) -> Unit
    ){
        callback("Dear $name, you are $age years old")
    }
}

fun main(args: Array<String>){
    val constructor = Constructor(10, "Evans")

    constructor.returnStatement {  statement ->
        println(statement)
    }
}