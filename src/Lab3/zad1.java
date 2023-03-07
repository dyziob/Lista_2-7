package Lab3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class zad1 {

    public static void main(String[] args) {
        int a, b = 2;
        double parzysteavg = 0, nieparzysteavg = 0;
        boolean pierwsza = true;
        List<Integer> parzyste = new ArrayList<>();
        List<Integer> nieparzyste = new ArrayList<>();
        System.out.print("Podaj liczbę całkowitą:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.close();
        while (b <= a / 2) {
            if (a % b == 0) {
                pierwsza = false;
                break;
            }
            b++;
        }
        while (a > 0) {
            if ((a % 10) % 2 == 0) {
                parzyste.add(a % 10);
            } else {
                nieparzyste.add(a % 10);
            }
            a = a / 10;
        }
        if (parzyste.size() > 0) {
            for (int element : parzyste) {
                parzysteavg += element;
            }
            parzysteavg /= parzyste.size();
        }
        if (nieparzyste.size() > 0) {
            for (int element : nieparzyste) {
                nieparzysteavg += element;
            }
            nieparzysteavg /= nieparzyste.size();
        }
        if (parzysteavg != 0) {
            System.out.print("Stosunek średniej arytmetycznej cyfr nieparzystych do średniej arytmetycznej cyfr parzystych wynosi " + (nieparzysteavg / parzysteavg) + "\n");
        } else {
            System.out.print("Stosunek średniej arytmetycznej cyfr nieparzystych do średniej arytmetycznej cyfr parzystych wynosi " + nieparzysteavg + "\n");
        }
        if (pierwsza) {
            System.out.print("Liczba jest liczbą pierwszą.");
        } else {
            System.out.print("Liczba nie jest liczbą pierwszą.");
        }
    }
}
