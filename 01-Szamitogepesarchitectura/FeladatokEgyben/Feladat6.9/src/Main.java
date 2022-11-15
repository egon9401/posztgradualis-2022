import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //9. Írj egy programot ami bekér egy karakterláncot, majd törli minden páros helyen álló karakterét és
        //kiírja a képernyőre.

        //bekeres
        Scanner sc = new Scanner(System.in);
        String temp = "";

        System.out.println("Adjon meg egy karakterlancot:");
        String karakterlanc = sc.nextLine();

        for (int i = 0; i < karakterlanc.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(karakterlanc.charAt(i));
            }


        }
    }
}