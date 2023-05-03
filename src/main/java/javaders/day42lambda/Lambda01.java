package javaders.day42lambda;

import zlfy.soruBankasi.Interface.soru2de7.L;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
     //   names.add("Tom");
        names.add("Alex");
     //   names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");


        System.out.println(sortWithLastCharDisctinctUpperInList(names));//[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]

        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));//[alexander, michael, alex, alex, mary, jim, tom]
        System.out.println(isLengthMorThanTwo(names));//true
        System.out.println(noLengthLessThanTree(names));//true
        System.out.println(atLeastOneLengthLessThanTree(names));//true


    }

//EX: List elemanlarini son harflerine gore naturel order'da tekrarsiz olarak buyuk harflerle bir List'in icine return ediniz.
    // [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]

    public static List<String> sortWithLastCharDisctinctUpperInList(List<String> names){

       return names.stream().
               distinct().
               map(String::toUpperCase).// length'e gore siralar.
               sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).//tersten son harfe gore siralar.
               collect(Collectors.toList());//list'in icinde gormek istiyorsak "collect(Collectors.toList())" yazmaliyiz.

        //Normalde distinct elemanlari depolamak icin "Set" kullanilir. ama Lambda'daki collect(Collectors.toSet()): method'u elemalanri rastgele siralar,
        //[ALEX, MİCHAEL, TOM, JİM, MARY, ALEXANDER] bu sekilde, halbuki bu soruda rastgele siralama kabul edilmiyor.
        // bu yuzden mecburen  "collect(Collectors.toList())" kullanilir.


    }


//EX2: List elemanlarini karakter sayilarina gore ters sirada kucuk harfle birr listin icinde return edniniz.
// ayni karakter sayisina sahip elemanlar kendi icinde naturel order'a gore siralansin.

public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){
        return names.
                stream().
                map(String::toLowerCase).// length'e gore siralar.
                sorted(Comparator.comparing(String::length).//alfabetik siraya gore siralar
                        reversed().//tersten siralama yapar
                        thenComparing(t-> t.charAt(0))).//ic ice siralama olacaksa thanComparing
                collect(Collectors.toList());// list icine yazdirir.

}


//EX3: List elemanlarinin tamaminin karakter sayisinin ikiden byuk olup olmadigini kontrol eden methodu olusturunuz.

    public static boolean isLengthMorThanTwo(List<String>names){
        return names.stream().allMatch(t-> t.length()>2);//hepsi ikiden buyukse allMatch bize true veriri. bir tanesi bile 2 den kucukse false veriri.
    }

// bir listteki elemanlarin spesifik ozelliklerini almak icin allMatch kullanilir.
//allMatch() methodu tum elemanlarda verilen sarta gore karsilastirma yapar.Tamami ortusuyorsa true degilse false verir


//EX4: List elemanlarinin hic birinin karakter sayilarinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLengthLessThanTree(List<String>names){
        return names.stream().noneMatch(t-> t.length()<3);//none:hicbiri demek o yuzden noneMatch(t-> t.length()<3) kullndik.

    }


//EX5: List elemanlarinin en az birinin karakter saysinin 4'den kucuk olup olmadigini kontrol eden method'u olusturunuz.
public static boolean atLeastOneLengthLessThanTree(List<String>names) {
    return names.stream().anyMatch(t -> t.length() < 4);// karakter sayisi 4'ten az hic olmasaydi false veriridi.
    //tom ve jim 4 den kucuk karakter sayisi o yuzden rtue verdi.

 /* Match
    allMatch() ==> tum elemanlar sarti saglarsa true dondurur
    anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
    noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */

}


}