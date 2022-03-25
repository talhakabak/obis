package obis;


public class Mesaj {
    public static String mainAcilis() {
        return "Öğrenci Bilgi Sistemine Hoşgeldiniz";
    }

    public static String mainCevrimici(String kullaniciadi) {
        return "Hoşgeldin " + kullaniciadi;
    }

    public static String mainMenuSecim() {
        return "Duyurular için 1'i\nNotlar için 2'i\nSınavlar için 3'ü\nDers programınız için 4'ü\nDevamsızlık bilgileriniz için 5'i giriniz:";
    }

    public static String girisKullanici() {
        return "Lütfen giriş yapmak için kullanıcı adınızı giriniz:";
    }

    public static String girisBulunamadi() {
        return "Kullanıcı adı bulunamadı.";
    }

    public static String girisSifre() {
        return "Lütfen şifrenizi giriniz:";
    }

    public static String girisBasarili() {
        return "Giriş başarılı.";
    }

    public static String girisHatali() {
        return "Şifre yanlış girildi.";
    }

    public static String hataliGiris() {
        return "Hatalı giriş yapıldı.";
    }

    public static String duyuruBulunamadi() {
        return "Duyuru bulunamadı. Lütfen geçerli bir duyuru numarası giriniz.";
    }

    public static String duyurularSecim() {
        return "Geri dönmek için 0, Duyuruyu incelemek için duyuru numarasını giriniz:";
    }

    public static void bekle(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
