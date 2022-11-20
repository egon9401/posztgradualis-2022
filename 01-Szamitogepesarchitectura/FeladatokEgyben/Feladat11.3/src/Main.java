import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Enumeration;

public class Main {
    // 3.Írjunk  egy  programot  ami  az  aktuális  könyvtárban
    // létrehoz  egy  _DataFiles  könyvtárat,
    // majd  a consoleról *-ig beolvasott nevű fájlokat hoz létre
    // ebben a könyvtárban.(Próbáld  ki,  hogy  mi  történik,
    // ha  olyan  fájlneveket  adsz  meg,  amik  nem  kanonikus  utak.
    // Mit gondolsz, miért lehet ebből baj?)
    public static void main(String[] args) throws IOException {

        Path konyvtarEleresiutvonal = Paths.get("").toAbsolutePath();
        File konyvtar = konyvtarEleresiutvonal.toFile();
        Path aktualisKonyvtar = Paths.get("_DataFiles");
        aktualisKonyvtar.toFile().mkdir();

    }
}