package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yaziniz.
        // % ==> Modulus operatoru sayinin bolumunden kalan sayiyi verir
        //  int sayi= input.nextInt();//8649
        //  int sonRakam = sayi%10;//9
        //  int ilkRakam = sayi/1000;//8
        /*
        3 basamakli bir sayinin ilk
        basamagini rakami almak icin  (Basamak sayisi -1) 0 olan yani 100'e bolmeliyiz

        4 basamakli bir sayinin ilk
        basamagini almak icin  (Basamak sayisi -1) 0 olan yani 1000'e bolmeliyiz

        5 basamakli bir sayinin ilk
        basamagini almak icin  (Basamak sayisi -1) 0 olan yani 10000'e bolmeliyiz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int number = input.nextInt();

        //son rakami al
        int sonRakam = number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int sondanIkinciRakam = number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int sondanUcuncuRakam = number%10 ;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int sondanDorduncuRakam = number%10;
        //sayi kucult
        number = number/10;


        System.out.println(sonRakam+sondanDorduncuRakam);
        //System.out.println("sonRakam+ sondanDorduncuRakam  = " +(sonRakam+ sondanDorduncuRakam));
        // bu formul de calisir.sonRakam+ sondanDorduncuRakam  = 7 seklince yazdirir.











    }




}
