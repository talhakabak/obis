package obis;

import API.*;

import java.util.Scanner;

public class Menuler {
    static String[] menuler = {"Duyurular", "Notlar", "Sınavlar", "Ders Programı", "Devamsızlık"};
    public static void menuSecim(String[] kullanici){
        int secim = -1;
        Scanner menuScan = new Scanner(System.in);
        Duyuru ddemo = new Duyuru();
        Program pdemo = new Program();
        Sinavlar sdemo = new Sinavlar();
        Notlar ndemo = new Notlar();
        Devamsizlik devamdemo = new Devamsizlik();
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
                        case 1 -> ddemo.duyuruGiris(kullanici);
                        case 2 -> ndemo.notlarGiris(kullanici);
                        case 3 -> sdemo.sinavlarGetir(kullanici);
                        case 4 -> pdemo.programGiris(kullanici);
                        case 5 -> devamdemo.devamsizlikGiris(kullanici);
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
