package ariketak3;

import java.util.Scanner;

public class Arrayeragiketa {
    private static int[] array = new int[10];

    public static void hasieratu(Scanner sc) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Sartu zenbaki bat: ");
            array [i] = sc.nextInt();
        }       
    }

    public static void ikusi() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }

    public static void txertatu(Scanner sc) {
        System.out.println("Zein posiziotan sartu nahi duzu?");
        int posizioa = sc.nextInt();
        System.out.println("Zein zenbaki satu nahi duzu?");
        int balio = sc.nextInt();
        array[posizioa-1] = balio;
    }

    public static void ezabatu(Scanner sc) {
        System.out.println("Zein posizio ezabatu nahi duzu?");
        int posizioa = sc.nextInt();
        for (int i = posizioa-1; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1]=0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aukera;
        do {
            System.out.println("ARRAYEKIN ERAGIKETAK:\n\n"
                                + "1.- Arraya hasieratu.\n"
                                + "2.- Arraya ikusi.\n"
                                + "3.- Txertatu elementu bat.\n"
                                + "4.- Elementu bat ezabatu.\n"
                                + "5.- Irten. \n\n"
                                + "Sartu aukera:");
            aukera = sc.nextInt();
            switch (aukera) {
                case 1:
                    hasieratu(sc);
                    break;
            
                case 2:
                    ikusi();
                    break;
            
                case 3:
                    txertatu(sc);
                    break;
            
                case 4:
                    ezabatu(sc);
                    break;
            
                default:
                    break;
            }
        } while (aukera != 5);
        sc.close();
    }
}
