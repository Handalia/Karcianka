package karcianka;

import java.util.ArrayList;
import java.util.Collections;

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

  public void potasuj() {
    Collections.shuffle(karty);
  }

  public void przeniesJednaKarteDo(StosKart stos2) throws WyjatekPustegoStosu {
    throw new WyjatekPustegoStosu("Brak możliwości wzięcia karty z pustego stosu");
  }

}
