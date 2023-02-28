class Plata(Plata1: Boolean,nameoper1:String, S1:Int, onemin1:Double) :Operator(Plata1,nameoper1,S1,onemin1)
{
    fun Plat()
    {
        print("Присутствует ли плата за соединение? 1-Да, 2-Нет: ")
        var Pris= readLine()!!.toInt()
        if (Pris==1)
        Plata=true;
        else if (Pris==2)
        Plata=false
        else
        {println("Ошибочный ввод данных, выставлен режим отсутствия платы за соединение"); Plata=false;}

    }
    var Qp1:Double=0.0
    override fun Qp():Double
    {
        if (Plata)
        Qp1=0.7*Q()
        else Qp1=1.5*Q()
        return Qp1
    }
}
