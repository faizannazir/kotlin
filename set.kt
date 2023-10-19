// Unorder collection type with no repeat values 

fun main() {
    val set = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
    println(set.size) // 3

    val ints: Set<Long> = setOf(1L, 2L, 3L)
    println(ints) // [1, 2, 3]

    val newset = setOf('A', 'B')
    println(newset + 'C') // [A, B, C]
    println(newset + setOf('C', 'D')) // [A, B, C, D]
    println(setOf('Z') + newset) // [Z, A, B]
    println(newset.isEmpty()) // flase
}