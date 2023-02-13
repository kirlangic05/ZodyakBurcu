package KosulluIfadeler;

import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        String burc = "";
        System.out.print("Kaçıncı gün : ");
        day = input.nextInt();
        System.out.print("Kaçıncı ay : ");
        month = input.nextInt();

        if (month == 1) {
            if ((day >= 1) && (day <= 21)) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else {
            System.out.println("HATA!");
        }
        if (month == 2) {
            if ((day >= 1) && (day <= 19)) {
                burc = "Kova";
            } else {
                burc = "Balık";
            }

        } else {
            System.out.println("HATA!");
        }
        if (month == 3) {
            if ((day >= 1) && (day <= 20)) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else {
            System.out.println("HATA!");
        }
        if (month == 4) {
            if ((day >= 1) && (day <= 20)) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        }
        if (month == 5) {
            if ((day >= 1) && (day <= 21)) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else {
            System.out.println("HATA!");
        }
        if (month == 6) {
            if ((day >= 1) && (day <= 22)) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }

        } else {
            System.out.println("HATA!");
        }
        if (month == 7) {
            if ((day >= 1) && (day <= 22)) {
                burc = "Yengeç";
            } else {
                burc = "Aslan";
            }
        } else {
            System.out.println("HATA!");
        }
        if (month == 8) {
            if ((day >= 1) && (day <= 22)) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        }
        if (month == 9) {
            if ((day >= 1) && (day <= 22)) {
                burc = "Başak";
            } else {
                burc = "Terazi";
            }
        } else {
            System.out.println("HATA!");
        }
        if (month == 10) {
            if ((day >= 1) && (day <= 22)) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }

        } else {
            System.out.println("HATA!");
        }
        if (month == 11) {
            if ((day >= 1) && (day <= 21)) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }
        } else {
            System.out.println("HATA!");
        }
        if (month == 12) {
            if ((day >= 1) && (day <= 21)) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        }
        System.out.println("Burcunuz : " + burc);
    }
}