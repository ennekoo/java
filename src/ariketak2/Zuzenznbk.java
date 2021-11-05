package ariketak2;

import java.util.Scanner;

public class Zuzenznbk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        int zeroak = 0;
        sc.close();
        for (zeroak = 0; zeroak < (double)zbk/2+1; zeroak++) {
            for (int zutabea = 1; zutabea <= zbk; zutabea++) {
                if (zutabea <= zeroak || zutabea > zbk-zeroak) {
                    System.out.print(0);
                } else {
                    System.out.print(zutabea);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        for (zeroak = zeroak - 2; zeroak >= 0; zeroak--) {
            for (int zutabea = 1; zutabea <= zbk; zutabea++) {
                if (zutabea <= zeroak || zutabea > zbk-zeroak) {
                    System.out.print(0);
                } else {
                    System.out.print(zutabea);
                }
                System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}
