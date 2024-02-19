fun main(){
    try {
        val avt=avto(manufacture = "")
        avt.Input(avto=avto(manufacture = ""))
        if (avt.hp>0)avt.Output()
        else avt.Output1()
    }catch (e:Exception){ println("Неверный ввод")}
}