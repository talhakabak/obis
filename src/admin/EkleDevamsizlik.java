package admin;




public class EkleDevamsizlik {

    public String ogrencinumarasi;
    public String dersnumarasi;
    public int uygdevamsizlik;
    public int teorikdevamsizlik;


    public EkleDevamsizlik() {
    }

    public EkleDevamsizlik(String ogrencinumarasim, String dersnumarasi, int uygdevamsizlik, int teorikdevamsizlik) {
        this.ogrencinumarasi = ogrencinumarasim;

        this.dersnumarasi = dersnumarasi;
        this.uygdevamsizlik = uygdevamsizlik;
        this.teorikdevamsizlik = teorikdevamsizlik;
    }

    public void setOgrencinumarasi(String ogrencinumarasi) {
        this.ogrencinumarasi = ogrencinumarasi;
    }

    public void setDersnumarasi(String dersnumarasi) {
        this.dersnumarasi = dersnumarasi;
    }

    public void setUygdevamsizlik(int uygdevamsizlik) {
        this.uygdevamsizlik = uygdevamsizlik;
    }

    public void setTeorikdevamsizlik(int teorikdevamsizlik) {
        this.teorikdevamsizlik = teorikdevamsizlik;
    }

}