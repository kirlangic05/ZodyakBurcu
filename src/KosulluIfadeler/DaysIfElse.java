package KosulluIfadeler;

import java.util.Scanner;

public class DaysIfElse {
    public static void main(String[] args) {

        int day;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaçıncı gün olduğunu yazın : ");
        day = inp.nextInt();

       /* if (day == 1) {

            System.out.println("Bugün günlerden pazartesi");

        } else if (day == 2) {
            System.out.println("Bugün günlerden salı");
        } else if (day == 3) {
            System.out.println("Bugün günlerden çarşamba");
        } else if (day == 4) {
            System.out.println("Bugün günlerden perşembe");

        } else if (day == 5) {
            System.out.println("Bugün günlerden cuma");

        } else if (day == 6) {
            System.out.println("Bugün günlerden cumartesi");

        } else if (day == 7) {
            System.out.println("Bugün günlerden pazar");

        } else {
            System.out.println("Geçersiz sayı girildi");
        } */

        switch (day) {
            case 1:
                System.out.println("Bugün günlerden pazartesi");

                break;

            case 2:
                System.out.println("bugün günlerden salı");

                break;

            case 3:
                System.out.println("Bugün günlerden çarşamba");
                break;

            case 4:
                System.out.println("Bugün günlerden perşembe");
                break;

            case 5:
                System.out.println("Bugün günlerden cuma");
                break;

            case 6:
                System.out.println("Bugün günlerden cumartesi");
                break;

            case 7:
                System.out.println("Bugün günlerden cuma");
                9
                break;

            default:
                System.out.println("Lütfen 1 ve 7 arasından bir sayı giriniz.");
        }

    }
}
