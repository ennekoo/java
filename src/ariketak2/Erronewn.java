package ariketak2;

import java.util.Scanner;

public class Erronewn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double zbk;

    do {   
        zbk = sc.nextInt();
        if (zbk > 0) {
            double erroa = zbk/2;
            double errorea = Math.abs(erroa*erroa-zbk);
            while (errorea > 0.000000001) {
                erroa = ((zbk/erroa)+erroa)/2;
                errorea = Math.abs(erroa * erroa - zbk);
            }
            System.out.println(erroa);
        }
        } while (zbk > 0);
        sc.close();
    }
}