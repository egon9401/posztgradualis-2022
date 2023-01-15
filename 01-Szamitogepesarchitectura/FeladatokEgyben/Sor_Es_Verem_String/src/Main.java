public class Main {
    public static void main(String[] args) {

        System.out.println("Verem");
        StringVerem verem = new StringVerem();


        System.out.println("Sor");
        StringSor sor = new StringSor();

    }
}

class StringSor {
    LancoltLista adatokASorban;

    public StringSor() {
        adatokASorban = new LancoltLista();
    }

    public void SorbaAll(String adat) {
        adatokASorban.VegereBeszur(adat);
    }

    public String Sorelhagy() {
        String elsoErtek = adatokASorban.AdottPozicioLekerdezese(0);
        adatokASorban.ElejerolTorol();
        return elsoErtek;
    }

    public boolean Ures() {
        return adatokASorban.Hossz() == 0;
    }

    public String Kukucska() {
        return adatokASorban.AdottPozicioLekerdezese(0);
    }
}

class StringVerem {

    LancoltLista adatokAVeremben;

    public StringVerem() {
        adatokAVeremben = new LancoltLista();
    }

    public void Betesz(String adat) {
        adatokAVeremben.ElejereBeszur(adat);
    }

    public String Kivesz() {
        String elsoErtek = adatokAVeremben.AdottPozicioLekerdezese(0);
        adatokAVeremben.ElejerolTorol();
        return elsoErtek;
    }

    public boolean Ures() {
        return adatokAVeremben.Hossz() == 0;
    }

    public String Kukucska() {
        return adatokAVeremben.AdottPozicioLekerdezese(0);
    }
}

class Lancszem {
    private Lancszem kovetkezo;
    private String adat;

    public void SetKovetkezo(Lancszem kovetkezo) {
        this.kovetkezo = kovetkezo;
    }

    public Lancszem GetKovetkezo() {
        return this.kovetkezo;
    }

    public void SetAdat(String adat) {
        this.adat = adat;
    }

    public String GetAdat() {
        return adat;
    }
}

class LancoltLista {
    private Lancszem elso;

    private Lancszem utolso;

    public LancoltLista() {
        this.elso = null;
        this.utolso = null;
    }

    public int Hossz() {
        Lancszem aktualisLancszem = this.elso;
        int elemszam = 0;
        while (aktualisLancszem != null) {
            ++elemszam;
            aktualisLancszem = aktualisLancszem.GetKovetkezo();
        }
        return elemszam;
    }

    public void AdottPozicionErtekadas(int poz, String adat) {
        Lancszem adottPozicionLevoSzem = this.elso;
        for (int i = 0; i < poz; i++) {
            adottPozicionLevoSzem = adottPozicionLevoSzem.GetKovetkezo();
        }
        adottPozicionLevoSzem.SetAdat(adat);
    }

    public String AdottPozicioLekerdezese(int poz) {
        Lancszem adottPozicionLevoSzem = this.elso;
        for (int i = 0; i < poz; i++) {
            adottPozicionLevoSzem = adottPozicionLevoSzem.GetKovetkezo();
        }
        return adottPozicionLevoSzem.GetAdat();
    }

    public void ElejerolTorol() {
        this.elso = this.elso.GetKovetkezo();
        if (this.elso == null)
            this.utolso = null;
    }

    public void PoziciorolTorol(int poz) {
        if (poz == 0) {
            ElejerolTorol();
            return;
        }

        Lancszem adottPozicioElottiSzem = this.elso;
        for (int i = 0; i < poz - 1; i++) {
            adottPozicioElottiSzem = adottPozicioElottiSzem.GetKovetkezo();
        }
        adottPozicioElottiSzem.SetKovetkezo(adottPozicioElottiSzem.GetKovetkezo().GetKovetkezo());

        // ha a lista vegerol toroltunk
        if (adottPozicioElottiSzem.GetKovetkezo().GetKovetkezo() == null) {
            this.utolso = adottPozicioElottiSzem;
        }
    }

    public void ElejereBeszur(String adat) {
        Lancszem ujElem = new Lancszem();
        ujElem.SetAdat(adat);

        ujElem.SetKovetkezo(this.elso);
        this.elso = ujElem;

        // ures listabol 1 elemu lista
        if (ujElem.GetKovetkezo() == null) {
            this.utolso = ujElem;
        }
    }

    public void VegereBeszur(String adat) {
        if (this.Hossz() == 0) {
            ElejereBeszur(adat);
            return;
        }

        Lancszem ujElem = new Lancszem();
        ujElem.SetAdat(adat);

        this.utolso.SetKovetkezo(ujElem);
        this.utolso = ujElem;
    }

    public void PozicioraBeszur(int poz, String adat) {
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

            // ha a lista vegere szurtunk, az utolsot is allitani kell
            if (ujElem.GetKovetkezo() == null) {
                this.utolso = ujElem;
            }
        }
    }
}