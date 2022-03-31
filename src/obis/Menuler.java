package obis;

import API.Duyurular;

import java.util.Scanner;

public class Menuler {
    static String[] menuler = {"Duyurular", "Notlar", "Sınavlar", "Ders Programı", "Devamsızlık"};
    public static void menuSecim(String[] kullanici){
        Scanner menuScan = new Scanner(System.in);
        int secim;
        boolean i = false;
        do{
            try {
                int b = 1;
                for(String strings : menuler){
                    System.out.println(strings + " -> " + b);
                    b++;
                }
                System.out.print(Mesaj.mainMenuSecim());
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
