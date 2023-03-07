package Lab7.zad2;

public class Student {
    String imie, nazwisko;
    int nr_indeksu;

    Student(String imie, String nazwisko, int nr_indeksu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }
    public void wypisz(){
        System.out.println(imie+"\t"+nazwisko+"\t"+nr_indeksu);
    }
}
