package ariketak2;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int urte = sc.nextInt(); 
        if ((urte % 4 == 0) && ((urte % 100 != 0) || (urte % 400 == 0)))
	        System.out.println("URTEA BISIESTOA DA");
        else
	        System.out.println("URTEA EZ DA BISIESTOA");
        sc.close();
    }
}
