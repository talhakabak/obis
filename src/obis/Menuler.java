package obis;

import java.util.Scanner;

public class Menuler extends Mesaj {
    String kullanici;

    Menuler(String i) {
        kullanici = i;
    }
    public void menuSecim(){
        Scanner menuScan = new Scanner(System.in);
        int secim = 0;
        boolean i = true;
        do{
            try {
                System.out.println(mainMenuSecimMSG());
                secim = menuScan.nextByte();
                i = false;
            } catch (Exception e){
                menuScan.nextLine();
                System.out.println(menulerSecimHataMSG());
            }
        }while(i);
        switch (secim) {
            case 1 -> duyurular();
            case 2 -> notlar();
            case 3 -> sinavlar();
            case 4 -> program();
            case 5 -> devamsizlik();
            default -> menuSecim();
        }
        menuScan.close();
    }

    public void duyurular() {
        Duyurular duyuru = new Duyurular(kullanici);

    }

    public void notlar() {
        Notlar not = new Notlar(kullanici);
    }

    public void sinavlar() {
        Sinavlar sinav = new Sinavlar(kullanici);
    }

    public void program() {
        Program program_ = new Program(kullanici);
    }

    public void devamsizlik() {
        Devamsizlik devamsiz = new Devamsizlik(kullanici);
    }

}
