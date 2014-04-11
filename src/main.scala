import Kieli._


object main extends App {

/*  var muuttuja = lue // lukee käyttäjältä kokonaisluvun
  kirjoita(muuttuja+2) //tulostaa kokonaisluvun ja lisää kaksi
  jos(muuttuja>2) {kirjoita("Jee!")} //self-explanatory
  toista(3) {muuttuja += 1; kirjoita(muuttuja)} //tulostetaan muuttujaa kolmasti kasvattaen aina yhdellä
  toistaEhdolla(muuttuja > 2) {muuttuja -=1; kirjoita(muuttuja)} //tulostaa muuttuja, kunnes se on kaksi.
*/
  var t1 = new Tallenne("Moi", new MinSek(20, 12))
  var t2 = new Tallenne("Hei", new MinSek(23, 32))
  //println(t2.getNimi +" " +  t2.getAika)
  var tal1 = new Taltio();
  tal1.lisaaTallenne(t1);
  tal1.lisaaTallenne(t2);
  tal1.tulostaTallenteet;
  }