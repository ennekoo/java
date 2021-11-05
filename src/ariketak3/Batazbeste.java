package ariketak3;

import java.util.Scanner;

public class Batazbeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abatbes[]= new int [100];
        int znb, kont=0, bat=0;
        double emaitza;
        char aukera;
        do {
            System.out.print("Sartu zenbaki bat: ");
            znb=sc.nextInt();
            abatbes[kont] = znb;
            kont++;

            bat+=znb;
            emaitza=(double)bat/kont;

            do {
                System.out.print("Gehiago? (b/e): ");
                aukera=sc.next().charAt(0);
            } while (aukera!='b' && aukera!='e' && aukera!='B' && aukera!='E');

        } while (aukera=='b' || aukera=='B' && kont<100);

        System.out.println("Sartutako zenbakien bataz besteko: "+emaitza);
        sc.close();

        int handiago=0, txikiago=0;
        double dbat=0;
        for (int i=0;i<kont;i++){
            if (abatbes[i]>emaitza) {
                handiago++;
            }

            else if (abatbes[i]<emaitza){
                txikiago++;
            }

            dbat+= Math.pow(abatbes[i]-emaitza, 2);
        }
        System.out.println("Bataz bestekoa baino handiagoak izan diren zenbaki kopurua: "+handiago);
        System.out.println("Bataz bestekoa baino txikiagoak izan diren zenbaki kopurua: "+txikiago);
        
        double desbideratzea = Math.sqrt(dbat/kont);
        System.out.println("Desbideratze tipikoa: "+desbideratzea);
    }
}
