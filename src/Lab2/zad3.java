package Lab2;

import java.util.Scanner;


public class zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj prędkość: ");
        double m = scan.nextDouble();
        double k = m;

        double kmh = m * 1.60934;
        double mil = k/1.60934;

        System.out.print("Prędkość w Kilometrach na godzinę (km/h) = " + kmh + ". Prędkość w milach: " + mil);
    }

}