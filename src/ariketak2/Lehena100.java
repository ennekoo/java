package ariketak2;

public class Lehena100 {

    public static boolean lehenak(int zbk) {
        int zenbatzailea = 0;

        for (int kont = 1; kont <= zbk; kont++) {
            if ((zbk % kont) == 0) {
                zenbatzailea++;
            }
        }

        if (zenbatzailea <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int zenbat = 0;
        for (int znb = 1; zenbat < 100; znb++) {
            if (lehenak(znb)) {
                zenbat++;
                System.out.println(znb);
            }
        }
    }

}
