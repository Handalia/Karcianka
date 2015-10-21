package karcianka;

import junit.framework.TestCase;

public class KarciankaTest extends TestCase {

  // Czy mogę stworzyć daną karte
  public void testDanaKarta() {
    new karcianka.Karta(karcianka.Wartosc.K4, karcianka.Kolor.PIK);
  }
  
  // Czy stworzona karta ma właściwą wartość
  public void testWartoscWlasciwa() {
    karcianka.Karta karta = new karcianka.Karta(Wartosc.DAMA, Kolor.TREFL);
    assertTrue("Karta ma złą wartość", karta.getWartosc() == Wartosc.DAMA);
  }
  
  // Czy getWartosc zwraca to co konstruktor dostał
  public void testWartosc() {
    karcianka.Karta karta = new karcianka.Karta(Wartosc.KROL, Kolor.TREFL);
    assertTrue("Karta nie zwraca prawidłowo konstruktora", karta.getWartosc() == Wartosc.KROL);
  }

  // Czy stworzona karta ma właściwy kolor
  public void testKolorcWlasciwy() {
    karcianka.Karta karta = new karcianka.Karta(Wartosc.DAMA, Kolor.TREFL);
    assertTrue("Karta ma zły kolor", karta.getKolor() == Kolor.TREFL);
  }
  // Czy getKarta zwraca to co konstruktor dostał
  public void testKolor() {
    karcianka.Karta karta = new karcianka.Karta(Wartosc.KROL, Kolor.PIK);
    assertTrue("Karta nie zwraca prawidłowo konstruktora", karta.getKolor() == Kolor.PIK);
  }  
  // Czy da się tworzyć obiekt stos kart
  public void testObiektStosKart() {
    new karcianka.StosKart();
  }

}