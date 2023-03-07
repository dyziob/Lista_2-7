package Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        int[][] losoweLiczby = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < losoweLiczby.length; i++) {
            for (int j = 0; j < losoweLiczby[0].length; j++) {
                losoweLiczby[i][j] = random.nextInt();
            }
        }

        File file4 = new File("./src/Lab6/Pliki/zadanie5.csv");
        try {

            file4.delete();
            FileWriter fileWrite = new FileWriter(file4, true);
            for (int i = 0; i < losoweLiczby.length; i++) {
                for (int j = 0; j < losoweLiczby[0].length; j++) {
                    fileWrite.write(Integer.toString(losoweLiczby[i][j]) + '\t');
                }
                fileWrite.write("\n");
            }
            fileWrite.close();
        } catch (IOException e) {
            System.out.println("Blad zapisywania pliku");
        }
        int[][] losoweLiczby2 = new int[10][10];
        try {
            Scanner scanner = new Scanner(file4);
            while (scanner.hasNext()) {
                for (int i = 0; i < losoweLiczby2.length; i++) {
                    for (int j = 0; j < losoweLiczby2[0].length; j++) {
                        losoweLiczby2[i][j] = scanner.nextInt();
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {

        }

        for (int i = 0; i < losoweLiczby2.length; i++) {
            for (int j = 0; j < losoweLiczby2[0].length; j++) {
                System.out.print(losoweLiczby2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}