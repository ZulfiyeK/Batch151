package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();// lambda arraylarda ' collectionlarda, file'larda..kullanilir.

        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);//Tom Jim Clara Tom Clara Angelina
        System.out.println();
        printEl(myList);//Tom Jim Clara Tom Clara Angelina
        System.out.println();
        prinElExceptStartWithT(myList);//Jim Clara Clara Angelina
        System.out.println();
        printElLengthLessThanFour(myList);//Tom Jim Tom
        System.out.println();
        printEldorttenBuyukBuyukHarf(myList);//CLARA CLARA ANGELİNA
        System.out.println();
        printElLengthMoreThanFourUniqeLowerCase(myList);//clara angelina
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);//ANGELİNA CLARA JİM TOM
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);//tom jim clara angelina

    }

    //Example 1: Bir List'teki elemanlari console'a yazdiran methodu yaziniz.(methodlar main'in disinda olusturulur.)
    //1. yol
    public static void printElements(List<String>myList){
        for (String w : myList) {                           // bu sekilde uzun yazilan koda "Structured Programming" denir.
            System.out.print(w +" ");//Tom Jim Clara Tom Clara Angelina
        }

    }

    //2.yol Lambda Ekspression
    public static void printEl(List<String>myList){
        myList.stream().forEach(t-> System.out.print(t+ " "));//mylist'i strem'e cevir ve foreach'i kullan diyorum.  //Tom Jim Clara Tom Clara Angelina
       //bu tip koda yazilimina da "Functional Programming"   //foreach ,ilk eleman t'ye koyar, sonrada sout'ta yazdirir..
                                                                // sonra ikinci eleman t'te konulur tekrar yazdirilir.
                                                                //stream alt alta yazdirir.strem ile daha fazla methoda ulasiriz.
    }
//Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari konsola yazdiran methodu olusturunuz.
public static void prinElExceptStartWithT(List<String> myList){
       myList.stream().filter(t->!t.startsWith("T")).forEach((t-> System.out.print(t+" ")));//Jim Clara Clara Angelina
}


//Example 3: Bir List'te karakter sayisi 4'den az olan tum elemanlari konsola yazdiriniz.
private static void printElLengthLessThanFour(List<String> myList) {
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t+ " "));//Tom Jim Tom
}

//Example 3: Bir List'teki karakter sayisi 4den cok olan tum elemanlari buyuk harflerle konsola yazdiran methodu yaziniz.

    private static void printEldorttenBuyukBuyukHarf(List<String> myList) {
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t+ " "));//CLARA CLARA ANGELİNA -map()'in iicnde toupper ile buyuttuk.
    }


//Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

public static void printElLengthMoreThanFourUniqeLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));//clara angelina -- kodu okunur yapmak icin bu sekilde alta aliriz.

}

//Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada konsola yazdiriniz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t + " "));//ANGELİNA CLARA JİM TOM
    }

//Example 7: Bir List'teki elemanlari tekrariz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak konsolda yazdiriniz.
public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.stream().
                distinct(). //tekrarsiz yazdiriyor.
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).                         //elemanin uzunluguna bakarak karsilastir' karakter sayisi az olan basa gelir.
                forEach(t-> System.out.print(t + " "));//tom jim clara angelina
}








}
