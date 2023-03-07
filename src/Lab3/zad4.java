package Lab3;

import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        int iloczyn = 1, liczba = 0;
        Scanner scanner = new Scanner(System.in);
        while (liczba != 5) {
            System.out.print("Podaj liczbę:");
            liczba = scanner.nextInt();
            if (liczba != 5) {
                iloczyn *= liczba;
            }
        }
        scanner.close();
        System.out.print("Iloczyn podanych liczb wynosi:" + iloczyn);
    }
}