package Lab6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class zad3 {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator(10, 8, 15, 3);
        System.out.println();
        try {
            File file3 = new File("./src/Lab6/Pliki/zadanie3.txt");
            file3.delete();
            FileWriter fileWrite = new FileWriter(file3, true); //true wlacza tryb append

            for (int i = 0; i < kalkulator.liczby.size(); i++) {
                fileWrite.write(kalkulator.liczby.get(i).toString() + " ");
            }
            fileWrite.write("\n");
            for (int i = 0; i < kalkulator.results.length; i++) {
                for (int j = 0; j < kalkulator.results[0].length; j++) {
                    fileWrite.write(kalkulator.results[i][j] + "\t");
                }
                fileWrite.write("\n");
            }
            fileWrite.close();
        } catch (IOException e) {
            System.out.println("Blad zapisywania pliku" + e);
        }
    }
}
