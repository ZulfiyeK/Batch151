package zlfy.mehmethocaday31collection;

import java.util.LinkedList;

public class LinkedList01Tekrar {
    public static void main(String[] args) {
 /*
 ArrayListler eleman ekleme ve silmede indekleme yapmak zorunda olduklari icin ,eleman ekleme ve silmede basarisizdirlar.
 bunun icin Java yeni bir yapi olusturmustur. bunun adi LinkedListtir.
 LikedListler indeks kullanmadiklari icin eleman ekleme ve silmede (re-indeks) zorlanmazlar. Bu yuzden eleman ekleme ve silmede
 cok basarilidir. Bunu nasil yaparlar?
    bir yapi olustururlar, her yapinin icinde ikili bolumler vardir.
    birinci boluma datayi koyar, ikinci bolume de pointer koyar, bu yapiya "Node" denir.
    pointer bir sonraki elemani gosteriri.
    en sondaki pointer ==> null gosterir, "Tail" denir.
    en basta da sadece pointer var buna "Head" denir, o da ilk datayi gosterir.
    Eleman ekleme silme yaparken "node" ekleyip sildigi icin bu islem LinkedListler icin cok kolaydir.
    ancak indeksleme olmadigi icin eleman bulma konusunda cok yavastir.


 ArrayListlerde "search" islemi kolay yapilir cunku indexler adres gibidir.
  Linkedlistlerde search islemi zor yapilir cunku LinkedListler index kullanmmaz.
       index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir
       bu da cok fazla is demektir.


  */


        LinkedList<String> s = new LinkedList<>();
        s.add("Merve");
        s.add("Murat");
        s.add("Vildan");
        s.add("Fatih");
        s.add("Mustafa");
        s.add("Fatih");
        System.out.println(s);//[Merve, Murat, Vildan, Fatih, Mustafa, Fatih]

        s.add(1,"Caner");
        System.out.println(s);//[Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih]

        s.addFirst("Ahmet");
        System.out.println(s);//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih]

        s.addLast("Enver");
        System.out.println(s);//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

        s.remove(2);// ikinci indeksi siliyor
        System.out.println(s);//[Ahmet, Merve, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

        s.remove("Murat");
        System.out.println(s);//[Ahmet, Merve, Vildan, Fatih, Mustafa, Fatih, Enver]

        s.removeFirstOccurrence("Fatih");// ilk fatihi sildi
        System.out.println(s);//[Ahmet, Merve, Vildan, Mustafa, Fatih, Enver]

        s.removeLastOccurrence("Fatih");// ikinci fatih'i sildi.
        System.out.println(s);//[Ahmet, Merve, Vildan, Mustafa, Enver]

        String r1 = s.peek();// ilk node'u alir getirir ama silmez.-- copy paste/ kopyala yapistir.
        System.out.println(r1);//Ahmet ---List ici bos ise null veriri.

        String r2 = s.pop();// ilk node'u alir getirir ama siler.-- cut paste / kes yapistir.
        System.out.println(r2);// Ahmet
        System.out.println(s);//[Merve, Vildan, Mustafa, Enver]

        String r3 = s.element();
        System.out.println(r3);//Merve -- List ici bos ise hata alir.
        System.out.println(s);//[Merve, Vildan, Mustafa, Enver]

        String r4 = s.pop();
        System.out.println(r4);//Merve
        System.out.println(s);//[Vildan, Mustafa, Enver]

        s.poll();// s.pop(): ==> ikiside ilk elemani siler, poll==>list bos oldugunda null veriri, pop==> hata verir.
        System.out.println(s);//[Mustafa, Enver]


    }
}
