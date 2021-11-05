package ariketak2;

import java.util.Scanner;

public class Aurkeztubikw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        int kont = 0;
        sc.close();
        while (kont <= zbk) {
            System.out.println(kont);
            kont+=2; //kont = kont + 2
        }
    }
}