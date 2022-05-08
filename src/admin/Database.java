package admin;

import java.util.ArrayList;

//Normal koşullarda akademisyen panelinden yapılması gerekenleri simüle etmek amaçlı admin paketini kullanıyoruz
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

    //public static String[] ders = {"Bölüm", "Ders No", "Ders Adı", "Kredi"};
    public static String[] ders1 = {"BT", "201", "Bilişim Güvenliği", "3"};
    public static String[] ders2 = {"BT", "202", "Ağ Temelleri", "5"};
    public static String[] ders3 = {"BP", "203", "Matematik", "3"};
    public static String[] ders4 = {"BP", "204", "Programlama Temelleri", "5"};
    public static String[] ders5 = {"BT,BP", "205", "Nesne Tabanlı Programlama", "4"};
    public static String[][] dersler = {ders1, ders2, ders3, ders4, ders5};

    //public static String[] dersNot = {"ogrenci", "DersNo", "Vize", "Final", "Büt"};
    public static double[] dersNot1 = {Double.parseDouble(ogrenci1[0]), Double.parseDouble(ders3[1]), 70,90,-1};
    public static double[] dersNot2 = {Double.parseDouble(ogrenci1[0]), Double.parseDouble(ders4[1]), 75,70,-1};
    public static double[] dersNot3 = {Double.parseDouble(ogrenci1[0]), Double.parseDouble(ders5[1]), 50,80,-1};

    public static double[] dersNot4 = {Double.parseDouble(ogrenci2[0]), Double.parseDouble(ders1[1]), 80,75,-1};
    public static double[] dersNot5 = {Double.parseDouble(ogrenci2[0]), Double.parseDouble(ders2[1]), 90,55,-1};
    public static double[] dersNot6 = {Double.parseDouble(ogrenci2[0]), Double.parseDouble(ders5[1]), 70,65,-1};

    public static double[] dersNot7 = {Double.parseDouble(ogrenci3[0]), Double.parseDouble(ders3[1]), 55,85,-1};
    public static double[] dersNot8 = {Double.parseDouble(ogrenci3[0]), Double.parseDouble(ders4[1]), 45,80,-1};
    public static double[] dersNot9 = {Double.parseDouble(ogrenci3[0]), Double.parseDouble(ders5[1]), 30,35,70};

    public static double[][] dersNotlari = {dersNot1, dersNot2, dersNot3, dersNot4, dersNot5,dersNot6,dersNot7,dersNot8,dersNot9};


    public static String[] gunler = {"Pazartesi","Salı", "Çarşamba", "Perşembe", "Cuma"};
    public static String[] pazartesiBT = {"BT","201", "202"};
    public static String[] saliBT = {"BT"};
    public static String[] carsambaBT = {"BT","205"};
    public static String[] persembeBT = {"BT"};
    public static String[] cumaBT = {"BT","205", "201"};

    public static String[] pazartesiBP = {"BP","203", "204"};
    public static String[] saliBP = {"BP"};
    public static String[] carsambaBP = {"BP"};
    public static String[] persembeBP = {"BP","205"};
    public static String[] cumaBP = {"BP","203", "205"};


    //public static String[][] programDers = {"Bölüm", "PazartesiDers", "SalıDers", "ÇarşambaDers", "PerşembeDers", "CumaDers"};

    public static String[][] programBT = {pazartesiBT,saliBT,carsambaBT,persembeBT,cumaBT};
    public static String[][] programBP = {pazartesiBP,saliBP,carsambaBP,persembeBP,cumaBP};

    public static String[][][] programlar = {programBT,programBP};


    //public static String[] dersNot = {"ogrenci", "DersNo", "uygulama devamsızlık", "teorik devamssızlık"};

    public static String[] devamsizlik1 = {(ogrenci1[0]), (ders3[1]), "1","3"};
    public static String[] devamsizlik2 = {(ogrenci1[0]), (ders4[1]), "0","0"};
    public static String[] devamsizlik3 = {(ogrenci1[0]), (ders5[1]), "4","4"};

    public static String[] devamsizlik4 = {(ogrenci2[0]), (ders1[1]), "5","3"};
    public static String[] devamsizlik5 = {(ogrenci2[0]),(ders2[1]), "6","5"};
    public static String[] devamsizlik6 = {(ogrenci2[0]), (ders5[1]), "7","8"};

    public static String[] devamsizlik7 = {(ogrenci3[0]),(ders3[1]), "5","7"};
    public static String[] devamsizlik8 = {(ogrenci3[0]), (ders4[1]), "3","4"};
    public static String[] devamsizlik9= {(ogrenci3[0]), (ders5[1]), "6","0"};

    public static String[][] devamsizliklar = {devamsizlik1, devamsizlik2, devamsizlik3, devamsizlik4, devamsizlik5,devamsizlik6,devamsizlik7,devamsizlik8,devamsizlik9};

}
