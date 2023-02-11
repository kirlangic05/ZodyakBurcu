package KosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Number1, Number2, Result;
        int Select;

        System.out.print("İlk sayıyı giriniz : ");
        Number1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz : ");
        Number2 = input.nextDouble();

        System.out.println("1 Toplama\n2 Çıkarma\n3 Çarpma\n4 Bölme\n");

        Select = input.nextInt();

        switch (Select) {
            case 1:
                Result = (Number1 + Number2);
                System.out.println("İşlem sonucu : " + Result);
                break;
            case 2:
                Result = (Number1 - Number2);
                System.out.println("İşlem sonucu : " + Result);
                break;
            case 3:
                Result = (Number1 * Number2);
                System.out.println("İşlem sonucu : " + Result);
                break;
            case 4:
                System.out.print(Number2 == 0 ? "Sayı 0'a bölünemez !" : "İşlem Sonucu =" + (Number1 / Number2));


                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz...");
        }

    }
}
