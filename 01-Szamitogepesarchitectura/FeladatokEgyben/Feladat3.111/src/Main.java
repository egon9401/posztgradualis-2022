import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy szamot");
        int szam = sc.nextInt();
        sc.nextLine();

        boolean paros = szam % 2 == 0;
        boolean oszthato4el = szam % 4 == 0;
        boolean oszthato8al = szam % 8 != 0;

        if (paros == false) {
            System.out.println("a szam paratlan");
        } else if (oszthato4el == false) {
            System.out.println("A szam nem oszthato 4-el");
        } else if (oszthato8al == true) {
            System.out.println("A szam oszthato 4 es nem szthato 8al");
        } else
            System.out.println("A szam oszthato 8al");


        System.out.println("Hello world!");
    }
}