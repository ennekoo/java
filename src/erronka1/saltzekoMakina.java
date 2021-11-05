package erronka1;

import java.util.Scanner;

/**
 * SaltzekoMakina
 * 
 * Autobus-terminal bateko makina saltzaile bat kudeatzea ahalbidetuko duen
 * aplikazioa. Erabiltzaileak zenbakizko teklatu baten eta pantaila baten bidez
 * jarduten du makinarekin. Makinak aukeren menuak eskaintzen ditu eta
 * erabiltzaileak egiten duen aukeraketa jasotzen du, betiere erantzun egokia
 * sortuz. Dirua sartzea, aldaketak itzultzea eta produktua ematea ere
 * teklatuaren edo pantaila bidezko mezuen bidez simulatuko dira.
 */
public class saltzekoMakina {
    /**
     * Datuak sartzkeo erabiliko den Scanner-a
     */
    private static Scanner sc = new Scanner(System.in);
    /**
     * Produktuen prezioak gordetzeko array-a
     */
    private static double[] aprezioa = new double[8];
    /**
     * Produktuen izenak gordetzeko array-a
     */
    private static String[] aizenak = new String[8];
    /**
     * Nahi duzun produktuaren kodea izango dena
     */
    private static int erantzuna = 0;
    /**
     * Produktu guztien prezioa gordetzeko
     */
    private static double prezioatotala;
    /**
     * Produktuen prezioaren beza eta totala gordetzeko
     */
    private static double beza, totala;
    /**
     * 
     */
    private static int emaitza = 0;
    /**
     * Hautatzen diren produktuen zerrenda gordeko den String-a
     */
    private static String e;

    /**
     * Berriro hasiko garenenan, aldagai guztiak 0an hasieratuko ditugu
     */
    public static void hasieratu() {
        prezioatotala = 0;
        beza = 0;
        totala = 0;
        emaitza = 0;
        e = " ";
    }

    /**
     * Aukeren menua imprimatzen du, kodea, produktuaren izena eta prezioarekin.
     */
    public static void menua() {
        System.out.printf("\n..........................................\n"
                + ": KODIGOA :     PRODUKTUA      : PREZIOA :\n" 
                + ":.........:....................:.........:\n"
                + ": 0.-     : Irten              :         :\n" 
                + ": 1.-     : Ur Botilatxoa      : 1,50€   :\n"
                + ": 2.-     : Kola Botilatxoa    : 2€      :\n" 
                + ": 3.-     : Laranja Botilatxoa : 2€      :\n"
                + ": 4.-     : Limoi Botilatxoa   : 2€      :\n" 
                + ": 5.-     : Nestea             : 1,80€   :\n"
                + ": 6.-     : Kit-Kat            : 1,50€   :\n" 
                + ": 7.-     : Toblerone          : 2€      :\n"
                + ": 8.-     : Fruitu Lehorrak    : 1€      :\n" 
                + ":.........:....................:.........:\n");
        arrayak();
    }

    /**
     * 
     */
    public static void arrayak() {
        aprezioa[0] = 1.5;
        aprezioa[1] = 2;
        aprezioa[2] = 2;
        aprezioa[3] = 2;
        aprezioa[4] = 1.8;
        aprezioa[5] = 1.5;
        aprezioa[6] = 2;
        aprezioa[7] = 1;

        aizenak[0] = "Ur botilatxoa          1.50€";
        aizenak[1] = "Kola botilatxoa        2€";
        aizenak[2] = "Laranja botilatxoa     2€";
        aizenak[3] = "Limoi botilatxoa       2€";
        aizenak[4] = "Nestea                 1.80€";
        aizenak[5] = "Kit-Kat                1.50€";
        aizenak[6] = "Toblerone              2€";
        aizenak[7] = "Fruitu lehorrak        1€";
    }

        /**
         * 
         */
    public static void irakurri() {
        System.out.print("Erosi nahi duzun produktuaren kodea: ");
        erantzuna = intIrakurri();
        if (erantzuna != 0) {
            prezioatotala = prezioatotala + aprezioa[erantzuna - 1];
            emaitza++;
        }
    }

    public static void erantzuna() {
        if (emaitza == 1) {
            e = aizenak[erantzuna - 1];
            System.out.print(aizenak[erantzuna - 1]);
        } else {
            e = e + "\n" + aizenak[erantzuna - 1];
            System.out.print(e);
        }

        System.out.println("\n");
        System.out.printf("TOTALA BEZ-a gabe      %.2f€", prezioatotala);
        System.out.println("\n");
        System.out.println("Produktu gehiago sartu nahi dituzu?");
    }

    public static int intIrakurri() {
        int zbk = -1;
        do {
            try {
                zbk = Integer.parseInt(sc.nextLine());
                if (zbk > 8 || zbk < 0) {
                    System.out.print("Zenbakia 0 eta 8 artean egon behar da.\nSartu berriz kodea: ");
                }
            } catch (Exception e) {
                System.out.print("zbk zenbaki oso bat izan behar da (0-8).\nSartu berriz kodea: ");
            }
        } while (zbk > 8 || zbk < 0);
        return zbk;
    }

