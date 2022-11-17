import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //12. Írj egy programot amely feltölt egy 10 elemű tömböt véletlen tört számokkal, kiírja a tömb
        //elemeit, megcseréli a legnagyobb és a legkisebb számot, majd újra kiírja a tömböt.
        Random tortek = new Random();
        double[] tomb = new double[10];
        double legnagyobbElem;
        double legKisebbElem;

        for (int i = 0; i < 10; i++) {
            tomb[i] = tortek.nextDouble();


        }
        System.out.println("A veletlen tortek");
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);


        }
        legnagyobbElem = getLegnagyobbElem(tomb);
        System.out.println("Legnagyobb elem" + " " + legnagyobbElem);
        legKisebbElem = getLegKisebbElem(tomb);
        System.out.println("Legkisebb elem" + " " + legKisebbElem);

        double temp = legKisebbElem;
        legKisebbElem = legnagyobbElem;
        legnagyobbElem = temp;
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);

        }






    }

    private static double getLegnagyobbElem(double[] tomb) {
        double legnagyobbElem;
        legnagyobbElem = tomb[0];


        for (int i = 0; i < tomb.length; i++) {
            if (legnagyobbElem < tomb[i]) {

                legnagyobbElem = tomb[i];


            }

        }
        return legnagyobbElem;
    }

    private static double getLegKisebbElem(double[] tomb) {
        double legKisebbElem;
        legKisebbElem = tomb[0];

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < legKisebbElem) {

                legKisebbElem = tomb[i];

            }

        }
        return legKisebbElem;
    }


}