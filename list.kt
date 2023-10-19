//  Basic Collection Type Order list  

fun main()
{
    val items = listOf("Bread","Milk","Yogurt","Tea","Chicken")
    println(items)
    println("the items are $items")
    println("there are total ${items.size}")


    for (item in items)
    {
        println(item)
    }


    // List not change able 
    // but can create new list from it and add or remove items by simple + -
    val itemsList = items - "Chicken" + "Rice"
    println(itemsList)
    println(itemsList.contains("Rice"))
    println("Rice" in itemsList)
}