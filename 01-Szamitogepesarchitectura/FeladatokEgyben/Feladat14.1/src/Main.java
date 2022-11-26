public class Main {
    public static void main(String[] args) {

        //1.Írjon rekurzív algotmut, ami egy tört számot megszoroz egy egész számmal,
        // kizárólag összeadás művelet használatával.


        double tort = 4.3;
        int egesz = -3;

        double eredmeny = tortesEgeszSzorzataRek(tort, egesz);


    }

    private static double tortesEgeszSzorzataRek(double tort, int egesz) {

        if (egesz != 0 && egesz > 0) {
            return (tort + tortesEgeszSzorzataRek(tort, egesz - 1));


        } else if (egesz < 0) {
            return (-tort + tortesEgeszSzorzataRek(tort, egesz + 1));
        } else
            return 0;


    }
}