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

  // Czy jest metoda do dodawania nowej karty
  public void testDodajKarte() {
    karcianka.Karta karta = new karcianka.Karta(Wartosc.KROL, Kolor.TREFL);
    karcianka.StosKart stos = new karcianka.StosKart();
    stos.dodajKarte(karta);
  }
  
  // Czy nie moge wziąć karty z pustego stosu
  public void testPustyStos() {
    try {
      karcianka.StosKart stos = new karcianka.StosKart();
      stos.wezKarte();
      fail();
    } catch (WyjatekPustegoStosu a) { }
  }
  // Czy karta dodana do stosu i wzięta ze stosu była tą samą kartą
  public void testDodajIWez() {
    karcianka.StosKart stos = new karcianka.StosKart();
    karcianka.Karta karta = new karcianka.Karta(Wartosc.KROL, Kolor.TREFL);
    stos.dodajKarte(karta);
    try {
      assertTrue("Karta nie jest tym samym co dodalam", stos.wezKarte() == karta);
    } catch (WyjatekPustegoStosu e) {
      fail();
    }
  }
  
  // Czy można potasować stos kart?
  public void testPotasujStosKart() {
    karcianka.StosKart stos = new karcianka.StosKart();
    stos.potasuj();
    try {
      stos.wezKarte();
      fail();
    } catch (WyjatekPustegoStosu w) { }
  }
  
  // Czy można potasować stos kart z jedną kartą?
  public void testPotasujStosKartZJednaKarta() {
    karcianka.StosKart stos = new karcianka.StosKart();
    Karta karta = new Karta(Wartosc.AS, Kolor.KARO);
    stos.dodajKarte(karta);
    stos.potasuj();
    try {
      assertEquals(karta, stos.wezKarte());
    } catch (WyjatekPustegoStosu w) {
      fail();
    }
    try {
      stos.wezKarte();
      fail();
    } catch (WyjatekPustegoStosu w) { }
  }
  
  // Czy można potasować stos kart z dwiema kartami?
  public void testPotasujStosKartZDwiemaKartami() {
    karcianka.StosKart stos = new karcianka.StosKart();
    Karta karta1 = new Karta(Wartosc.AS, Kolor.KARO);
    Karta karta2 = new Karta(Wartosc.DAMA, Kolor.KIER);
    stos.dodajKarte(karta1);
    stos.dodajKarte(karta2);
    stos.potasuj();
    Karta zdjeta1;
    Karta zdjeta2;
    try {
      zdjeta1 = stos.wezKarte();
      assertTrue(zdjeta1 == karta1 || zdjeta1 == karta2);
    } catch (WyjatekPustegoStosu w) {
      fail();
    }
    try {
      zdjeta2 = stos.wezKarte();
      assertTrue(zdjeta2 == karta1 || zdjeta2 == karta2);
    } catch (WyjatekPustegoStosu w) {
      fail();
    }
    // assertTrue(zdjeta1 != zdjeta2);  // spytać jak to zrobić
    try {
      stos.wezKarte();
      fail();
    } catch (WyjatekPustegoStosu w) { }
  }

}