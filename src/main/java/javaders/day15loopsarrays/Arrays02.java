package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        /*

        1)Application'larda "data" ile bu data'lari isleyen kod'lar(Logic) birbirinden ayrilir.
  Yani; logic data'ya bagimli olmamalidir.
  Data'ya bagimli olarak yazilan kod'lara "hard code" denir.
  "hard code" hatali kod demektir.

  Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz

   Arrays.sort(grades);// sort methodu sayilari kucukten buyuge, alfabeyi de siraya gore siralama yapiyor.

         */


        // Array'leri kisa yoldan nasil olusturabiliri.
        int grades[] = {67, 98, 100, 34, 76};//                                                             data
        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

        //grades array'indeki en kucuk ve en buyuk grade'nin toplamini ekrana yazdiran kodu yaziniz.
        Arrays.sort(grades);// sort methodu kucukten buyuge dogru siralama yapiyor.                       Locig
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]
        System.out.println(grades[0] + grades[grades.length - 1]);//134// ilk ve son indeksi topladi


//Size verilen bir String array'deki isimlerden 5 karakterden az karakter icerenleri konsola yazdiriniz.
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames[0] + stdNames[2]);// uzun yol

        for (String w : stdNames) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }
        System.out.println();
//Size verilen bir String array'deki isimlerden alfabetik siraya koyduktan sonra F ile baslayan isimlerden onceki isimleri konsola yazdiriniz.

        Arrays.sort(stdNames);// Ajda, Ayhan, Cuneyt, Filiz, Tom...F ile baslayanlardan sonrakileri yazmadi
        for (String w : stdNames) {
            if (w.startsWith("F")) {
                break;
            }
            System.out.println(w);//// Ajda, Ayhan, Cuneyt,
        }
        System.out.println();
//Size verilen bir String array'deki isimlerden alfabetik siraya koyduktan sonra F ile baslayan isim dahil onceki isimleri konsola yazdiriniz.

        Arrays.sort(stdNames);// Ajda, Ayhan, Cuneyt, Filiz, Tom....alfabetik siraya koydu

        for(String w : stdNames){
            System.out.println(w);
            if(w.startsWith("F")){
                break;
            }
        }


        System.out.println();
//Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
//           isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(stdNames);// Ajda, Ayhan, Cuneyt, Filiz, Tom...alfabetik siraya koydu
        for(String w:stdNames) {
            if (w.startsWith("F")) {
                continue;// aldiris etme demekti
            }
            System.out.print(w+" ");//Ajda Ayhan Cuneyt Tom



        }
    }
}
