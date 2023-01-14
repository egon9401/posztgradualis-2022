public class Main {
    public static void main(String[] args) {

        booleanMultihalmaz smh = new booleanMultihalmaz();
        smh.HozzaAd("a");
        smh.HozzaAd("a");
        if (smh.ElemMultiplicitasa("a") == 2) {
            System.out.println("Lehet, hogy jól működik az adatszerkezet");
        } else {
            System.out.println("Tuti rossz az adatszerkezet.");
        }
    }
}

class booleanMultihalmaz {

    private int igazakSzama;
    private int hamisakSzama;

    public booleanMultihalmaz() {
    }

    public void HozzaAd(boolean elem) {
        if (elem = true) {
            igazakSzama++;
        } else
            hamisakSzama++;
    }

    public int Szamossag() {
        return igazakSzama + hamisakSzama;
    }

    public void Kivesz(boolean elem) {
        if (elem = true) {
            --igazakSzama;
        } else
            --hamisakSzama;
    }

    public booleanMultihalmaz Kivon(booleanMultihalmaz kivonando) {


        return new booleanMultihalmaz();
    }

    public booleanMultihalmaz Egyesit(booleanMultihalmaz halmaz) {
        return new booleanMultihalmaz();
    }

    public booleanMultihalmaz Metszet(booleanMultihalmaz metszendo) {
        return new booleanMultihalmaz();
    }

    public void Urit() {
        igazakSzama = 0;
        hamisakSzama = 0;
    }

    public boolean BenneVan(boolean elem) {
        if (elem = true) {
            if (igazakSzama != 0) {
                return true;
            }
        } else {
            if (hamisakSzama != 0)
                return true;

        }
        return false;
    }

    public boolean uresE() {
        return Szamossag() == 0;
    }

    public boolean Ertekek() {
        return true;
    }

    public int ElemMultiplicitasa(boolean elem) {
        return 0;
    }
}