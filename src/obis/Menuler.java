package obis;

import java.util.Scanner;

public class Menuler extends Mesaj {
    Admin DB = new Admin();
    String[] kullanici;
    Menuler(String[] i) {
        kullanici = i;
    }
    public void menuSecim(){
        Scanner menuScan = new Scanner(System.in);
        int secim;
        boolean i = false;
        do{
            try {
                System.out.println(mainMenuSecimMSG());
                secim = menuScan.nextByte();
                switch (secim) {
                    case 1 -> duyurular(kullanici[4]);
                    case 2 -> notlar();
                    case 3 -> sinavlar();
                    case 4 -> program();
                    case 5 -> devamsizlik();
                    default -> throw new Exception(menulerSecimHataMSG());
                }
            } catch (Exception e){
                menuScan.nextLine();
                System.out.println(menulerSecimHataMSG());
                i = true;
            }
        }while(i);
        menuScan.close();
    }

    public void duyurular(String bolum) {
        for (String[] strings : DB.duyurular) {//duyuruları kontrol eder
            if (bolum.equals(strings[0])) {//duyurunun bölüm kısmı eşleşirse çalışır
                for (int r = 1; r < strings.length; r++) {//duyuruyu yazdırır
                    System.out.println(strings[r]);
                }
            }
        }
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
