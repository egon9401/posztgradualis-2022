import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        //1.Írja ki a program aktuális könyvtárában lévő összes könyvtár és fájl nevét.
        // Egyszer a könyvtrárakat, utána a fájlokat.

        Path eleresiUtvonal = Paths.get("").toAbsolutePath();
        File f = eleresiUtvonal.toFile().getAbsoluteFile();
        File[] konyvtarBejegyzesek = f.listFiles();

        //Konyvtar letrehozas

        Path ujKonyvtar = Paths.get("Az Igen");
        ujKonyvtar.toFile().mkdir();


        for (int i = 0; i < konyvtarBejegyzesek.length; i++) {
            if (konyvtarBejegyzesek[i].isFile()) {
                System.out.println(konyvtarBejegyzesek[i].getName());
            }
        }

        for (int i = 0; i < konyvtarBejegyzesek.length; i++) {
            if (konyvtarBejegyzesek[i].isDirectory()) {
                System.out.println(konyvtarBejegyzesek[i].getName());
            }
        }

    }
}