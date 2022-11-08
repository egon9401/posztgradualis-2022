import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy karakter:");
        char karakter = sc.next().charAt(0);

        if (karakter>= 65 && karakter<=90 ) {
            System.out.println("A megadott karakter nagy betu");
        } else if (karakter>=97 && karakter<=122) {
            System.out.println("A megadott karakter kis betu");
        } else if (karakter>=48 && karakter<=57) {
            System.out.println("A megadott karakter szam");
        } else
        System.out.println("A megadott karakter egy szimbolum");
    }
}