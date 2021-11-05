package ariketak2;

import java.util.Scanner;

public class Tabnotak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nt = sc.nextInt();
        if (nt<0 || nt>10) {
            System.out.println("Nota ez da zuzena");
        } else if (nt<3) {
                System.out.println("OSO GUTXI");
            } else if (nt<5) {
                    System.out.println("GUTXI");
                } else if (nt<6) {
                        System.out.println("NAHIKO");
                    } else if (nt<7) {
                            System.out.println("ONDO");
                        } else if (nt<9) {
                            System.out.println("OSO ONDO");
                            } else {
                                System.out.println("BIKAIN");
                            }
        sc.close();

    }
}
