package ariketak2;

import java.util.Scanner;

public class Erromaznbk_1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int zbk, zenb1;

    do {
        System.out.println("Aukeratu zenbaki bat 0tik 999ra");
        zbk= sc.nextInt();    
    } while (zbk<=1 || zbk>=999);
    
    sc.close();

    zenb1=zbk;
    String ema =" ";

        while (zbk>=900) {
            ema = ema + "CM";
            zbk = zbk - 900;
        }
        while (zbk>=500) {
            ema = ema + "D";
            zbk = zbk - 500;
        }
        while (zbk>=400) {
            ema = ema + "CD";
            zbk = zbk - 400;
        }
        while (zbk>=100) {
            ema = ema + "C";
            zbk = zbk - 100;
        }
        while (zbk>=90) {
            ema = ema + "XC";
            zbk = zbk - 90;
        }
        while (zbk>=50) {
            ema = ema + "L";
            zbk = zbk - 50;
        }
        while (zbk>=40) {
            ema = ema + "XL";
            zbk = zbk - 40;
        }
        while (zbk>=10) {
            ema = ema + "X";
            zbk = zbk - 10;
        }
        while (zbk>=9) {
            ema = ema + "IX";
            zbk = zbk - 9;
        }
        while (zbk>=5) {
            ema = ema + "V";
            zbk = zbk - 5;
        }
        while (zbk>=4) {
            ema = ema + "IV";
            zbk = zbk - 4;
        }
        while (zbk>=1) {
            ema = ema + "I";
            zbk = zbk - 1;
        }
        System.out.println("Aukeratutako zenbakia ("+zenb1+") zenbaki erromatarretan:" +ema+ " da.");
    }

}
