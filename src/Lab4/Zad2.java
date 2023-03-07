package Lab4;

import java.util.*;

class Tworzenie {
    Random rand = new Random();
    int[][] dostepne = new int[7][7];

    //Wypelanianie tablicy
    void wypelnianie() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                dostepne[i][j] = rand.nextInt(99) + 1;
            }
        }
    }

    int[][] dostepneKopia = new int[7][7];

    //Kopiowanie
    void kopiowanie() {
        for (int i = 6, k = 0; i >= 0; i--, k++) {
            for (int j = 6, l = 0; j >= 0; j--, l++) {
                dostepneKopia[k][l] = dostepne[i][j];
            }
        }
        System.out.println("dostepne kopia:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(dostepneKopia[i][j] + ", ");
            }
            System.out.println();
        }
    }

    //Wyswietlanie
    void wyswietlanie() {
        System.out.println("dostepne:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(dostepne[i][j] + ", ");
            }
            System.out.println();
        }
    }

    //Max, Min ka¿dej kolumny
    int[][] dostepnePomocnicza = new int[2][7];

    void minMaxKolumn() {
        int maxKolumn = dostepne[0][0];
        int minKolumn = dostepne[0][0];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (dostepne[j][i] > maxKolumn) {
                    maxKolumn = dostepne[j][i];
                }
                if (dostepne[j][i] < minKolumn) {
                    minKolumn = dostepne[j][i];
                }
            }
            dostepnePomocnicza[0][i] = maxKolumn;
            dostepnePomocnicza[1][i] = minKolumn;
            maxKolumn = dostepne[0][0];
            minKolumn = dostepne[0][0];
        }
    }

    //Wyswietlanie tablicy pomocniczej
    void wyswietlaniePomoc() {
        System.out.println("Odpowiednio Wartoœci max kolumn:");
        for (int j = 0; j < 7; j++) {
            System.out.print(dostepnePomocnicza[0][j] + ", ");
        }
        System.out.println();
        System.out.println("Odpowiednio wartoœci min kolumn:");
        for (int j = 0; j < 7; j++) {
            System.out.print(dostepnePomocnicza[1][j] + ", ");
        }
    }

    //Max, Min tablicy
    void maxMinTab() {
        int max = dostepne[0][0];
        int min = dostepne[0][0];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (dostepne[i][j] > max) {
                    max = dostepne[i][j];
                }
                if (dostepne[i][j] < min) {
                    min = dostepne[i][j];
                }
            }
        }
        System.out.println("Max tablicy: " + max);
        System.out.println("Min tablicy: " + min);
    }

    //Œrednia wartoœæ elementów
    void srednia() {
        double srednia = 0.0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                srednia += dostepne[i][j];
            }
        }
        srednia = srednia / 49;
        System.out.println("\nSrednia: " + srednia);
        int licznikMniejszych = 0;
        int licznikWiekszych = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (dostepne[i][j] > srednia) {
                    licznikWiekszych++;
                }
                if (dostepne[i][j] < srednia) {
                    licznikMniejszych++;
                }
            }
        }
        System.out.println("Iloœæ elementów wiêkszych od œredniej: " + licznikWiekszych);
        System.out.println("Iloœæ elementów mniejszych od œredniej: " + licznikMniejszych);
    }
}

public class Zad2 {
    public static void main(String[] args) {
        Tworzenie obiekt = new Tworzenie();
        obiekt.wypelnianie();
        obiekt.wyswietlanie();
        obiekt.maxMinTab();
        obiekt.minMaxKolumn();
        obiekt.wyswietlaniePomoc();
        obiekt.srednia();
        obiekt.kopiowanie();
    }
}
