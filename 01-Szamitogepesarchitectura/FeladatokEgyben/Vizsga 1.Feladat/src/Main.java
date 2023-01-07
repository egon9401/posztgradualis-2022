import java.util.Scanner;

public class Main {
    private static String nev = "Egon";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy szamot:");
        char karakter = 'X';
        int szam = sc.nextInt();

        karaktercsere(karakter, szam);
    }

    private static void karaktercsere(char karakter, int szam) {
        nev = nev.substring(0, szam) + karakter + nev.substring(szam + 1);
        System.out.println(nev);
    }


}