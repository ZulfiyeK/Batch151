package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

// Size verilen bir cumlede kac kelime oldugunu goster kodu yaziniz.

String s = "Java is easy. Learn Java earn Money ";
//Java coklu datayi Array'in icine koyar.Split() Methodu bosluklardan boler.

       String words[] = s.split(" ");
       System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, Money]
       System.out.println(words.length);// 7 eleman sayisini yazdirir.


// Size verilen bir cumlede kac harf oldugunu goster kodu yaziniz.

        String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);//28











    }

}
