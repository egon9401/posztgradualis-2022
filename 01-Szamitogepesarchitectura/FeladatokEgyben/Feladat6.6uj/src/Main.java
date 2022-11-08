import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy karakterlancot");
        String karakterlanc = sc.nextLine();
        char elso = karakterlanc.charAt(0);
        String uj = "";

        for (int i = 0; i < karakterlanc.length(); i++) {
             if (karakterlanc.charAt(i) == elso) {
                 uj = uj + '!';

             } else {
                 uj = uj + karakterlanc.charAt(i);
             }
        }

        System.out.println(uj);
    }
}