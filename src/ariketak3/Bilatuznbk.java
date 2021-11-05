package ariketak3;

import java.util.Scanner;

public class Bilatuznbk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizea = { { 1, 4, 7 }, { 3, 3, 8 }, { 7, 9, 9 }, { 5, 3, 2 } };
        System.out.println("Sartu zenbaki bat:");
        int zbk = sc.nextInt();
        sc.close();
        for (int errenka = 0; errenka < 4; errenka++) {
            for (int zutabe = 0; zutabe < 3; zutabe++) {
                if (zbk==matrizea[errenka][zutabe]) {
                    System.out.println("Zenbakia, "+(errenka+1)+", "+(zutabe+1)+" posizioan dago");
                }
            }
        }      
    }
}