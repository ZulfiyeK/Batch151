package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {

        /*
           Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
         v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun
         
        */
Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu    i) En az 8 karakterden olussun\n" +
                "                ii)Password space icermesin\n" +
                "                iii)En az 1 tane buyuk harf olsun\n" +
                "                iv) En az 1 tane kucuk harf olsun\n" +
                "                v) En az 1 tane sembol olsun\n" +
                "                vi) En az 1 tanede rakam olsun \nuygun olarak giriniz ");

        String pwd = input.nextLine();
       // i) En az 8 karakterden olussun
        // boolean first = pwd.length() >=8; asagidaki daha hizli calisir.
        boolean first = pwd.length()>7;//kac adet olacagina length methodu ile baktik en az 8 olsun dedigi icin >7 dedik.

       // ii)Password space icermesin
        boolean second = !pwd.contains(" ");// unlem olumsuzluk verir. bosluk icermesin dedigi icin ! koyariz.

        //iii)En az 1 tane buyuk harf olsun
        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0;// en az 1 tane dedigi icin >0 diyoruz. ve length methodu ile yine kontrol ediyorum en az 1 tane mi >0 olmali.

       //iv) En az 1 tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;

        //v) En az 1 tane sembol olsun
        boolean fifth = pwd.replaceAll("[^a-zA-Z0-9]", "").length()>0;

        // vi) En az 1 tanede rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;

        System.out.println(first && second && third && fourth && fifth && sixth);//Zulfiye951* ==> true. Sifre olarak kabul ediyor.
                                                                                 //1546255k.==> False verdi cunku buyuk kucuk harf yok.













    }
}
