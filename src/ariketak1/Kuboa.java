package ariketak1;

import java.util.Scanner;

public class Kuboa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double zbk = sc.nextDouble();
        System.out.println(Math.pow(zbk, 3));
        sc.close();
    }
}
