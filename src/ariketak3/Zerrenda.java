package ariketak3;

import java.util.Scanner;

public class Zerrenda {

    private static final int IKASLEAK = 5;
    private static final String[] IKASGAIAK = { "Sareak", "Datu baseak", "Programazioa" };

    private static String[][] izenAbizena = new String[IKASLEAK][2];
    private static int[][] notak = new int[IKASLEAK][IKASGAIAK.length];

    private static void hasieratu() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < IKASLEAK; i++) {
            System.out.println("Ikaslearen izena:");
            izenAbizena[i][0] = sc.nextLine();
            System.out.println("Ikaslearen abizena:");
            izenAbizena[i][1] = sc.nextLine();
            for (int j = 0; j < IKASGAIAK.length; j++) {
                System.out.printf("Sartu nota (%s): \n", IKASGAIAK[j]);
                notak[i][j] = notaIrakurri(sc);
            }
        }
        sc.close();
    }

    private static int notaIrakurri(Scanner sc) {
        int nota = -1;
        do {
            try {
                nota = Integer.parseInt(sc.nextLine());
                if (nota > 10 || nota < 0) {
                    System.out.println("Nota 0 eta 10 artean egon behar da.");
                }
            } catch (Exception e) {
                System.out.println("Nota zenbaki oso bat izan behar da (0-10).");
            }
        } while (nota > 10 || nota < 0);
        return 0;
    }

    private static void impIkasleDatuak(int ikasle) {
        double batazbeste = 0;
        int zenbatGutxi = 0;
        int notaAltuena;
        int notaTxikiena;
        for (int i = 0; i < IKASGAIAK.length; i++) {
            batazbeste += notak[ikasle][i];
        }
        batazbeste /= IKASGAIAK.length;
    }

    public static void main(String[] args) {
        hasieratu();
        for (int ikasle = 0; ikasle < args.length; ikasle++) {
            impIkasleDatuak(ikasle);
        }
    }
}
