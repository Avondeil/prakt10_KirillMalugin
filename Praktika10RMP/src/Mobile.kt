abstract class Mobile():hf {
    abstract var S:Int
    abstract var nameoper:String
    abstract var Plata:Boolean;
    abstract var onemin:Double
    abstract fun Q(): Double
    abstract fun Qp():Double;
    override fun Info()
    {
        println("Оператор: $nameoper, Стоимость минуты: $onemin, Площадь покрытия: $S, Q=${Q()}, Qp=${Qp()}")
    }

}