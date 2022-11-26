public class Main {
    public static void main(String[] args) {

        //Egy 𝑛egész szám esetén 𝑛!jelöli 1-től 𝑛-ig a számok szorzatát.
        // 5!=1⋅2⋅3⋅4⋅5. Írjon rekurzív algoritmust amely kiszámolja 𝑛!értékét.

        int n =5;
        System.out.println(faktorialis(n));
    }

    private static int faktorialis(int n) {
        if (n>=1) {
            return n * faktorialis(n-1);
        }
        return 1;
    }
}