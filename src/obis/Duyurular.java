package obis;


public class Duyurular extends Admin{
    Duyurular(String[] i){
        duyuruCek(i[4]);
    }
    public void duyuruCek(String bolum){
        for (String[] strings : duyurular) {//duyuruları kontrol eder
            if (bolum.equals(strings[0])) {//duyurunun bölüm kısmı eşleşirse çalışır
                for (int r = 1; r < strings.length; r++) {//duyuruyu yazdırır
                    System.out.println(strings[r]);
                }
            }
        }
    }
}
