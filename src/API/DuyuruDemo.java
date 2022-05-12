package API;

import obis.Mesaj;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DuyuruDemo {

    static int i=4,tekGirisDuyuru=0;
    EkleDuyuru duyuruz1= new EkleDuyuru("BP","Ders Ertelendi","'Bilgisayar Programcılığı' bölümünün 'Matematik' dersi ertelendi");
    EkleDuyuru duyuruz2= new EkleDuyuru("BT","Ders Ertelendi","'Bilgisayar Teknolojisi' bölümünün 'Elektrik' dersi ertelendi");
    EkleDuyuru duyuruz3= new EkleDuyuru("BT","Etkinlik","'Bilgisayar Teknolojisi' bölümünün katılması önerilen seminer yarın 16:00'da");
    EkleDuyuru duyuruz4= new EkleDuyuru("BP","Etkinlik","'Bilgisayar Programcılığı' bölümünün katılması önerilen seminer yarın 16:00'da");

    static ArrayList<EkleDuyuru> duyuruDizi = new ArrayList<>();


public void ekleDuyuru(){
    EkleDuyuru eklenenDuyuru= new EkleDuyuru();
    Scanner girdi = new Scanner(System.in);
    System.out.println("Başlık giriniz:");
    eklenenDuyuru.setBaslik(girdi.nextLine());
    System.out.println("Ana Metin giriniz:");
    eklenenDuyuru.setAnaMetin(girdi.nextLine());
    System.out.println("Bölüm giriniz: (BP/BT)");
    String harfBuyut = girdi.nextLine();

    eklenenDuyuru.setBolum(harfBuyut.toUpperCase());
    ekleMetotDuyuru(eklenenDuyuru);
}
    public void ekleMetotDuyuru(EkleDuyuru ekleDuyuru){




        duyuruDizi.add(ekleDuyuru);

       }
    public void cikarMetotDuyuru(){
        byte siralama=0;
           for (EkleDuyuru duyuru : duyuruDizi) {

               System.out.println( siralama+")    "+duyuru.bolum +"   "+duyuru.baslik+": "+duyuru.anaMetin+"\n");
               siralama++;
           }
           System.out.println("Silmek istediğiniz duyurunun numarasını giriniz");
           Scanner duyuruSilme = new Scanner(System.in);
          int silinceksayi =duyuruSilme.nextInt();
        System.out.println(silinceksayi);
           duyuruDizi.remove(silinceksayi);

       }
    public void listeleMetotDuyuru(){
    okuMetotDuyuru();
           for (EkleDuyuru duyuru : duyuruDizi) {
               System.out.println( duyuru.bolum +" --- "+duyuru.baslik+": "+duyuru.anaMetin);
           }

       }

       public void okuMetotDuyuru(){
           if (tekGirisDuyuru==0){
               duyuruDizi.add(duyuruz1);
               duyuruDizi.add(duyuruz2);
               duyuruDizi.add(duyuruz3);
               duyuruDizi.add(duyuruz4);
               tekGirisDuyuru++;
           }

       }
   public void duyuruGiris(String[] kullanici){
        okuMetotDuyuru();
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
           for (EkleDuyuru duyuru : duyuruDizi) {//duyuruları kontrol eder
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
           if (ekleSilduyuru.equals(arti)) ekleDuyuru();
           if (ekleSilduyuru.equals(eksi)) cikarMetotDuyuru();
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
