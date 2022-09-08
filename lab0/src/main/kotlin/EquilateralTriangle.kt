import kotlin.math.sqrt

class EquilateralTriangle (_side : Double, _name : String) : Shape(_name){
    var sid = 0.0


    fun setDimensions(_side: Double){
        sid = _side
    }

    override fun printDimensions(){
        println("Side: $sid")
    }

    override fun getArea(): Double {
        val s = (sid + sid + sid) * 0.5
        return sqrt(s * (s - sid) * (s - sid) * (s - sid))

    }
}