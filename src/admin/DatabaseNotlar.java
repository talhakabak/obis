package admin;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseNotlar {
    static int i=4,tekGirisDuyuru=0;
    EkleNotlar notlarz1= new EkleNotlar("111","203",70,90,-1);
    EkleNotlar notlarz2= new EkleNotlar("111","204",70,90,-1);
    EkleNotlar notlarz3= new EkleNotlar("111","205",70,90,-1);
    EkleNotlar notlarz4= new EkleNotlar("222","201",70,90,-1);
    EkleNotlar notlarz5= new EkleNotlar("222","202",70,90,-1);
    EkleNotlar notlarz6= new EkleNotlar("222","205",70,90,-1);
    EkleNotlar notlarz7= new EkleNotlar("333","203",70,90,-1);
    EkleNotlar notlarz8= new EkleNotlar("333","204",70,90,-1);
    EkleNotlar notlarz9= new EkleNotlar("333","205",70,90,-1);

    public static ArrayList<EkleNotlar> notDizi = new ArrayList<>();

    public void eklenenNot(){
        EkleNotlar eklenenNot= new EkleNotlar();
        Scanner girdi = new Scanner(System.in);

        System.out.println("Öğrenci numarası giriniz:");
        eklenenNot.setOgrenci_kullanici(girdi.nextLine());

        System.out.println("Ders numarasını giriniz:");
        eklenenNot.setDersno(girdi.nextLine());

        System.out.println("vize giriniz:");
        eklenenNot.setVize(girdi.nextInt());

        System.out.println("final giriniz:");
        eklenenNot.setFinalsinav(girdi.nextInt());

        System.out.println("Büt giriniz: (girmediyse -1");
        eklenenNot.setBut(girdi.nextInt());
        ekleMetotnot(eklenenNot);
    }
    public void ekleMetotnot(EkleNotlar eklenenNot){




        notDizi.add(eklenenNot);

    }
    public void cikarMetotNot(){
        byte siralama=0;
        for (EkleNotlar not : notDizi) {

            System.out.println( siralama+")    "+not.ogrenci_kullanici +"   "+not.dersno+": "+not.vize+"   "+not.finalsinav+"  "+not.but+"\n");
            siralama++;
        }
        System.out.println("Silmek istediğiniz duyurunun numarasını giriniz");
        Scanner duyuruSilme = new Scanner(System.in);
        int silinceksayi =duyuruSilme.nextInt();
        System.out.println(silinceksayi);
        notDizi.remove(silinceksayi);

    }
    public void okuMetotNotlar(){
        if (tekGirisDuyuru==0){
            notDizi.add(notlarz1);
            notDizi.add(notlarz2);
            notDizi.add(notlarz3);
            notDizi.add(notlarz4);
            notDizi.add(notlarz5);
            notDizi.add(notlarz6);
            notDizi.add(notlarz7);
            notDizi.add(notlarz8);
            notDizi.add(notlarz9);
            tekGirisDuyuru++;
        }

    }

}
