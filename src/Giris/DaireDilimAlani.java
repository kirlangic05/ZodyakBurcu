package Giris;

import java.util.Scanner;

public class DaireDilimAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double cevre,alan,sonuc,r,aciOlcusu,pi=3.14;

        System.out.print("Dilim alanını bulmak istediğiniz dairenin yarıçapını giriniz : ");
        r = input.nextDouble();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        aciOlcusu = input.nextDouble();

        sonuc = (pi*(r*r)*aciOlcusu)/360;
        alan = pi*r*r;
        cevre = 2*r*pi;
        System.out.println("Dairenin dilim alanı : "+ sonuc);
        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);


    }
}
