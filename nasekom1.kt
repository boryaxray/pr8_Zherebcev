fun main(){
    try {
       val nam=Nasekomie(manufacture = "")
        nam.Input(nasekomie = Nasekomie(manufacture = ""))
      if(nam.speed<=0.0)
      {
          nam.Output1()
      }
        else nam.Output()
    }catch (e:Exception){ println("Неверный ввод")}
}