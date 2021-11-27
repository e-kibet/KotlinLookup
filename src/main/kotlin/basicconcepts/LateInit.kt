package basicconcepts


class LateInit{
    lateinit var studentName: String

    fun initializeName(){
        /**
         * check if the var studentName is initialize
         */
        println(this::studentName.isInitialized)

        studentName = "ekibet"//set the value at this point

        println(this::studentName.isInitialized)
    }
}

fun main(){
    LateInit().initializeName()
}
