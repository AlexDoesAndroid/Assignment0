import kotlin.math.sqrt

class Triangle(_side1 : Double, _side2 : Double, _side3 : Double, _name : String) : Shape(_name) {
    var s1 = 0.0
    var s2 = 0.0
    var s3 = 0.0

    fun setDimensions(_side1: Double, _side2: Double, _side3: Double){
        s1 = _side1
        s2 = _side2
        s3 = _side3

    }

    override fun printDimensions(){
        println("Side 1: $s1")
        println("Side 2: $s2")
        println("Side 3: $s3")
    }

    override fun getArea(): Double {
        val s = (s1 + s2 + s3) * 0.5
        return sqrt(s * (s - s1) * (s - s2) * (s - s3))
    }
}