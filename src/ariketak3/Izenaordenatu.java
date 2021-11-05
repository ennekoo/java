package ariketak3;

import java.util.Arrays;
import java.util.Scanner;

public class Izenaordenatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] izenak = new String[3];
        System.out.println("Sartu lehenego izena:");
        izenak[0] = sc.next();
        System.out.println("Sartu bigarren izena:");
        izenak[1] = sc.next();
        System.out.println("Sartu hirugarren izena:");
        izenak[2] = sc.next();
        Arrays.sort(izenak);
        for (int i = 0; i < izenak.length; i++) {
            System.out.println(izenak[i]);
        }
        sc.close();
    }
}
