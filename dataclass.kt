// class Dog(val name: String)
// {
//     init{
//         println("Constructor is called ")
//         println("Dog name is ${this.name}")
//     }

// }

// fun main()
// {
//     val dog  = Dog("Pluto")
   
// }

// class Dog(
// val name: String
// )

// fun main() {
// val pluto1 = Dog("Pluto")
// val pluto2 = Dog("Pluto")

// println(pluto1 == pluto2) // false
// println(pluto1 == pluto1) // true

// println(pluto1) // Dog@404b9385
// println("Dog: $pluto1") // Dog: Dog@404b9385
// }

data class Dog(
val name: String
)

fun main() {
val pluto1 = Dog("Pluto")
val pluto2 = Dog("Pluto")
val rex = Dog("Rex")

println(pluto1 == pluto2) // true
println(pluto1 == pluto1) // true
println(pluto1 == rex) // false
}