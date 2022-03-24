package admin;
//Normal koşullarda akademisyen panelinden yapılması gerekenleri simüle etmek amaçlı admin sınıfını kullanıyoruz
public class Database {
    public String[] duyuru =  {"bolum","Başlık","Ana Metin"};//Duyuru Şablonu
    public String[] duyuru1 =  {"BP","Ders Ertelendi","'Bilgisayar Programcılığı' bölümünün 'Matematik' dersi ertelendi"};
    public String[] duyuru2 =  {"BT","Ders Ertelendi","'Bilgisayar Teknolojisi' bölümünün 'Elektrik' dersi ertelendi"};
    public String[] duyuru3 =  {"BT","Etkinlik","'Bilgisayar Teknolojisi' bölümünün katılması önerilen seminer yarın 16:00'da"};
    public String[] duyuru4 =  {"BP","Etkinlik","'Bilgisayar Programcılığı' bölümünün katılması önerilen seminer yarın 16:00'da"};
    public String[][] duyurular = {duyuru,duyuru1,duyuru2,duyuru3,duyuru4};

}
