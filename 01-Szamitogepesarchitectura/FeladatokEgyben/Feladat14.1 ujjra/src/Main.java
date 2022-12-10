public class Main {
    public static void main(String[] args) {

        double tort = 3.5;
        int egesz = 4;

        double eredmeny = szorzas(tort,egesz);
        System.out.println(eredmeny);
    }

    private static double szorzas(double tort, int egesz) {
        if (egesz != 0 && egesz > 0) {
            return (tort + szorzas(tort, egesz-1));
        } else if (egesz <0) {
            return (-tort + szorzas(tort, egesz+1));

        } else
        return 0;
    }
}