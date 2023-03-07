package Lab7.zad1;

import java.util.ArrayList;

public class Autokomis {
    private int Lp;
    public static void main(String[] args) {
        ArrayList<Samochod> dostepne = new ArrayList<>();
        dostepne.add(new Samochod("Scania", "R620", "Ciezarowy", "Diesel", 16.0, 2010, 140000, 2022, 10, 29));
        dostepne.add(new Samochod("Renault", "Megan", "Osobowy", "Benzin", 1.6, 2002, 2500, 2006, 3, 26));
        dostepne.add(new Samochod("Audi", "A8", "Osobowy", "Hybrid", 4.2, 2018, 35000, 2009, 9, 15));
        dostepne.add(new Samochod("Audi", "80", "Osobowy", "Bensine", 2.0, 1998, 8000, 2022, 12, 3));
        dostepne.add(new Samochod("BMW", "M3", "Osobowy", "Bensine", 2.0, 2021, 505000, 4, 2, 12));

        for (Samochod wys : dostepne) {
            System.out.print(wys.getMarka() + "\t|\t" + wys.getModel() + "\t|\t" + wys.getTyp() + "\t|\t" + wys.getSilnik() + "\t|\t" + wys.getPojemnosc() + "\t|\t" + wys.getRokProdukcji() + "\t|\t" + wys.getCena() + "\t|\t" + wys.getDatapierwszejrejestracji() + "\t|\t");
            wys.Gwarancja();
            System.out.print("\n");
        }
    }
}

