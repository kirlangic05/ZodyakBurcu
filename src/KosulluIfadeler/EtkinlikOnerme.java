package KosulluIfadeler;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sıcaklığı kaç derece ? : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapmaya Gitmek İçin Güzel Bir Gün.");
        } else if ((heat > 5) && (heat <= 15)) {
            System.out.println("Sinemaya Gitmek İçin Güzel Bir Gün.");

        } else if ((heat >= 15) && (heat < 25)) {

            System.out.println("Piknik Yapmak İçin Güzel Bir Gün.");
        } else if (heat > 25) {
            System.out.println("Yüzmeye Gitmek İçin Güzel Bir Gün.");

        }

    }
}
