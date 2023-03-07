package Lab6;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) throws IOException {
        String file = "./src/Lab6/Pliki/zadanie2.txt";

        FileWriter make = new FileWriter(file);
        BufferedWriter make2 = new BufferedWriter(make);
        make2.write("Lorem Ipsum is simply dummy text of the \n printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took \na galley of type and scrambled it to make a type specimen book.\n It has survived not only five centuries,\n but also the leap into electronic \ntypesetting, remaining essentially unchanged.\n It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,\n and more recently with desktop\n publishing software like Aldus PageMaker\n including versions of Lorem Ipsum.");
        make2.newLine();
        make2.close();

        ArrayList<String> zawartoscPliku = new ArrayList<>();
        try
        {
            File file2 = new File("./src/Lab6/Pliki/zadanie2.txt");
            Scanner scanner = new Scanner(file2);
            while(scanner.hasNextLine())
            {
                zawartoscPliku.add(scanner.nextLine());
                System.out.println(zawartoscPliku.get(zawartoscPliku.size()-1));
            }
            scanner.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("Plik nie istnieje.");
        }


        /*try {
            FileReader fileReader = new FileReader(file);
            BufferedReader plik = new BufferedReader(fileReader);
            String line = null;
            while ((line = plik.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        }
        catch (IOException ex) {
            System.out.println("Wystąpił Błąd" + ex);
        }*/

    }
}

