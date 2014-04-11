class MinSek (private var min: Int, private var sek: Int) {
  
  var tmpsek = min*60 + sek;
  min = tmpsek/60
  sek = tmpsek%60
  
  def this() {
    this(0,0);
  }
  
  def this(sek: Int) {
    this(0,sek)
  }
  
  def getMin() = min;
  def getSek() = sek;
  
  def +(arvo: MinSek) = {
  new MinSek(min + arvo.getMin, sek + arvo.getSek)
  }
  
  def -(arvo: MinSek) = {
  new MinSek(min - arvo.getMin, sek - arvo.getSek)
  }
  
  def *(arvo: Int) = {
    new MinSek(min*arvo,sek*arvo);
  }
  
  def / (arvo: Int) = {
    var tmpsek = min*60 + sek;
    new MinSek(tmpsek/arvo)
  }
  
  def unary_-() = {
    var tmpsek = min*60 + sek;
    new MinSek(tmpsek * -1);
  }
  
  def +=(arvo: MinSek) {
    var tmpsek = min*60 + sek;
    var tmpsek2 = arvo.getMin*60 + arvo.getSek;
    tmpsek += tmpsek2;
    min = tmpsek/60
    sek = tmpsek%60
    }
  
  def -=(arvo: MinSek) {
    var tmpsek = min*60 + sek;
    var tmpsek2 = arvo.getMin*60 + arvo.getSek;
    tmpsek -= tmpsek2;
    min = tmpsek/60
    sek = tmpsek%60
    }
  
  def +=(arvo: Int) {
    var tmpsek = min*60 + sek + arvo;
    min = tmpsek/60
    sek = tmpsek%60
    }
  
  def -=(arvo: Int) {
    var tmpsek = min*60 + sek - arvo;
    min = tmpsek/60
    sek = tmpsek%60
    }
  
  def *= (kerroin: Int) {
    var tmpsek = min*60 + sek
    tmpsek *= kerroin;
    min = tmpsek/60
    sek = tmpsek%60
  }
  
  def /= (jakaja: Int) {
    var tmpsek = min*60 + sek
    tmpsek /= jakaja;
    min = tmpsek/60
    sek = tmpsek%60
  }

  override def toString = {
    var str: String = "";
    if (min == 0 && sek < 0) {str+="-"}
    if (sek < 10 && sek > -10) {      
      str += min + ":0" + Math.abs(sek)
      str
    } else {
      str += min + ":" +Math.abs(sek)
      str
    }
  }
}