package Lab3;

import java.util.*;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        int licznik = 0;

        System.out.print("Dzielniki liczby " + liczba + " to: ");

        for (int i = 2; i <= liczba / 2; i++) {
            if ((liczba % i) == 0) {
                System.out.print(i + "  ");
            } else {
                licznik++;
            }
        }
        if (licznik == 0) {
            System.out.print("brak");
        }
    }
}