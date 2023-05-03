package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //kullanicidan alacagimiz bes basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yazdiriniz.


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bes basamakli bir sayi giriniz");
        int number = input.nextInt();

        //bir sayinin son rakamini alabilmek icin o sayiyi 10'a bolup kalani almaliyiz.
        //%==> modulus operator, solunda bulunan sayinin, saginda bulunan sayiya bolumunden kalan sayiyi verir.
        //Dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir.
        //bir tam sayiyi baska bir tam sayiya bolersek java sonucu kesinlikle tam sayi yapar.
        // yani ondalikli kismi iptal eder, yuvarlama yapmaz.
        //dolayisiyla bir tam sayiyi 10'a bolersek birler basamagini silmis oluruz.

        /*
        Kendime Not: java ondalikli kismi almadigi icin 10 boldugumuzde aslinda birler basamagini silmis oluruz.
        38671 sayisini 10'a boldugumda sayi 3867,1 olur. java virgulden sonrayi almayacagi icin
        elimde kalan sayi 3867 olur. bu sebeple once " 38671%10 " yapiyorum son rakami buluyorum,
         sonrada " 38671/10 " yapip sayi eksiltme yapmis oluyorum.

         */


        //son rakami al
        int lastDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int lastSecondDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10 ;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int lastfourthDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan  besinci rakami al
        int lastFifthDigit = number%10;
        //sayi kucult
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastfourthDigit+lastFifthDigit);








            }



}
