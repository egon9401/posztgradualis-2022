import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        char[] tomb = new char[100];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (char) (r.nextInt(26) + 97);
            System.out.println(tomb[i]);
            System.out.println("-");
        }

        char[] uj = new char[100];
        int szam = 100;
        for (int i = 0; i < 100; i++) {
            uj[szam - 1] = tomb[i];
            szam = szam - 1;

            for (int j = 0; j < 100; j++) {
                System.out.println(uj[j]);
                System.out.println("+");

            }

        }
    }
}