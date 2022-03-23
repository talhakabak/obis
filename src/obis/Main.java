package obis;


public class Main {

    public static void main(String[] args) {
        baslangic();
    }

    public static void baslangic() {
        Mesaj mesaj = new Mesaj();
        Ogrenci ogrenci = new Ogrenci();
        Giris giris = new Giris(ogrenci.girisBilgiAl()); //doğru giriş bilgileri gönderildi.
        System.out.println(mesaj.mainAcilis());
        do {
            giris.girisYap();
            if (giris.cevrimici) {
                ogrenci.ogrenciBilgi(giris.logKullanici);
                ogrenci.kullanici = ogrenci.ogrenciGiris[0];
                ogrenci.sifre = ogrenci.ogrenciGiris[1];
                ogrenci.isim = ogrenci.ogrenciGiris[2];
                ogrenci.soyisim = ogrenci.ogrenciGiris[3];
                ogrenci.bolum = ogrenci.ogrenciGiris[4];
                ogrenci.ogrenciMail = ogrenci.ogrenciGiris[5];
                System.out.println(mesaj.mainCevrimici(ogrenci.isim));
            }
        } while (!giris.cevrimici);
    }

}






