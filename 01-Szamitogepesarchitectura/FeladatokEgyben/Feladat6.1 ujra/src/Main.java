import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Kérjen be egy számot és írja ki, hogy helló annyiszor. (Emlékezzünk a régi szenvedős megoldásra
        //és értékeljük a haladást.)

        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg egy szamot:");
        int szam = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < szam; i++) {

            System.out.println("Hello");

        }
    }
}