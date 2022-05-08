package API;

import admin.Database;
import obis.Mesaj;

import java.util.Scanner;
public class Devamsizlik {
    public static void devamsizlikGetir(String[] kullanici) {
        System.out.println("\n\n");
        String bolum = kullanici[4];

        System.out.printf("%-10s %-30s %-30s %-40s \n", "Ders No", "Ders Adı", "uygulamalı devamsızlık","teorik devamsızlık");
        for (String[] strings : Database.dersler){
            if (strings[0].contains(bolum)){
                System.out.printf("%-10s %-40s", strings[1], strings[2]);

                for (String[] ogrencidev : Database.devamsizliklar){

                    if (kullanici[0].equals(ogrencidev[0])  && strings[1].equals(ogrencidev[1])  ){//ogrenciye göre devamsızlık getirir

                        System.out.printf("%-30s %-30s \n", ogrencidev[2], ogrencidev[3]);


                    }

                }

            }
        }
        System.out.print("\n\n" + Mesaj.menuyeDon());
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}
