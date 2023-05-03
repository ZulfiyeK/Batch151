package zlfy.Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //EX 1) Bir metin dosyasındaki tüm satırları okuyun ve ekrana yazdırın.
        System.out.println("Ex 1) ");
        Files.
                lines(Paths.get("src/main/java/Lambda/Txt.File")).
                forEach(System.out::println);


        // Ex 2) Bir metin dosyasındaki tüm satırları büyük harflerle okuyun ve ekrana yazdırın.//dosya diyorsa Files kullanacagiz
        System.out.println("Ex 2) ");
        Files.
                lines(Paths.get("src/main/java/Lambda/Txt.File")).
                map(String::toUpperCase).
                forEach(System.out::println);


        // Ex 3) Bir metin dosyasındaki herhangi bir satırda "Java" kelimesi var mı yok mu kontrol edin.
        System.out.println("Ex 3) ");
        boolean varMi = Files.
                lines(Paths.get("src/main/java/Lambda/Txt.File")).
                anyMatch(t-> t.contains("Java"));
        System.out.println(varMi);


        // Ex 4) Bir metin dosyasındaki tüm farklı kelimeleri bir liste içinde döndürün.
        System.out.println("Ex 4) ");
        List<String> kelime = Files.
                lines(Paths.get("src/main/java/Lambda/Txt.File")).
                flatMap(t->Arrays.stream(t.split(" "))).
                map(t->t.replaceAll("\\p{Punct}","")).
                distinct().
                collect(Collectors.toList());
       System.out.println(kelime);


        // Ex 5) Bir metin dosyasındaki tüm harflerin sayısını hesaplayın.
        System.out.println("Ex 5) ");
        Long totalLetters = Files.
                lines(Paths.get("src/main/java/Lambda/Txt.File")).
                map(line->line.replaceAll("[^a-zA-Z]","")).//harfler haricindekiler silindi
                        flatMap(line->Arrays.stream(line.split(""))).
                count();//sayac gibi sayma islemi yapar
        System.out.println("totalLetters = " + totalLetters);


        // Ex 6) Bir metin dosyasındaki tüm harfleri alfabetik olarak ters sırayla bir listeye ekleyin.
        System.out.println("Ex 6) ");
        List<String> tersetenliste =  Files.
                lines(Paths.get("src/main/java/Lambda/Txt.File")).
                map(line->line.replaceAll("[^a-zA-Z]","")).
                flatMap(line->Arrays.stream(line.split(""))).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(tersetenliste);//turkce karakterleri de sildi.

    }

}
