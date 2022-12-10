public class Main {

    //3.Írjuk  ki  egy 𝑛pozitív  egész  szám  összes  összegfelbontását,
    // vagyis  az  osszes  olyan  felbontást, amiben pozitív egész számok összegeként előállítható.
    // Pl.: 4=1+1+1+1=1+1+2=1+3=2+2

    private static int[] aktualisReszmegoldas;

    private static int szam = 4;

    public static void main(String[] args) {

        int helyesMegoldasokSzama = 0;
        KezdetiReszmegoldadBeallitasa(szam);

        // backtracking iterativan
        int aktualisSzint = 0;
        while (aktualisSzint >= 0) {
            boolean azonosSzintenVoltUjKezdemeny = false;
            boolean ujKezdemenyEldobando = false;
            do {
                azonosSzintenVoltUjKezdemeny = SzintenBelulUjReszmegoldas(aktualisSzint);
                if (azonosSzintenVoltUjKezdemeny)
                    ujKezdemenyEldobando = EldobandoReszmegoldas(aktualisSzint);
            } while (azonosSzintenVoltUjKezdemeny && ujKezdemenyEldobando);

            if (!ujKezdemenyEldobando && azonosSzintenVoltUjKezdemeny) {
                if (TeljesMegoldas(aktualisSzint)) {
                    // dolgozzuk
                    ++helyesMegoldasokSzama;
                    MegoldasKiirasa(helyesMegoldasokSzama, aktualisReszmegoldas);
                } else {
                    // szintlepes
                    ++aktualisSzint;
                    // reszmegoldas specifikalasa
                }
            } else {
                // backtrack
                // szint lepes lefele
                --aktualisSzint;
                aktualisReszmegoldas[aktualisSzint + 1] = 0;
            }
        }
    }

    private static void KezdetiReszmegoldadBeallitasa(int n) {
        aktualisReszmegoldas = new int[n];


    }

    private static boolean TeljesMegoldas(int aktualisSzint) {

        int aktualisReszosszeg = 0;
        for (int i = 0; i < aktualisReszmegoldas.length; i++) {
            aktualisReszosszeg += aktualisReszmegoldas[i];
        }

        return aktualisReszosszeg == szam;
    }

    private static boolean EldobandoReszmegoldas(int aktualisSzint) {
        // [1,0,0,0]
        // [1,1,0,0]
        // [1,2,0,0]
        // [1,3,0,0]
        // [1,4,0,0]
        int aktualisReszosszeg = 0;
        for (int i = 0; i < aktualisReszmegoldas.length; i++) {
            aktualisReszosszeg += aktualisReszmegoldas[i];
        }

        return aktualisReszosszeg > szam;
    }

    private static boolean SzintenBelulUjReszmegoldas(int aktualisSzint) {

        // [1,1,0,0]
        // [1,2,0,0]
        // [1,3,0,0]
        int aktualisReszosszeg = 0;
        for (int i = 0; i < aktualisReszmegoldas.length; i++) {
            aktualisReszosszeg += aktualisReszmegoldas[i];
        }
        if (aktualisReszosszeg >= szam)
            return false;
        aktualisReszmegoldas[aktualisSzint]++;
        return true;


    }

    private static void MegoldasKiirasa(long megoldasiTippekSzama, int[] megoldasTipp) {
        System.out.print("#" + megoldasiTippekSzama + ": ");
        for (int i = 0; i < aktualisReszmegoldas.length; i++) {
            System.out.print(aktualisReszmegoldas[i]+"+");
        }

    }
}