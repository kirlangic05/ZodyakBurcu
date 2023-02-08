package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kmBasi,km,acilis,tutar,eger;

         kmBasi = 2.20;
         acilis = 10;

         System.out.print("Kaç KM yol gidildi : ");
        km= input.nextDouble();

        tutar= (km * kmBasi)+acilis;
        tutar = (tutar <= 20) ? 20 : tutar;

        System.out.print("Borcunuz : "+tutar);




    }
}
