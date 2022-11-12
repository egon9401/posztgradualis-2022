import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //2. Írj egy programot, ami beolvas 3 keresztnevet (feltételezhető, hogy amit beír a felhasználó, az
        //keresztnév), majd ezeket ábécé sorrendben kiírja. Ne használj beépített rendező függvényt.

        Scanner sc = new Scanner(System.in);
        String[] nevek = new String[3];
        int temp = 0;

        System.out.println("Adja meg az 1. nevet");
        nevek[0] = sc.nextLine();
        System.out.println("Adja meg az 2. nevet");
        nevek[1] = sc.nextLine();
        System.out.println("Adja meg az 3. nevet");
        nevek[2] = sc.nextLine();

        for (int i = 0; i < nevek.length ; i++) {
            for (int j = 0; j < nevek.length ; j++) {
                if(nevek[i]) > nevek[j])
                temp = nevek[i];
                        nevek[i] = nevek[j];
                        nevek[j] = temp;


            }


        }

        }

        System.out.println("Hello world!");
    }
}