package Lab2;

import static java.lang.Math.sqrt;
import java.util.Scanner;



public class zad2 {

    public static void main(String[] args) {
        double delta, x, x1, x2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Podaj a = ");
            double a = scan.nextDouble();
            System.out.print("Podaj b = ");
            double b = scan.nextDouble();
            System.out.print("Podaj c = ");
            double c = scan.nextDouble();

            if(a==0)
                liniowe(b,c);
            else{
                delta =(b*b)-4*a*c;
                if(delta<0)
                    System.out.print("Brak rozwiązania");
                else {
                    if(delta==0) {
                        x = b/(2*a);
                        System.out.print("Jedno podwojne rozwiazanie x = " + x);
                    }
                    else {
                        x1=(-b+sqrt(delta))/(2*a);
                        x2=(-b-sqrt(delta))/(2*a);
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);

                    }
                }
            }
        }

    }
    static void liniowe(double a, double b) {
        if(a==0)
            if(b==0)
                System.out.println("Równanie tożsamościowe");
            else
                System.out.println("Równanie sprzeczne");
        else {
            double x;
            x = -b/a;
            System.out.println("Równanie liniowe, x = " + x);
        }
    }
}