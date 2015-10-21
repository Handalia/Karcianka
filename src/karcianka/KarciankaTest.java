package karcianka;

import junit.framework.TestCase;

public class KarciankaTest extends TestCase {

  // Czy mogę stworzyć daną karte
  public void testDanaKarta() {
    new karcianka.Karta(karcianka.Wartosc.K4, karcianka.Kolor.PIK);
  }
}
