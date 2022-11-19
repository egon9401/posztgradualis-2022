import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        //2.Írja ki a program prancssoriargumentumaként megkapott
        // könyvtárban lévő összes könyvtár és fájl nevét.
        // Egyszer a könyvtrárakat, utána a fájlokat.

        Path konyvtarEleresiUtvonal = Paths.get(args[0]);

        File konyvtar = konyvtarEleresiUtvonal.toFile();
        File[] konyvtarbejegyzesek = konyvtar.listFiles();



        for (int i = 0; i < konyvtarbejegyzesek.length; i++) {
            if (konyvtarbejegyzesek[i].isDirectory()) {
                System.out.println(konyvtarbejegyzesek[i].getName());


            }

        }
        for (int i = 0; i < konyvtarbejegyzesek.length; i++) {
            if (konyvtarbejegyzesek[i].isFile()) {
                System.out.println(konyvtarbejegyzesek[i].getName());


            }

        }
    }
}