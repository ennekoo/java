package ariketak2;

import java.util.Scanner;

public class Bakbic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zbk = sc.nextInt();
        if (zbk%2 == 0) {
            System.out.println("BIKOITIA");
        } else {
            System.out.println("BAKOITIA");
        }
        sc.close();
    }
}
