import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg az elso szamot:");
        int szam1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Adja meg a masodik szamot:");
        int szam2 = sc.nextInt();
        sc.nextLine();
        System.out.println("1. gomb Szamtani kozep?:");
        System.out.println(" 2. gomb Mertani kozep?:");
        int valasz =sc.nextInt();

        switch (valasz) {
            case 1 :
                System.out.println((szam1+szam2)/2);
                break;
            case 2 :
                System.out.println((szam1*szam2)^(1/2));
        }
    }
}