package ariketak3;

import java.util.Scanner;

public class Matbatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz1[][] = new int[3][2];
        int matriz2[][] = new int[3][2];
        int emaitza[][] = new int[3][2];
        for (int errenka = 0; errenka < 3; errenka++) {
            for (int zutabe = 0; zutabe < 2; zutabe++) {
                System.out.print("Sartu zenbaki bat 1 matrizean: ");
                matriz1[errenka][zutabe] = sc.nextInt();
            }
        }
        for (int errenka = 0; errenka < 3; errenka++) {
            for (int zutabe = 0; zutabe < 2; zutabe++) {
                System.out.print("Sartu zenbaki bat 2 matrizean: ");
                matriz2[errenka][zutabe] = sc.nextInt();
            }
        }
        sc.close();
        for (int errenka = 0; errenka < 3; errenka++) {
            for (int zutabe = 0; zutabe < 2; zutabe++) {
                emaitza[errenka][zutabe] = matriz1[errenka][zutabe] + matriz2[errenka][zutabe];
                System.out.print(emaitza [errenka][zutabe]+ " ");
            }
            System.out.println(" ");
        }
    }
}
