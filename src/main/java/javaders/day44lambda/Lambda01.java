package javaders.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/*

    Notlar :

           1) lines methoduna dosya yolunu yazmak için Paths classından get methodunu kullanmalıyız.
           2) foreach() methodu ile satır satır okuma yaptık.
           3) Files classındaki lines methodu datayı Stream olarak verir. Bu sebeple stream'deki bütün
              methodları burada kullanabiliriz.

 */
public class Lambda01 {
    public static void main(String[] args) throws IOException {
        //Example 1 : Verilen text file icindeki text'i console' a yazdiran code u yaziniz

        Files.lines(Paths.get("src/main/java/javaSuleymanhoca/day44lambda/myTextFile")).
                forEach(System.out::println);

        //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik
        //biz normalde stream'i liste ceviridik burda direk kullanyoruz.


        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz

        Files.lines(Paths.get("src/main/java/javaSuleymanhoca/day44lambda/myTextFile")).
                map(String::toUpperCase).
                forEach(System.out::println);


        //Example 3 : Verilen text file icindeki text'i "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz

        boolean r1 = Files.lines(Paths.get("src/main/java/javaSuleymanhoca/day44lambda/myTextFile")).
                anyMatch(t -> t.contains("Java"));
        System.out.println(r1);


        //Example 4 : Verilen text file icindeki text'lerde kullanbilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.lines(Paths.get("src/main/java/javaSuleymanhoca/day44lambda/myTextFile")).//lines methodunu kullaninca bir stream methodu olur.
                // bunun icinde sizin tektfile'a koydugunuz satirlar var.
                        map(t -> t.replaceAll("\\p{Punct}", " ").split(" ")).//bununla noktalama isaretlerini sil dedik ve bosluktan kes dedik.split bize array verir.
                        flatMap(Arrays::stream).//arayy'in koseli parantezini kaldiriyor ve sadece kelimeler kalir.tum kelimeleri alt alta listeler ve stream'a cevirir.
                        distinct().//bu kelimelerden tekrarli olanlari almaz,
                        collect(Collectors.toList());//kelimeleri listin icine alir.
        System.out.println(words);


        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.lines(Paths.get("src/main/java/javaSuleymanhoca/day44lambda/myTextFile")).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);

//bazi methodlar kendinden sonra method kullanilmasina izin vermez.boyle methodlara terminal methodlar denir.count() gibi.


        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.
        List<String> letters =  Files.lines(Paths.get("src/main/java/javaSuleymanhoca/day44lambda/myTextFile")).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);


    }
}
