import java.util.Scanner;

enum Valasztottopcio {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,

}

public class Main {
    public static void main(String[] args) {
        //5. Írjon egy kávé autómata tesztelését segítő alkalmazást. A program úgy működik, hogy a
        //képernyőre kiír egy 5 menüpontból álló programot:
        //a. Espresso, rövid, cukorral – 1
        //b. Espresso, rövid, tejjel és cukorral – 1
        //c. Espresso, hosszu, cukorral – 1
        //d. Espresso, hosszu, tejjel és cukorral – 1
        //e. Cappuccino-1
        //f. Olasz Cappuccino-1
        //g. Moccaccino-2
        //h. Forró csoki-2
        //i. Kilépés
        //A menü kiírása után bekéri az opció menükódját, majd kiírja, hogy „Ön egy XXXX-t vett ZZZZ
        //lejért. Várja meg míg elkészül és fogyassza egészséggel.”

        Scanner sc = new Scanner(System.in);

        System.out.println("Valaszon egy opciot");
        System.out.println("a. Espresso, rövid, cukorral – 1\n" +
                "        //b. Espresso, rövid, tejjel és cukorral – 1\n" +
                "        //c. Espresso, hosszu, cukorral – 1\n" +
                "        //d. Espresso, hosszu, tejjel és cukorral – 1\n" +
                "        //e. Cappuccino-1\n" +
                "        //f. Olasz Cappuccino-1\n" +
                "        //g. Moccaccino-2\n" +
                "        //h. Forró csoki-2\n" +
                "        //i. Kilépés");

        System.out.println("Melyik legyen?:");
        String opcio = sc.nextLine();


        switch (opcio) {
            case "a":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "b":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "c":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "d":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "e":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "f":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "g":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "h":
                System.out.println("Ön egy XXXX-t vett ZZZZ\n" +
                        "        lejért. Várja meg míg elkészül és fogyassza egészséggel");
                return;
            case "i":
                System.out.println("Kilepet");
                return;

        }


    }
}