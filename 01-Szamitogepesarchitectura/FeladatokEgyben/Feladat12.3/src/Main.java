enum fotocellaAllapot {
    Zarva,
    Nyitva,
    Osszecsukodik,
    Kinyilik;
}
enum fotocellaEsemenyek{
    Nyilik,
    Zarva,
    Valakiterzekel,
    Nemerzekelsenkit;

}
public class Main {
    public static void main(String[] args) {

        fotocellaAllapot foAjtoAllapota = fotocellaAllapot.Zarva;

        private static fotocellaAllapot fotocellaKovetkezoAllapota(
        foAjtoAllapota = fotocellaKovetkezoAllapota(fotocellaAllapot, fotocellaEsemenyek.Zarva)


                fotocellaAllapot aktualisAllapot;
                fotocellaEsemenyek aktualisEsemeny;
        ){
            switch (aktualisAllapot) {
                case Zarva:
                    switch (aktualisEsemeny) {
                        case Valakiterzekel:
                            return fotocellaAllapot.Kinyilik;
                        case Nemerzekelsenkit:
                            return fotocellaAllapot.Zarva;
                    }
                case Nyitva:
                    switch (aktualisEsemeny) {
                        case Osszecsukodik:
                            return fotocellaAllapot.Zarva;

                    }

            }
        }

        //3.Írjon  egy  állapotgépet  ami  egy  fotocellás  ajtó  működését  modellezi.
        // Modellezze,  hogy  milyen állapotai lehetnek, illetve milyen ingerek érhetnek egy fotocellás ajtót.

    }
}