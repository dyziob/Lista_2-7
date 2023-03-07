package Lab2;

import java.util.Scanner;


public class zad1 {

    public static void main(String[] args) {

        String sign = "*";

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Podaj wielkosc choinki: ");
            int number = scan.nextInt();

            for(int x = 0; x < number; x++) {
                for(int y = 0; y < number * 2; y++) {
                    if(y < (number - x) || y > (number + x)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(sign);
                    }
                }
                System.out.println();
            }
        }

    }

}