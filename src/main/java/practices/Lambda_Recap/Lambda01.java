package practices.Lambda_Recap;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    //map haric tum collectionlarda kullanilir. cunku maplerde key value iliskisi vardir.


    public static void main(String[] args) {



        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        System.out.println(sayi);
        ciftVePozitifLamExYazdir(sayi);////12 6 8
        System.out.println();
        ciftvePozitifMethodRefYazdir(sayi);//12 6 8
        System.out.println();
        kareleriniYazdir(sayi);//25 64 144 0 1 144 25 25 36 81 225 64
        System.out.println();
        kareleriniTekrarsizYazdir(sayi);//25 64 144 0 1 36 81 225
        System.out.println();
        buyuktenKucugeSirala(sayi);//15 12 9 8 6 5 5 1 0 -5 -8 -12
        System.out.println();
        pozitifKupBirlerBas5(sayi);//125 125 3375
        System.out.println();
        toplaminiBulMetRef(sayi);//Optional[36]
        System.out.println();
        toplaminiBulLambdaEx(sayi);//36
        System.out.println(ciftElKareKucBuySirListReturn(sayi));//[0, 36, 64, 64, 144, 144]


    }
//SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

        public static void ciftVePozitifLamExYazdir (List<Integer>sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t+" "));

    }

//SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

        public static void ciftvePozitifMethodRefYazdir(List<Integer>sayi){
         sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);//method referances kullandik.

    }
//SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

       public static void kareleriniYazdir(List<Integer>sayi){
        sayi.stream().map(t->t*t).forEach(Utils::yazdir);//map icinde lambda expression yaptik
        sayi.stream().map(Utils::karesiniAl).forEach(Utils::yazdir);//map icinde method referance yaptik.

    }

//SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
        public static void kareleriniTekrarsizYazdir(List<Integer>sayi) {
            sayi.stream().map(Utils::karesiniAl).distinct().forEach(Utils::yazdir);//kareleri tekrarsiz olsun dedigi icin once map yaptik,
                                                    //bu soru icin belki degismeyebilir ama farkli bir soru olsa belki degisebilir.
                                                    // o yuzden once islemi yapip sonra tekrarsiz olsun demek daha dogru olur.
        }

//SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın.
        public static void buyuktenKucugeSirala(List<Integer>sayi){
            sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
        }

// SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız.
        public static void pozitifKupBirlerBas5(List<Integer>sayi){
           sayi.stream().filter(t->t>0).map(t-> t*t*t).filter(t-> t%10==5).forEach(Utils::yazdir);//map'de lambda ex. kullandik.
           sayi.stream().filter(t->t>0).map(Utils::kubunuAl).filter(t-> t%10==5).forEach(Utils::yazdir);//map'de meth.refer.kullandik.

        }

// SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
        public static void toplaminiBulMetRef(List<Integer>sayi) {
             Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);
         }

// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
        public static void toplaminiBulLambdaEx(List<Integer>sayi) {
       int sonuc = sayi.stream().reduce(0,(a,b)->a+b);//reduce() akistan gelen elemanlarin toplamini alarak tek bir eleman olarak bize verir.
            System.out.println(sonuc);
        }

//SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer> sayi){
/*
        List<Integer> sonuc = sayi.
                                stream().
                                filter(t->t%2==0).
                                map(Utils::karesiniAl).
                                sorted().
                                collect(Collectors.toList());
                        return sonuc;
 */

       return sayi.stream().filter(t->t%2==0).map(Utils::karesiniAl).sorted().collect(Collectors.toList());

    }


    }
