package zlfy.mehmethocaday31collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02Tekrar {
    public static void main(String[] args) {

   //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        long t1= System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add(" a@gmail.com");
        emails.add(" t@gmail.com");
        emails.add(" g@gmail.com");
        emails.add(" x@gmail.com");
        emails.add(" e@gmail.com");
        emails.add(" b@gmail.com");
        emails.add(" c@gmail.com");
        System.out.println(emails);//[ a@gmail.com,  b@gmail.com,  c@gmail.com,  e@gmail.com,  g@gmail.com,  t@gmail.com,  x@gmail.com]

        long t2= System.nanoTime();
        //2. yol

        HashSet<String> emailHs = new HashSet<>();
        emailHs.add(" a@gmail.com");
        emailHs.add(" t@gmail.com");
        emailHs.add(" g@gmail.com");
        emailHs.add(" x@gmail.com");
        emailHs.add(" e@gmail.com");
        emailHs.add(" b@gmail.com");
        emailHs.add(" c@gmail.com");

        TreeSet<String> emailTs = new TreeSet<>(emailHs);// tree setin contractoruna hashsetin objesinin adini yaziyoruz.
                                                         // boylece hashseti treeSet'e ceviriyor.
        System.out.println(emailTs);//[ a@gmail.com,  b@gmail.com,  c@gmail.com,  e@gmail.com,  g@gmail.com,  t@gmail.com,  x@gmail.com]

        long t3= System.nanoTime();


        System.out.println(t2-t1);// 1052700-treeSet calisma suresi
        System.out.println(t3-t2);//80800- hashSet calisma suresi


    }
}
