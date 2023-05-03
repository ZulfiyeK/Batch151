package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Spesifik bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.

        String names[]= {"K","C","R","A","S"};
        String el= "A";

//1.yol
        int counter = 0;
        for(String w: names){
            if(w.equals(el)){
                counter++;
                break;// a yi bulduktan sonra tekrar calismana gerk yok b yuzden break yapiyorum ve sonlandiriorum


            }
        }
    if(counter>0) {
        System.out.println("Array has "+ el);// A icin var
    }else{
        System.out.println("Array doesn't have"+ el);//T icin yok
}


//2.yol "BinarySearch() Method hizli arama yapar.
 //** aradigim elemanlar 10.000 tane olsa ve benim aradigim 10.000 ci olsa nasil olacak.
// birer birer bakmak javayi yorar daha pratik bir yol, sort harfleri alfabetik siraya dizer ve en ortadaki harfe gider a bu degrin sagindami solundami diye bakar.
// Saginda ise soldakileri siler ve sagdan devam eder.

/*
1)binarySearch() methodunu sort() kullanmadan kullanmayiniz cunku binarySearch() mantigi sirali elemanlar icin gecerlidir
2)binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir.
3)binarySearch() methodundan aldiginiz index 0 veya 0'dan buyukse bu o eleman array'de var demektir.
4)binarySearch() methodu olmayan elemanlar icin negatif tamsayi degerini (sira numarasini) verir.
  "-" isaretinin anlami o eleman yok demektir.
  "sayi" ise oeleman olsaydi kacinci eleman olurdu demektir.
 */

   Arrays.sort(names);
        int result = Arrays.binarySearch(names,"R");
        System.out.println(result); // E icin -3 " yani olsaydi -3 deger olacakti."// R icin 3














    }
}
