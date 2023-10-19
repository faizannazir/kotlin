fun main() {
    val pair = Triple(1F, "ABC", true)
    println(pair.first) // 1.0
    println(pair.second) // ABC
    println(pair.third) // true
    val (number, letters, boolean) = pair
    // the type of number is Double
    // the type of letters is Char
    // the type of boolean is Boolean
    println(number) // 1.0
    println(letters) // ABC
    println(boolean) // true
    }