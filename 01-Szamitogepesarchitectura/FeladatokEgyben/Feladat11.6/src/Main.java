import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    //6.Írjon    egy    programot,
    //ami    a    parancssori    argumentumaként    kapott    fájlból    feltölt
    //egy karakterláncokból álló tömböt.
    // A fájl első sorában a feltöltendő tömb hossza van.
    // Utána egy üress sor. Majd a tömb elemeisoronként.
    public static void main(String[] args) throws IOException {

        Path bemenetEleresiUt = Paths.get(args[0]);
        File bemenetiFajl = bemenetEleresiUt.toFile();
        FileReader fr = new FileReader(bemenetiFajl);
        Scanner scBemenet = new Scanner(fr);

        int tombMerete = scBemenet.nextInt();
        String tmp = scBemenet.nextLine();
        tmp = scBemenet.nextLine();

        String[] beolvasottTomb = new String[tombMerete];
        for (int i = 0; i < beolvasottTomb.length; i++) {
            beolvasottTomb[i] = scBemenet.nextLine();

        }
        fr.close();
    }
}
