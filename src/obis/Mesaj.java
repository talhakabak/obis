package obis;


public class Mesaj {
    public static String mainAcilis() { return "Öğrenci Bilgi Sistemine Hoşgeldiniz"; }

    public static String mainCevrimici(String kullaniciadi) { return "Hoşgeldin " + kullaniciadi; }

    public static String girisKullanici() { return "Lütfen giriş yapmak için kullanıcı adınızı giriniz:"; }

    public static String girisBulunamadi() { return "Kullanıcı adı bulunamadı."; }

    public static String girisSifre() { return "Lütfen şifrenizi giriniz:"; }

    public static String girisBasarili() {
        return "Giriş başarılı.";
    }

    public static String girisHatali() {
        return "Şifre yanlış girildi.";
    }

}
