import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //3. Írj programot, ami be kér egy számot 1 és 5 között, majd pontosan ennyi keresztnevet kér be és
        //ezeket kiírja fordított sorrendben.

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy szamot:");
        int megadottSzam = sc.nextInt();
        String[] keresztNevek = new String[5];



        for (int i = 0; i < megadottSzam + 1; i++) {
            if (megadottSzam > 5 || megadottSzam < 0) {
                System.out.println("A szam nem jo");
                break;
            } else

            System.out.println("Adjon meg egy nevet:");
            keresztNevek[i] = sc.nextLine();
        }

        for (int i = keresztNevek.length - 1; i > 0; i--) {
            System.out.println(keresztNevek[i]);
        }

    }
}