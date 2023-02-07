package Giris;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,c;
        double d,cevre,alan;

        System.out.print("1.kenarı girin : ");
        a= inp.nextInt();

        System.out.print("2.kenarı girim : ");
        b= inp.nextInt();

        System.out.print("3.kenarı girin : ");
        c= inp.nextInt();

        d=(a+b+c)/2;
        cevre=2*d;
        System.out.println("Üçgenin çevresi : "+cevre);

        alan =Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.println("Üçgenin alanı : "+alan);
    }
}
