package javaders.day03methodcreationscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        /*

         Kullanicidan data almak icin Scanner Class'i kullanilir ve bir input/ scan/ scanner Objesi olusturulur.
        Bu objeyi new keyword'u ile olustururuz.

         */
        //1. Obje olusturma
        Scanner input = new Scanner(System.in); // "Ali " kullanicisi icin dosya olusturuyoruz. input dedigimiz Ali oluyor.

        // 2. Kullniciya ne yapacagini soyluyoruz.
        System.out.println("Lutfen maasinizi giriniz");

        //3. Kullanicidan alinan datalar yapisina ve buyuklugune gore bir variable'a yerlestirilir.
        long maas = input.nextLong();

        //4. Kullanici verdigi bilgileri teyit edebilmesi vs icin yazdiriyoruz.
        System.out.println(maas);
        System.out.println("maas = " + maas);

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz.


        // char cinsiyet = input.next().charAt(0); parantez icine 0 koyuyoruz cunku kelime yazarsa ilk harfini aliyor.
        // 1,2, yazarsa kelimenin ikinci yada ucuncu harflerini aliyor.
        // Bu yuzden 0 girilmeli ki ilk harfi alsin

        System.out.println("lutfen cinsiyetinizi kadin ise K, erkek ise E giriniz");
        char cinsiyet = input.next().charAt(0); // erkek

        input.nextLine();
        System.out.println("Lutfen adinizi giriniz");
        String name = input.nextLine();// Ali Fuat

        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi true yada false seklinde giriniz");
        boolean seviyorMu = input.nextBoolean();

        System.out.println("***** Ali Fuat *******");

        System.out.println("cinsiyet= "+cinsiyet+"\nname="+name+"\nmemleket="+memleket+"\nyas="+yas+"\nboy="+boy+"\nseviyorMu="+seviyorMu);





    }
}
