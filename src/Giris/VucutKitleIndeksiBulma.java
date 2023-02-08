package Giris;

import java.util.Scanner;

public class VucutKitleIndeksiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double boy,kilo,index;

        System.out.print("Lütfen boyunuzu giriniz (metre cinsinden) : ");
        boy= inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo= inp.nextDouble();

        index= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+ index);
    }
}
