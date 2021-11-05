package ariketak1;

import java.util.Scanner;

public class Kapitala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dirua: ");
        double diru = sc.nextDouble();
        System.out.println("Tasa: ");
        double tasa = sc.nextDouble();
        System.out.println("Denbora: ");
        double dem = sc.nextDouble();
        System.out.println("Interesa: " + (diru*tasa*dem) / (360*100) + "%%");
        sc.close();
    }
    
}
