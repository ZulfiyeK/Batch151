package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();// Strin, Integer iki tane data type'i girdik,
                                                            // ogrencinin isimleri ve yaslari icin
        stdAges.put("Ajda", 77);// isim kismi "key", yas kismi "value"
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);// put ==> eleman eklemek icin kullanilir.
        //"key"i tekrarli kullandigimizda hata vermez, en son verilen entry'nin degerini kabul eder.
        // bu yontem value guncellemede kullanilabilir. buna "overwrite" denir.

        stdAges.put("Tom", 83);
        // HasMap'ler entry'leri rast gele siralar, bu yuzden cok hizlidir.
        // "Map'ler siralamayi key'lere bakarak siralama yapar.

        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}-- ikinci tom'u aldi,
        // cunku tom'un guncellendigini dusundu ve son degeri kabul etti.
        // veri guncellemesi yaparak overwrite yapti.

        stdAges.replace("Ezel", 39);// replace() methodu key'leri kullanarak value'lari degistirmeye yarar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        // value degistirmek icin replace methodu kullanilir.
        stdAges.replace("Angelina", 57, 61);//angelina 58 ise onu 61 yap.58 degilse 61 olmayacak.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        stdAges.putIfAbsent("Brad", 60);// brad yoksa koy,
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}-- oldugu icin eklemedi

        stdAges.putIfAbsent("Ali", 60);//Ali yoksa koy,
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //stdAges.get();// "key" ile calisir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom", 0));//83--var olanlar icin degeri veririr.

        System.out.println(stdAges.get("Fuat"));//null--get() olmayanlar icin ise null verir.
        System.out.println(stdAges.getOrDefault("Fuat", 0));//0--olmayanlar icin bizim yazdigimizi veriri
                                                                            // 100 deseydik 100 verirdi.

        System.out.println(stdAges.containsValue(77));//-- valuelerde 77 var mi dedigimizde false ya da tru verir.
        System.out.println(stdAges.containsValue(88));//false- entry'lerde 88 olmadigi icin false verdi.

        System.out.println(stdAges.containsKey("Ali"));//true--key'lerde Ali var mi diye bakar, varsa true.
        // yoksa false verir.Stringler herzaman buyuk/kucuk harfe duyarlidir.

        stdAges.remove("Ajda");// key kullanarak siler
        System.out.println(stdAges);//{Tom=83, Angelina=58, Brad=58, Ezel=39, Ali=60}
        stdAges.remove("Ali", 77);// key ve value aynen varsa siler.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Brad=58, Ezel=39, Ali=60}

        // stdAges.clear();// temizler
        // stdAges.size();// entry sayisini veriri.

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

        //stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=58, John=12, Brad=58, Jack=32, Ezel=39, Ali=60, Jim=22}
        System.out.println(kidsAge);//{John=12, Jack=32, Jim=22}
    }
}
