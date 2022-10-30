import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. Írj egy programot, ami beolvas 3 keresztnevet (feltételezhető, hogy amit beír a felhasználó, az
        //keresztnév), majd ezeket ábécé sorrendben kiírja. Ne használj beépített rendező függvényt.

        Scanner sc = new Scanner(System.in);
        String[] nevek = new String[3];

        System.out.println("Elso nev:");
        nevek[0] = sc.nextLine();
        System.out.println("Masodik nev:");
        nevek[1] = sc.nextLine();
        System.out.println("Harmadik nev:");
        nevek[2] = sc.nextLine();

        Arrays.sort(nevek);
        for (int i = 0; i < nevek.length; i++) {
            System.out.println(nevek[i]);

        }


        System.out.println("Hello world!");
    }
}