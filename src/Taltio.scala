

class Taltio {
  
  var list : scala.collection.mutable.ArrayBuffer[Tallenne] = collection.mutable.ArrayBuffer()
  
  def lisaaTallenne(tallenne: Tallenne) {
    list.append(tallenne);
  }

  def tulostaTallenteet() {
    var aika = new MinSek();
    list.foreach((tallenne : Tallenne) => {
      println(tallenne.getNimi +" "+ tallenne.getAika)
      aika += tallenne.getAika;
    })
  println("kokonaiskesto: " + aika)
  }
}