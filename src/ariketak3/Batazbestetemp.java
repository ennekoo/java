package ariketak3;

import java.util.Scanner;

public class Batazbestetemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] aTenp= new double [100];
        int kont=0, bat=0;
        double emaitza, tenp;
        char aukera;
        do {
            System.out.print("Sartu zenbaki bat: ");
            tenp=sc.nextDouble();
            aTenp[kont] = tenp;
            kont++;

            bat+=tenp;
            emaitza=(double)bat/kont;

            do {
                System.out.print("Gehiago? (b/e): ");
                aukera=sc.next().charAt(0);
            } while (aukera!='b' && aukera!='e' && aukera!='B' && aukera!='E');

        } while (aukera=='b' || aukera=='B' && kont<100);

        System.out.println("Sartutako zenbakien bataz besteko: "+emaitza);
        sc.close();

        System.out.println("Bataz bestekoak baino handiagoak diren tenperaturak: ");
        int zenbatberdin=0;
        for (int i = 0; i < kont; i++) {
            if (aTenp[i]>emaitza) {
                System.out.print(aTenp[i]+" ");
            }
            if (aTenp[i]==emaitza) {
                zenbatberdin++;
            }
        }
        System.out.println(" ");
        System.out.println("Batazbestekoa temperatura "+zenbatberdin+" aldiz errepikatu da.");
        
        System.out.println("Bataz bestekoak baino txikiagoak diren tenperaturak: ");
        for (int i = 0; i < kont; i++) {
            if (aTenp[i]<emaitza) {
                System.out.print(aTenp[i]+" ");
            }
        }
        System.out.println(" ");
    }
}
