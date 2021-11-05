package ariketak2;

import java.util.Scanner;

public class Triafiwa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        sc.close();
        for (int fila = 1; fila <= zbk; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                System.out.print(fila + " ");
            }
            System.out.println();
        }
    }
}