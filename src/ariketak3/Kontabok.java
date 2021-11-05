package ariketak3;

import java.util.Scanner;

public class Kontabok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Sartu hitz bat: ");
        String hitza = sc.next();

        int akont[]=new int [5];
        for (int i=0;i<5;i++){
            akont[i]=0;
        }

        for (int i=0; i<hitza.length(); i++){
            if (hitza.charAt(i)=='A' || hitza.charAt(i)=='a') {
                akont[0]++;
            }
            else if (hitza.charAt(i)=='E' || hitza.charAt(i)=='e') {
                akont[1]++;
            }
            else if (hitza.charAt(i)=='I' || hitza.charAt(i)=='i') {
                akont[2]++;
            }
            else if (hitza.charAt(i)=='O' || hitza.charAt(i)=='o') {
                akont[3]++;
            }
            else if (hitza.charAt(i)=='U' || hitza.charAt(i)=='u') {
                akont[4]++;   
            }
        }
        
        System.out.println("A edo a letra "+akont[0]+" aldiz errepikatu da.");
        System.out.println("E edo e letra "+akont[1]+" aldiz errepikatu da.");
        System.out.println("I edo i letra "+akont[2]+" aldiz errepikatu da.");
        System.out.println("O edo o letra "+akont[3]+" aldiz errepikatu da.");
        System.out.println("U edo u letra "+akont[4]+" aldiz errepikatu da.");
        sc.close();
    }
}
