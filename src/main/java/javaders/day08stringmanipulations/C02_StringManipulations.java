package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {

         /*
            Kullanicidan email adresini girmesini isteyin, Asagidaki kurallara gore kullanicinin
            girdigi email adresini kontrol ediniz.

                 i)mail adresi "gmail" icermeli
                ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
                iv)En az bir tane noktalama isareti bulunmali
 */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen mail adresinizi \ni)mail adresi \"gmail\" icermeli\n" +
                "                ii)Space characteri mail'de olmamali\n" +
                "               iii)mail adresinde buyuk harf olmamali\n" +
                "                iv)En az bir tane noktalama isareti bulunmali");


        String mail = input.nextLine();

        // i)mail adresi "gmail" icermeli
        boolean first = mail.contains("gmail");
        System.out.println("GmailMail icermeli  = " + first);

        // ii)Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");
        System.out.println("notSpace = " + second);

        // iii)mail adresinde buyuk harf olmamali
        boolean third = mail.replaceAll("[a-z0-9]","").         // kucuk harfleri v noktalama isaretleri sil,
                replaceAll("[\\p{Punct}]","").                  // tum noktalama isaretlerini sil
                replace(" ","").length()==0;                    // bosluk da varsa hiclikle yer degistir ve sifira esitle.
                                                                                // icerigi tamamen sifirlayip buyuk harf kaliyor mu kalmiyor mu diye bakmis oluyoruz.


        // iv)En az bir tane noktalama isareti bulunmali
        boolean fourth =  mail.replaceAll("[a-zA-Z0-9]","").replace(" ","").length()>0;
        System.out.println("fourth = " + fourth);

        boolean fourt1 = mail.replaceAll("[^\\p{Punct}]","").length()>0; //[^\p{Punct}] semboller haric demek
        System.out.println("fourt1 = " + fourt1);

        boolean fourt2 = mail.replaceAll("[\\P{P}]","").length()>0; //[\P{P}] semboller haric demek
        System.out.println("fourt2 = " + fourt2);

        System.out.println(first&&second&&third&&fourt1&&fourt2);
        //aliveli@gmail.com
       // GmailMail icermeli  = true
       // notSpace = true
       // fourth = true
      //  fourt1 = true
      //  fourt2 = true
      //  true








    }
}
