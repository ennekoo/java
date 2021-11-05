package ariketak2;

import java.util.Scanner;

public class Menuaegunak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu egunaren bi karaktereak:");
        String eguna = sc.nextLine();
        sc.close();
        switch (eguna.toUpperCase()) {
            case "AL":
                System.out.println("ASTELEHENA");
                break;
            case "AA":
                System.out.println("ASTEARTEA");
                break;
            case "AZ":
                System.out.println("AZTEAZKENA");
                break;
            case "OG":
                System.out.println("OSTEGUNA");
                break;
            case "OL":
                System.out.println("OSTIRALA");
                break;
            case "LA":
                System.out.println("LARUNBATA");
                break;
            case "IG":
                System.out.println("IGANDEA");
                break;
            default:
                System.out.println("Sartutako kodigoa ez da zuzena");
                break;
        }

    }
}
