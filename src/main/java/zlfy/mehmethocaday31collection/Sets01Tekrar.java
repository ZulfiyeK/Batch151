package zlfy.mehmethocaday31collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01Tekrar {
    /*
    tekrarli bile olsa her datanin tek ve yeni bir kodu vardir. buna hashing Technique denir.
    set, tekrarsiz data demek. telefon numaralari' arac plakalri, tc kimlik vs gibi datalari depolamak icin kullanilir.
    tekrarsiz elemanlara " unique" denir, bennzersiz, tekrarsiz demek.
    3 tane set class'i vardir.
        Hashset : sira gozetmeksizin tum datalari alir. bu yuzden cok hizlidir.
        LinkedHashset :bizim verdigimiz siraya gore(insertion order) ekler.
        TreeSet : istediginiz sirada verin kendi icinde naturel siraya gore dizer.
                  o yuzden cok yavastir, bu yuzden cok tavsiye edilmez kullanilmasi.

Setler tekrarsiz(==>unique) eleman depolamak icin kullanilir.
 3 tane Set Class vardir.
    1. HashSet :
       -Benzersiz Id olusturma teknigidir.Bu teknige Hassing denir.
       - "HasSet" elemenalari rastgele siralar.
       - Siralama yapmadigi icin cok hizlidir.
       - "HashSet" ler tekrarsiz eleman depolamak icin kullanilir
       - "HashSet" ler "null" i eleman olarak kabul eder.

    2. LinkedHashSet Class:
          "LinkedHashSet" ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order)
          "HashSet" lere gore yavastirlar.
          "LinkedHashSet" ler tekrarsiz eleman depolamak icindir

    3. TreeSet :
         "TreeSet" ler elemanlari natural order(kuzukten buyuge, alfabetik sira)'ya gore dizerler
        "TreeSet" ler elemanlari natural order a gore dizdiklerinden cok yavastirlar
        En yavas set "TreeSet" ler dir.
        "TreeSet" ler tekrarsiz eleman depolamak icin kullanilir



     */


    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Yasemin");
        hs.add("Ismail");
        hs.add("Fuat");
        hs.add("Kevser");
        hs.add("Zulfiye");
        hs.add("Meysere");
        hs.add("Ismail");
        hs.add("Rabiye");
        System.out.println(hs);//[Rabiye, Fuat, Kevser, Ismail, Zulfiye, Yasemin, Meysere]--
                               // bir tane ismail verdi, tekrarsiz oldugu icin sadece birini yazdi

        System.out.println(hs.hashCode());//-1380567737

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(20);
        lhs.add(31);
        lhs.add(33);
        lhs.add(3);
        lhs.add(null);
        System.out.println(lhs);//[313, 20, 31, 33, 3, null]-- benim verdigim siraya gor dizdi. bu yuzden biraz daha fazla caba harcadi.
                                //bu yuzden HashSet'e gore daha yavastir. null'i kabul etti sorun vermedi.

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(313);
        ls.add(420);
        ls.add(31);
        ls.add(33);
        ls.add(100);

        lhs.retainAll(ls);
        System.out.println(lhs);//[313, 31, 33]
        System.out.println(ls);//[313, 420, 31, 33, 100]


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('A');
        ts.add('G');
        ts.add('R');
        ts.add('U');
        ts.add('Z');

        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));//G verilen elemanin bir onceki elemani verir
        System.out.println(ts.lower('D'));//A

        System.out.println(ts.higher('R'));//U
        System.out.println(ts.higher('T'));//U

        System.out.println(ts.headSet('R'));//[A, G]
        System.out.println(ts.headSet('R',true));//[A, G, R]

        System.out.println(ts.tailSet('R'));//[R, U, Z]
        System.out.println(ts.tailSet('R',false));//[ U, Z]

        System.out.println(ts.ceiling('R'));//R
        System.out.println(ts.ceiling('T'));//U

        System.out.println(ts.floor('G'));//G
        System.out.println(ts.floor('T'));//R

        System.out.println(ts.subSet('G', 'Z'));//[G, R, U]
        System.out.println(ts.subSet('G',false, 'Z',true));//[R, U, Z]


    }
}
