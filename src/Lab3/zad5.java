package Lab3;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        int wynik = 1, liczba;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        liczba = scanner.nextInt();
        scanner.close();
        while (wynik < liczba) {
            wynik *= 3;
            if (wynik >= liczba) {
                return;
            }
            System.out.print(wynik + "\n");
        }
    }
}