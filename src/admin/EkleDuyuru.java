package admin;

public class EkleDuyuru {


   public String bolum;
    public String baslik;
    public String anaMetin;
public EkleDuyuru(){}
    public EkleDuyuru( String bolum, String baslik, String anaMetin) {
        this.bolum = bolum;

        this.baslik = baslik;
        this.anaMetin = anaMetin;
    }



    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAnaMetin() {
        return anaMetin;
    }

    public void setAnaMetin(String anaMetin) {
        this.anaMetin = anaMetin;
    }
}
