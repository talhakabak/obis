package obis;


public class Mesaj extends Main {
    public String mainAcilis() {//Main
        return "Öğrenci Bilgi Sistemine Hoşgeldiniz";
    }

    public String mainCevrimici(String kullaniciadi) {
        return "Hoşgeldin " + kullaniciadi;
    }

    public String girisKullanici() {
        return "Lütfen giriş yapmak için kullanıcı adınızı giriniz:";
    }

    public String girisBulunamadi() {
        return "Kullanıcı adı bulunamadı.";
    }

    public String girisSifre() {
        return "Lütfen şifrenizi giriniz:";
    }

    public String girisBasarili() {
        return "Giriş başarılı.";
    }

    public String girisHatali() {
        return "Şifre yanlış girildi.";
    }

}
