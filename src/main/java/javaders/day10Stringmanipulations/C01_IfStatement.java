package javaders.day10Stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // If it rains; I vill cancel the picnic. Eger yagmur yagarsa piknigi iptal edecegim..

        //ex: Verilen bir karakter "buyuk harf ise" ekrana "Buyuk Harf " yazdirin.

        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");//Buyuk Harf- hepsi true oldugu icin

            // Resimleri kiyaslayamayacagi icin burada ascii tabloya gider ve A'nin degerine bakar.
            // ch>=A icin 65>=65 oldugu icin true veririr, ekrana yazdirir.
            // ch<=Z icin 65<=90 oldugu icin true veriri.
            // A yerine * olsaydi *==42, 42>=65 yanlis oldugu icin False verecek ve ekrana hic biese yazdirmayacak.
        }

        char ch1 = '*';
        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println("Buyuk Harf");//    - False verdigi icin hic bir sey yazdirmadi
        //* == 42 ascii degeri, A==65, Z == 90
        // 42>=65 False, 42<=90 True, && hepsi True olmali bu yuzden bir false dan dolayi hic bise yazmaz.

        }
        // ex: Verilen bir sayi cift sayi ise ekrana "Cift Sayi" yazdiran kodu yaziniz.

        //kodun dogru calismasi icin Dinaik olmasi gerek, yani her yeni degerde sout'un calismasi gerk.
        //direk deger yazilirsa hurd coding olur, yeni tek datalik kod olur.

        //EX: verilen bir sayi 300'den kucuk veya 1200'den buyuk ise "Harika Sayi" yazdiran kodu yaziniz.




            byte sayi = 18;
        if(sayi%2 == 0){
            System.out.println("Cift Sayi");
            // cift sayi 2 ye bolunebilir ve kalani 0 olur.

        }
        byte sayi1 = 15;
        if(sayi1%2 == 0) {
            System.out.println("Cift Sayi");
            // cift sayi olmadigi icin hic bise cikmadi
        }

            int num = 1600;
            if(num<300||num>1200) {
                System.out.println("Harika Sayi");//Harika Sayi

            }


            //EX: Kullanicidan alinan datanin tek mi cifmi oldugunu yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi giriniz");
            int number = input.nextInt();

            if(number%2==0){
                System.out.println("Cift Sayi");//24-Cift Sayi

            }
            if(number%2!=0){
                System.out.println("Tek Sayi");//31-Tek Sayi

            }
        //2.yol- araya else yazip sout dan devam ediyoruz.

        if(number%2==0){
            System.out.println("Cift Sayi");//24-Cift Sayi

        } else {
        System.out.println("Tek Sayi");//31-Tek Sayi

        }

      //Ex: Verilen bir sayinin negatif mi, pozitif mi, notur mu oldugunu yazdiran kodu yaziniz.


        int sayi3 = -25;   // elseden sonra kod yazilmaz./ 0 icin Notur Sayi / 25 icin Pozitif Sayi /-25 icin Sayi Negatif


        if(sayi3<0){
            System.out.println("Sayi Negatif");

        }else if(sayi3==0){
            System.out.println("Notur Sayi");
        }else{
            System.out.println("Pozitif Sayi");
        }











            }
        }


