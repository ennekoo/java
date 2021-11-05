package ariketak1;

import java.util.Scanner;

public class Irakurrikarakterea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        System.out.println("Aldagaiaren balioa: " + letra + " da.");
        sc.close();
    }
    
}
