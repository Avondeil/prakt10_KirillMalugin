fun main()
{
    try {
        var Plata: Plata = Plata(true, "Мотив", 6, 5.0)
        Plata.Plat()
        Plata.Info()
        var Plata2: Plata = Plata(true, "МТС", 15, 8.0)
        Plata2.Plat()
        Plata2.Info()
    }
    catch (e:Exception)
    {
        println("Ошибка при вводе данных")
    }
}