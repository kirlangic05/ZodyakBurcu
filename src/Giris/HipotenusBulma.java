package Giris;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        double a,b,c,hipotenus;
        Scanner input=new Scanner(System.in);

        System.out.print("İlk kenarı giriniz : ");
        a= input.nextDouble();



        System.out.print("ikinci kenarı giriniz : ");
        b= input.nextDouble();





        hipotenus=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+hipotenus);
    }
}
