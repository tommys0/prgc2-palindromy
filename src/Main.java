public class Main {

    public static void main(String[] args) {
        int biggestPalindom = najdiNejvetsiPalindrom();
        System.out.println(biggestPalindom);
    }

    private static int najdiNejvetsiPalindrom() {
        int biggestPalindrom = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int soucin = i * j;

                if (isPalindrom(soucin) && soucin > biggestPalindrom) {
                    biggestPalindrom = soucin;
                }
            }
        }

        return biggestPalindrom;
    }

    private static boolean isPalindrom(int cislo) {
        String cisloStr = String.valueOf(cislo);
        String obraceneCisloStr = new StringBuilder(cisloStr).reverse().toString();
        return cisloStr.equals(obraceneCisloStr);
    }
}
