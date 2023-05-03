package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {

        /*

        1. STRING CLASS KULLANAMK TERCIH EDILIR, CUNKU STRING CLASS METHOD ACISINDAN COK ZENGINDIR
        2. lIST.OF KULLANARAk KISA yoldan lIST OLUSTURABILIRSINIZ AMA BU LISTLERIN ELEMANLARI DEGISTIRILEMEZ.
            a. Bu listlerin elemanlari degistirilemez.
            b. Yeni eleman eklenemez.
            d. Var olan elemani silemezsin

         */

   /*
        Example 1: Kullanicinin girdigi harf List'te var ise o harfi "Buldum!" a cevirin yoksa o harfi list'e ekleyin
 */
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();// 5 elemanli old. icin 5 vercek

        Scanner input = new Scanner(System.in);

        int counter = 0;
        do {
            if(counter==size){// 0=5 olmadigi icin
            System.out.println(myList);
                break;
            }
            System.out.println("Lutfen bir haft giriniz");
            String letter = input.next().toUpperCase().substring(0, 1);// kullanici kucuk harf girse bile touppercase ile buyuge cevirir.

            if (myList.contains(letter)) {// liste gelip harflere bakiyor ve har var mi diye bakiyor. bulup mylistin icine koyuyor
                myList.set(myList.indexOf(letter), "Buldum");// var olani degistir//indeksof ile indeks numarasina gider ve oradaki harfin yerine bulduma yazdirir. elemanin indeksini buluyorum sonra strin'e ceviriyorum.

            } else {//yoksa
                myList.add(letter);// yoksa eger listeye ekler
            }
            counter++;
        }while(true);
    }
}
