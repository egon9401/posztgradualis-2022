public class Main {
    public static void main(String[] args) {

        //5.A  Fibonacci  sorozat  elég  természetellenes  képességű  nyulak  szaporodását  modellezi.
        // A  sorozat úgy  indul,  hogy 𝐹2=𝐹1=1.  Ezek  után  egy  tetszőleges 𝐹𝑛érteke  úgy  számolható  ki,
        // hogy  a sorozat két előző elemét összedadjuk 𝐹𝑛=𝐹𝑛−1+𝐹𝑛−2. (1,1,2,3,5,8,13,...)Számolja ki 𝐹𝑛értékét
        // rekurzió segítségéve.
        int n = 4;

        System.out.println(Fn(n));
    }

    private static int Fn(int n) {
        if (n <= 2) {
            return 1;
        } else {

            return Fn(n - 1) + Fn(n - 2);
        }
    }

}