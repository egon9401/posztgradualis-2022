public class Main {
    public static void main(String[] args) {

        //4.Írjon olyan függvényt egy láncolt lista típusra,
        // ami két pozíció paramétert kap és a két adott helyen lévő elemet felcseréli a listában.

        LancoltLista lista = new LancoltLista();
        LancoltLista lista2 = new LancoltLista();

        lista.ElejereBeszur(2); // 2
        lista.ElejereBeszur(-5); // -5 2
        lista.PozicioraBeszur(1, 7); // -5 7 2
        lista.PozicioraBeszur(3, 3);

        for (int i = 0; i < lista.Hossz(); i++) {
            System.out.print("  " + lista.AdottPozicioLekerdezese(i) + "  ");
        }
        System.out.println();

        lista.PozicioCsere(1,3 );

        for (int i = 0; i < lista.Hossz(); i++) {
            System.out.print("  " + lista.AdottPozicioLekerdezese(i) + "  ");
        }

        System.out.println();
        System.out.println(lista.Hossz());

        lista.AdottPozicionErtekadas(0, 0);
        lista.AdottPozicionErtekadas(1, 1);
        lista.AdottPozicionErtekadas(2, 2); // 0 1 2
        System.out.println("A lis masodik elem: " + lista.AdottPozicioLekerdezese(1));
        lista.PoziciorolTorol(1); // 0 2
        lista.PoziciorolTorol(1); // 0
        System.out.println("A lista elso eleme: " + lista.AdottPozicioLekerdezese(0));
        lista.ElejerolTorol();// {}
        System.out.println("A lista hossza: " + lista.Hossz());
    }
}

class Lancszem {
    private Lancszem kovetkezo;
    private int adat;

    public void SetKovetkezo(Lancszem kovetkezo) {
        this.kovetkezo = kovetkezo;
    }

    public Lancszem GetKovetkezo() {
        return this.kovetkezo;
    }

    public void SetAdat(int adat) {
        this.adat = adat;
    }

    public int GetAdat() {
        return adat;
    }
}

class LancoltLista {
    private Lancszem elso;

    public LancoltLista() {
        this.elso = null;
    }

    public int Hossz() {
        int hossz = 0;
        Lancszem elso1 = this.elso;


        while (elso1 != null) {
            hossz++;
            elso1 = elso1.GetKovetkezo();

        }
        return hossz;
    }

    public void AdottPozicionErtekadas(int poz, int adat) {
        Lancszem adottPozicionLevoSzem = this.elso;
        for (int i = 0; i < poz; i++) {
            adottPozicionLevoSzem = adottPozicionLevoSzem.GetKovetkezo();
        }
        adottPozicionLevoSzem.SetAdat(adat);
    }

    public int AdottPozicioLekerdezese(int poz) {
        Lancszem adottPozicionLevoSzem = this.elso;
        for (int i = 0; i < poz; i++) {
            adottPozicionLevoSzem = adottPozicionLevoSzem.GetKovetkezo();
        }
        return adottPozicionLevoSzem.GetAdat();
    }

    public void ElejerolTorol() {
        if (this.elso != null) {
            this.elso = this.elso.GetKovetkezo();
        }
    }

    public void PoziciorolTorol(int poz) {

        if (elso == null) {
            return;
        }
        if (poz == 0) {
            elso = elso.GetKovetkezo();
            return;
        }

        Lancszem torlendoElotti = elso;
        for (int i = 0; torlendoElotti != null && i < poz - 1; i++) {
            torlendoElotti = torlendoElotti.GetKovetkezo();

        }
        Lancszem torlendoUtani = torlendoElotti.GetKovetkezo().GetKovetkezo();

        torlendoElotti.SetKovetkezo(torlendoUtani);

    }

    public void ElejereBeszur(int adat) {
        Lancszem ujElem = new Lancszem();
        ujElem.SetAdat(adat);

        ujElem.SetKovetkezo(this.elso);
        this.elso = ujElem;
    }

    public void PozicioraBeszur(int poz, int adat) {
        if (poz == 0) {
            ElejereBeszur(adat);
        } else {
            Lancszem ujElem = new Lancszem();
            ujElem.SetAdat(adat);

            // utolso elem a pozicio elott
            Lancszem beszurandoElotti = this.elso;
            for (int i = 1; i < poz; i++) {
                beszurandoElotti = beszurandoElotti.GetKovetkezo();
            }

            ujElem.SetKovetkezo(beszurandoElotti.GetKovetkezo());
            beszurandoElotti.SetKovetkezo(ujElem);
        }
    }

    public void PozicioCsere(int poz1, int poz2) {
        Lancszem pozitio1 = this.elso;
        Lancszem pozitio2 = this.elso;



        for (int i = 0; i < poz1; i++) {
            pozitio1 = pozitio1.GetKovetkezo();
        }
        for (int i = 0; i < poz2; i++) {
            pozitio2 = pozitio2.GetKovetkezo();
        }

        pozitio1.SetAdat(pozitio2.GetAdat());
        pozitio2.SetAdat(pozitio1.GetAdat());





    }


}