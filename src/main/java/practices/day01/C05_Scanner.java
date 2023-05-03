package practices.day01;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

     /*
        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Adinizi Giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen Soyadinizi Giriniz");
        String soyAd = scan.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz");
        String yas = scan.nextLine();

        System.out.println("Lutfen Boyunuzu Giriniz");
        String boy = scan.nextLine();

        System.out.println("Lutfen Kilonuzu Giriniz");
        String kilo = scan.nextLine();

        System.out.println("isim = " + isim+ "\n" + "soyad="+soyAd+"\n"+ "yas="+yas + "\n"+"boy="+ boy+ "\n"+"kilo="+kilo);
//isim = orhan
//soyad=kacagan
//yas=10
//boy=150
//kilo=25



    }
}
