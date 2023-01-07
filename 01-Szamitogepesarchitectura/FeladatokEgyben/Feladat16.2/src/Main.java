public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class StringHalmaz {

    //tagvaltozok

    //konstruktor

    public StringHalmaz() {

    }

    public boolean ElemHozzaadas(String adat) {
        return true;
    }

    public boolean ElemKivetele(String adat) {
        return true;
    }

    public int Szamossaga() {
        return 0;
    }

    public StringHalmaz HalmazKivonasa(StringHalmaz kivonando) {
        return new StringHalmaz();
    }

    public StringHalmaz Egyesites(StringHalmaz egyesitendo) {
        return new StringHalmaz();
    }

    public StringHalmaz Metszet(StringHalmaz metszendo) {
        return new StringHalmaz();
    }

    public void Urites() {

    }

    public boolean Tartamazae(String adat) {
        return true;
    }
}