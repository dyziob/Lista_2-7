package Lab2;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double wynik;
        int opcja;

        System.out.println("Kalkulator. Podaj 2 liczby:");
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        System.out.println("Wybierz opcje: \n 1.Dodawanie \n 2.Odejmowanie \n 3.Mnozenie \n 4.Dzielenie");
        opcja = scanner.nextInt();
        switch (opcja) {
            case 1:
                wynik = a + b;
                System.out.println(wynik);
                break;

            case 2:
                wynik = a - b;
                System.out.println(wynik);
                break;

            case 3:
                wynik = a * b;
                System.out.println(wynik);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Nie dzielimy przez zero");
                } else {
                    wynik = (a / b);
                    System.out.printf("%.2f", wynik);
                }
                break;
        }
    }
}