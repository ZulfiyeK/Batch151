package practices.day01;

import java.util.Scanner;

public class C08_IfElse {
    public static void main(String[] args) {

    /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Hizmet Yilinizi Giriniz");
        int hizmetYili = scan.nextInt();

        System.out.println("LutfenMaasinizi Giriniz");
        int maas = scan.nextInt();

        if (hizmetYili>=5){
            System.out.println("maas="+ (maas*10/100+maas));// 6 yil, 1000 maas icin = maas=1100 olarak hesapliyor.

        }else{
            if (hizmetYili<5){
                System.out.println("Zam alabilmek icin "+(5-hizmetYili)+ "yil daha calismalisiniz");// 3 yil, 1000 maas icin = Zam alabilmek icin 2yil daha calismalisiniz

            }
        }






















    }
}
