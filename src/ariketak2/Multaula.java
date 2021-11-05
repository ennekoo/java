package ariketak2;

import java.util.Scanner;

public class Multaula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        sc.close();
        for (int i = 0; i < 11; i++) { //int variable empezando de 0 11 multiplicaciones y sumando 1 en la variable i
            System.out.printf("%d x %d = %d\n", zbk, i, zbk*i);
        }
    }
}
