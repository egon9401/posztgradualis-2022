import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //7. Írj egy programot ami bekér egy karakterláncot és az első betű összes előfordulását kicseréli !-re,
        //kétféle képpen. Egyik esetben karakterláncfeldolgozó műveletekkel, a másik esetben egy Java
        //beépített metódus használatával (google a barátod). Ha jól dolgozol, a két megoldás azonos kell
        //legyen.

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy karakterlancot");
        String karakterlanc = sc.nextLine();
        char ci = '!';
        char elso = karakterlanc.charAt(0);
        String uj = "";

        for (int i = 0; i < karakterlanc.length(); i++) {
            if (karakterlanc.charAt(i) == elso);
            {
                uj = uj + elso;

        }


        }
        System.out.println(uj);
        }


    }
