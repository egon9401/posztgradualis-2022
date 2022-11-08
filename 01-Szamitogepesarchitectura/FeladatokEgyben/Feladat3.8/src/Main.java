import com.sun.source.tree.NewArrayTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //8. Kérjen be egy számot 1 és 10 között és írja ki, hogy helló annyiszor. Nem megfelelő szám esetén
        //írjuk ki, hogy ejnye bejnye.

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy szamot");
        int szam = sc.nextInt();
        if (szam <= 10 && szam >= 0) {
            for (int i = 0; i < szam; i++) {

                System.out.println("Hello");
            }
        } else System.out.println("Nem jo a szam");

    }
}