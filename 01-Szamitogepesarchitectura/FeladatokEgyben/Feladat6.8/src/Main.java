import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adjon meg egy karakterlancot");
        Scanner sc = new Scanner(System.in);
        String karakterlanc = sc.nextLine();
        String karakterlanc2;

        boolean csillag = true;
        String megallo = String.valueOf('*');
        while (true)
            if (karakterlanc != megallo) {
                System.out.println("Adjon meg egy uj karakterlancot");
                karakterlanc2 = sc.nextLine();

            } else {
                System.out.println("Vege");
            }


    }
}