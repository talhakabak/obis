package admin;

public class EkleProgram {
    public String bolum;
    public String dersno;
    public String dersadi;
    public String kredi;
    public String gunu;

    public EkleProgram(){}
    public EkleProgram( String bolum, String dersno, String dersadi, String kredi,String gunu) {
        this.bolum = bolum;

        this.dersno = dersno;
        this.dersadi = dersadi;
        this.kredi = kredi;
        this.gunu = gunu;

    }

    public String getGunu() {
        return gunu;
    }

    public void setGunu(String gunu) {
        this.gunu = gunu;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getDersno() {
        return dersno;
    }

    public void setDersno(String dersno) {
        this.dersno = dersno;
    }

    public String getDersadi() {
        return dersadi;
    }

    public void setDersadi(String dersadi) {
        this.dersadi = dersadi;
    }

    public String getKredi() {
        return kredi;
    }

    public void setKredi(String kredi) {
        this.kredi = kredi;
    }
}
