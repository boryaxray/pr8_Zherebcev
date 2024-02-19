class Nasekomie(var manufacture: String) {
   var name="Муха"
    var speed = 0.0
    var color = "Красный"
    var eat = "Кровь"
    var life = "Лес"
    var ves=100.0
    fun Input(nasekomie: Nasekomie) {
        try {
            print("Введите название насекомого ")
            name= readLine()!!.toString()
            print("Введите скорость передвижения(м/с) ")
            speed = readLine()!!.toDouble()
            print("Введите окрас насекомого ")
            color = readLine()!!.toString()
            print("Введите пищу насекмого ")
            eat = readLine()!!.toString()
            print("Введите среду обитания насекомого ")
            life = readLine()!!.toString()
            print("Введите вес насекмого(граммы) ")
            ves = readLine()!!.toDouble()
        } catch (e: Exception) {
            println("Неверный ввод")
        }
    }
    fun Output() {
        println("Название ${name}\nCкорость ${speed}\nОкрас ${color}\nПища ${eat} \nСреда обитания ${life} \nВес насекмого ${ves}  ")
    }
    fun Output1() {
        println("Данные введены неверно")
    }
}