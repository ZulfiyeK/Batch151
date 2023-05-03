package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

//Example 1: Type code to print the number of occurrences of words in a sentence
           //Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz
//"I like you, like like!" => I=1, like=3, you=1
        // ilk adim, like! ile like'i ayni yapabilmek icin tum noktalama isaretlerini silmeliyiz.

        String s = "I like you, like like!";
        System.out.println(s);//I like you, like like!

        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        //kelimelerle calisabilmem icin split() kullanmaliyim.
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for(String w: words){
            Integer numOfGorunum = occ.get(w);
            if(numOfGorunum ==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfGorunum+1);
            }
        }

        System.out.println(occ);//{like=3, I=1, you=1}


    }
}
