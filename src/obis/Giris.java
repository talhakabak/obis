package obis;


import java.util.HashMap;
import java.util.Scanner;

public class Giris extends Mesaj{
    HashMap<String, String> girisbilgi;
    String logKullanici;
    String logSifre;
    boolean cevrimici = false;

    Giris(HashMap<String, String> girisBilgiKayit) {
        girisbilgi = girisBilgiKayit;//doğru giriş bilgileri
    }

    public void girisYap() {
        System.out.println(girisKullaniciMSG());
        Scanner girisScan = new Scanner(System.in);
        logKullanici = girisScan.nextLine();
        if (girisbilgi.containsKey(logKullanici)) {//giriş bilgileri değeri içeriyor mu diye bakıyor
            boolean b = false;
            do {

                System.out.println(girisSifreMSG());
                logSifre = girisScan.nextLine();
                if (girisbilgi.get(logKullanici).equals(logSifre)) {
                    System.out.println(girisBasariliMSG());
                    cevrimici = true;
                    b = true;
                } else {
                    System.out.println(girisHataliMSG());
                }
            } while (!b);
        } else {
            System.out.println(girisBulunamadiMSG());
        }
    }

}
