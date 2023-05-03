package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

 // hash= unique id olusturmadir.
 /*


  key           value           I
 tekrarsiz = tekrarli olabilir. I
  Cat      = Evcil hayvan       I ==> ikili yapiya Entry Set denir hepsine
  dog      = evcil hayvan       I
  Crocodile = timsah            I
  tiger    = kaplan    =========I==> sadece bu ikkili yapiya Entry denir.


Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
Ornek:
Cat=Evcil hayvan
Dog=Evcil hayvan

Bu sozluk yapisi Java'daki map yapisina benzer.
Kelimenin oldugu sirada ayni kelimeden birden fazla bulunmaz bu kelimeler tekrarsizdir.
Sol tarafta tekrarli kelimeler yani esanlamli kelimeler olabilir.
Maplerde de boyle iki bolum olur. Ilk bolum tekrarsiz, ikinci bolumde tekrarli bolum olabilir.
Tekrarsiz kisim key, tekrarli kisim value olarak tanimlanir. Key=Value
Maplar key=value yapisini kullanir. Maplerde birinci ve ikinci deger var.
Maplerdeki elemanlara "Entry" denilir.
Elemanlari iceren yapinin tamamina "EntrySet" denir.
Java tekrarsizlara Set diyor,

Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
"key" kismi tekrarsiz, "value kismi tekrarli olabilir.
Mapler "key" ve "value" structure'ini kullanir.
Map'lerdeki elemanlara "entry" denir.
Elemanlarin tamanina ise "EntrySet" denir.
Entry ler Tekrarsiz oldugu icin "EntrySet"denilir
Key ve value lar ayri ayri data typ'lari olabilir.
Map'lar collction degildir, farkli bir yapidir.
HashMap'ler "entry"leri ratgele siralar, bu yuzden en hizli map'dir

  */

        //map nasil olusturulur.
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        // map'e entry nasil eklenir.
        countryPopulation.put("Russia", 147182123);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Germany", 83000000);
        System.out.println(countryPopulation);//{Turkey=83000000, Germany=83000000, Russia=147182123, Albania=3000000}

        countryPopulation.get("Russia");//get() methodu "key" ile calisir ve "value" kismini verir
        System.out.println(countryPopulation.get("Russia"));//147182123-- key'i girersek Value'yi verir bize.

        Set<String> keys = countryPopulation.keySet();// key'ler tekrarsizdir, o yuzden set'in icine koyup vericek.
        System.out.println(keys);//[Turkey, Germany, Russia, Albania]
        //keySet() methodu tekrarsiz olan "key"leri bir set'in icine koyarak verir

        Collection<Integer> values = countryPopulation.values();// integer olacagi icin
        System.out.println(values);//[83000000, 83000000, 147182123, 3000000]


        //EX: countryPopulation map'indeki ulkelerin nufuslarinin ortalamasi nedir.

        Collection<Integer> value = countryPopulation.values();

        int sum = 0;
        for(Integer w: value){
            sum= sum+w;
        }
        System.out.println(sum/ value.size());// 79045530 - kac eleman varsa onun size'ina boleriz,
                                              // boylece ortalamayi aliriz.

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Turkey=83000000, Germany=83000000, Russia=147182123, Albania=3000000]
        //entrySet() "entry"leri kalip halinde alip  "Set"in icine koyarak bize verir
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz

   //    EX: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.
        int toplam =0;
        for(Map.Entry<String,Integer> w : entries){
           toplam= toplam+ w.getKey().length()+ w.getValue();// getKey() bana keyleri verecek.length ile karakter sayisini alacagiz, getValue ile valueleri alacagiz.
        }
        System.out.println(toplam);//316182149















    }
}
