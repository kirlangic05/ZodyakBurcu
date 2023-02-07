
package Giris;

import java.util.Scanner;

public class DersOrtalamasi {
    public static void main(String[] args) {
        double matematik,fizik,kimya,tarih,muzik,turkce,ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz : ");
        matematik = input.nextDouble();

        System.out.println("Fizik notunu giriniz : ");
        fizik = input.nextDouble();

        System.out.println("Kimya notunu giriniz : ");
        kimya = input.nextDouble();

        System.out.println("Tarih notunu giriniz : ");
        tarih = input.nextDouble();

        System.out.println("Müzik notunu giriniz : ");
        muzik = input.nextDouble();

        System.out.println("Türkçe notunu giriniz : ");
        turkce= input.nextDouble();
 ortalama = ((matematik+muzik+kimya+tarih+fizik+turkce)/6);
        System.out.println("Derslerin ortalaması : "+ ortalama);
boolean sonuc;
sonuc= (ortalama >= 60);
String vSonuc = (sonuc) ? "Geçti" : "Kaldı";
        System.out.println(vSonuc);




    }
}
