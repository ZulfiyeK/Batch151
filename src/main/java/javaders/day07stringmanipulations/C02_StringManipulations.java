package javaders.day07stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {

// ****************** replaceAll() **************\\
        /*
        replaceAll() methodu Bir grup datayi degistirmek icin kullanilir.
        Bir grup data = Regular Expression (regex) kullanilir.



       En cok Kullanilan Regex'ler
       1) Tum Rakamlar==>[0-9]
       2) Tum kucuk harfler ==>[a-z]
       3) Tum buyuk harfler==>[A-Z]
       4) Tum harfler==>[a-zA-Z]
       5) Tum harfler ve tum rakamlar==>[a-zA-Z0-9]
       6) Tum sesli harfler==>[aeiouAEIOU]
       7) Tum noktalama isaretleri==> \\p{Punct}
       8) -den farkli, -haricinde demek icin==> ^
          a) Tum Rakamlar haric demek icin ==>[^0-9]
          b) Tum kucuk harfler haric demek icin ==>[^a-z]
          c) Tum buyuk harfler haric demek icin==>[^A-Z]
          d) Tum harfler haric demek icin==>[^a-zA-Z]
          e) Tum harfler ve tum rakamlar haric demek icin==>[^a-zA-Z0-9]
          f) Tum sesli harfler haric demek icin==>[^aeiouAEIOU]



         */

            String s = "Mehmet 20 yasinda QA_Developer kursunda $ dolarla kazanmistir...";

        // ex: s stringindeki tum rakamlari * 'a ceviriniz.

        String s1= s.replaceAll("[0-9]","*");
        System.out.println("s1 = " + s1);//s1 = Mehmet Fatih bey ** yasinda QA_Developer kursunda $ dolarla maas kazanmistir...


        // ex: s stringindeki tum harfleri ve tum rakamlari " @ " ceviriniz.
        String s2= s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println("s2 = " + s2);//s2 = @@@@@@ @@@@@ @@@ @@ @@@@@@@ @@_@@@@@@@@@ @@@@@@@@ $ @@@@@@@ @@@@ @@@@@@@@@@@...

        // ex: s stringindeki tum spaceler disindaki karakterleri  " + " ceviriniz.

        String s3= s.replaceAll("[^ ]","+");
        System.out.println("s3 = " + s3);//s3 = ++++++ ++ +++++++ ++++++++++++ ++++++++ + +++++++ ++++++++++++++

        // ex: s stringindeki tum kucuk harfler disindaki karakterleri  " * " ceviriniz.

        String s4= s.replaceAll("[^a-z ]","*");
        System.out.println("s4 = " + s4);//s4 = *ehmet ** yasinda ****eveloper kursunda * dolarla kazanmistir***

        // ex: s stringindeki tum sesli harfler disindaki karakterleri  " & " ceviriniz.

        String s5 = s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("s5 = " + s5);//s5 = &e&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&a&&a&a&&i&&i&&&&







    }
}
