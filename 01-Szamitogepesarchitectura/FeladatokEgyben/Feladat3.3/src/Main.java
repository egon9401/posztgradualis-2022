import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //3. Írj programot amiben a felhasnzálónak lehetősége van megadni, hogy egy kör sugarát vagy
        //átmérőjét szeretné megadni. Ezek után kérd be a választott adatot, majd számold ki a kör területét
        //és írd ki.

        Scanner sc = new Scanner(System.in);
        System.out.println("Irjon 1 et ha a kor sugarat akarja kiszamolni valamint 2 t ha az atmerojet akarja megkapni");
        int kor = sc.nextInt();
        double pi = 3.14;

        switch (kor) {

            case 1:
                System.out.println("Adja meg a kor sugarat:");
                int korsugara = sc.nextInt();
                double eredmeny1 = pi * (korsugara * korsugara);
                System.out.println(eredmeny1);
                break;
            case 2:
                System.out.println("Adja meg a kor atmerojet:");
                int koratmeroje = sc.nextInt();
                double eredmeny2 = pi * (koratmeroje / 2) * (koratmeroje/2);
                System.out.println(eredmeny2);
                break;
        }

    }
}
