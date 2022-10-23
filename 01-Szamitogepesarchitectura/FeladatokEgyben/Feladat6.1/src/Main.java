import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Adj meg egy karakterlancot:");
        String karakterlanc = sc.nextLine();
        int hossz = karakterlanc.length();
        String forditott = "";

        for (int i = hossz-1; i >=0 ; --i) {
           forditott = forditott + karakterlanc.charAt(i);

           if (karakterlanc.equals(forditott))
            {
                System.out.println("Palindrom");

            } else{
                System.out.println("Nem palindrome");
            }
        }

    }
}