package karcianka;

public class Karta {

  public Karta(final karcianka.Wartosc wartosc2, final karcianka.Kolor kolor2) {
    wartosc = wartosc2;
    kolor = kolor2;
  }

  karcianka.Wartosc wartosc;
  karcianka.Kolor kolor;
  
  public Wartosc getWartosc() {
    return wartosc;
  }

  public Kolor getKolor() {
    return kolor;
  }
}