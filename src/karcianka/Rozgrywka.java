package karcianka;

import java.util.ArrayList;

public class Rozgrywka {

  public static void main(String[] args) {
    StosKart talia = new StosKart();
    for (Wartosc wartosc : Wartosc.values()) {
      for (Kolor kolor : Kolor.values()) {
        talia.dodajKarte(new Karta(wartosc, kolor));
      }
    }

    talia.potasuj();

    ArrayList<StosKart> gracze = new ArrayList<StosKart>();
    for (int i = 0; i < 5; i++) {
      StosKart gracz = new StosKart();
      for (int j = 0; j < 5; j++) {
        try {
          talia.przeniesJednaKarteDo(gracz);
        } catch (WyjatekPustegoStosu w) {
          // wypisać komunikat o błędzie
          System.exit(-1);
        }
      }
      gracze.add(gracz);
    }

    for (int i = 0; i < gracze.size(); i++) {
      StosKart gracz = gracze.get(i);
      System.out.printf("Gracz %d:\n", i + 1);
      while(true) {
        try {
          Karta karta = gracz.wezKarte();
          System.out.printf("  %s %s\n", karta.getWartosc(), karta.getKolor());
        } catch (WyjatekPustegoStosu w) {
          break;
        }
      }
    }
  }

}
