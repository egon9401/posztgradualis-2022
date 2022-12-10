import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        //6.Írjon egy programot ami két parancssori argumentumot vár.
        // Az első egy könyvtár elérési útja, a második  egy  fájl  neve.
        // Egy  rekurzív  függvény  segítségével  döntse  el,  hogy  van-e  olyan  fájl  a könyvtárban
        // (vagy bármely abban lévő könyvtárban tetszőleges mélységben) bárhol olyan nevű fájl.
        // Ha vannak ilyenek, ezeknek a teljes elérési útját írja ki a consolere.

        Path currentFolderPath = Paths.get("").toAbsolutePath();
        File currentFolderInfo = currentFolderPath.toFile();
    }

    private static void konyvtarbanKereses(File currentFolderInfo) {
        if (currentFolderInfo.isDirectory()) {


        }
    }
}
}