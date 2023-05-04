package practices.day12;

import java.util.Arrays;

public class C02_CamelCase {

    public static void main(String[] args) {
        // INTERWIEW QUESTIONS QA AUTOMATION Nisan 2023
/*
    String str = "cats AND*Dogs-are Awesome"
    verilen String Datanin her bir kelimenin ilk harfini
    buyuk harf diger harfleri kucuk harf olacak
    "CatsAndDogsAreAwesome" sekilde veren kodu yaziniz
    input==> "cats AND*Dogs-are Awesome"
    output ==>"CatsAndDogsAreAwesome

 */

        String str = "cats AND*Dogs-are Awesome";

       String words[] = str.split("[^a-zA-Z]");// harflerin disindaki her yerden parcaladim ve array'e atadim.
        System.out.println(Arrays.toString(words));//[cats, AND, Dogs, are, Awesome]

        StringBuilder sb = new StringBuilder();// degistirecegim icin StrinBuildere atatim ve ici bos suan.
        for (String w : words) {// word'den kelime al ve w'nun icine koy
            if(w.length()>0){
                sb.append(w.substring(0,1).toUpperCase());// sb'ye ekle ,w'nun icindeki kelimeyi ve sifirinci indeks dahil birinci indeks haric sekilde buyuk harf yap.
                if(w.length()>1){// data bir haften fazla ise alttaki kodu calistir.
                    sb.append(w.substring(1).toLowerCase());// burda da ilk harften sonraki tum harfleri kucuge cevir demek.
                }//append konkat gibi calisiyor.
            }
        }
        System.out.println("sb : "+sb);

    }}
