package ariketak2;

import java.util.Scanner;

public class Kalkubez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        if (zbk > 20000) {
            System.out.println("BEZ-a %16= " + zbk*0.16);
        } else {
            System.out.println("BEZ-a %7= " + zbk*0.07);
        }
        sc.close();
    }
}
