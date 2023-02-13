package KosulluIfadeler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        userName = inp.nextLine();
        System.out.print("Şifre giriniz : ");
        password = inp.nextLine();
        if ((userName.equals("furkan")) && (password.equals("kirlangic"))) {
            System.out.println("Giriş başarıyla gerçekleşti..");


        } else {
            System.out.print("Kullanıcı bilgileri hatalı.\nYeni bir şifre oluşturmak ister misiniz ?\n1-Evet\n2-Hayır\n");
            int select;
            select = inp.nextInt();
        String newPassword;
            Scanner input = new Scanner(System.in);
           switch (select){
               case 1:
                   System.out.println("Yeni şifrenizi girin : ");
                   newPassword = input.nextLine();

                   if(newPassword.equals(password)){
                       System.out.println("Yeni şifre eskisiyle aynı olamaz !");
                   }else {
                       System.out.println("Şifre başarıyla oluşturuldu..");
                   }
                   break;
               case 2:
                   System.out.println("İşlem iptal edildi.");
                   break;
               default:
                   System.out.println("Geçersiz işlem girildi.");
           }


        }

    }
}
