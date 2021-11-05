package ariketak2;

import java.util.Scanner;

public class Znbkzifrak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int zbk;
        do {
            zbk = sc.nextInt();
            if (zbk >= 0 && zbk < 10) {
                res = res*10+zbk;
            }
        } while (zbk >= 0);
        System.out.println(res);
    sc.close();
    }
}
