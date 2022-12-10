public class Main {
    public static void main(String[] args) {
        int v[] = {38, 27, 43, 3, 9, 82, 10};
        int v1[] = {43, 27, 38};
        int v2[] = {3, 9, 10, 82};

        MergeSort(v);
RendezettTombokOsszeFesulese(v1, v2);
    }

    private static void MergeSort(int[] v) {
        if (v.length <= 1) {
            return;
        }
        // vagd kette a tombot

        // rendezd a ket altombot

        // fesuld ossze az eredmenyeket
    }

    private static int[] RendezettTombokOsszeFesulese(int[] v1, int[] v2) {

        int[] osszefesult = new int[v1.length + v2.length];

        int aktualisanFeltoltendoElemHelye = 0;
        int szabadElemV1ben = 0;
        int szabadElemV2ben = 0;
        // valasztunk a ket szabadbol, amig van mindkettoben szabad
        while (szabadElemV1ben < v1.length && szabadElemV2ben < v2.length) {
            if (v1[szabadElemV1ben] <= v2[szabadElemV2ben]) {
                osszefesult[aktualisanFeltoltendoElemHelye] = v1[szabadElemV1ben];
                aktualisanFeltoltendoElemHelye++;
                szabadElemV1ben++;
            } else {
                osszefesult[aktualisanFeltoltendoElemHelye] = v2[szabadElemV2ben];
                aktualisanFeltoltendoElemHelye++;
                szabadElemV2ben++;
            }
        }
            // ha meg v1 van, az osszeset atmasoljuk
            while (szabadElemV1ben < v1.length) {
                osszefesult[aktualisanFeltoltendoElemHelye] = v1[szabadElemV1ben];
                szabadElemV1ben++;
                aktualisanFeltoltendoElemHelye++;
            }


            // ha meg v2 van, az osszeset atmasoljuk
            while (szabadElemV1ben < v2.length) {
                osszefesult[aktualisanFeltoltendoElemHelye] = v2[szabadElemV1ben];
            szabadElemV2ben++;
            aktualisanFeltoltendoElemHelye++;

        }


        return osszefesult;
    }


}
