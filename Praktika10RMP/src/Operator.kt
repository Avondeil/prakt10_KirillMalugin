open class Operator(var Plata1:Boolean, var nameoper1:String, var S1:Int, var onemin1:Double):Mobile(){
    override var Plata=Plata1;
    override var nameoper:String=nameoper1
    override var S=S1
    override var onemin=onemin1
    override fun Q():Double
    {
        var Q=100*S/onemin
        return Q
    }
    override fun Qp():Double
    {
        return 0.0;
    }
}