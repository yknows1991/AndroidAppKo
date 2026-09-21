
class Road{
  //default constructor
    var name: String = ""
    var length: Double = 0.0
    var location: String = ""

    constructor(name: String) {
        this.name = name
    }
    constructor(length: Double, location: String) {
        this.length = length
        this.location = location
    }
    fun display() {
        println("Road name: $name")
        println("Road Length: $length")
        println("Location: $location")
    }
}

class Stores(
    var name: String,
    var owner: String,
    var address: String,
){
    //parameterized cons / pri- const
    fun displayInfo(){
        println("Road name: $name")
        println("Road Length: $owner")
        println("Location: $address")
    }

}


fun main(){
   // var road = Road("R.Martinez")
    var road2 = Road(500.00, "Nasugbu")
    road2.display()

    var store = Stores("Aling Coring", "Korina", "Sa kanto")
    store.displayInfo()
}