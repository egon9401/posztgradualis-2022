import java.util.Scanner;

public class Main {

    //1. Olvass be két egész számot és írd ki a
    //a. összegüket
    //b. különbségüket
    //c. szorzatukat
    //d. maradékos osztási hányadosukat
    //e. osztási maradékukat
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ki irom, hogy mit kerek
        System.out.println("Szam1: ");
        System.out.println("Szam2: ");

        //Beolvasas
        int x = sc.nextInt();
        int y = sc.nextInt();

        //a. Osszeguk
        int Osszeadas = x + y;

        System.out.println("Osszeg:" + Osszeadas);

        //b. Kulonbseguk
        int Kivonas = x - y;

        System.out.println("Kulonbseg:" + Kivonas);

        //c. Szorzatuk
        int Szorzas = x * y;

        System.out.println("Szorzat:" + Szorzas);

        //d. maradékos osztási hányadosukat
        int Osztas = x / y;

        System.out.println("Osztas:" + Osztas);

        //c. osztási maradékuk
        int OsztM = x % y;

        System.out.println("OsztasiMaradek:" + OsztM);
    }
}