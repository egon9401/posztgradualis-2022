enum ForgovillaAllapot {
    Nyitva,
    Zarva,
    Foglalt,
    Hiba,

}

enum ForgovillaEsemeny {
    AthaladasiKiserlet,
    PenzBedobas ,
    Belerugas ,
    kilepettBelsoOldal,
    kilepettKulsoOldal,
}

public class Main {
    public static void main(String[] args) {

        ForgovillaAllapot eszakiKapuAllapota = ForgovillaAllapot.Nyitva;

        // valami tortenik
        eszakiKapuAllapota = ForgovillaKovetkezoAllapota(eszakiKapuAllapota,
                ForgovillaEsemeny.Belerugas);

        eszakiKapuAllapota = ForgovillaKovetkezoAllapota(eszakiKapuAllapota,
                ForgovillaEsemeny.AthaladasiKiserlet);

        eszakiKapuAllapota = ForgovillaKovetkezoAllapota(eszakiKapuAllapota,
                ForgovillaEsemeny.AthaladasiKiserlet);

        eszakiKapuAllapota = ForgovillaKovetkezoAllapota(eszakiKapuAllapota,
                ForgovillaEsemeny.PenzBedobas);
        eszakiKapuAllapota = ForgovillaKovetkezoAllapota(eszakiKapuAllapota,
                ForgovillaEsemeny.kilepettBelsoOldal);
        eszakiKapuAllapota = ForgovillaKovetkezoAllapota(eszakiKapuAllapota,
                ForgovillaEsemeny.kilepettKulsoOldal);

    }

    private static ForgovillaAllapot ForgovillaKovetkezoAllapota(
            ForgovillaAllapot aktualisAllapot,
            ForgovillaEsemeny aktualisEsemeny
    ) {
        switch (aktualisAllapot) {
            case Nyitva:
                switch (aktualisEsemeny) {
                    case AthaladasiKiserlet:
                        return ForgovillaAllapot.Zarva;
                    case PenzBedobas:
                        return ForgovillaAllapot.Nyitva;
                    case Belerugas:
                        return ForgovillaAllapot.Nyitva;
                    case kilepettBelsoOldal:
                        return ForgovillaAllapot.Hiba;
                    case kilepettKulsoOldal:
                        return ForgovillaAllapot.Hiba;
                    default:
                        throw new IllegalArgumentException();
                }
            case Zarva:
                switch (aktualisEsemeny) {
                    case AthaladasiKiserlet:
                        return ForgovillaAllapot.Zarva;
                    case PenzBedobas:
                        return ForgovillaAllapot.Nyitva;
                    case Belerugas:
                        return ForgovillaAllapot.Zarva;
                    case kilepettBelsoOldal:
                        return ForgovillaAllapot.Hiba;
                    case kilepettKulsoOldal:
                        return ForgovillaAllapot.Hiba;
                    default:
                        throw new IllegalArgumentException();
                }
            case Foglalt:
                switch (aktualisEsemeny) {
                    case AthaladasiKiserlet:
                        return ForgovillaAllapot.Hiba;
                    case PenzBedobas:
                        return ForgovillaAllapot.Hiba;
                    case Belerugas:
                        return ForgovillaAllapot.Foglalt;
                    case kilepettBelsoOldal:
                        return ForgovillaAllapot.Zarva;
                    case kilepettKulsoOldal:
                        return ForgovillaAllapot.Nyitva;
                    default:
                        throw new IllegalArgumentException();
                }

            default:
                throw new IllegalArgumentException();
        }
    }
}