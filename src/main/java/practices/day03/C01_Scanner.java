package practices.day03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

/*
1. kullanicidan aldiginiz bir  sekil ile asagidaki sekli olusturan kodu yazdiniz.

             A
            A A
           A A A

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");
        char ch = input.next().charAt(0);

        System.out.println(" "+" "+ch+" "+" ");
        System.out.println(" "+ch +" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);






//2. Kullanican iki sayi alip dort islem yapan ve islemlerin sonuclarini yapan ve ekrana yazdiran basit bir hesap makinesi kodunu yaziniz.

        System.out.println("Lutfen ilk sayiyi giriniz");
        System.out.println("Lutfen ikinci sayiyi giriniz");

        int ilkSayi = input.nextInt();
        int ikinciSayi = input.nextInt();

        System.out.println("ilkSayi+ikinciSayi ="+ ilkSayi+ikinciSayi);
        System.out.println("ilkSayi-ikinciSayi ="+ (ilkSayi-ikinciSayi));
        System.out.println("ilkSayi*ikinciSayi =" +ilkSayi*ikinciSayi);
        System.out.println("ilkSayi/ikinciSayi =" +ilkSayi/ikinciSayi);


//3. Kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2  rakamlari toplamini bulan kodu yaziniz
        // abcd
//1. yol***
        System.out.println("Lutfen bes basamakli bir sayi giriniz");

        int sayi = input.nextInt();//35641
        int ilkIkiRakam =sayi/1000;// ilk iki rakam dedigi icin bolu dedik ki 35,641 olacak ve virgulden oncesi kalsin.
        System.out.println("ilkIkiRakam = " + ilkIkiRakam);

        int ilkIkiToplam = (ilkIkiRakam%10) +(ilkIkiRakam/10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);

        int sonIkiRakam = sayi%100;// son iki rakami verdigi icin modulus yaptik.
        System.out.println("sonIkiRakam = " + sonIkiRakam);

        int sonIkiToplam = (sonIkiRakam%10)+(sonIkiRakam/10);
        System.out.println("sonIkiToplam = " + sonIkiToplam);

        System.out.println(ilkIkiToplam+sonIkiToplam);

//2.yol***
        System.out.println("Lutfen bes basamakli bir sayi giriniz");
        int number = input.nextInt();//12345


        int sonRakam = number%10;   //5// Son rakami al
        number = number/10;    // 1234//Sayiyi Kucult

        int sondanIkinciRakam= number%10;   // 4//Sondan ikinci rakami al
        number = number/10;               // 123

        int sondanUcuncuRakam =number %10;   // 3//Sondan ucuncu rakami al/ toplamaya dahil etmedi
        number = number/10;                 // 12

        int sondanDorduncuRakam=number%10;  //2//Sondan dorduncu rakami al
        number=number/10;                   //1

        int sondanBesinciRakam=number%10;  // 1 //Sondan besinci rakami al

        System.out.println(sonRakam + sondanIkinciRakam + sondanDorduncuRakam + sondanBesinciRakam);//12













    }
}
