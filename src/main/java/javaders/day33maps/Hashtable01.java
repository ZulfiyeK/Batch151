package javaders.day33maps;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashtable01 {
    /*
    HashMap ile Hashtable araasindaki farklar
    1. HashMap "thread-safe" degildir.Yani coklu isi ayni anda yapamniz gerektiginde kullanamayiz.
       Hashtable "thread-safe" dir. Ayni anda birden fazla is yapabilmek demektir.
    2. HashMap "synchronized " degildir. mantikli siralama yapmaz. Hashtable "synchronized" dir.
    3. HashMap bir tane "null" key'e ve istediginiz kadar null value'ye musaade eder.
       Hashtable key'lerde de valueler'de de null kullanilmasina musaaade etmez.
    4. HashMap hizlidir. Hashtable HashMap'e gore yavastir. Hashtable thread-safe ve synchronized durumlarina baktigi icin zaman kaybeder.
    NOTE:  HashMap ve Hashtable entry'leri rastgele siralar.

     1.TreeMap "thread-safe" ve "synchronized " degildir.
     NOTE:Map'lerde  Multi thread kullanmaniz gerektiginde sadece Hashtable kullanabilirsiniz.
    2. TreeMap'lerde Value'lerde null kullanimina musaade eder ama key'lerde etmez.
    3. TreeMap entry'leri key'lerine gore Naturel Order'a gore (alfabetik siraya) siraya koyar .
       Bu yuzden cooook yavastir.
     */
    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges= new Hashtable<>();
        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Hanry", 43);
        stdAges.put("Walker", 85);
        System.out.println(stdAges);//{Jim=52, Hanry=43, Tom=43, Walker=85, Jack=21}



























    }
}
