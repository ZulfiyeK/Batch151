package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

            List<String> iller= new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne","Agri","Rize", "Usak"));

        buyukHarflereGoreUzunluklaraGoreTekrarsizArtan(iller);//VAN,MUS,ORDU,HATAY,ANKARA,EDİRNE,KUTAHYA,GUMUSHANE,GAZİANTEP,
        System.out.println();
        buyukHarfleSonHarfeGorreArtanSiradaTekrarsiz(iller);//KUTAHYA,ANKARA,GUMUSHANE,EDİRNE,VAN,GAZİANTEP,MUS,ORDU,HATAY,
        System.out.println();
        buyukHarfUzunluklaraGoreTekrarsizAyniOlanlarSirayla(iller);
        System.out.println();
        System.out.println(krktrSysBesFzlOlanlariSil(iller));//[Van, MUS, MUS, Ordu, Hatay]
        System.out.println();
        System.out.println(hIleYadaUIleBaslayanlariSil(iller));//[Van, MUS, MUS]
        System.out.println();
        karakterSayilarininKareleri(iller);//9,9,9,16,16,16,
        System.out.println();
        System.out.println(karakterSayisiCiftOlanlar(iller));//[Agri,Rize,Usak,]


    }

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void buyukHarflereGoreUzunluklaraGoreTekrarsizArtan(List<String>iller){
    iller.stream().distinct().map(t-> t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+ ","));
    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void buyukHarfleSonHarfeGorreArtanSiradaTekrarsiz(List<String>iller){
        iller.stream().distinct().
                map(t-> t.toUpperCase()).//yapi degisiyorsa map methodu,lambda expression denir.
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//lambda expression denir.
                forEach(t-> System.out.print(t+","));
    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void buyukHarfUzunluklaraGoreTekrarsizAyniOlanlarSirayla(List<String>iller){
        iller.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println); //(t-> System.out.print(t+ ",")); print secersek bosluk birakamiyoruz. o yuzden println secerek alt lata yazdirirz.
    }


    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
    public static List<String> krktrSysBesFzlOlanlariSil(List<String >iller){

        iller.removeIf(t->t.length()>5);


        return iller;
    }


    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleYadaUIleBaslayanlariSil(List<String>iller){

        iller.removeIf(t-> t.startsWith("H")|| t.endsWith("u"));

        return iller;
    }




    // 6) List elemanlarinin karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    public static void karakterSayilarininKareleri(List<String>iller){
        iller.stream().map(t-> t.length()*t.length()).forEach(t-> System.out.print(t+ ","));

    }

    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

        public static List<String> karakterSayisiCiftOlanlar(List<String>iller){
            iller.removeIf(t -> t.length()%2!=0);
            return iller;
    }
}
