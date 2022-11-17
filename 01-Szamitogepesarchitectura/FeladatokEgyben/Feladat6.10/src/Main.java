import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //10. Írj egy programot ami bekér egy szöveget. Ezt a szöveget vesszők mentén feldarabolja, majd kiírja
        //az összes előforduló szót, de csak egyszer. Pl.: „alma, körte, alma, kukorica” bemenetre „alma,
        //körte, kukorica” íródik a képernyőre.

        //bekeres
        Scanner sc = new Scanner(System.in);

        System.out.println("Adjon meg egy szoveget:");
        String szoveg = sc.nextLine();
        String[] szavak = szoveg.split(" ");

        for (int i = 0; i < szoveg.length(); i++) {
            if (szoveg.charAt(i) == ',') {
                System.out.println();
            }


        }
        System.out.println("Hello world!");
    }
}