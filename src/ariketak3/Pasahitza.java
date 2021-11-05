package ariketak3;

import java.util.Scanner;

public class Pasahitza {
    public static void main(String[] args) {
        String[][] pasahitzak = new String[10][2];
        pasahitzak[0][0] = "user";
        pasahitzak[0][1] = "pass";
        pasahitzak[1][0] = "Julen";
        pasahitzak[1][1] = "1234";
        pasahitzak[2][0] = "Eneko";
        pasahitzak[2][1] = "1234";
        pasahitzak[3][0] = "Asier";
        pasahitzak[3][1] = "1234";
        pasahitzak[4][0] = "Jessica";
        pasahitzak[4][1] = "1234";
        pasahitzak[5][0] = "Aritz";
        pasahitzak[5][1] = "1234";
        pasahitzak[6][0] = "Iker";
        pasahitzak[6][1] = "1234";
        pasahitzak[7][0] = "Unai";
        pasahitzak[7][1] = "1234";
        pasahitzak[8][0] = "Bittor";
        pasahitzak[8][1] = "1234";
        pasahitzak[9][0] = "Irati";
        pasahitzak[9][1] = "1234";

        Scanner sc = new Scanner(System.in);
        int saiakera = 0;
        String erabiltzaile;
        String pasahitza;
        boolean pasa = false;
        do {
            System.out.println("Sartu erabiltzailea:");
            erabiltzaile = sc.next();
            System.out.println("Sartu pasahitza:");
            pasahitza = sc.next();
            for (int i = 0; i < pasahitzak.length && !pasa; i++) {
                if (pasahitzak[i][0].equals(erabiltzaile)) {
                    if (pasahitzak[i][1].equals(pasahitza)) {
                        System.out.println("Oso ondo.");
                        pasa = true;
                    } else {
                        System.out.println("Pasahitz okerra.");
                    }
                }
            }
            if (!pasa) {
                System.out.println("Erabiltzailea ez da existitzen");
            }
            saiakera++;
        } while (saiakera < 3 && !pasa);
        sc.close();
    }
}
