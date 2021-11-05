package ariketak2;

import java.util.Scanner;

public class Erronew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double zbk = sc.nextInt();
        double erroa = zbk/2;
        double errorea = Math.abs(erroa*erroa-zbk);
        while (errorea > 0.000000001) {
            erroa = ((zbk/erroa)+erroa)/2;
            errorea = Math.abs(erroa * erroa - zbk);
        }
        System.out.println(erroa);
        sc.close();
    }
}