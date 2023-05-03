package javaders.day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Iterator02 {
    public static void main(String[] args) {


   //verilen listedeki her elemani uc arttiran methodu yaziniz.
    List< Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);//[5, 9, 2, 1, 17, 3]

        ListIterator itr = list.listIterator();
        while (itr.hasNext()){//senden sonra eleman var mi?
           Object sayi = itr.next();//next ile sonrakine geciyor ve gectigi her datayi sayi konteynirina ekliyor.
            itr.set((Integer)sayi+3);//set ile degistir diyoruz,sayi konteynirindaki datalara 3 ekle
        }
        System.out.println(list);//[8, 12, 5, 4, 20, 6]
    }
}