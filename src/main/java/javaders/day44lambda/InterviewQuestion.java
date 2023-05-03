package javaders.day44lambda;

import java.util.*;

public class InterviewQuestion {

    public static void main(String[] args) {



    //Size verilen bir Array'in "Muntain Array" olup olmadigini gosteren kodu yaziniz.[0,2,5,3,1,-2]
    //belli bir elemana kadar surekli artis, sonrada surekli bir azalis olmali

        int []arr= {0,2,5,3,1,-2};//once array'i list'e cevirelim, cunku list'i kullanmak daha kolay.

        List<Integer> myList = new ArrayList<>();
        Arrays.stream(arr).//arr icindeki tum elemanlari listin icine koyun
                forEach(t->myList.add(t));//her bir elemani alip benim listime ekleyecek.
        System.out.println(myList);


    //Listteki max elemani bulalim. biz onu gorecegiz ki azalanlari ve artanlari bulabielim.
      int max =   myList.stream().//listimi stream'a cevirdim
                  reduce(Math::max).get();//max'u buldum
        System.out.println(max);//5


    //max elemanin indeksini bulduk.
      int indexOfMax = myList.indexOf(max);
        System.out.println(indexOfMax);//2


    //max elemana kadar olan tum elemanlari bir listin icine koyalim
        List<Integer> firstList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)<=indexOfMax).forEach(t->firstList.add(t));//elemanin indeksini buldu ve max'un indeksinden kucukse liste ekle demek.
        System.out.println(firstList);//[3, 2, 5, 3]

        List<Integer> firstListCopy = new ArrayList<>();//copy
        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println(firstListCopy);//[3, 2, 5, 3]

        Collections.sort(firstListCopy);//copy olani sort yap dedik. o zaman 2,3,5 olarak siralayacagi icin false verdi.

        boolean rule1 = firstList.equals(firstListCopy);
        System.out.println(rule1);//true


        //max elemandan sonraki tum elemanlari bir listin icine koyalim
        List<Integer> secondtList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)>= indexOfMax).forEach(t->secondtList.add(t));
        System.out.println(secondtList);//[5, 1, -2]


        List<Integer> secondtListCopy = new ArrayList<>();

        secondtList.stream().forEach(t->secondtListCopy.add(t));
        System.out.println(secondtListCopy);//[5, 1, -2]

        Collections.sort(secondtListCopy);
        Collections.reverse(secondtListCopy);//ters olarak siraladik.
        System.out.println(secondtListCopy);

        boolean rule2 = secondtList.equals(secondtListCopy);
        System.out.println(rule2);

        System.out.println("is the array mountain array? " + (rule1 && rule2));


    }
}
