public class Main {
    public static void main(String[] args) {

        //2.Írjon  ki  a  képernyőre  n  darab  csillagot.
        // Oldja  meg  kétféleképpen  is.  Iteratív  módon  és  rekurzíó felhasználásával.
        int n = 10;

        System.out.println(csillagRek(n));
        System.out.println(csillag(n));
    }

    private static String csillagRek(int n) {
        String eredmeny= "";
        if (n > 0) {

        eredmeny = '*' +csillagRek(n-1);
        }return eredmeny;

    }

    private static char csillag(int n) {
        for (int i = 0; i < n-1; i++) {
            System.out.println('*');

        }
        return '*' ;
    }
}