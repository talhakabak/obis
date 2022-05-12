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

    public String getOgrenci_kullanici() {
        return ogrenci_kullanici;
    }

    public void setOgrenci_kullanici(String ogrenci_kullanici) {
        this.ogrenci_kullanici = ogrenci_kullanici;
    }

    public String getDersno() {
        return dersno;
    }

    public void setDersno(String dersno) {
        this.dersno = dersno;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinalsinav() {
        return finalsinav;
    }

    public void setFinalsinav(int finalsinav) {
        this.finalsinav = finalsinav;
    }

    public int getBut() {
        return but;
    }

    public void setBut(int but) {
        this.but = but;
    }
}
