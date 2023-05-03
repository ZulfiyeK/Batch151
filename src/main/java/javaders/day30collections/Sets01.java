package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        /*

    1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
    2)3 tane Set Class vardir;
      i) HashSet Class:
              "Hash" benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
              "HashSet" elemanlari rastgele siralar.
              "HashSet" elemanlari siralamadigindan cok hizli(super hizli) calisir.
              "HashSet" "null"i eleman olarak kabul eder.
              "HashSet"ler tekrarsiz eleman depolamak icindir.

      ii)LinkedHashSet Class:
              "LinkedHashSet" elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order) "HashSet"lere gore yavastirlar.
              "HashSet"lere gore yavastir.
              "LinkedHashSet"ler tekrarsiz eleman depolamak icindir.

      iii)TreeSet Class:
              "TreeSet"ler elemanlari natural order'a gore dizerler
              "TreeSet"ler elemanlari natural order'a gore dizdiklerinden coooook yavastirlar.
              En yavas Set "TreeSet"tir. "null'i eleman olarak kabul etmez.

    3. TreeSet cok yavas oldugundan mumkun oldugu kadar Treeset kullanmamamya calisiriz.
         */
//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler


        HashSet<String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman eklediginizde hata vermez, ama tekrarli elemani sadece bir kere ekler.
        hs.add(null);

        System.out.println(hs);//[null, Zeki, Ajda, Cuneyt, Esra, Ezel]


        System.out.println(hs.hashCode());//2038751948

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);

        System.out.println(lhs);//[234, 87, -32, 124]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls);//[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124]==> Ilk LinkHashSet'teki farkli elemanlar silindi
        System.out.println(ls);//[451, 87, 231, 124]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null); treeSet;lere null eklenemez
        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z
        System.out.println(ts.lower('R'));// G-- verilen elemandan bir onceki elemani veriri.
        System.out.println(ts.lower('A'));//null-- A'dan once eleman olmadigi icin null verdi
        System.out.println(ts.lower('D'));//A
        System.out.println(ts.higher('K'));//R-- verilen elemandan bir sonraki elemani veriri. kendisini hic bir zaman vermez.
        System.out.println(ts.headSet('R'));//[A, G]-- R'ye kadar olan elemanlari verdi.R'den oncekileri set olarak bana ver diyor.
        System.out.println(ts.headSet('A'));// []
        System.out.println(ts.tailSet('G'));// [G, R, U, Z]-- verilen elemani dahil edip sonuna kadar yazdirir.
        System.out.println(ts.headSet('R', true));//[A, G, R]-- R dahil olsun istiyorum. o zaman r,true yazariz.
        System.out.println(ts.tailSet('G', false));//[R, U, Z]-- G'yi dahil etme dedim.
        System.out.println(ts.ceiling('R'));//R-- eleman set'in icinde varsa elemanin kendisi return eder.
        System.out.println(ts.ceiling('K'));//R--eleman set'in icinde yoksa siradaki eleman return eder.
        System.out.println(ts.floor('G'));// G -- var oldugu icin kendisini verdi
        System.out.println(ts.floor('J'));//G-- olmadigi icin alfabetik siraya gore
                                            // kendinden sonraki harf hangisi olmali ise onu veriri.
                                             // [A, G, R, U, Z] burada J yok,
                                             // alfabetik siraya gore J'den sonra G geliyor. o yuzden G yazdirdi.
        System.out.println(ts.subSet('G', 'U'));//[G, R]-- ilk eleman dahil, ikincisi haric calisir.
        System.out.println(ts.subSet('G',false, 'Z', true));// [R, U, Z]-- G haric, Z dahil.

    }

}
