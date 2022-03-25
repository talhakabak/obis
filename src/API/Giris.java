package API;


import obis.Mesaj;

import java.util.HashMap;
import java.util.Scanner;

public class Giris{
    Ogrenci ogrenci = new Ogrenci();
    HashMap<String, String> girisbilgileri = ogrenci.girisBilgiAl();
    public String logKullanici;
    public String logSifre;
    public boolean cevrimici = false;

    public void girisYap() {
        System.out.println(Mesaj.girisKullanici());
        Scanner girisScan = new Scanner(System.in);
        logKullanici = girisScan.nextLine();
        if (girisbilgileri.containsKey(logKullanici)) {//giriş bilgileri değeri içeriyor mu diye bakıyor
            boolean b = false;
            do {

                System.out.println(Mesaj.girisSifre());
                logSifre = girisScan.nextLine();
                if (girisbilgileri.get(logKullanici).equals(logSifre)) {
                    System.out.println(Mesaj.girisBasarili());
                    cevrimici = true;
                    b = true;
                } else {
                    System.out.println(Mesaj.girisHatali());
                }
            } while (!b);
        } else {
            System.out.println(Mesaj.girisBulunamadi());
        }
    }

}
