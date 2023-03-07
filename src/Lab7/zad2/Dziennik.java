package Lab7.zad2;

import java.util.ArrayList;

public class Dziennik {
    public static void main(String[] args) {
        ArrayList<Student> lista = new ArrayList<>();

        //zadanie_3
        System.out.println("Ilosc elementow w tablicy: "+ lista.size());
        if(lista.size()>3) {
                lista.get(3).wypisz();
        }
    }
}
