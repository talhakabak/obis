package obis;

public class Main extends Mesaj{

    public static void main(String[] args) {
        anaMenu(baslangic());
    }

    public static String[] baslangic() {
        Ogrenci ogrenci = new Ogrenci();
        Giris giris = new Giris(ogrenci.girisBilgiAl()); //doğru giriş bilgileri gönderildi.
        System.out.println(mainAcilisMSG());
        do {
            giris.girisYap();
            if (giris.cevrimici) {
                ogrenci.ogrenciBilgi(giris.logKullanici);
                System.out.println(mainCevrimiciMSG(ogrenci.ogrenciGiris[2]));
            }
        } while (!giris.cevrimici);
        return ogrenci.ogrenciGiris;
    }

    public static void anaMenu(String[] kullanici){
        Menuler menu = new Menuler(kullanici);
        menu.menuSecim();
    }
}






