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


    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public void setAnaMetin(String anaMetin) {
        this.anaMetin = anaMetin;
    }
}
