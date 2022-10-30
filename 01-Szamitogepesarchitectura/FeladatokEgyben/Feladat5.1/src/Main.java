import java.util.Scanner;

public class Main {
    //1. Írj egy programot, ami beolvas 3 keresztnevet (feltételezhető, hogy amit beír a felhasználó, az
    //keresztnév), majd ezeket fordított sorrendben kiírja.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nevek = new String[3];

        System.out.println("Adja meg az elso nevet:");
        nevek[0] = sc.nextLine();
        System.out.println("Adja meg az masodik nevet:");
        nevek[1] = sc.nextLine();
        System.out.println("Adja meg az harmadik nevet:");
        nevek[2] = sc.nextLine();

        System.out.println("Nevek forditott sorrendbe:");
        System.out.println(nevek[2]);
        System.out.println(nevek[1]);
        System.out.println(nevek[0]);
    }
}