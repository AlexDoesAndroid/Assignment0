class Circle(_radius : Double, _name : String) : Shape(_name) {
    var rad = 0.0

    fun setDimensions(_radius: Double){
        rad = _radius
    }

    override fun printDimensions(){
        println("Radius: $rad")
    }

    override fun getArea(): Double {
        return (3.14 * rad) * (3.14 * rad)
    }
}