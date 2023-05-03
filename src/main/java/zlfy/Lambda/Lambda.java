package zlfy.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
  /*
  1. Lambda method create etme degil, mevcut methodlari library'den cagirip kullanmaktir.
  2. Java 8 ile eklenmistir.
  3. Functional Programming'dir.Mimari yapiya onem vermez.
  4. hiz,clean code ve okunabilirlilik acisindan onemlidir.

   */

        List<String> iller = new ArrayList<>(Arrays.asList("VAN","Edirne","VAN","Izmir","Eskisehir","Safranbolu","Izmir","MUS"));
        printsElements(iller);//VAN Edirne VAN Izmir Eskisehir Safranbolu Izmir MUS
        System.out.println(1);
        printsEl(iller);//VAN,Edirne,VAN,Izmir,Eskisehir,Safranbolu,Izmir,MUS,
        System.out.println(2);
        EHaricYazdir(iller);//VAN,VAN,Izmir,Safranbolu,Izmir,MUS,
        System.out.println(3);
        KaraterSayisiDorttenAzOlanlar(iller);//VAN,VAN,MUS,
        System.out.println(4);
        KaraterSayisiDorttenCokOlanlar(iller);//Edirne,Izmir,Eskisehir,Safranbolu,Izmir,
        System.out.println(5);
        KaraterSayisiDorttenCokOlanTekrarsiz(iller);//Edirne,Izmir,Eskisehir,Safranbolu,
        System.out.println(6);
        TekrarsizElemanlariBuyukHarfleYazdir(iller);//VAN,EDİRNE,IZMİR,ESKİSEHİR,SAFRANBOLU,MUS,
        System.out.println(7);
        TekrarsizElemanlariKucukHarfleUzunluklarinaGoreKucuktenBuyugeYazdir(iller);//van,mus,ızmir,edirne,eskisehir,safranbolu,
        System.out.println(8);
        tumElemanlarinIlkHarfiBuyuk(iller);
        System.out.println(9);







    }
        //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
        //1.Yol:Structured Programming
        public static void printsElements(List<String>iller){
            for (String w: iller ) {
                System.out.print(w+ " ");
            }
        }

        //2.Yol:LAMBDA
        public static void printsEl(List<String>iller){
        iller.
                stream().
                forEach(t-> System.out.print(t+","));//her bir datayi al ve sistemin disina at ve her bir t variablesini soutta yazdir.
        }


        //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
        public static void EHaricYazdir(List<String>iller){
        iller.stream().filter(t->!t.startsWith("E")).forEach((t-> System.out.print(t+",")));
        }


        //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
        public static void KaraterSayisiDorttenAzOlanlar(List<String>iller){
        iller.stream().filter(t-> t.length()<4).forEach((t-> System.out.print(t+",")));
        }


        //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
        public static void KaraterSayisiDorttenCokOlanlar(List<String>iller){
            iller.stream().filter(t-> t.length()>4).forEach((t-> System.out.print(t+",")));
        }

        //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
        public static void KaraterSayisiDorttenCokOlanTekrarsiz(List<String>iller){
            iller.
                    stream().
                    distinct().
                    filter(t-> t.length()>4).
                    forEach((t-> System.out.print(t+",")));
        }

        //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
        public static void TekrarsizElemanlariBuyukHarfleYazdir(List<String>iller){
        iller.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                forEach(t-> System.out.print(t+ ","));
        }


        //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
        public static void TekrarsizElemanlariKucukHarfleUzunluklarinaGoreKucuktenBuyugeYazdir(List<String>iller){
        iller.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+","));
        }

        // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz
        public static void tumElemanlarinIlkHarfiBuyuk(List<String>iller){
       iller.
               stream().
               map(t-> t.toLowerCase()).
               map(t-> t.substring(0, 1).toUpperCase() + t.substring(1)).
               forEach(t-> System.out.print(t+","));

       }




}
