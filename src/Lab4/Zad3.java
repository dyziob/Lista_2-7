package Lab4;

import java.util.Arrays;

class Bool {
    boolean[] dostepne = new boolean[40];

    void wstawianie() {
        for (int i = 0; i < 40; i++) {
            dostepne[i] = (i % 2) != 0;
        }
    }

    void wyswietlanie() {
        System.out.println(Arrays.toString(dostepne));
    }
}

public class Zad3 {
    public static void main(String[] args) {
        Bool obiekt = new Bool();
        obiekt.wstawianie();
        obiekt.wyswietlanie();
    }
}
