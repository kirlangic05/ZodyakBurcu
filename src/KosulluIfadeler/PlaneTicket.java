package KosulluIfadeler;

import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int age, bilet;
        double mesafe, mesafeUcret = 0.10, tutar, iTutar, gtutar;
        System.out.print("Yolcunun yaşı : ");
        age = inp.nextInt();
        System.out.print("Bilet türü : ");
        bilet = inp.nextInt();
        System.out.print("Uçulacak mesafe(KM) :");
        mesafe = inp.nextDouble();
        tutar = mesafe * mesafeUcret;
        if (age < 12) {
            iTutar = tutar - (tutar * 0.50);
            if (bilet == 2) {
                gtutar = 2 * (iTutar - (iTutar * 0.20));
                System.out.println("Borcunuz " + gtutar);
            } else if (bilet == 1) {
                System.out.println("Borcunuz " + iTutar);
            } else {
                System.out.println("HATA!");
            }

        } else if ((age > 12) && (age < 24)) {
            iTutar = tutar - (tutar * 0.10);
            if (bilet == 2) {
                gtutar = 2 * (iTutar - (iTutar * 0.20));
                System.out.println("Borcunuz " + gtutar);
            } else if (bilet == 1) {
                System.out.println("Borcunuz " + iTutar);
            } else {
                System.out.println("HATA!");
            }

        } else if (age > 65) {
            iTutar = tutar - (tutar * 0.30);
            if (bilet == 2) {
                gtutar = 2 * (iTutar - (iTutar * 0.20));
                System.out.println("Borcunuz " + gtutar);
            } else if (bilet == 1) {
                System.out.println("Borcunuz " + iTutar);
            } else {
                System.out.println("HATA!");
            }

        }
    }

}
