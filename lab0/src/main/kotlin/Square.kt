class Square (_length : Double, _width : Double, _name : String) : Shape(_name){
    //name stuff
    var len = 0.0
    var wid = 0.0
    fun setDimensions(_length: Double, _width: Double){
        len = _length
        wid = _width
    }
    override fun printDimensions(){
        println("Length: $len")
        println("Width: $wid")
    }

    override fun getArea(): Double {
        return len * wid
    }

}