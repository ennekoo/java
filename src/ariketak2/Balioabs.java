package ariketak2;

import java.util.Scanner;

public class Balioabs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        if (zbk<0) {
            System.out.println(-zbk);
        } else {
            System.out.println(zbk);
        }
        sc.close();
    }
}
