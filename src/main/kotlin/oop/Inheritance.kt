package oop


open class User(var name: String, var age: Int){

}

class Admin(name: String, age: Int): User(name, age){

}

class Moderator(name: String, age: Int, var country: String): User(name, age){

}

fun main(){
    val moderator = Moderator("ekibet", 23, "Kenya")

    println(moderator.country)
}
