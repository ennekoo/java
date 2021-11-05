package ariketak3;

import java.util.Scanner;

public class Izenabanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu izen bat:");
        String izena = sc.nextLine();
        for (int i = 0; i < izena.length(); i++) {
            System.out.println(izena.charAt(i));
        }
        sc.close();
    }
}
