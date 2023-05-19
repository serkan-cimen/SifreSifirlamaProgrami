import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcının mevcut şifresini burada varsayalım
        String dogruSifre = "gizliSifre123";

        System.out.print("Şifrenizi giriniz : ");
        String girilenSifre = input.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.print("Giriş başarılı!");

        } else {
            System.out.print("Şifrenizi sıfırlamak istermisiniz? (evet/hayır)");
            String cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();

                if (yeniSifre.equals(girilenSifre) || yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu. ");
                    // Yeni şifreyi kaydetme veya devam etme
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi. ");
            }
        }

        input.close();
    }
}