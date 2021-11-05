package ariketak3;

import java.util.Scanner;

public class Betematrizea01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taula[][] = new int[4][3];
        for (int errenka = 0; errenka < 4; errenka++) {
            for (int zutabe = 0; zutabe < 3; zutabe++) {
                System.out.println("Sartu zenbaki bat: ");
                taula[errenka][zutabe] = sc.nextInt();
            }
        }
        sc.close();
        for (int errenka = 0; errenka < 4; errenka++) {
            for (int zutabe = 0; zutabe < 3; zutabe++) {
                System.out.print(taula[errenka][zutabe] + " ");
            }
            System.out.println();
        }
    }
}
