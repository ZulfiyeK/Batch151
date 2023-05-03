package zlfy.mehmethocaday34collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();// Queue==> interface yapidadir, herseyi override etmek zorundayiz,ama abstract oldugu icin de obje olusturamayiz.
                                                    //bu yuzden constructorunu PriorityQueue olarak seciyoruz. artik kalibimiz PriorityQueue oldu.
                                                    // PriorityQueue'da elemanlari istedigimiz gibi siralayabiliyoruz.
                                                    // Aktif ozellikler icin constructor, pasif ozellikler icin class'a bakilir.
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]
        /*

            1)Queue bir interface dir ,  bu yuzden constructor ' yoktur, dolayisiyla object olustururken new keywordunden sonra kullanilamaz
            2)Datatype "Queue" olan bir object olusturmak icin new keywordden sonra
                i)LinkedList veya
               ii)PriorityQueue class'lari kullanilabilir
            3)Queue olustururken constructor olarak PriorityQueue kullanirsaniz eleman kendi belirleyeceginiz kurala gore siralama hakkiniz olur
         */



        //Sondan eleman eklemek istersem eger Deque ile yaparim, iki uclu kuyruk demek.
        // Queue yapisinda tek giris var.Deque de hem bastan hem sondan ekleme yapabiliyoruz.



        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);//[Milk, Meat, Egg, Orange, Tomatoes]
        // javadaki amacimiz; gunluk hayatta karsilasilabilen bazi olaylarin kodlarini yazmak.
        // java collections bunyesinde coklu datalari depolayabilmek icin ve bu depoladigimiz datalari da
        // gerektiginde kolayca manipule edebilmek icin yapilar olusturmus.
        // makul ve mantikli olani kullanacagiz.
        // mumkun mertebe an az kod yazmak
        // yapacagimiz isle ilgili ozel bir yapi ve veya method varsa onu kullanmak en iyisidir.
        // tekrarsiz datalari tutmak icin tekrardan kod yazmaya gerek yok, java zaten yapmis onu alip kullaniriz.
        // bizim ihriyacimiza uygun olan hangisi ise onu kullaniriz.



    }
}
