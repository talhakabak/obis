package obis;

import API.Duyurular;

import java.util.Scanner;

public class Menuler {
    public static void menuSecim(String[] kullanici){
        Scanner menuScan = new Scanner(System.in);
        int secim;
        boolean i = false;
        do{
            try {
                System.out.println(Mesaj.mainMenuSecim());
                secim = menuScan.nextByte();
                menuScan.nextLine();
                switch (secim) {
                    case 1 -> {
                        Duyurular.duyuruSec(kullanici);
                        menuScan.close();
                    }
                    case 2 -> notlar();
                    case 3 -> sinavlar();
                    case 4 -> program();
                    case 5 -> devamsizlik();
                    default -> throw new Exception(Mesaj.hataliGiris());
                }
            } catch (Exception e){
                System.out.println(Mesaj.hataliGiris());
                i = true;
            }
        }while(i);
        menuScan.close();
    }

    public static void notlar() {

    }

    public static void sinavlar() {

    }

    public static void program() {

    }

    public static void devamsizlik() {

    }

}
