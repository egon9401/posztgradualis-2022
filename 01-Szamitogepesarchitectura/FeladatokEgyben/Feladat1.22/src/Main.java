import java.util.Scanner;


public class Main {
    //2. Olvass be két tört számot és írd ki hogy egyenlőek-e vagy sem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("ElsoTort:");
            double dTort1 = sc.nextDouble();
            sc.nextLine();
            System.out.println("MasodikTort");
            double dTort2 = sc.nextDouble();
            sc.nextLine();

            boolean bEgyenloek = (dTort1 == dTort2);


            System.out.println("Egyenloek-e:" + bEgyenloek);


        }


    }
}