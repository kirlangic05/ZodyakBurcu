package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int armut,elma,domates,muz,patlican;
        double arkg = 2.14, elkg = 3.67, domkg = 1.11, muzkg = 0.95, patkg=5,toplam;

        System.out.print("Armut kaç kilo ? : ");
        armut = inp.nextInt();
        System.out.print("Elma kaç kilo ? : ");
        elma = inp.nextInt();
        System.out.print("Muz kaç kilo ? : ");
        muz = inp.nextInt();
        System.out.print("Domates kaç kilo ? : ");
        domates = inp.nextInt();
        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = inp.nextInt();

        toplam = (armut*arkg)+(elma*elkg)+(muz*muzkg)+(domates*domkg)+(patlican*patkg);
        System.out.println("Toplam tutar : "+toplam);
    }
}
