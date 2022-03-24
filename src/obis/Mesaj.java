package obis;


public class Mesaj {
    public static String mainAcilisMSG() {
        return "Öğrenci Bilgi Sistemine Hoşgeldiniz";
    }

    public static String mainCevrimiciMSG(String kullaniciadi) {
        return "Hoşgeldin " + kullaniciadi;
    }

    public static String mainMenuSecimMSG() {
        return "Duyurular için 1'i\nNotlar için 2'i\nSınavlar için 3'ü\nDers programınız için 4'ü\nDevamsızlık bilgileriniz için 5'i giriniz:";
    }

    public static String girisKullaniciMSG() {
        return "Lütfen giriş yapmak için kullanıcı adınızı giriniz:";
    }

    public static String girisBulunamadiMSG() {
        return "Kullanıcı adı bulunamadı.";
    }

    public static String girisSifreMSG() {
        return "Lütfen şifrenizi giriniz:";
    }

    public static String girisBasariliMSG() {
        return "Giriş başarılı.";
    }

    public static String girisHataliMSG() {
        return "Şifre yanlış girildi.";
    }

    public static String menulerSecimHataMSG() {
        return "Hatalı giriş yapıldı.";
    }
}
