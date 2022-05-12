package API;

import admin.DatabaseNotlar;
import admin.DatabaseProgram;
import admin.EkleNotlar;
import admin.EkleProgram;
import obis.Mesaj;

import java.util.Scanner;

public class Notlar {


    public void notlarGiris(String[] kullanici){
        DatabaseNotlar notlarCek = new DatabaseNotlar();

        Scanner programScan = new Scanner(System.in);
        String ekleSilnotlar;
        String arti="+";
        String eksi="-";

        System.out.println("\n\n");
        String bolum = kullanici[4];
        String harfNotu="F";
        double notOrt;
        System.out.printf("%-10s %-29s %-5s %-7s %-8s %-5s\n", "Ders No", "Ders Adı", "Vize","Final","Büt","Ders Notu");
        //System.out.println("Ders No \t Ders Adı \t\t\t\t\t Vize \t Final \t Büt \t Ders Notu");
        for (EkleProgram strings : DatabaseProgram.programDizi){
            if (strings.bolum.equals(bolum)){
                System.out.printf("%-10s %-30s", strings.dersno, strings.dersadi);
                //System.out.print("  " + strings[1] + "\t\t " + strings[2]);
                for (EkleNotlar doubles : notlarCek.notDizi){
                    if (kullanici[0].equals(doubles.ogrenci_kullanici) && strings.dersno.equals(doubles.dersno)){//bolume göre not getirir
                        if(doubles.but >= doubles.finalsinav){
                            notOrt = (doubles.vize + doubles.but)/2;
                        }
                        else{
                            notOrt = (doubles.vize + doubles.finalsinav)/2;
                        }
                        if (notOrt >= 90) harfNotu = "AA";
                        else if (notOrt >= 85) harfNotu = "BA";
                        else if (notOrt >= 75) harfNotu = "BB";
                        else if (notOrt >= 65) harfNotu = "CB";
                        else if (notOrt >= 60) harfNotu = "CC";
                        else if (notOrt >= 50) harfNotu = "DC";
                        else if (notOrt >= 45) harfNotu = "DD";
                        else if (notOrt >= 40) harfNotu = "FD";
                        else if (notOrt >= 0) harfNotu = "FF";

                        if (doubles.but == -1.0){
                            System.out.printf("%-5s %-7s %-11s %-5s\n", doubles.vize, doubles.finalsinav, "Girmedi", harfNotu);
                        }
                        else{
                            System.out.printf("%-5s %-7s %-11s %-5s\n", doubles.vize, doubles.finalsinav, doubles.but, harfNotu);
                        }
                    }
                }

            }
        }
        System.out.println("\n"+Mesaj.duyurularEkleSil());
        ekleSilnotlar = programScan.nextLine();
        if (ekleSilnotlar.equals(arti)) notlarCek.eklenenNot();
        if (ekleSilnotlar.equals(eksi)) notlarCek.cikarMetotNot();
        System.out.print("\n\n" + Mesaj.menuyeDon());
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

    }




