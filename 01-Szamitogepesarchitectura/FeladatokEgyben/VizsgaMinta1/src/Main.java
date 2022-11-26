import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. (5 pont) Írjon egy programot amiben deklarál egy globális dupla pontos változót, aminek kezdeti
        //értéke 1. Ezen kívül írjon egy függvényt ami egy parancsot és egy számot vár paraméterként és
        //ezek függvényében értelemszerűen frissíti a globális változó értékét. Az érvényes parancsok:
        //szoroz, oszt, osszead. A main függvényben hívja is meg a függvényt néhány tetszőleges
        //paraméterezéssel.
        Scanner sc = new Scanner(System.in);
        double kezdoSzam = 3;

        String[] parancs = {"szoroz", "oszt", "ossead"};

        System.out.println("Adjon meg egy szamot:");
        double szam = sc.nextInt();
        System.out.println("Adjon meg egy parametert:");

        int parameter = sc.nextInt();



    }
}