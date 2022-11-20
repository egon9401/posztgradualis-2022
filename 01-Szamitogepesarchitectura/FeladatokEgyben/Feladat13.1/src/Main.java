import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //1.Írjon egy programot ami az aktuális könyvtárban lévő bemenet.txt fájlból
        // felölt egy karakterlánc tömböt. A fájl első sorában a későbbi sorok száma van,
        // utána soronként egy-egy karakterlánc.
        // a.Rendezze a tömböt buborék rendezéssel.
        // b.Rendezze a tömböt kiválasztásos rendezéssel.
        // c.Rendezze a tömböt beszúrásos rendezéssel.
        // A rendezést a karakterláncok első betűje alapján végezze el.

        Path eleresiUtvonal = Paths.get(".", "bemenet.rtf");
        File bemenet = eleresiUtvonal.toFile();

        FileReader fr = new FileReader(bemenet);
        Scanner scfileOlvaso = new Scanner(fr);
        int tombMeret = scfileOlvaso.nextInt();
        String[] beolvasottTomb = new String[tombMeret];
        String tmp = scfileOlvaso.nextLine();
        for (int i = 0; i < beolvasottTomb.length; i++) {
            beolvasottTomb[i] = scfileOlvaso.nextLine();

        }

        bubbleSort(beolvasottTomb);


    }

    private static void bubbleSort(String[] beolvasottTomb) {
        for (int j = 0; j < beolvasottTomb.length-1 ; j++) {


            for (int i = 0; i < beolvasottTomb.length - 1 -j; i++) {
                if (beolvasottTomb[i].charAt(0) > beolvasottTomb[i + 1].charAt(0)) {
                    String tmp = beolvasottTomb[i];
                    beolvasottTomb[i] = beolvasottTomb[i + 1];
                    beolvasottTomb[i + 1] = tmp;
                }
            }
        }
    }

}