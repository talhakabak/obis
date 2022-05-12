package API;

public class EkleNotlar {
    String ogrenci_kullanici;
    String dersno;
    int vize;
    int finalsinav;
    int but;


    public EkleNotlar(){}
    public EkleNotlar( String ogrenci_kullanici, String dersno, int vize, int finalsinav, int but) {
        this.ogrenci_kullanici = ogrenci_kullanici;

        this.dersno = dersno;
        this.vize = vize;
        this.finalsinav = finalsinav;
        this.but = but;
    }
}
