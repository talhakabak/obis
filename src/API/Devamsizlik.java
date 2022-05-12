package API;

import admin.DatabaseDevamsizlik;
import admin.DatabaseProgram;
import admin.EkleDevamsizlik;
import admin.EkleProgram;
import obis.Mesaj;

import java.util.Scanner;

public class Devamsizlik {
    public void devamsizlikGiris(String[] kullanici){
        DatabaseDevamsizlik devamsizlikcek = new DatabaseDevamsizlik();


        String ekleSildevamsizlik;
        Scanner programScan = new Scanner(System.in);
        System.out.println("\n\n");
        String bolum = kullanici[4];
        String arti="+";
        String eksi="-";

        System.out.printf("%-10s %-30s %-30s %-40s \n", "Ders No", "Ders Adı", "uygulamalı devamsızlık","teorik devamsızlık");
        for (EkleProgram strings : DatabaseProgram.programDizi){
            if (strings.bolum.contains(bolum)){
                System.out.printf("%-10s %-40s", strings.dersno, strings.dersadi);

                for (EkleDevamsizlik ogrencidev : DatabaseDevamsizlik.devamsizlikDizi){

                    if (kullanici[0].equals(ogrencidev.ogrencinumarasi)  && strings.dersno.equals(ogrencidev.dersnumarasi)  ){//ogrenciye göre devamsızlık getirir

                        System.out.printf("%-30s %-30s \n", ogrencidev.uygdevamsizlik, ogrencidev.teorikdevamsizlik);


                    }

                }

            }
        }
        System.out.println("\n"+Mesaj.devamsizlikEkleSil());
        ekleSildevamsizlik = programScan.nextLine();
        if (ekleSildevamsizlik.equals(arti)) devamsizlikcek.ekleDevamsizlik();
        if (ekleSildevamsizlik.equals(eksi)) devamsizlikcek.cikarMetotDevamsizlik();
        System.out.print("\n\n" + Mesaj.menuyeDon());
        Scanner scan = new Scanner(System.in);
        scan.nextLine();





    }



}
