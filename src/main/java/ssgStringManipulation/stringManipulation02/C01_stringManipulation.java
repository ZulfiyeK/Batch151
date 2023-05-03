package ssgStringManipulation.stringManipulation02;

public class C01_stringManipulation {

    public static void main(String[] args) {
        /*
       1.chartAt() String'deki indexi alıyor indexler 0'dan başlar
       2.replace()-replaceAll degistirmeyi saglar replaceAll bir grup datayı degistirmeyi saglar
       3.concat() Stringleri toplamaya birleştirmeye boşluk olmuyo
       4.contains() icerme durumunu kontrol eder
       5.toLowerCase() - toUpperCase() buyuk kucuk harf yapıyor
       6.trim baştaki ve sondaki boşlukları siliyor
       7.startsWith() baştaki harf ya da kelimeyi icerip icermedigini kontrol eder
       8.endsWith() sondaki harf ya da kelimeyi icerip icermedigin kontrol eder
       9.indexOf() girelen harfin kacıncı indexte oldugunu kontrol
       10.lastIndexOf() girelen harfin sondan başlayarak ilk karsımıza cıkanın bastan kacıncı indexte oldugu yazar
       11.subString() ilk index yazılarak 2. indexe kadar 2. index dahil değil alabilmemizi saglar
       12.split bir indexi 2ye bolmeyi sagliyor
       13.equals(): direkt esit mi onu kontrol eder ama == sayisal ve char degerleri kontrol etmek icin kullanılır
       14.equalsIgnoreCase(): buyuk kucuk harf bakmaksızın kontrol eder
       15.isblank(): sadece bosluk var mı diye kontrol eder
       16.isEmpty(): boş mu diye kontrol eder
       17.valueOf(): String'i interger'a cevirir
         */
        //soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız.
        String str1 = "ali";
        String str2 = "ali";
        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));


    }



}
