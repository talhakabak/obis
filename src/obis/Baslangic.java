package obis;

import API.Giris;
import API.Ogrenci;

public class Baslangic {
    public static String[] baslangic() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
