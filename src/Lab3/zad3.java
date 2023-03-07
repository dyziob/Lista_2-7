package Lab3;

import java.util.Random;
import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int los =  rand.nextInt(200)+1;
        int a = 1;
        int i = 0;
        do {
            i++;
            System.out.print("Podaj liczbe o której myśle: ");
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            if(a < los) System.out.println("Wylosowana a jest większa.");
            else if(a > los) System.out.println("Wylosowana a jest mniejsza.");
            else  System.out.println("BRAWO. ZGADŁEŚ :)");

        }while(a!=los);
        System.out.println("Zgadłeś po " + i + " razach.");
    }

}