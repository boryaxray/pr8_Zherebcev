fun main(){
    try {
       val nam=Nasekomie(manufacture = "")
        nam.Input(nasekomie = Nasekomie(manufacture = ""))
        nam.Ves()
        nam.Fly()
        nam.Metres()
      if(nam.speed<=0.0)
      {
          nam.Output1()
      }
        else nam.Output()
    }catch (e:Exception){ println("Неверный ввод")}
}