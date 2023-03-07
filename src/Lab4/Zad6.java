package Lab4;

import java.util.Arrays;

class Znaki {
    int rozmiar = 123 - 97;
    char[] dostepne = new char[rozmiar];

    void wypelnij() {
        char znak = 'a';
        for (int i = 0; i < dostepne.length; i++, znak++) {
            dostepne[i] = znak;
        }
    }

    void wyswietl() {
        System.out.println(Arrays.toString(dostepne));
    }
}

public class Zad6 {
    public static void main(String[] args) {
        Znaki obiekt = new Znaki();
        obiekt.wypelnij();
        obiekt.wyswietl();
    }
}
