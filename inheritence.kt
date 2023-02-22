// Open class so it can be inherited from other class
open class Drone
{
    // Open can be modified by inherited child
    open val look:String = "Black and White"

    fun setOff()
    {
        move(0.0,10.0,0.0)
    }

   open fun move(front:Double,up:Double,rotate:Double)
    {
        println("Moving $front $up $rotate")
    }
}

class SuperDrone :Drone()
{
    override val look:String = "Superhero Look"
    override fun move(front:Double,up:Double,rotate:Double)
    {
        println("Supperhero is Moving ")
        super.move(front,up,rotate)
    }
}
fun main()
{
    val drone:Drone = SuperDrone()
    println(drone.look)
    drone.setOff()
    drone.move(10.0,0.0,0.0)
}