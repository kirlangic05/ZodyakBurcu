package Giris;

import java.util.Scanner;

public class KDVTutarHesaplama {
    public static void main(String[] args) {
        double deger,kdvtutar,vKdv;
        double kdv = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat giriniz : ");
        deger = input.nextDouble();
         kdvtutar = deger * kdv;
         vKdv = (deger * kdv)+deger;

         kdv= (deger <= 1000) ? 0.18 : 0.8;

        System.out.println("KDV'siz tutar : "+deger);
        System.out.println("KDV tutarı : "+kdvtutar);
        System.out.println("KDV oranı : "+kdv);
        System.out.println("KDV'li fiyat : "+vKdv);


    }

}
