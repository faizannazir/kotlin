fun main() {
    val map: MutableMap<Char, String> = mutableMapOf('A' to "Alex", 'B' to "Bob")
    map.put('C', "Celina")
    map['D'] = "Daria"
    println(map) // {A=Alex, B=Bob, D=Daria, C=Celina}
    map.remove('B')
    println(map) // {A=Alex, D=Daria, C=Celina}

    //  Donot allow duplicate key overridden old value of key
    val m = mapOf('a' to "Alex", 'a' to "Anna")
    print(m)
}