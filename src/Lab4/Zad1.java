package Lab4;

import java.util.*;

class Zadanie {
    Random rand = new Random();
    int[] dostepne = new int[30];

    void wstaw() {
        for (int i = 0; i < 30; i++) {
            dostepne[i] = rand.nextInt(51) + 99;
            System.out.print(dostepne[i] + ",");
        }
    }

    int[] dodatkowa = new int[30];

    void kopiowanie() {
        for (int i = 0; i < 30; i++) {
            dodatkowa[i] = dostepne[i];
            System.out.print(dodatkowa[i] + ",");
        }
    }
}

public class Zad1 {
    public static void main(String[] args) {
        Zadanie obiekt = new Zadanie();
        obiekt.wstaw();
        System.out.println();
        obiekt.kopiowanie();
    }
}
