package obis;

import API.*;

import java.util.Scanner;

public class Menuler {
    static String[] menuler = {"Duyurular", "Notlar", "Sınavlar", "Ders Programı", "Devamsızlık"};
    public static void menuSecim(String[] kullanici){
        int secim = -1;
        Scanner menuScan = new Scanner(System.in);
        do {
            System.out.println("\n\n");
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
                        case 0 -> {}
                        case 1 -> Duyurular.duyuruSec(kullanici);
                        case 2 -> Notlar.notGetir(kullanici);
                        case 3 -> Sinavlar.sinavlarGetir(kullanici);
                        case 4 -> Program.programGetir(kullanici);
                        case 5 -> Devamsizlik.devamsizlikGetir(kullanici);
                        default -> throw new Exception(Mesaj.hataliGiris());
                    }
                } catch (Exception e){
                    System.out.println(Mesaj.hataliGiris());
                    i = true;
                }
            }while(i);
        }while(secim!=0);

    }





}
