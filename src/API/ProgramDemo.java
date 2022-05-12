package API;

import admin.Database;
import obis.Mesaj;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramDemo {

    static int i=4,tekGirisProgram=0;
    EkleProgram programz1= new EkleProgram("BT", "201", " Bilişim Güvenliği ", "3","Salı");
    EkleProgram programz2= new EkleProgram("BT", "202", " Ağ Temelleri ", "5","Perşembe");
    EkleProgram programz3= new EkleProgram("BP", "203", " Matematik ", "3","Cuma");
    EkleProgram programz4= new EkleProgram("BP", "204", " Programlama Temelleri ", "5","Pazartesi");
    EkleProgram programz5= new EkleProgram("BT,BP", "205", " Nesne Tabanlı Programlama ", "4","Cuma");

    static ArrayList<EkleProgram> programDizi = new ArrayList<>();
    public void ekleProgram(){
        EkleProgram eklenenProgram= new EkleProgram();
        Scanner girdi = new Scanner(System.in);
        System.out.println("Ders No giriniz:");
        eklenenProgram.setDersno(girdi.nextLine());
        System.out.println("Ders adı giriniz:");
        eklenenProgram.setDersadi(girdi.nextLine());
        System.out.println("Ders kaç kredi giriniz:");
        eklenenProgram.setKredi(girdi.nextLine());
        System.out.println("Günü  giriniz:");
        eklenenProgram.setGunu(girdi.nextLine());
        System.out.println("Bölüm giriniz: (BP/BT/BT,BP)");
        String harfBuyut = girdi.nextLine();

        eklenenProgram.setBolum(harfBuyut.toUpperCase());
        ekleMetotProgram(eklenenProgram);
    }
    public void ekleMetotProgram(EkleProgram ekleProgram){




        programDizi.add(ekleProgram);

    }
    public void cikarMetotProgram(){
        byte siralama=0;
        for (EkleProgram program : programDizi) {

            System.out.println( siralama+")    "+program.bolum +"   "+program.dersno+" "+program.dersadi+" "+program.kredi+program.gunu+"\n");
            siralama++;
        }
        System.out.println("Silmek istediğiniz duyurunun numarasını giriniz");
        Scanner programSilme = new Scanner(System.in);
        int silinceksayi =programSilme.nextInt();
        System.out.println(silinceksayi);
        programDizi.remove(silinceksayi);

    }
    public void listeleMetotProgram(){
        okuMetotProgram();
        for (EkleProgram program : programDizi) {
            System.out.println( program.bolum +" --- "+program.dersno+"----- "+program.dersadi+program.kredi);
        }

    }
    public void okuMetotProgram(){
        if (tekGirisProgram==0){
            programDizi.add(programz1);
            programDizi.add(programz2);
            programDizi.add(programz3);
            programDizi.add(programz4);
            programDizi.add(programz5);
            tekGirisProgram++;
        }

    }

    public void programGiris(String[] kullanici){
        okuMetotProgram();
        String ekleSilprogram;
        String arti="+";
        String eksi="-";
        String gunler1="Pazartesi";
        String gunler2="Sali";
        String gunler3="Çarşamba";
        String gunler4="Perşembe";
        String gunler5="Cuma";
        Scanner programScan = new Scanner(System.in);

        System.out.println("\n\n");
        String bolum = kullanici[4];
            for(EkleProgram bolumProgramlar : programDizi){


            if(bolumProgramlar.bolum.equals(bolum)|| bolumProgramlar.bolum.length() >= 4) {

                if (Database.gunler[0].equals(bolumProgramlar.gunu))  gunler1=gunler1+"/"+bolumProgramlar.dersadi+" / ";
                if (Database.gunler[1].equals(bolumProgramlar.gunu))  gunler2=gunler2+"/"+bolumProgramlar.dersadi+" / ";
                if (Database.gunler[2].equals(bolumProgramlar.gunu))  gunler3=gunler3+"/"+bolumProgramlar.dersadi+" / ";
                if (Database.gunler[3].equals(bolumProgramlar.gunu))  gunler4=gunler4+"/"+bolumProgramlar.dersadi+" / ";
                if (Database.gunler[4].equals(bolumProgramlar.gunu))  gunler5=gunler5+"/"+bolumProgramlar.dersadi+" / ";




            }
        }
        if (gunler1.length()>10) System.out.println(gunler1);
        else System.out.println(gunler1+" Ders Yok");
        if (gunler2.length()>10) System.out.println(gunler2);
        else System.out.println(gunler2+" Ders Yok");
        if (gunler3.length()>10) System.out.println(gunler3);
        else System.out.println(gunler3+" Ders Yok");
        if (gunler4.length()>10)  System.out.println(gunler4);
        else System.out.println(gunler4+" Ders Yok");
        if (gunler5.length()>10)  System.out.println(gunler5);
        else System.out.println(gunler5+" Ders Yok");

        System.out.println(Mesaj.duyurularEkleSil());
        ekleSilprogram = programScan.nextLine();
        if (ekleSilprogram.equals(arti)) ekleProgram();
        if (ekleSilprogram.equals(eksi)) cikarMetotProgram();
        System.out.print(Mesaj.menuyeDon());
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }





}
