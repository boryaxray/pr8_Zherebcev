class avto(var manufacture: String) {
    var marka="BMW"
    var model="M5"
    var year=2017
    var hp=231
    var price=8964500
    var nalog=5000!!.toInt()
    var kuzov="Седан"
    var rem=100.0
    var price2=100.0
    fun Input(avto: avto) {
        try {
            println("Введите марку машины")
            marka= readLine()!!.toString()
            println("Введите модель машины")
            model= readLine()!!.toString()
            println("Введите год выпуска машины")
            year= readLine()!!.toInt()
            println("Введите лошадинные силы машины")
            hp= readLine()!!.toInt()
            println("Введите стоимость машины")
            price= readLine()!!.toInt()
            println("Введите тип кузова машины")
            kuzov= readLine()!!.toString()
        } catch (e: Exception) {
            println("Неверный ввод")
        }
    }
    fun Nalog(){
        when (hp) {
            in 0..100 -> nalog = 12 * hp
            in 101..125-> nalog=25*hp
            in 126 .. 150 ->nalog=35*hp
            in 151..175->nalog=45*hp
            in 176..200->nalog=50*hp
            in 201 ..225->nalog=65*hp
            in 226..250->nalog=75*hp
            in 251..99999->nalog=150*hp
        }
    }
    fun Remont(){
        rem=price*0.05
    }
    fun Price2(){
        price2= price.toDouble()
        price2-=price*0.13
    }
    fun Output() {
        println("Марка ${marka}" +
                "\nМодель ${model}" +
                "\nГод выпуска ${year}" +
                "\nМощность(л.с.) ${hp}" +
                "\nНалог(в год, в рублях) ${nalog}" +
                "\nСтоимость ${price}" +
                "\nКузов ${kuzov}" +
                "\nРемонт ${rem}" +
                "\nЦена данной машины через год: ${price2}")
    }

    fun Output1() {
        println("Данные введены неверно")
    }
}
