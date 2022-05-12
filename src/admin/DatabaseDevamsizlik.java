package admin;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseDevamsizlik {
    static int i=4,tekGirisDevamsizlik=0;
    EkleDevamsizlik devamsizlik1= new EkleDevamsizlik("111","203",1,3);
    EkleDevamsizlik devamsizlik2= new EkleDevamsizlik("111","204",3,4);
    EkleDevamsizlik devamsizlik3= new EkleDevamsizlik("111","205",6,5);
    EkleDevamsizlik devamsizlik4= new EkleDevamsizlik("222","201",0,7);
    EkleDevamsizlik devamsizlik5= new EkleDevamsizlik("222","202",7,6);
    EkleDevamsizlik devamsizlik6= new EkleDevamsizlik("222","205",5,2);
    EkleDevamsizlik devamsizlik7= new EkleDevamsizlik("333","203",3,3);
    EkleDevamsizlik devamsizlik8= new EkleDevamsizlik("333","204",2,7);
    EkleDevamsizlik devamsizlik9= new EkleDevamsizlik("333","205",8,4);

    public static ArrayList<EkleDevamsizlik> devamsizlikDizi = new ArrayList<>();
    public void ekleDevamsizlik(){
        EkleDevamsizlik eklenenDevamsizlik= new EkleDevamsizlik();
        Scanner girdi = new Scanner(System.in);
        System.out.println("Öğrenci No giriniz:");
        eklenenDevamsizlik.setOgrencinumarasi(girdi.nextLine());
        System.out.println("Ders No giriniz:");
        eklenenDevamsizlik.setDersnumarasi(girdi.nextLine());
        System.out.println("Uygulamalı devamsızlık giriniz:");
        eklenenDevamsizlik.setUygdevamsizlik(girdi.nextInt());
        System.out.println("Teorik devamsızlık giriniz:");
        eklenenDevamsizlik.setTeorikdevamsizlik(girdi.nextInt());


        ekleMetotDevamsizlik(eklenenDevamsizlik);
    }

    public void ekleMetotDevamsizlik(EkleDevamsizlik eklenenDevamsizlik){




        devamsizlikDizi.add(eklenenDevamsizlik);

    }
    public void cikarMetotDevamsizlik(){
        byte siralama=0;
        for (EkleDevamsizlik devamsizlik : devamsizlikDizi) {

            System.out.println( siralama+")    "+devamsizlik.ogrencinumarasi +"   "+devamsizlik.dersnumarasi+": "+devamsizlik.uygdevamsizlik+"   "+devamsizlik.teorikdevamsizlik+"\n");
            siralama++;
        }
        System.out.println("Silmek istediğiniz duyurunun numarasını giriniz");
        Scanner duyuruSilme = new Scanner(System.in);
        int silinceksayi =duyuruSilme.nextInt();
        System.out.println(silinceksayi);
        devamsizlikDizi.remove(silinceksayi);

    }
    public void okuMetotDevamsizlik(){
        if (tekGirisDevamsizlik==0){
            devamsizlikDizi.add(devamsizlik1);
            devamsizlikDizi.add(devamsizlik2);
            devamsizlikDizi.add(devamsizlik3);
            devamsizlikDizi.add(devamsizlik4);
            devamsizlikDizi.add(devamsizlik5);
            devamsizlikDizi.add(devamsizlik6);
            devamsizlikDizi.add(devamsizlik7);
            devamsizlikDizi.add(devamsizlik8);
            devamsizlikDizi.add(devamsizlik9);
            tekGirisDevamsizlik++;
        }

    }

}


