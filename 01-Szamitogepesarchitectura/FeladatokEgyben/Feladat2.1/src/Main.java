
//1. Írj egy programot, ami beolvas egy egész számot, binárisan összeéseli 512-vel, majd az eredményt
//kíjra.
//Ennek a programnak a segítségével adj meg 3-3 olyan különböző számot ami:
//a. Kisebb mint 512 és a program kimenete 0.
public class Main {
    public static void main(String[] args) {

        int ix = 1024;
        int iy = 43;
        int iz = 87;
        int Osszeeselt1 = ix & 512;
        if (Osszeeselt1 == 0) {
            System.out.println("Ugyes");
        } else {


            System.out.println("Nem ugyes");
        }
        int Osszeeselt2 = iy & 512;
        if (Osszeeselt2 == 0) {
            System.out.println("Ugyes");
        } else {
            System.out.println("Nem ugyes");
        }
        int Osszeeselt3 = iz & 512;
        if (Osszeeselt3 == 0) {
            System.out.println("Ugyes");
        } else {
            System.out.println("Nem ugyes");
        }

        System.out.println(Osszeeselt1);
        System.out.println(Osszeeselt2);
        System.out.println(Osszeeselt3);
    }
}

