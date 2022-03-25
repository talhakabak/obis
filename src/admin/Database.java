package admin;
//Normal koşullarda akademisyen panelinden yapılması gerekenleri simüle etmek amaçlı admin sınıfını kullanıyoruz
public class Database {
    //public static String[] duyuru =  {"bolum","Başlık","Ana Metin"};//Duyuru Şablonu
    public static String[] duyuru1 =  {"BP","Ders Ertelendi","'Bilgisayar Programcılığı' bölümünün 'Matematik' dersi ertelendi"};
    public static String[] duyuru2 =  {"BT","Ders Ertelendi","'Bilgisayar Teknolojisi' bölümünün 'Elektrik' dersi ertelendi"};
    public static String[] duyuru3 =  {"BT","Etkinlik","'Bilgisayar Teknolojisi' bölümünün katılması önerilen seminer yarın 16:00'da"};
    public static String[] duyuru4 =  {"BP","Etkinlik","'Bilgisayar Programcılığı' bölümünün katılması önerilen seminer yarın 16:00'da"};
    public static String[][] duyurular = {duyuru1,duyuru2,duyuru3,duyuru4};

    //public static String[] ogrenci = {"Kullanıcı no", "şifre", "İsim", "Soyisim", "Bölüm", "Mail"};//Öğrenci Şablonu
    public static String[] ogrenci1 = {"111", "123", "Talha", "Kabak", "BP", "talha.kabak@ogr.mail.com"};
    public static String[] ogrenci2 = {"222", "234", "Emir Taha", "Karcı", "BT", "emir.karci@ogr.mail.com"};
    public static String[] ogrenci3 = {"333", "345", "Emir", "Güner", "BP", "emir.guner@ogr.mail.com"};
    public static String[][] ogrenciler = {ogrenci1, ogrenci2, ogrenci3};
}
