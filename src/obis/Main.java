package obis;


import admin.DatabaseDevamsizlik;
import admin.DatabaseDuyuru;
import admin.DatabaseNotlar;
import admin.DatabaseProgram;

public class Main{

    public static void main(String[] args) {
        DatabaseDevamsizlik veriDevamsizlik = new DatabaseDevamsizlik();
        DatabaseDuyuru veriDuyuru = new DatabaseDuyuru();
        DatabaseNotlar veriNotlar = new DatabaseNotlar();
        DatabaseProgram veriProgram = new DatabaseProgram();
        veriDevamsizlik.okuMetotDevamsizlik();
        veriDuyuru.okuMetotDuyuru();
        veriNotlar.okuMetotNotlar();
        veriProgram.okuMetotProgram();

        do {
            anaMenu(Baslangic.baslangic());
        }while(true);

    }

    public static void anaMenu(String[] kullanici){
        Menuler.menuSecim(kullanici);
    }
}






