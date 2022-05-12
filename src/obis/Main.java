package obis;


import API.EkleDuyuru;

public class Main{

    public static void main(String[] args) {


        do {
            anaMenu(Baslangic.baslangic());
        }while(true);

    }

    public static void anaMenu(String[] kullanici){
        Menuler.menuSecim(kullanici);
    }
}






