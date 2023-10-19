fun main()
{
    val s:String = "HelloWorld"
    try
    {
        println(s[20])
    }
    // Throwable or Exception both can be used 
    catch(e : Throwable)
    {
        println(e.message)
    }
    // catch(e : Exception)
    // {
    //     println(e.message)
    // }
    finally
    {
        println("Always printed")
    }
}

