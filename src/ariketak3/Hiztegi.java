package ariketak3;

import java.util.Scanner;

public class Hiztegi {
    private static String[] hiztegi = new String[20];
    private static Scanner sc = new Scanner(System.in);

    public static void beteHiztegi() {
        for (int i = 0; i < hiztegi.length; i++) {
            hiztegi[i] = sc.nextLine();
        }
    }

    public static void ordenatu() {
        String temp;
        for (int i = 0; i < hiztegi.length-1; i++) {
            for (int j = 0; j < hiztegi.length-1-i; j++) {
                if (hiztegi[j].compareTo(hiztegi[j+1]) > 0) {
                    temp = hiztegi[j+1];
                    hiztegi[j+1] = hiztegi[j];
                    hiztegi[j] = temp;
                }
            }
        }
    }

    public static void ImprimatuHiztegia() {
        for (int i = 0; i < hiztegi.length; i++) {
            System.out.println(hiztegi[i]);   
        }
    }

    public static void main(String[] args) {
        System.out.println("Bete hiztegia 20 hitzekin:");
        beteHiztegi();
        sc.close();

        ordenatu();
        System.out.println("Hau da sartutako hitzegia ordenatuta");
        ImprimatuHiztegia();
    }
}
