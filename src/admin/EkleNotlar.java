package admin;

public class EkleNotlar {
   public String ogrenci_kullanici;
    public String dersno;
    public int vize;
    public int finalsinav;
    public int but;


    public EkleNotlar(){}
    public EkleNotlar( String ogrenci_kullanici, String dersno, int vize, int finalsinav, int but) {
        this.ogrenci_kullanici = ogrenci_kullanici;

        this.dersno = dersno;
        this.vize = vize;
        this.finalsinav = finalsinav;
        this.but = but;
    }

    public void setOgrenci_kullanici(String ogrenci_kullanici) {
        this.ogrenci_kullanici = ogrenci_kullanici;
    }

    public void setDersno(String dersno) {
        this.dersno = dersno;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public void setFinalsinav(int finalsinav) {
        this.finalsinav = finalsinav;
    }

    public void setBut(int but) {
        this.but = but;
    }
}
