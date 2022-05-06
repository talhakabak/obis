package API;

import admin.Database;
import obis.Mesaj;

import java.util.Scanner;

public class Sinavlar {
    public static void sinavlarGetir(String[] kullanici){
        int gun = 0;
        System.out.println("\n\n");
        String bolum = kullanici[4];
        for(String[][] bolumProgramlar : Database.programlar){
            for (String[] program : bolumProgramlar){
                if (bolum.equals(program[0])){
                    System.out.print(Database.gunler[gun]);
                    if (program.length > 1){
                        System.out.print(" günündeki sınavlarınız:");
                        System.out.println();
                        for (String derskodu : program){
                            for (String[] ders : Database.dersler){
                                if (ders[1].equals(derskodu)){
                                    if (!derskodu.equals(bolum)){
                                        System.out.println(ders[2]);
                                    }
                                }

                            }
                        }
                        System.out.println("\n");
                    }
                    else{
                        System.out.println(" gününde sınavınız bulunmuyor.\n");
                    }
                    gun++;
                }
            }
        }
        System.out.print(Mesaj.menuyeDon());
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}
