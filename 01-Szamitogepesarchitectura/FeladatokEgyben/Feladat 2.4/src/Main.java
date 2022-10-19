public class Main {
    public static void main(String[] args) {
//4. Írj egy programot ami beolvas egy tetszőleges egész számot, majd egy 0 és 4 közötti egész számot.
//Ha a második szám nem 0 és négy közötti, dorongold le a felhasználót.
//Ezek után írd ki az első szám másodikkal binárisan eltolt értékeit mind a három tanult bináris
//eltolás operátorral (<<, >>, >>>)
        int iElsoSzam = 10;
        int iMasodikSzam = 0;

        if (iMasodikSzam > 4) {
            System.out.println("A szam nem jo");
        } else if (iMasodikSzam < 0) {
            System.out.println("A szam nem jo");
        } else {
            System.out.println(iElsoSzam << iMasodikSzam);
            System.out.println(iElsoSzam >> iMasodikSzam);
            System.out.println(iElsoSzam >>> iMasodikSzam);
        }

    }


}
