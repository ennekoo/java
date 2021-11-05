package ariketak2;

import java.util.Scanner;

public class Hipotenusa {
    public static double erroNewton (double zbk){
        double erroa = zbk/2;
        double errorea = Math.abs(erroa*erroa-zbk);
        while (errorea > 0.000000001) {
            erroa = ((zbk/erroa)+erroa)/2;
            errorea = Math.abs(erroa * erroa - zbk);
        }
        return erroa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Kateto 1: ");
        double a = sc.nextDouble();
        System.out.println("Kateto 2: ");
        double b = sc.nextDouble();

        double h = erroNewton(a*a+b*b);
        System.out.println("Hipotenusa= " +h);
        sc.close();
    }
}
