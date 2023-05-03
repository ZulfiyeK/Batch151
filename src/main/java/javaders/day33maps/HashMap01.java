package javaders.day33maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        String s = " Hello Henry!";
        System.out.println(harflerinGorunumSayisiniAl(s));//{r=1, e=2, H=2, y=1, l=2, n=1, o=1}
    }

        //EX: verilen bir Stringde hangi harfin kac defa kullanildigini veren method olusturunuz.
 // " Hello Henry!"  ==> h= 2, e=2, l=2, o=1, n=1, r=1, y=1==> bu ciktiyi gorunce map oldugunu anlamaliyiz.

        static HashMap<String,Integer> harflerinGorunumSayisiniAl(String s) {
            s = s.replaceAll("[^A-Za-z]", "");// harf disi karakterleri sildik

            HashMap<String, Integer> harflerinGorunumu = new HashMap<>();//gorunum sayilarini depolamak icin Map olusturduk--alfabetik siraya gore istiyorsan TreeMap yapmaliyiz.

            String letters[] = s.split("");// harfleri aldik [ H,e,l,l,o,H,e,n,r,y] yaptik

            for (String w : letters) {// for-each loop ile hesapaldik
                Integer gorunumsayisi = harflerinGorunumu.get(w);
                if (gorunumsayisi == null) {
                    harflerinGorunumu.put(w, 1);
                } else {
                    harflerinGorunumu.replace(w, gorunumsayisi + 1);
                }
            }
            return harflerinGorunumu;
        }
}//Javada alfabetik sirada once buyuk harf ardindan Kucuk harf gelir.
// Cunku buyuk harf ascii value'si kucuk harflerinkinden kucuktur.
