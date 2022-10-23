import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. Kérjen be egy karakterláncot. Majd ahány karakter van ebben (pl. alma esetén 4, kiskutya esetén
        //8), annyiszor írja ki az első karaktert (pl. alma esetén aaaa, kiskutya esetén kkkkkkkk).

        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy karakterlancot:");
        String karakterlanc = sc.nextLine();

        for (int i = 0; i < karakterlanc.length(); i++) {
            System.out.println(karakterlanc.charAt(0));
        }

    }
}