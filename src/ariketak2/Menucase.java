package ariketak2;

import java.util.Scanner;

public class Menucase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu lehenengo zenbakia:");
        int x = sc.nextInt();
        System.out.println("Sartu bigarren zenbakia:");
        int z = sc.nextInt();
        System.out.println( "Aukeratu eragiketa\n" +
                            "1.- Batuketa\n" +
                            "2.- Kenketa\n" +
                            "3.- Biderketa\n" +
                            "4.- Zatiketa\n" +
                            "5.- Ondarra\n" +
                            "6.- Irten\n"
        );
        int eragiketa = sc.nextInt();
        sc.close();
        switch (eragiketa) {
            case 1:
                System.out.println(x+z);
                break;
            case 2:
                System.out.println(x-z);
                break;
            case 3:
                System.out.println(x*z);
                break;
            case 4:
                System.out.println(x/z);
                break;
            case 5:
                System.out.println(x%z);
                break;
            case 6:
                System.out.println("Agur");
            default:
                break;
        }
    }
}
