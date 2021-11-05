package ariketak2;

import java.util.Scanner;

public class Menuahilabeteak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu egunaren bi karaktereak:");
        String hila = sc.nextLine();
        sc.close();
        switch (hila.toLowerCase()) {
            case "urtarrila":
                System.out.println("1");
                break;
            case "otsaila":
                System.out.println("2");
                break;
            case "martxoa":
                System.out.println("3");
                break;
            case "apirila":
                System.out.println("4");
                break;
            case "maiatza":
                System.out.println("5");
                break;
            case "ekaina":
                System.out.println("6");
                break;
            case "uztaila":
                System.out.println("7");
                break;
            case "abuztua":
                System.out.println("8");
                break;
            case "iraila":
                System.out.println("9");
                break;
            case "urria":
                System.out.println("10");
                break;
            case "azaroa":
                System.out.println("11");
                break;
            case "abendua":
                System.out.println("12");
                break;
            default:
                System.out.println("Sartutako hilabetea ez da zuzena");
                break;
        }

    }
}
