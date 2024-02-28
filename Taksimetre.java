import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //variable
        double taksimetreTutari, gidilenKm, kmBasi = 2.20;
        //double kmBasi = 2.20;
        int minTutar = 20;
        int acilisTutari = 10;
        Scanner mesafe = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi km cinsinden giriniz: ");
        gidilenKm = mesafe.nextDouble();

        taksimetreTutari = acilisTutari + (gidilenKm * kmBasi);
        if (taksimetreTutari >= minTutar)
            System.out.println("Taksimetre ücretiniz: " + taksimetreTutari + " TL'dir");
        else
            System.out.println("Taksimetre ücretiniz: " + minTutar + " TL'dir");
    }
}
