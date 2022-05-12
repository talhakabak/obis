package obis;


public class Mesaj {
    public static String mainAcilis() {
        return "Öğrenci Bilgi Sistemine Hoşgeldiniz";
    }

    public static String mainCevrimici(String kullaniciadi) {
        return "Hoşgeldin " + kullaniciadi;
    }

    public static String mainMenuSecim() { return "Çıkış yapmak için 0, sayfalara gitmek için sayfa numarasını giriniz:"; }

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

    public static String duyurularSecim() { return "Ana sayfaya geri dönmek için 0, duyuruyu incelemek için duyuru numarasını giriniz:"; }
    public static String devamsizlikEkleSil() { return "Devamsızlık eklemek için artı(+) silmek için eksi,(-) geçmek için enter a basınız"; }
    public static String notlarEkleSil() { return "Not eklemek için artı(+) silmek için eksi,(-) geçmek için enter a basınız"; }
    public static String programEkleSil() { return "Program eklemek için artı(+) silmek için eksi,(-) geçmek için enter a basınız"; }
    public static String sinavlarEkleSil() { return "Sınav eklemek için artı(+) silmek için eksi,(-) geçmek için enter a basınız"; }
    public static String duyurularEkleSil() { return "Duyuru eklemek için artı(+) silmek için eksi,(-) geçmek için enter a basınız"; }
    public static String menuyeDon() { return "Ana sayfaya geri dönmek için enter'a basınız"; }


    public static void bekle(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
