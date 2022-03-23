package obis;


import java.util.HashMap;
import java.util.Scanner;

public class Giris {
    Mesaj mesaj = new Mesaj();
    HashMap<String, String> girisbilgi;
    String logKullanici;
    String logSifre;
    boolean cevrimici = false;

    Giris(HashMap<String, String> girisBilgiKayit) {
        girisbilgi = girisBilgiKayit;//doğru giriş bilgileri
    }

    public void girisYap() {
        System.out.println(mesaj.girisKullanici());
        Scanner girisScan = new Scanner(System.in);
        logKullanici = girisScan.nextLine();
        if (girisbilgi.containsKey(logKullanici)) {//giriş bilgileri değeri içeriyor mu diye bakıyor
            boolean b = false;
            do {

                System.out.println(mesaj.girisSifre());
                logSifre = girisScan.nextLine();
                if (girisbilgi.get(logKullanici).equals(logSifre)) {
                    System.out.println(mesaj.girisBasarili());
                    cevrimici = true;
                    b = true;
                } else {
                    System.out.println(mesaj.girisHatali());
                }
            } while (!b);
        } else {
            System.out.println(mesaj.girisBulunamadi());
        }
    }

}
