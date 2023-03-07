package Lab4;

import java.util.Arrays;
import java.util.Random;

class Losowo {
    int[] dostepne = new int[40];
    Random rand = new Random();

    void wypelnij() {
        for (int i = 0; i < 40; i++) {
            if (i < 10) {
                dostepne[i] = rand.nextInt(4) + 1;
            } else if (i >= 10 && i < 20) {
                dostepne[i] = rand.nextInt(4) + 6;
            } else if (i >= 20 && i < 30) {
                dostepne[i] = rand.nextInt(44) + 11;
            } else if (i < 40) {
                dostepne[i] = rand.nextInt(15) + 60;
            }
        }
    }

    void wyswietl() {
        System.out.println(Arrays.toString(dostepne));
    }
}

public class Zad5 {
    public static void main(String[] args) {
        Losowo obiekt = new Losowo();
        obiekt.wypelnij();
        obiekt.wyswietl();
    }
}
