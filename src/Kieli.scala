object Kieli {

  def lue(): Int = {
    readInt
  }
  
  def kirjoita(param: => Any) = println(param)
  
  def  jos(param: => Boolean)(expression: => Unit) = {
    if (param) {
      expression
    }
  }
  
  def  toista(param: => Int)(expression: => Unit) = {
    for	(i <- 0 until param) expression
  }
    
  def toistaEhdolla(param: => Boolean)(expression: => Unit) = {
    while(param) expression
  }  
}