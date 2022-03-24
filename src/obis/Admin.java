package obis;
//Normal koşullarda akademisyen panelinden yapılması gerekenleri simüle etmek amaçlı admin sınıfını kullanıyoruz
public class Admin {
    String[] duyuru =  {"bolum","Başlık","Ana Metin"};//Duyuru Şablonu
    String[] duyuru1 =  {"BP","Ders Ertelendi","'Bilgisayar Programcılığı' bölümünün 'Matematik' dersi ertelendi"};
    String[] duyuru2 =  {"BT","Ders Ertelendi","'Bilgisayar Teknolojisi' bölümünün 'Elektrik' dersi ertelendi"};
    String[] duyuru3 =  {"BT","Etkinlik","'Bilgisayar Teknolojisi' bölümünün katılması önerilen seminer yarın 16:00'da"};
    String[] duyuru4 =  {"BP","Etkinlik","'Bilgisayar Programcılığı' bölümünün katılması önerilen seminer yarın 16:00'da"};
    String[][] duyurular = {duyuru,duyuru1,duyuru2,duyuru3,duyuru4};
}