    public static double doubleIrakurri() {
        double zbk = -1;
        do {
            try {
                zbk = Double.parseDouble(sc.nextLine());
                return zbk;
            } catch (Exception e) {
                System.out.print("Zenbaki bat sartu\nSartu berriz diru kopurua (€): ");
            }
        } while (true);
    }

    private static boolean baiEzIrakurri() {
        char bz;
        System.out.println("BAI edo EZ (b/e)");
        do {
            bz = sc.nextLine().toUpperCase().charAt(0);
            if (bz == 'B') {
                return true;
            } else if (bz == 'E') {
                return false;
            } else {
                System.out.println("B edo E autagaiak izan behar dira.");
            }
        } while (true);
    }

    public static void tiket() {
        System.out.println(" ");
        System.out.println("TIKET-a");
        beza = prezioatotala * 0.21;
        double roundBeza = Math.round(beza * 100.0) / 100.0;
        totala = prezioatotala + roundBeza;
        System.out.printf(e
                + "\n............................\nTOTALA BEZ-a gabe      %.2f€\nBEZ-a                  %.2f€\nTOTALA                 %.2f€\n",
                prezioatotala, roundBeza, totala);

    }

    public static void bueltak() {
        double dirua = 0;
        double bueltak = 0;
        double bueltak2 = 0;
        String ema = " ";
        double roundTotala = Math.round(totala * 100.0) / 100.0;
        boolean jarraitu = true;

        if (dirua < roundTotala) {
            do {
                double falta = roundTotala - dirua;
                System.out.printf("%.2f€ falta dira.\nDirua sartu nahi duzu? \n", falta);
                jarraitu = baiEzIrakurri();
                if (jarraitu) {
                    System.out.println("Zenbat diru sartu nahi duzu? (€)");
                    dirua = dirua + doubleIrakurri();
                }
            } while (dirua < roundTotala && jarraitu);
        }
        if (dirua > roundTotala) {
            bueltak = dirua - roundTotala;
            bueltak2 = bueltak;

            while (bueltak >= 200) {
                ema = ema + "200€ ";
                bueltak = bueltak - 200;
            }
            while (bueltak >= 100) {
                ema = ema + "100€ ";
                bueltak = bueltak - 100;
            }
            while (bueltak >= 50) {
                ema = ema + "50€ ";
                bueltak = bueltak - 50;
            }
            while (bueltak >= 20) {
                ema = ema + "20€ ";
                bueltak = bueltak - 20;
            }
            while (bueltak >= 10) {
                ema = ema + "10€ ";
                bueltak = bueltak - 10;
            }
            while (bueltak >= 5) {
                ema = ema + "5€ ";
                bueltak = bueltak - 5;
            }
            while (bueltak >= 2) {
                ema = ema + "2€ ";
                bueltak = bueltak - 2;
            }
            while (bueltak >= 1) {
                ema = ema + "1€ ";
                bueltak = bueltak - 1;
            }
            while (bueltak > 0.49) {
                ema = ema + "50zent. ";
                bueltak = bueltak - 0.5;
            }
            while (bueltak > 0.19) {
                ema = ema + "20zent. ";
                bueltak = bueltak - 0.2;
            }
            while (bueltak > 0.09) {
                ema = ema + "10zent. ";
                bueltak = bueltak - 0.1;
            }
            while (bueltak > 0.049) {
                ema = ema + "5zent. ";
                bueltak = bueltak - 0.05;
            }
            while (bueltak > 0.019) {
                ema = ema + "2zent. ";
                bueltak = bueltak - 0.02;
            }
            while (bueltak > 0.009) {
                ema = ema + "1zent. ";
                bueltak = bueltak - 0.01;
            }
            System.out.println("Bueltak hauek dira: " + ema);
        }

        else if (jarraitu) {
            System.out.println("Diru kantitate zehatza sartu da: " + roundTotala);
        }
        if (jarraitu) {
            totalfinala(bueltak2, dirua);
        }
    }

    public static void totalfinala(double bueltak2, double dirua) {
        tiket();
        double roundBueltak2 = Math.round(bueltak2 * 100.0) / 100.0;
        System.out.println("Sartutako dirua: " + dirua + "€ dira.");
        System.out.println("Itzulitako dirua: " + roundBueltak2 + "€ dira.");
        System.out.println("ESKERRIK ASKO.");
    }

    public static void main(String[] args) {
        System.out.println("ONGI ETORRI");
        while (true) {
            hasieratu();
            do {
                menua();
                irakurri();
                if (erantzuna != 0) {
                    erantzuna();
                }
            } while (erantzuna != 0 && baiEzIrakurri());
            if (erantzuna != 0) {
                tiket();
                bueltak();
            }
        }
    }
}