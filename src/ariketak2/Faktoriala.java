package ariketak2;

import java.util.Scanner;

public class Faktoriala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        int kont = 1;
        int era = 1;
        sc.close();
        while (kont <= zbk) {
            era = era * kont;
            kont++;
        }
        System.out.println(era);
    }
}