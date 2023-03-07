package Lab2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class zad4 {
    static int min,max;
    static double avg;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liczby = new ArrayList<Integer>();
        System.out.print("Podaj wartość (Uwaga! Litery kończą działanie tablicy):");
        while(scanner.hasNextInt())
        {
            System.out.print("Podaj następną liczbę:");
            liczby.add(scanner.nextInt());
        }
        scanner.close();
        max=min=liczby.get(0);
        liczby.forEach((i)->compare(i));
        avg=avg/liczby.size();
        System.out.println("Najmniejsza liczba to: " + min);
        System.out.println("Największa liczba to: " + max);
        System.out.println("Średnia to: " + avg);
        System.out.println("Ilość liczb w tablicy: " + max);
    }
    static void compare(int x)
    {
        if(max<x) {max=x;}
        if(min>x) {min=x;}
        avg+=x;
    }
}


