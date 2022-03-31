package API;

import admin.Database;
import obis.Menuler;
import obis.Mesaj;

import java.util.Objects;
import java.util.Scanner;

public class Duyurular {

    public static void duyuruSec(String[] kullanici) {
        String bolum = kullanici[4];
        String[][] bolumDuyurular = new String[10][2];
        Scanner duyuruScan = new Scanner(System.in);
        byte duyuruSecim;
        byte secimNo = 1;
        byte b = 0;
        int r = 2;
        for (String[] strings : Database.duyurular) {//duyuruları kontrol eder
            if (bolum.equals(strings[0])) {//duyurunun bölüm kısmı eşleşirse çalışır
                bolumDuyurular[b][0] = strings[1];
                bolumDuyurular[b][1] = strings[2];
                b++;
                System.out.println(strings[1] + " -> " + secimNo);
                secimNo++;
            }
        }
        do {
            try {
                System.out.print(Mesaj.duyurularSecim());
                duyuruSecim = duyuruScan.nextByte();
                r = duyuruSecim;
                duyuruScan.nextLine();
                if (r != 0) {
                    for (int i = 0; i < bolumDuyurular[duyuruSecim - 1].length; i++) {
                        if(!Objects.equals(bolumDuyurular[duyuruSecim - 1][i], null)) System.out.println(bolumDuyurular[duyuruSecim - 1][i]);
                        else {
                            System.out.println(Mesaj.duyuruBulunamadi());
                            break;
                        }
                    }
                    Mesaj.bekle(1000);
                    System.out.print(Mesaj.duyuruGeriDon());
                }
            } catch (Exception e) {
                duyuruScan.nextLine();
                System.out.println(Mesaj.hataliGiris());
            }
        } while (r != 0);
        Menuler.menuSecim(kullanici);
    }
}
