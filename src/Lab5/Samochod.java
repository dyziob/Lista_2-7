package Lab5;

import java.time.LocalDate;

public class Samochod {
    private String model, marka, typ, silnik;
    private double pojemnosc;
    private int rokProdukcji;
    private double cena;
    private LocalDate datapierwszejrejestracji;
    static private LocalDate data = LocalDate.now();

    public Samochod(String marka, String model, String typ, String silnik, double pojemnosc, int rokProdukcji, double cena, int rokrejstracji, int miesiacrejestracji, int dzienrejestracji) {
        this.marka = marka;
        this.model = model;
        this.typ = typ;
        this.silnik = silnik;
        this.pojemnosc = pojemnosc;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
        this.datapierwszejrejestracji = LocalDate.of(rokrejstracji, miesiacrejestracji, dzienrejestracji);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public LocalDate getDatapierwszejrejestracji() {
        return datapierwszejrejestracji;
    }

    public void setDatapierwszejrejestracji(int rokrejstracji, int miesiacrejestracji, int dzienrejestracji) {
        this.datapierwszejrejestracji = LocalDate.of(rokrejstracji, miesiacrejestracji, dzienrejestracji);
    }

    public void Gwarancja() {
        if (data.getYear() - datapierwszejrejestracji.getYear() > 2) {
            System.out.printf("Nie podlega gwarancji");
        } else if (data.getYear() - datapierwszejrejestracji.getYear() == 2) {
            if (data.getDayOfYear() - datapierwszejrejestracji.getDayOfYear() <= 0) {
                System.out.printf("Podlega gwarancji");
            } else {
                System.out.printf("Nie podlega gwarancji");
            }
        } else {
            System.out.printf("Podlega gwarancji");
        }
    }
}
