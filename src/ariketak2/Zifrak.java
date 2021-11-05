package ariketak2;

import java.util.Scanner;

public class Zifrak {
    public static void imprimatuZifra(String zbk) {
        for (int l = 0; l < zbk.length(); l++) {
            System.out.println(zbk.charAt(l));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zbk;
        do {
            zbk = sc.nextLine();
            imprimatuZifra(zbk);
        } while (Integer.parseInt(zbk) != 0);

        sc.close();
    }
}
