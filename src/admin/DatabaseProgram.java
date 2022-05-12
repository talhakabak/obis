package admin;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseProgram {
    static int i=4,tekGirisProgram=0;
    EkleProgram programz1= new EkleProgram("BT", "201", "Bilişim Güvenliği", "3","Salı");
    EkleProgram programz2= new EkleProgram("BT", "202", "Ağ Temelleri", "5","Perşembe");
    EkleProgram programz3= new EkleProgram("BP", "203", "Matematik", "3","Cuma");
    EkleProgram programz4= new EkleProgram("BP", "204", "Programlama Temelleri", "5","Pazartesi");
    EkleProgram programz5= new EkleProgram("BT,BP", "205", "Nesne Tabanlı Programlama", "4","Cuma");

    public static ArrayList<EkleProgram> programDizi = new ArrayList<>();
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

}
