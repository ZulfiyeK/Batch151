package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatment {
    public static void main(String[] args) {

        //INTERWIEW QUESTIONS USA QA

        //ex: bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz.
        //String y = "abbccdc";

        String y = "aac";// soru cozumu cok uzamamsi icin y bu sekilde alindi ( orjinali String y = "abbccdc"; )

        char ch =y.charAt(0);
        if(y.indexOf(ch)==y.lastIndexOf(ch)){

            System.out.println(ch);


        }//if body, iki curly braces arasi


        char ch1 = y.charAt(1);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){

            System.out.println(ch1);
        }

        char ch2 = y.charAt(2);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){

            System.out.println(ch2);


        }
        /*

        char ch =y.charAt(0); / tek karakter oldugu icin char kullanabilir. sifirinci indekse gittim ve oradaki karakteri ch nin icine yerlestirdim.

        if(y.indexOf(ch)==y.lastIndexOf(ch)){ / if dedim ve y nin icine girdim ve ilk gorunnumu kacinci indeks 0 ci indeks, sonra tekrar y nin icine git ve son gorunumune bak,
        a harfi birinci indekste, o zaman 0 bire esit mi degil' o ozaman false verir. o zaman ekranda a harfini goremeyiz.
        Diger tum harflere de aynisi uygulanir ve c nin tekrarsiz oldugu gorulur.


        System.out.println(ch);

        }

         */

        //ex: Verilen sayi pozitif ise ekrana "Sayi Pozitif" yazdiran kodu yaziniz.

        int num = 65;
        if(num>0){
            System.out.println("Sayi Pozitif");//Sayi Pozitif

        }

        int num1 = -65;
        if(num1>0){
        System.out.println("Sayi Pozitif");//hic bir sey yazdirmadi.


        }
    //ex: SAyi -1 ile 10 arasinda ise ekrana " Verilen Data Rakamdir" yazdiran kodu yaziniz.( rakamlar 1.2.3.4.5.6.7.8.9)

        int rakam = 56;
        if(rakam>-1|| rakam<10){
        System.out.println(" Verilen Data Rakamdir");//Verilen Data Rakamdir, yada iyimserdi hemen true dondururdu o yuzden yazdirdi.

        }

        if(rakam>-1&& rakam<10){
        System.out.println(" Verilen Data Rakamdir");// hic bise yazdirmedi cunku mukemmelliyetci ve
        }

        //ex: Sayi 3 basamakli ise "Verilen Data Uc Basamaklidir" yazdiran kodu yaziniz.

        int sayi = -200;
        sayi = Math.abs(sayi); // bu method ile matematik kutuphanesine gidiyoruz ve oradan mutlak degeri aliyoruz, yani negatif sayilari pozitife ceviriyoruz.


        if(sayi>99 && sayi<1000){
        System.out.println("Verilen Data Uc Basamaklidir");// Verilen Data Uc Basamaklidir


       }





    }
}
