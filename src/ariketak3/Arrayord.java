package ariketak3;

import java.util.Scanner;

public class Arrayord {
    private static int[] array = new int[10];
    private static int posizioa = 0;

    public static void sartu(int zbk) {
        boolean amaitu = false;
        if (posizioa == 0) {
            array[posizioa] = zbk;
        } else {
            for (int i = posizioa - 1; i >= 0 && !amaitu; i--) {
                if (array[i] > zbk) {
                    array[i + 1] = array[i];
                } else {
                    array[i + 1] = zbk;
                    amaitu = true;
                }
            }
            if (!amaitu) {
                array[0] = zbk;   
            }
        }
        posizioa++;
    }

    public static void imprimatu() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk;
        do {
            zbk = sc.nextInt();
            if (zbk > 0) {
                sartu(zbk);
            }
        } while (zbk > 0 && posizioa < array.length);
        imprimatu();
        sc.close();
    }
}
