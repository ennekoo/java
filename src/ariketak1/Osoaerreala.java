package ariketak1;

import java.util.Scanner;

public class Osoaerreala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double zbk = sc.nextDouble();
        double parteDecimal = zbk % 1;
        double parteEntera = zbk - parteDecimal;
        System.out.printf("Parte entera: %f. Parte decimal: %f\n", parteEntera, parteDecimal);
        sc.close();
}    
}
