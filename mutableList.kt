fun main()
{
    val mutableList = mutableListOf("A","B")
    mutableList.add("C")
    mutableList.add("E")
    mutableList.add(3,"D")  // index , String 
   
    println(mutableList) 
    
    mutableList.remove("E")
    println(mutableList)
}