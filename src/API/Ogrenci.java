package API;


import admin.DatabaseDizi;

import java.util.Arrays;
import java.util.HashMap;

public class Ogrenci {

    public static String[] ogrenciOnline = {" ", " ", " ", " ", " ", " "}; //Öğrenci bilgilerinin saklandığı kısım

    public static HashMap<String, String> girisBilgileri = new HashMap<>();//Giriş bilgileri burada tutulur

    public Ogrenci() {
        for (String[] strings : DatabaseDizi.ogrenciler)
            girisBilgileri.put(strings[0], strings[1]);//Giriş bilgilerini HashMap içerisine atar
    }

    public static void ogrenciBilgi(String online) { //Giriş yapan öğrencinin bilgilerini alır
        int f = -1;// -1||0
        int h = -1;// hangi dizideki öğrenci kayıtları
        for (int i = 0; i < DatabaseDizi.ogrenciler.length && f == (-1); i++) {//sırayla dizi içerisindeki dizilerde değer aratır
            h++;//
            f = Arrays.asList(DatabaseDizi.ogrenciler[i]).indexOf(online);//dizinin kaçıncı elemanı ise o değeri alır. almazsa -1 kalır. alana kadar devam eder
            ogrenciOnline = DatabaseDizi.ogrenciler[h];
        }
    }

    protected HashMap<String, String> girisBilgiAl() {//Giriş bilgilerini bu sınıftan giriş sınıfına taşımak için kullandığım yöntem
        return girisBilgileri;
    }

}
