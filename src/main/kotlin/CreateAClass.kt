
class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100


    fun printSize() {
        println("Width: $width cm " +
                "Height: $height cm " +
                "Length: $length cm ")
    }

}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}

fun main() {
    buildAquarium()

}