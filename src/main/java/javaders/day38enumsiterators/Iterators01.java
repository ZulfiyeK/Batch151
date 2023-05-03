package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /*
    1. iterator'lar loop larin yaptigi isi yapar. looplarda sonsuz loop tehlikesi var. iteratorlarla sonsuz loop olusmadan loop yapabiliyor.
    2. iterator'larda sonsuz loop olusma ihtimali yoktur.
    3. iterator'lar ile loop'lar arasinda performans farki yoktur.
    4. iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir, loop'lara gore.
    5. iki tip iterator vardir.
        -Iterator: sadece eleman silmede kullanilir, eleman eklemek ve degistirmek mumkun degildir.
        -ListIterator: eleman silebilir, ekleyebilir ve degistirebilir.
        not: Iterator sadece soldan saga calisir.(ilk elemandan son elemana)
             ListIterator ise iki yonlu calisabilir.

     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

    //Iterator kullanalim. once listi'i iterator'a cevirelim.

       Iterator<String>myItr =  myList.iterator();// listteki ayni elemanlari iterator yapisi icine koydu.

       while ((myItr.hasNext())){// pointer'a senden sonra eleman var mi diye sorar varsa true,yoksa false return eder.false olursa loop tamamlanir ve sout'a gelir.
           myItr.next();//pointer'i bir sonraki elemanin onune koyar ve gectigi elemani verir.-increment-decrement yerine calisir.
           myItr.remove();// sirayla elemani siler. iteratorda silinen eleman list'de de silinir.

       }
        System.out.println(myList);//[]


    //ListIterator kullanalim.
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);//[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String>yourtListItr = yourList.listIterator();//diger taraftan geri geri gelembilmek icin pointer'in en sona gelmesi gerekir.
        while ((yourtListItr.hasNext())){

           String el = yourtListItr.next();//hasnext() ve next() pointer'i en sona getirdi bu yuzden ikinci while ile tersten yazmis oldu.

           yourtListItr.set(el+ "!");// degistirmeye yarar, her elemanin sonuna unlem koy
        }
           System.out.println(yourList);//[Tom!, Jim!, Clara!, Angie!, Mark!]


        //hasPrevious() ve previous() nasil kullanilir?
        while (yourtListItr.hasPrevious()){//kullanabilmek icin pointerin en sonda olmasi gerekir.

            String el = yourtListItr.previous();// burda tersten baslayarak yazdirir; cunku ilk while'da             pointer'i bir oncekinin onune atar.
                                                // hasnext() ve next() pointer'i en sona getirdi                    en basa geldiginde false olur ve yazdirir.-previous: "onceki" demek.
                                                //bu yuzden ikinci while ile tersten yazmis oldu.
            yourtListItr.set("?"+el);
        }
        System.out.println(yourList);//[?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]

        //descendingIterator() En sondan en basa nasil iterate edebiliriz.
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);//[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> ourListItr = ourList.descendingIterator();//sondan basa demek, ters siradan demek.bu method bize iterator String dondurur.
        while (ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.print(el+",");//Mark,Angie,Clara,Jim,Tom,
        }

        System.out.println();
        List< Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);//[5, 9, 2, 1, 17, 3]

        Iterator itr = list.iterator();//[(itr)5, 9, 2, 1, 17, 3]- itr bu sekilde listenin basina gelir ve beklemeye baslar.iterator methodu ile listimizi itretor'a atadik.
        System.out.println(itr.hasNext());//true-senden sonra eleman var mi, itr bakiyor kendinden sonra 5 oldugu icin true dondurdu.
        System.out.println(itr.next());//5- itr artik 9'un onune geldi ve kimi gecti ise onu yazdirir. 5'i gectigi icin 5'i yazdirdi.
        System.out.println(itr.next());//9'u verecek.
        itr.remove();
        System.out.println("list = " + list);//list = [5, 2, 1, 17, 3]- en son kimin uzerinden gecti ise onu siler.en son 9 dan gecmisti.
        //itr.remove();// remove dan sonra next yapmadigimiz icin itr yerinde kaldi ve ikinci kez remove yapamadi. bu yuzden ikikez ust uste remove yapamayiz.
        //System.out.println("list = " + list);//IllegalStateException hatasi veriri.
        // remove dan once mutlaka next() veya previous kullanmak zorundayiz yoksa silecek data bulamaz.




    }
}
