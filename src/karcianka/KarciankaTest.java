package karcianka;

import junit.framework.TestCase;

public class KarciankaTest extends TestCase {

  // Czy mogę stworzyć daną karte
  public void testDanaKarta() {
    new karcianka.Karta(karcianka.Wartosc.K4, karcianka.Kolor.PIK);
  }
  
  // Czy stworzona karta ma właściwą wartość
  public void testKolorIWartosc() {
    karcianka.Karta karta = new karcianka.Karta(Wartosc.DAMA, Kolor.TREFL);
    assertTrue("Karta ma złą wartość", karta.getWartosc() == Wartosc.DAMA);
  }
}