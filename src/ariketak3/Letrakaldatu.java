package ariketak3;

import java.util.Scanner;

public class Letrakaldatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu izen bat:");
        String izena = sc.next();
        char[] izenaArray = izena.toCharArray();
        System.out.println("Posizioa:");
        int posizioa = sc.nextInt();
        System.out.println("Letra berria:");
        Character k = sc.next().charAt(0);
        sc.close();
        if (posizioa>0 && posizioa<=izena.length()) {
            izenaArray[posizioa-1]=k;
        }
        izena = new String(izenaArray);
        System.out.println("Emaitza: "+izena);
    }
}
