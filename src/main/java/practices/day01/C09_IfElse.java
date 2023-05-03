package practices.day01;

import java.util.Scanner;

public class C09_IfElse {
    public static void main(String[] args) {

        /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir numara giriniz");
        byte number = scan.nextByte();

        if(number<0){
            System.out.println("Negatif Sayi");//-1 icin = Negatif Sayi
        }else{
        if (number<10) {
            System.out.println("Pozitif Rakam");// 9 icin = Pozitif Rakam
        }else{
        }if (number>=10){
            System.out.println("Pozitif Sayı");//10 icin = Pozitif Sayı
            }

        }



























    }
}
