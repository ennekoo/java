package ariketak2;

import java.util.Scanner;

public class Aurkeztuzbkw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        int kont = 1;
        sc.close();
        while (kont <= zbk) {
            System.out.println(kont);
            kont++;
        }
    }
}
