import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //6. Írj egy programot ami bekér két karakterláncot, majd kiírja, hogy a második karakterlánc hánszor
        //szerepel az elsőben. Ezt kétféleképpen is számolja meg:
        //i. Átfedésekkel: pl: a „abrabrabra”-ban 3-szor szerepel az „abra”, ha átfedéseket
        //megengedünk.
        //ii. Átfedések nélkül: pl: a „abrabrabra”-ban 2-szor szerepel az „abra”, ha átfedéseket nem
        //engedünk meg.

        Scanner sc = new Scanner(System.in);

        System.out.println("Adja meg az elso karakterlancot");
        String elsokarakterlanc = sc.nextLine();

        System.out.println("Adja meg a masodik karakterlancot");
        String masodikkarakterlanc = sc.nextLine();
        boolean tartalmazzae = elsokarakterlanc.contains(masodikkarakterlanc);
        int hanyszortartalmazza;

       if (tartalmazzae = true) {
           System.out.println("Az elso tartalmazza a masodikat");
       } else {
           System.out.println("Az elso nem tartalmazza a masodikat");
       }

        for (int i = 0; i <elsokarakterlanc.length(); i++) {
            if elsokarakterlanc.
        }
        System.out.println("Hello world!");
    }
}