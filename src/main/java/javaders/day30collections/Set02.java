package javaders.day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        //Ex: ogrenci e-mail adreslerini natural order'da siralanmis olarak depolayiniz.( mail adresleri benzersiz olacagi icin set kullanmak zorundayiz.

        //1.yol
        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abl@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");// once ekleme yapip sonra siraya gore dizer.
        emails.add("abi@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abf@gmail.com");
        System.out.println(emails);//[abc@gmail.com, abd@gmail.com, abe@gmail.com, abf@gmail.com, abg@gmail.com,
                                    // abh@gmail.com, abi@gmail.com, abj@gmail.com, abk@gmail.com, abl@gmail.com]

        long t2 = System.nanoTime();
        //2.Way: This is the best

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abl@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");// once ekleme yapip sonra siraya gore dizer.
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abf@gmail.com");
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);// siralama yapmiyor-- SOR!!!
        System.out.println(emailsHsTs);//[abc@gmail.com, abd@gmail.com, abe@gmail.com, abf@gmail.com, abg@gmail.com,

                                        // abh@gmail.com, abi@gmail.com, abj@gmail.com, abk@gmail.com, abl@gmail.com]
        long t3 = System.nanoTime();
        System.out.println(t2-t1);//1082200
        System.out.println(t3-t2);//94900


    }
}
