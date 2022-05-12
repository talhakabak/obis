package API;

import admin.DatabaseDuyuru;
import admin.EkleDuyuru;
import obis.Mesaj;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Duyuru {

   public void duyuruGiris(String[] kullanici){
       DatabaseDuyuru databaseCek = new DatabaseDuyuru();

       String bolum = kullanici[4];
       String[][] bolumDuyurular = new String[50][2];
       Scanner duyuruScan = new Scanner(System.in);
       String ekleSilduyuru;
       String arti="+";
       String eksi="-";
       byte duyuruSecim;
       byte secimNo;
       byte b;
       int r;
       do {
           System.out.println("\n\n");
           secimNo = 1;
           b = 0;
           r = 2;
           for (EkleDuyuru duyuru : databaseCek.duyuruDizi) {//duyuruları kontrol eder
               if (bolum.equals(duyuru.bolum)) {//duyurunun bölüm kısmı eşleşirse çalışır
                   bolumDuyurular[b][0] = duyuru.baslik;
                   bolumDuyurular[b][1] = duyuru.anaMetin;
                   b++;
                   System.out.println(duyuru.baslik + " -> " + secimNo);
                   secimNo++;
               }
           }
           System.out.println(Mesaj.duyurularEkleSil());
           ekleSilduyuru = duyuruScan.nextLine();
           if (ekleSilduyuru.equals(arti)) databaseCek.ekleDuyuru();
           if (ekleSilduyuru.equals(eksi)) databaseCek.cikarMetotDuyuru();
           System.out.print(Mesaj.duyurularSecim());

           try {
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
               }
           } catch (Exception e) {
               duyuruScan.nextLine();
               System.out.println(Mesaj.hataliGiris());
           }
       } while (r != 0);
       System.out.println("\n\n");
    }

}
