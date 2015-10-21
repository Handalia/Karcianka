package karcianka;

import java.util.ArrayList;

public class StosKart {

  ArrayList<Karta> karty = new ArrayList<Karta>();

  public void dodajKarte(Karta karta) {  
    karty.add(karta);
  }

  public Karta wezKarte() throws WyjatekPustegoStosu {
    if (karty.isEmpty()) {
      throw new WyjatekPustegoStosu("Brak możliwości wzięcia karty z pustego stosu");
    }

    return karty.remove(karty.size() - 1);
  }

}
