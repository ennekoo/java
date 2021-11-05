package ariketak1;

import java.util.Scanner;

public class Zirkuluazalera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rd = sc.nextDouble();
        System.out.println(Math.PI * Math.pow(rd, 2));
        sc.close();
    }
}
