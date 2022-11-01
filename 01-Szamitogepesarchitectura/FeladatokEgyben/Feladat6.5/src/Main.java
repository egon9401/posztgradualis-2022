import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5. Írjon programot ami addig olvas be karakterláncokat ameddig azt nem adjuk meg neki, hogy Exit.
        //Minden beolvasott karakterláncot írjon is ki azonnal fordítva, de az Exit-et már ne.

        Scanner sc = new Scanner(System.in);
        String karakterlanc;
        char karakter;

        while (true) {
            System.out.println("Adjon meg egy karakterlancot:");
            karakterlanc = sc.nextLine();
            String forditott = "";

            if ("Exit".equalsIgnoreCase(karakterlanc)) {
                break;
            }
            for (int i = 0; i < karakterlanc.length(); i++) {

                karakter = karakterlanc.charAt(i);
                forditott = karakter + forditott;

            }
            System.out.println(forditott);

        }
        System.out.println("Hello world!");
    }
}