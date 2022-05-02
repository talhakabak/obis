package API;

import admin.Database;
import obis.Mesaj;

import java.util.Scanner;

public class Notlar {
    public static void notGetir(String[] kullanici) {
        System.out.println("\n\n");
        String bolum = kullanici[4];
        String harfNotu="F";
        double notOrt;
        System.out.printf("%-10s %-29s %-5s %-7s %-8s %-5s\n", "Ders No", "Ders Adı", "Vize","Final","Büt","Ders Notu");
        //System.out.println("Ders No \t Ders Adı \t\t\t\t\t Vize \t Final \t Büt \t Ders Notu");
        for (String[] strings : Database.dersler){
            if (strings[0].contains(bolum)){
                System.out.printf("%-10s %-30s", strings[1], strings[2]);
                //System.out.print("  " + strings[1] + "\t\t " + strings[2]);
                for (double[] doubles : Database.dersNotlari){
                    if (Double.parseDouble(kullanici[0])==doubles[0] && Double.parseDouble(strings[1]) == doubles[1]){//bolume göre not getirir
                        if(doubles[4] >= doubles[3]){
                            notOrt = (doubles[2] + doubles[4])/2;
                        }
                        else{
                            notOrt = (doubles[2] + doubles[3])/2;
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

                        if (doubles[4] == -1.0){
                            System.out.printf("%-5s %-7s %-11s %-5s\n", doubles[2], doubles[3], "Girmedi", harfNotu);
                        }
                        else{
                            System.out.printf("%-5s %-7s %-11s %-5s\n", doubles[2], doubles[3], doubles[4], harfNotu);
                        }
                    }
                }

            }
        }
        System.out.print("\n\n" + Mesaj.menuyeDon());
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}
