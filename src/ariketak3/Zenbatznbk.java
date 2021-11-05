package ariketak3;

import java.util.Scanner;

public class Zenbatznbk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayKont[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayKont[i]=0;
        }

        int zbk;
        do {
            System.out.println("Zenbakia: ");
            zbk = sc.nextInt();
            if(zbk>0 && zbk<6){
                arrayKont[zbk-1] ++;
            }
                else{
                    System.out.println("Zenbakia ez da zuzena (1-5)");
                }
        } while (zbk!=0);

        int maxMaiz=0, minMaiz=Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + "ren Maistazuna: " + arrayKont[i]);
            if(arrayKont[i]<minMaiz && arrayKont[i]!=0) {
                minMaiz = arrayKont[i];
            }
            if(arrayKont[i]<maxMaiz) {
                maxMaiz = arrayKont[i];
            }
        }
        System.out.print("Gehien idatzi d(ir)en zenbakia(k) ("+maxMaiz+" aldiz: ");
        for (int i = 0; i < 5; i++) {
            if(arrayKont[i]==maxMaiz) {
                System.out.print(i+1 + " ");
            }

        }

        System.out.print("Gutxien idatzi d(ir)en zenbakia(k) ("+minMaiz+" aldiz: ");
        for (int i = 0; i < 5; i++) {
            if(arrayKont[i]==minMaiz) {
                System.out.print(i+1 + " ");
            }

        }

        System.out.print("Behin ere idatzi d(ir)en zenbakia(k) ("+maxMaiz+" aldiz: ");
        for (int i = 0; i < 5; i++) {
            if(arrayKont[i]==0) {
                System.out.print(i+1 + " ");
            }

        }

        sc.close();
    }
}
