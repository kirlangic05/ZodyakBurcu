package KosulluIfadeler;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, kimya, turkce, fizik, muzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = input.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100) {
            ortalama = (muzik + fizik + kimya + turkce) / 5;
        }
        if (turkce < 0 || turkce > 100) {
            ortalama = (muzik + fizik + kimya + mat) / 5;
        }
        if (fizik < 0 || fizik > 100) {
            ortalama = (muzik + mat + kimya + turkce) / 5;
        }
        if (kimya < 0 || kimya > 100) {
            ortalama = (muzik + fizik + turkce + mat) / 5;
        }
        if (muzik < 0 || muzik > 100) {
            ortalama = (mat + fizik + kimya + turkce) / 5;
        }else{
            ortalama=(mat + fizik + kimya + turkce+muzik) / 5;

            if(ortalama<55){
                System.out.println("Sınıfta kaldınız.");
                System.out.println("Ortalamanız : "+ortalama);
            }else{
                System.out.println("Tebrikler! Sınıfı Geçtiniz.");
                System.out.println("Ortalamanız : "+ortalama);
            }
        }



    }
}
