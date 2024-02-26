class Nasekomie(var manufacture: String) {
   var name="Муха"
    var speed = 0.0
    var color = "Красный"
    var eat = "Кровь"
    var life = "Лес"
    var ves=100.0
    var ves2=100.0
    var wings=1
    var wings2="Да"
    var metres=100.0
    var time=1
    var fly="Летает"
    fun Input(nasekomie: Nasekomie) {
        try {
            println("Введите название насекомого ")
            name= readLine()!!.toString()
            println("Введите скорость передвижения(м/с) ")
            speed = readLine()!!.toDouble()
            println("Введите окрас насекомого ")
            color = readLine()!!.toString()
            println("Введите пищу насекмого ")
            eat = readLine()!!.toString()
            println("Введите среду обитания насекомого ")
            life = readLine()!!.toString()
            println("Есть ли у насекомого крылья?(1-да,2-нет) ")
            wings = readLine()!!.toInt()
            println("Введите вес насекмого(граммы) ")
            ves = readLine()!!.toDouble()
            println("Введите сколько съел граммов насекомое ")
            ves2=readLine()!!.toDouble()
            println("Сколько секунд шло/летело насекомое? ")
            time=readLine()!!.toInt()
        } catch (e: Exception) {
            println("Неверный ввод")
        }
    }
    fun Ves(){
        ves+=ves2
    }
    fun Fly()
    {
        if(wings==1) {
           fly="Насекомое летает"
            wings2="Крылья есть"
        }else if (wings==0){
            fly="Насекомое не летает"
            wings2="Крыльев нет"
        }else println("Введите либо 1,либо 2!")
    }
    fun Metres(){
        metres=speed*time
    }

    fun Output() {
        println("\nНазвание ${name} " +
                "\nCкорость ${speed} " +
                "\nОкрас ${color} " +
                "\nПища ${eat} " +
                "\nСреда обитания ${life}" +
                "\nВес насекмого ${ves}" +
                "\nВес после приема пищи ${ves} " +
                "\n${wings2}" +
                "\n${fly}" +
                "\nЗа ${time} секунд насекомое преодолеет ${metres} метров")
    }
    fun Output1() {
        println("Данные введены неверно")
    }
}