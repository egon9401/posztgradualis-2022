import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //3.Írjunk  egy  programot  ami  az  aktuális  könyvtárban  létrehoz
        // egy  _DataFiles  könyvtárat,  majd  a consoleról *-ig beolvasott nevű fájlokat hoz létre
        // ebben a könyvtárban.
        // (Próbáld  ki,  hogy  mi  történik,  ha  olyan  fájlneveket  adsz  meg,
        // amik  nem  kanonikus  utak.  Mit gondolsz, miért lehet ebből baj?)

        Scanner sc = new Scanner(System.in);

        Path konyvtarEleresiUtvonal = Paths.get("").toAbsolutePath();

        System.out.println("Adja meg a konyvtar nevet:");
        File ujKonyvtar = sc.nextLine();

        Files.createDirectory(Path);
    }
}