package obis;


import java.util.Arrays;
import java.util.HashMap;

public class Ogrenci {
    String kullanici;
    String sifre;
    String isim;
    String soyisim;
    String bolum;
    String ogrenciMail;

    String[] ogrenciGiris = {" ", " ", " ", " ", " ", " "}; //Öğrenci bilgilerinin saklandığı kısım
    String[] ogrenci1 = {"111", "123", "Talha", "Kabak", "BP", "talha.kabak@ogr.mail.com"};
    String[] ogrenci2 = {"222", "234", "Emir Taha", "Karcı", "BP", "emir.karci@ogr.mail.com"};
    String[] ogrenci3 = {"333", "345", "Emir", "Güner", "BP", "emir.guner@ogr.mail.com"};

    String[][] ogrenciler = {ogrenci1, ogrenci2, ogrenci3};
    HashMap<String, String> girisBilgileri = new HashMap<>();//Giriş bilgileri burada tutulur.

    Ogrenci() {
        for (String[] strings : ogrenciler) girisBilgileri.put(strings[0], strings[1]);//Giriş bilgilerini günceller
    }

    public void ogrenciBilgi(String online) { //Giriş yapan öğrencinin bilgilerini alır
        int f = -1;// -1||0
        int h = -1;// hangi dizideki öğrenci kayıtları
        for (int i = 0; i < ogrenciler.length && f == (-1); i++) {//sırayla dizi içerisindeki dizilerde değer aratır
            h++;//
            f = Arrays.asList(ogrenciler[i]).indexOf(online);//dizinin kaçıncı elemanı ise o değeri alır. almazsa -1 kalır. alana kadar devam eder
            ogrenciGiris = ogrenciler[h];
        }
    }

    protected HashMap<String, String> girisBilgiAl() {//Giriş bilgilerini bu sınıftan giriş sınıfına taşımak için kullandığım yöntem
        return girisBilgileri;
    }

}
