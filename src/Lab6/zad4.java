package Lab6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        int[][] losoweLiczby = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < losoweLiczby.length; i++) {
            for (int j = 0; j < losoweLiczby[0].length; j++) {
                losoweLiczby[i][j] = random.nextInt();
            }
        }

        File file4 = new File("./src/Lab6/Pliki/zadanie4.csv");
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
    }
}
