package ariketak2;

import java.util.Scanner;

public class Znbklehena {
    public static void main(String[] ARGS) {
        Scanner sc = new Scanner(System.in);
        int zenbatzailea;
        int zbk;

        System.out.print("Sartu zenbakia: ");
        zbk = sc.nextInt();

        zenbatzailea = 0;

        for (int i = 1; i <= zbk; i++) {
            if ((zbk % i) == 0) {
                zenbatzailea++;
            }
        }

        if (zenbatzailea <= 2) {
            System.out.println("Zenbakia lehena da");
        } else {
            System.out.println("Zenbakia ez da lehena");
        }
        sc.close();
    }
}
