import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Gyakorlas
        //2. Kérjen be egy karakterláncot. Majd ahány karakter van ebben (pl. alma esetén 4, kiskutya esetén
        //8), annyiszor írja ki az első karaktert (pl. alma esetén aaaa, kiskutya esetén kkkkkkkk).

        Scanner sc = new Scanner(System.in);
        int i;
        quiz(7);

    }

    private static void quiz(int i) {
        if (i > 1) {
            quiz(i / 3);
            quiz(i - 4);
        }
        System.out.print("*");
    }

}