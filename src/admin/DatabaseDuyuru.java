package admin;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseDuyuru {

    static int tekGirisDuyuru=0;
    EkleDuyuru duyuruz1= new EkleDuyuru("BP","Ders Ertelendi","'Bilgisayar Programcılığı' bölümünün 'Matematik' dersi ertelendi");
    EkleDuyuru duyuruz2= new EkleDuyuru("BT","Ders Ertelendi","'Bilgisayar Teknolojisi' bölümünün 'Elektrik' dersi ertelendi");
    EkleDuyuru duyuruz3= new EkleDuyuru("BT","Etkinlik","'Bilgisayar Teknolojisi' bölümünün katılması önerilen seminer yarın 16:00'da");
    EkleDuyuru duyuruz4= new EkleDuyuru("BP","Etkinlik","'Bilgisayar Programcılığı' bölümünün katılması önerilen seminer yarın 16:00'da");

    public static ArrayList<EkleDuyuru> duyuruDizi = new ArrayList<>();


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

    public void okuMetotDuyuru(){
        if (tekGirisDuyuru==0){
            duyuruDizi.add(duyuruz1);
            duyuruDizi.add(duyuruz2);
            duyuruDizi.add(duyuruz3);
            duyuruDizi.add(duyuruz4);
            tekGirisDuyuru++;
        }

    }
}
