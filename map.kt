//  Collection of key value pair 
fun main() {
    val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}

       val countries = mapOf(
           Pair("Washington", "USA"),
           Pair( "Warsaw","Poland"),
           Pair("Kyiv","Ukraine" )
       )
       println(countries)

       val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)

       println(alphabet) // {A=1, B=2, C=3}


       println(alphabet['B']) // 2
       println(alphabet['&']) // null
       println(alphabet.size) // 3


       val map = mapOf('A' to "Alex", 'B' to "Bob")
       for (entry in map) {
           println("${entry.key} is for ${entry.value}")
       }

       for ((letter, name) in map) {
        println("$letter is for $name")
    }
}    