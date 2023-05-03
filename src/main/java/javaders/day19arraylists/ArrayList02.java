package javaders.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {


        ArrayList<String>cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Yozgat");
        cities.add("Miami");
        System.out.println(cities);//[Miami, Giresun, Yozgar, Barcelona, Miami, Giresun]


        //ArrayListte bir elemanin ilk gorunumu nasil silinir.
        cities.remove("Miami");// data type String
        System.out.println(cities);//[Giresun, Yozgar, Barcelona, Miami, Giresun]
        System.out.println(cities.remove("Miami"));//true - silip silmedigini soyler.

        //ArrayListte bir elemanin index kullanarak nasil silinir.
        cities.remove(2);//  data type int
        System.out.println(cities);//[Giresun, Yozgar, Miami, Giresun]
        System.out.println(cities.remove(2));//giresun - indeks numarasinda siler ve sonra ne sildigini soyler


        //ArrayList olustururken en basa ArrayList yerine List'de yazabilirsiniz.Sebebini Collections konusunda gorecegiz.
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

    // 12 elemanini ages List'ten siliniz.
       // ages.remove(12);// 12 primitive int olur.primitiv int remove ()method icinde kullaninca Java onu indeks zanneder.
                             // java'ya 12'nin indeks olmadigini soylemek icin primitive int yerine wrapper class integer kullanmaliyiz.
        ages.remove((Integer)12);
        System.out.println(ages);//[23, 7, 4]



    //  ArrayListteki bir elemanin tum gorunumlrini nasil sileriz.

        ArrayList<String>citiesToRemove = new ArrayList<>();

        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);//[Miami] - digerleri daha onceden silinmisti

    // iki ArrayListin birbirine esit olup olmadigini nasil anlariz.
        List<Character>initials =List.of('a','k', 'c','d','k');// kisa yoldan bir List olusturmak icin asagidaki List.of()methodu kullanilabilir. ArryaList yapamayiz.
        System.out.println(initials);//[a, k, c, d,k]

        List<Character>letters=  List.of('a','c', 'k','d','k');
        System.out.println(letters);//[a, c, k, d,k]
        boolean r1 = initials.equals(letters);
        System.out.println(r1);//false- cunku hem elemanlara hem de indeks yerlerine bakar, farkli indekste olursa false veriri.


        int r2= initials.indexOf('k');// elemanin ilk gorunumunun indeksini veriri.
        System.out.println(r2);//1. ilk 'k' birinci indekste oldugu icin 1 verdi,

        int r3= initials.lastIndexOf('k');
        System.out.println(r3);//4



    // bir List'teki tekrarsiz elemanlari konsola yazdiriniz.

    List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);
    for(Double w: prices) {
        if (prices.indexOf(w) == prices.lastIndexOf(w)) {
            System.out.print(w + " ");//3.75 4.0
        }
    }

        System.out.println();
// bir list'te  tekrarli eleman olurp olmadigini gosteren kodu yaziniz.

        List<Double> prices1 = List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        int counter = 0;
    for(Double w: prices1){         // prices1 den 2.5 'i aliyor w'ya atiyor. if'in icinde ilk indek ile son indekslerini karsilastiriyor,
        // eger indeksler esitse  counter artar, degilse artmaz. boylece loop sonuna kadar devam eder ve counter'a bakar. Eger sifira esitse ilk sout' degilse ikinci sout yazdirilir.

        if(prices1.indexOf(w)!=prices1.lastIndexOf(w)){
            counter++;
        }
    }
if(counter==0) {
    System.out.println("All elemants are unique in the list");
}else{
    System.out.println("At last one elements is not unique in the list");//
}



    }
}
