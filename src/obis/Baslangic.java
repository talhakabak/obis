package obis;

import API.Giris;
import API.Ogrenci;

public class Baslangic {
    public static String[] baslangic() {
        Giris giris = new Giris();//doğru giriş bilgileri gönderildi.
        System.out.println(Mesaj.mainAcilis());
        do {
            giris.girisYap();
            if (giris.cevrimici) {
                Ogrenci.ogrenciBilgi(giris.logKullanici);
                System.out.println(Mesaj.mainCevrimici(Ogrenci.ogrenciOnline[2]));
            }
        } while (!giris.cevrimici);
        return Ogrenci.ogrenciOnline;
    }
}
