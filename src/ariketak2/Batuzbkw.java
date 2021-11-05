package ariketak2;

import java.util.Scanner;

public class Batuzbkw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        int kont = 0;
        int era = 0;
        sc.close();
        while (kont <= zbk) {
            era = era + kont;
            kont++;
        }
        System.out.println(era);
    }
}