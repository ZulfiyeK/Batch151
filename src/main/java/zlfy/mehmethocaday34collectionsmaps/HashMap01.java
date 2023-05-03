package zlfy.mehmethocaday34collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*

    //Hash :benzersiz id olusturma teknigine hashing tek. denir.
    //Map : sozluk

   cat          = kedi    bu sekilde ikili yapiya entry denir. List'lerdeki node'la gibi
   dog          = kopek
   hard         = zor       key kisminda set kullanir.coklu data oldugu icin.
   difficult    = zor       key-value kismina da EntrySet denir.
  tekrarsiz     tekrarli    iki data oldugu icin <key,value> bu sekilde ikisi icin de data type'i girmek zorundayiz.
   (unique)
    KEY           VALUE



     */


    public static void main(String[] args) {

        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",830000000);
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


        //hashMap= set+collections demek. key kismi ==>set, value kismi==> collections
        //map yapisi loop yapisini kullanmaya izin vermiyor.bunun icin EntrySet methodunu kullaniriz.

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
