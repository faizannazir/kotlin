enum class PaymentMethod
{
    CASH,
    CARD,
    CHECK
}


fun pay( amount:Double, method:PaymentMethod): Boolean
    {
        return when(method)
        {
            PaymentMethod.CASH -> payWithCash(amount)
            PaymentMethod.CARD -> payWithCard(amount)
            PaymentMethod.CHECK -> payWithCheck(amount)
        }
    }
    
    fun payWithCard(amount:Double): Boolean
    {
        println("${amount} paayed with card")
        return true
    }

    fun payWithCash(amount:Double): Boolean
    {
        println("${amount} paayed with cash")
        return true
    }

    fun payWithCheck(amount:Double): Boolean
    {
        println("${amount} paayed with check")
        return true
    }

fun main()
{

    val pay = pay(123.0,PaymentMethod.CARD)

    println(pay)
}