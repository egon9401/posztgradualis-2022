public class Main {
    public static void main(String[] args) {

        //Irja meg a mar ismert egyszeru, vagy a bonyolultabb palindrom teszteles algoritmusat rekurzivan.
        //A rekurzio burkolofuggvenye egy karakterlancot var parameterkent es egy
        // igaz/hamis erteket ad vissza, miszerint a kapott karakterlanc palindrom, vagy nem

        String szo = "aabbaa";

        System.out.println("A szo" + Palindrom(szo));
    }

    private static boolean Palindrom(String szo) {
        if (szo.length() == 0 || szo.length() == 1) {
            return true;

        }
        if (szo.charAt(0) == szo.charAt(szo.length() - 1)) {

            return Palindrom(szo.substring(1, szo.length() - 1));

        }

        return false;
    }
}