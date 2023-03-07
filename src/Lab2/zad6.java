package Lab2;

import java.util.Scanner;
public class zad6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, money= 300000;
        System.out.print("Liczba miesięcy spłacanej raty: ");
        a = scan.nextInt();

        if(a <= 24)
            money = (money/a) * 1.02;
        else if(a > 24 && a <= 48)
            money = (money/a) * 1.03;
        else if(a > 48 && a <= 60)
            money = (money/a) * 1.04;
        else if(a > 60 && a <= 72)
            money = (money/a) * 1.05;
        else if(a > 72)
            money = (money/a) * 1.06;

        System.out.print("Kwota należna z odsetkami to: " + money);
    }
}