import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //8. Írj egy programot ami karakterláncokat kér be addig amígy *-ot nem kap, majd kiírja a leghoszabb
        //megadott karakterlánc hosszát.

        Scanner sc =new Scanner(System.in);
        String karakterlanc;
        String exit = "Exit";
        System.out.println("Adjon meg egy karakterlancot");
        karakterlanc = sc.nextLine();
        String[] karakterlancok = new String[100];


        while (true)
            if (!"*".equals(karakterlanc) ) {
                for (int i = 0; i < karakterlancok.length; i++) {
                    System.out.println("Adjon meg egy uj karaktert:");
                    karakterlancok[i] = sc.nextLine();
                }
            } else break;



    }
}