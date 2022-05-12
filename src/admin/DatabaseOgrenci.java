package admin;

import java.util.ArrayList;

public class DatabaseOgrenci {
    static int tekGirisOgrenci=0;

    EkleOgrenci ogrenciz1= new EkleOgrenci("111", "123", "Talha", "Kabak", "BP", "talha.kabak@ogr.mail.com");
    EkleOgrenci ogrenciz2= new EkleOgrenci("222", "234", "Emir Taha", "Karcı", "BT", "emir.karci@ogr.mail.com");
    EkleOgrenci ogrenciz3= new EkleOgrenci("333", "345", "Emir", "Güner", "BP", "emir.guner@ogr.mail.com");

    static ArrayList<EkleOgrenci> ogrenciDizi = new ArrayList<>();

    public void okuMetotOgrenci() {
        if (tekGirisOgrenci == 0) {
            ogrenciDizi.add(ogrenciz1);
            ogrenciDizi.add(ogrenciz2);
            ogrenciDizi.add(ogrenciz3);

            tekGirisOgrenci++;
        }
    }

}
