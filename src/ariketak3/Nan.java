package ariketak3;

import java.util.Scanner;

public class Nan {

    private static String eskatuNAN(Scanner sc) {
        String nan;
        do {
            System.out.println("Sartu zure NAN-a:");
            nan = sc.nextLine();
        } while (nan.length() != 9 || nan.toUpperCase().charAt(8)<'A' || nan.toUpperCase().charAt(8)>'Z');
        return nan;
    }

    private static boolean nankalkulatu(int nanzbk, char letra) {
        char[] letrak = {'T', 'R', 'W', 'A','G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letrak[nanzbk%23] == letra;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nan;
        char letra;
        int nanzbk = -1;
        do {
            nan = eskatuNAN(sc);
            letra = nan.toUpperCase().charAt(8);
            nan = nan.substring(0, 8);
            try {
                nanzbk = Integer.parseInt(nan);
            } catch (Exception e) {
                System.out.println("Nan-a 8 zenbaki eta letra bakarra izan behar du.");
            }
        } while (nanzbk == -1);
        sc.close();

        if (nankalkulatu(nanzbk, letra)) {
            System.out.println("NAN zenbakia eta letra zuzenak dira.");
        }else{
            System.out.println("NAN zenbakia eta letra ez da zuzena.");
        }
    }
}
