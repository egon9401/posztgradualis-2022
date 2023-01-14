public class Main {
    public static void main(String[] args) {

        StringHalmaz halmaz = new StringHalmaz();
        StringHalmaz halmaz2 = new StringHalmaz();

        halmaz.ElemHozzaadas("alma");
        halmaz.ElemHozzaadas("banan");
        halmaz.ElemHozzaadas("korte");
        halmaz.ElemKivetele("banan");
        halmaz.Szamossaga();
        halmaz.HalmazKivonasa(halmaz2);
        halmaz.Egyesites(halmaz2);
        halmaz.Metszet(halmaz2);
        halmaz.Urites();
        halmaz.Tartamazae("alma");
    }
}

class StringHalmaz {

    //tagvaltozok
    private String[] taroltErtekek;

    //konstruktor

    public StringHalmaz() {
        taroltErtekek = new String[0];

    }

    public boolean ElemHozzaadas(String adat) {
        if (Tartamazae(adat)) {
            return false;
        } else {
            String[] ujHalmaz = new String[taroltErtekek.length + 1];
            for (int i = 0; i < ujHalmaz.length; i++) {
                if (i < ujHalmaz.length - 1) {
                    ujHalmaz[i] = taroltErtekek[i];
                } else
                    ujHalmaz[i] = adat;
            }
            taroltErtekek = ujHalmaz;
            return false;
        }

    }


    public boolean ElemKivetele(String adat) {
        if (!Tartamazae(adat))
            return false;
        String[] ujTaroltElemek = new String[taroltErtekek.length-1];
        boolean atugrottukeMarAkivevendot = false;
        for (int i = 0; i < taroltErtekek.length; i++) {
            if (taroltErtekek[i].equals(adat)) {
                atugrottukeMarAkivevendot = true;
                continue;
            }

            if (!atugrottukeMarAkivevendot)
                ujTaroltElemek[i] = taroltErtekek[i];
            else
                ujTaroltElemek[i - 1] = taroltErtekek[i];
        }
        taroltErtekek = ujTaroltElemek;
        return true;
    }

    public int Szamossaga() {
        int szam = 0;
        for (int i = 0; i < taroltErtekek.length; i++) {
            if (taroltErtekek[i] != null) {
                szam++;
            } else
                return 0;
        }

        return szam;
    }

    public StringHalmaz HalmazKivonasa(StringHalmaz kivonando) {

        for (int i = 0; i < taroltErtekek.length; i++) {
            for (int j = 0; j < kivonando.Szamossaga(); j++) {

            }
        }

        return new StringHalmaz();
    }

    public StringHalmaz Egyesites(StringHalmaz egyesitendo) {

        StringHalmaz eredmeny = new StringHalmaz();

        for (int i = 0; i < this.taroltErtekek.length; i++) {
            eredmeny.ElemHozzaadas(this.taroltErtekek[i]);
        }

        for (int i = 0; i < egyesitendo.taroltErtekek.length; i++) {
            eredmeny.ElemHozzaadas(egyesitendo.taroltErtekek[i]);
        }

        return eredmeny;
    }

    public StringHalmaz Metszet(StringHalmaz metszendo) {
        StringHalmaz ujHalmaz = new StringHalmaz();

        for (int i = 0; i < this.taroltErtekek.length; i++) {
            if (metszendo.Tartamazae(this.taroltErtekek[i])){
                ujHalmaz.ElemHozzaadas(this.taroltErtekek[i]);
            }
        }

        return ujHalmaz;
    }

    public void Urites() {
        String[] halmaz = new String[0];
    }

    public boolean Tartamazae(String adat) {
        for (int i = 0; i < taroltErtekek.length; i++) {
            if (taroltErtekek[i].equals(adat))
                return true;
        }
        return false;
    }

    public boolean UresE() {
        return Szamossaga() == 0;
    }
}
