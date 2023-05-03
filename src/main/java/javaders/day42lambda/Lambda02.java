package javaders.day42lambda;

import javaders.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

       System.out.println(getSumInTheGivenRange(7, 10));//34
        System.out.println(getMultiplyInTheGivenRange(7, 10));//5040
        System.out.println(getSumOfDigitsInTheGivenRange(45, 47));//30

    }
    //Swap icin bir tane private method olustur
    private static List<Integer> swap(int starting, int ending){//10 ve 7'yi kullan
        List<Integer>list = new ArrayList<>();//bos bir list olusturduk.
        if(starting>ending){
            starting = starting+ending;
            ending = starting-ending;
            starting = starting-ending;// kodun tamami starting ile ending'in yerlerini degistiriyor.
        }
        list.add(starting);//7 ekle
        list.add(ending);//10 ekle
        return list;// starting 7. ending 10 oldu

    }


  //Ex: 7'den 10'a kadar tam sayilarin toplamini hesaplayan methodu olusturunuz.

   public static int getSumInTheGivenRange(int starting, int ending){
        // bu sekilde dinamik method olur.-verilen araliktaki toplami al demek
         swap(starting,ending);//swap methodunu bul 10 ve 7 ile kullan demek.yukari cikacak ve rakamlari yerlerine yerlestirecek
         return  IntStream.
                 rangeClosed(starting, ending).// ilk sayi buyuk oldugunda calismiyor.
                 reduce(Math::addExact).
                 getAsInt();


    }


    //Ex: 7'den 10'a kadar tam sayilarin carpimini hesaplayan methodu olusturunuz.
    public static int getMultiplyInTheGivenRange(int starting, int ending) {// bu sekilde dinamik method olur.-verilen araliktaki toplami al demek
         swap(starting,ending);
         return IntStream.
            rangeClosed(starting, ending).// ilk sayi buyuk oldugunda calismiyor.
            reduce(Math::multiplyExact).getAsInt();
    }


    //Ex: 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan methodu olusturunuz.

    public static int getSumOfDigitsInTheGivenRange(int starting, int ending){
         swap(starting,ending);
         return  IntStream.rangeClosed(starting,ending).// ilk deger buyuk oldugunda calismayacagi icin if koymaliyiz.
                map(Utils::getSumOfDigits).sum();
    }


















}
