package Lab6;

import java.util.ArrayList;

public class Kalkulator {
    ArrayList<Integer> liczby = new ArrayList<Integer>();
    String[][] results = new String[7][2];

    double additionResult = 0, subtractionResult = 0, multiplicationResult = 0, divisionResult = 0, squaredResult, squareRootResult, factorialResult = 0;

    Kalkulator(int liczba) {
        liczby.add(liczba);
        factorialResult = 1;
        oblicz();
    }

    Kalkulator(int liczba0, int liczba1, int liczba2, int liczba3) {
        liczby.add(liczba0);
        liczby.add(liczba1);
        liczby.add(liczba2);
        liczby.add(liczba3);
        oblicz();
    }

    Kalkulator(int liczba0, int liczba1, int liczba2, int liczba3, int liczba4, int liczba5, int liczba6) {
        liczby.add(liczba0);
        liczby.add(liczba1);
        liczby.add(liczba2);
        liczby.add(liczba3);
        liczby.add(liczba4);
        liczby.add(liczba5);
        liczby.add(liczba6);
        oblicz();
    }

    Kalkulator(Kalkulator kalk) {
        for (int i = 0; i < liczby.size(); i++) {
            this.liczby.add(kalk.liczby.get(i));
        }
        oblicz();
    }

    public void oblicz() {
        additionResult = liczby.get(0);
        subtractionResult = liczby.get(0);
        multiplicationResult = liczby.get(0);
        divisionResult = liczby.get(0);
        if (liczby.size() == 1) {
            squaredResult = liczby.get(0) * liczby.get(0);
            squareRootResult = Math.sqrt(liczby.get(0));
            for (int i = 1; i <= liczby.get(0); i++) {
                factorialResult *= i;
            }
            System.out.println("Wynik potęgowania:" + squaredResult);
            System.out.println("Wynik pierwiastkowania:" + squareRootResult);
            System.out.println("Wynik silnii:" + factorialResult);
        } else {
            for (int i = 1; i < liczby.size(); i++) {
                additionResult += liczby.get(i);
                subtractionResult -= liczby.get(i);
                multiplicationResult *= liczby.get(i);
                divisionResult /= liczby.get(i);
            }
        }

        results[0][0] = "Addition";
        results[1][0] = "Subtraction";
        results[2][0] = "Multiplication";
        results[3][0] = "Division";
        results[4][0] = "Squared";
        results[5][0] = "Square root";
        results[6][0] = "Factorial";

        results[0][1] = Double.toString(additionResult);
        results[1][1] = Double.toString(subtractionResult);
        results[2][1] = Double.toString(multiplicationResult);
        results[3][1] = Double.toString(divisionResult);
        results[4][1] = Double.toString(squaredResult);
        results[5][1] = Double.toString(squareRootResult);
        results[6][1] = Double.toString(factorialResult);

        System.out.println("Wynik dodawania:" + additionResult);
        System.out.println("Wynik odejmownaia:" + subtractionResult);
        System.out.println("Wynik mnożenia:" + multiplicationResult);
        System.out.println("Wynik dzielenia:" + divisionResult);

    }
}
